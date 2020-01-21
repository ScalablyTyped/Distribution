package typings.dojo.dojox.drawing

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/drawing/_base.html
  *
  * Drawing is a project that sits on top of DojoX GFX and uses SVG and
  * VML vector graphics to draw and display.
  * Drawing is similar to DojoX Sketch, but is designed to be more versatile
  * extendable and customizable.
  * Drawing currently only initiates from HTML although it's technically not
  * a Dijit to keep the file size light. But if Dijit is available, Drawing
  * will register itself with it and can be accessed with registry.byId('myDrawing')
  * (by requiring dijit/registry)
  *
  * NOTES:
  * Although not Drawing and Toolbar, all other objects are created with a custom
  * declare. See dojox.drawing.util.oo
  *
  * The files are laid out as such:
  *
  * Drawing: The master class. More than one instance of a Drawing can be placed
  *   on a page at one time (although this has not yet been tested). Plugins
  *   can be added in markup.
  * Toolbar: Like Drawing, Toolbar is a psudeo Dijit that does not need Dijit. It is
  *   optional. It can be oriented horizontal or vertical by placing one of
  *   those params in the class (at least one is required).  Plugins
  *   can be added in markup. A drawingId is required to point toolbar to
  *   the drawing.
  * defaults: Contains the default styles and dimensions for Stencils. An individual
  *   Stencil can be changed by calling stencil.att({color obj}); To change
  *   all styles, a custom defaults file should be used.
  * Stencils: Drawing uses a concept of 'Stencils' to avoid confusion between a
  *   Dojox Shape and a Drawing Shape. The classes in the 'stencils' package
  *   are display only, they are not used for actually drawing (see 'tools').
  *   This package contains _Base from which stencils inherit most of their
  *   methods. (Path and Image are display only and not found in Tools)
  * Tools: The Tools package contains Stencils that are attached to mouse events
  *   and can be used for drawing. Items in this package can also be selected
  *   and modified.
  * Tools / Custom: Holds tools that do not directly extend Stencil base classes and often
  *   have very custom code.
  * Library (not implemented): The Library package, which is not yet implemented, will be the place to
  *   hold stencils that have very specific data points that result in a picture.
  *   Flag-like-banners, fancy borders, or other complex shapes would go here.
  * Annotations: Annotations 'decorate' and attach to other Stencils, such as a 'Label'
  *   that can show text on a stencil, or an 'Angle' that shows while dragging
  *   or modifying a Vector, or an Arrow head that is attached to the beginning
  *   or end of a line.
  * Manager: Contains classes that control functionality of a Drawing.
  * Plugins: Contains optional classes that are 'plugged into' a Drawing. There are two
  *   types: 'drawing' plugins that modify the canvas, and 'tools' which would
  *   show in the toolbar.
  * Util: A collection of common tasks.
  *
  * @param props
  * @param node
  */
@JSGlobal("dojox.drawing._base")
@js.native
class base protected () extends js.Object {
  def this(props: js.Object, node: HTMLElement) = this()
  /**
    * Height of the canvas
    *
    */
  var height: Double = js.native
  /**
    * Changes the functionality of the drawing
    *
    */
  var mode: String = js.native
  /**
    * Whether or not the canvas has been created and Stencils can be added
    *
    */
  var ready: Boolean = js.native
  /**
    * Width of the canvas
    *
    */
  var width: Double = js.native
  /**
    * Add a toolbar plugin object to plugins array
    * to be parsed
    *
    * @param plugin
    */
  def addPlugin(plugin: js.Object): Unit = js.native
  /**
    * Use this method to programmatically add Stencils that display on
    * the canvas.
    *
    * FIXME: Currently only supports Stencils that have been registered,
    * which is items in the toolbar, and the additional Stencils at the
    * end of onSurfaceReady. This covers all Stencils, but you can't
    * use 'display only' Stencils for Line, Rect, and Ellipse.
    *
    * @param type The final name of the tool, lower case: 'image', 'line', 'textBlock'
    * @param options The parameters used to draw the object. See stencil._Base and eachtool for specific parameters of teh data or points objects.
    */
  def addStencil(`type`: String, options: js.Object): js.Any = js.native
  /**
    * Use this method to programmatically add Stencils that display on
    * the canvas.
    *
    * FIXME: Currently only supports Stencils that have been registered,
    * which is items in the toolbar, and the additional Stencils at the
    * end of onSurfaceReady. This covers all Stencils, but you can't
    * use 'display only' Stencils for Line, Rect, and Ellipse.
    *
    * @param type The final name of the tool, lower case: 'image', 'line', 'textBlock'
    * @param options type: ObjectThe parameters used to draw the object. See stencil._Base and eachtool for specific parameters of teh data or points objects.
    */
  def addUI(`type`: String, options: js.Object): js.Any = js.native
  /**
    * Change the defaults so that all Stencils from this
    * point on will use the newly changed style.
    *
    * @param newStyle An object that represents one of the objects indrawing.style that will be mixed in. Not allproperties are necessary. Only one object maybe changed at a time. The object boolean parameteris not required and if not set objects will automaticallybe changed.Changing non-objects like angleSnap requires valueto be true.
    * @param value
    */
  def changeDefaults(newStyle: js.Object, value: Boolean): Unit = js.native
  /**
    * Collects all Stencil data and returns an
    * Array of objects.
    *
    */
  def exporter(): js.Any = js.native
  /**
    *
    * @param name
    */
  def get(name: js.Any): Unit = js.native
  /**
    * Returns a Stencil constructor base on
    * abbreviation
    *
    * @param abbr
    */
  def getConstructor(abbr: String): js.Any = js.native
  /**
    * The common objects that are mixed into
    * a new Stencil. Mostly internal, but could be used.
    *
    * @param data
    * @param mode
    */
  def getShapeProps(data: js.Object, mode: js.Any): js.Any = js.native
  /**
    * Handles an Array of stencil data and imports the objects
    * to the drawing.
    *
    * @param objects
    */
  def importer(objects: js.Array[_]): Unit = js.native
  /**
    * Called from Toolbar after a plugin has been loaded
    * The call to this coming from toolbar is a bit funky as the timing
    * of IE for canvas load is different than other browsers
    *
    */
  def initPlugins(): Unit = js.native
  /**
    * Event fired from a stencil that has destroyed itself
    * will also be called when it is removed by "removeStencil"
    * or stencils.onDelete.
    *
    * @param stencil
    */
  def onDeleteStencil(stencil: js.Object): Unit = js.native
  /**
    * Event that fires when a stencil is drawn. Does not fire from
    * 'addStencil'.
    *
    * @param stencil
    */
  def onRenderStencil(stencil: js.Object): Unit = js.native
  /**
    * Event that to which can be connected.
    * Fired when the canvas is ready and can be drawn to.
    *
    */
  def onSurfaceReady(): Unit = js.native
  /**
    * Registers a tool that can be accessed. Internal.
    *
    * @param type
    */
  def registerTool(`type`: String): Unit = js.native
  /**
    * Deletes all Stencils on the canvas.
    *
    */
  def removeAll(): Unit = js.native
  /**
    * Use this method to programmatically remove Stencils from the canvas.
    *
    * @param stencil The Stencil to be removed
    */
  def removeStencil(stencil: js.Object): Unit = js.native
  /**
    * Resizes the canvas.
    * If within a ContentPane this will get called automatically.
    * Can also be called directly.
    *
    * @param box
    */
  def resize(box: js.Object): Unit = js.native
  /**
    * Selects all stencils
    *
    */
  def selectAll(): Unit = js.native
  /**
    * Drawing registers as a widget and needs to support
    * widget's api.
    *
    * @param name
    * @param value
    */
  def set(name: js.Any, value: js.Any): Unit = js.native
  /**
    * Sets up a new class to be used to draw. Called from Toolbar,
    * and this class... after a tool is used a new one of the same
    * type is initialized. Could be called externally.
    *
    * @param type
    */
  def setTool(`type`: String): Unit = js.native
  /**
    *
    */
  def startup(): Unit = js.native
  /**
    * Call a function within all selected Stencils
    * like attr()
    *
    * @param func
    */
  def toSelected(func: String): Unit = js.native
  /**
    * Destroys current tool
    *
    */
  def unSetTool(): Unit = js.native
}

