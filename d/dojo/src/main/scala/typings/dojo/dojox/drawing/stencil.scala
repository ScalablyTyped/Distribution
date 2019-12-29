package typings.dojo.dojox.drawing

import typings.dojo.dojox.drawing.manager.Anchors
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("dojox.drawing.stencil")
@js.native
object stencil extends js.Object {
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/drawing/stencil/Ellipse.html
    *
    * Creates a dojox.gfx Ellipse based on data or points provided.
    *
    * @param options
    */
  @js.native
  class Ellipse protected () extends _Base {
    def this(options: js.Any) = this()
    /**
      *
      */
    var anchorType: String = js.native
    /**
      *
      */
    var baseRender: Boolean = js.native
  }
  
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/drawing/stencil/Image.html
    *
    * Creates an dojox.gfx Image based on the data
    * provided.
    *
    * @param options
    */
  @js.native
  class Image protected () extends _Base {
    def this(options: js.Any) = this()
    /**
      * The data used to create the dojox.gfx Shape
      *
      */
    var StencilData: js.Object = js.native
    /**
      *
      */
    var StencilPoints: js.Array[_] = js.native
    /**
      *
      */
    var anchorType: String = js.native
    /**
      *
      */
    var baseRender: Boolean = js.native
    /**
      * Internal. If no image size is passed in with the data
      * create a dom node, insert and image, gets its dimensions
      * record them - then destroy everything.
      *
      * @param render
      */
    def getImageSize(render: js.Any): Unit = js.native
    def render(dbg: js.Any): Unit = js.native
  }
  
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/drawing/stencil/Line.html
    *
    * Creates a dojox.gfx Line based on data or points provided.
    *
    * @param options
    */
  @js.native
  class Line protected () extends _Base {
    def this(options: js.Any) = this()
    /**
      * The data used to create the dojox.gfx Shape, specify
      * x1,y1,x2,y2, or x,y,angle,radius
      *
      */
    var StencilData: js.Object = js.native
    /**
      *
      */
    var StencilPoints: js.Array[_] = js.native
    /**
      *
      */
    var anchorType: String = js.native
    /**
      *
      */
    var baseRender: Boolean = js.native
    /**
      * Converts data to points.
      *
      * @param o
      */
    def dataToPoints(o: js.Any): js.Array[_] = js.native
    /**
      * Converts points to data
      *
      * @param p
      */
    def pointsToData(p: js.Any): js.Object = js.native
  }
  
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/drawing/stencil/Path.html
    *
    * Creates a dojox.gfx Path based on points provided.
    *
    * @param options
    */
  @js.native
  class Path protected () extends _Base {
    def this(options: js.Any) = this()
    /**
      *
      */
    var StencilData: js.Object = js.native
    /**
      *
      */
    var StencilPoints: js.Array[_] = js.native
    /**
      *
      */
    var baseRender: Boolean = js.native
    /**
      *
      */
    var closeColor: js.Object = js.native
    /**
      *
      */
    var closePath: Boolean = js.native
    /**
      *
      */
    var closeRadius: Double = js.native
    /**
      * Checks if points are close enough to indicate that
      * path should be close. Provides a visual cue.
      * Not actually used in stencil.path - this is used for
      * drawable tools that extend it. Note that those tools
      * need to remove the shape created: this.closeGuide, or
      * add arg: remove
      *
      * @param firstPt
      * @param currPt
      * @param remove
      */
    def checkClosePoint(firstPt: js.Object, currPt: js.Object, remove: Boolean): Boolean = js.native
    /**
      * Called from anchor point mouse drag
      * also called from plugins.Pan.checkBounds
      *
      * @param anchor
      */
    def onTransform(anchor: js.Object): Unit = js.native
  }
  
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/drawing/stencil/Rect.html
    *
    * Creates a dojox.gfx rectangle based on data or points provided.
    *
    * @param options
    */
  @js.native
  class Rect protected () extends _Base {
    def this(options: js.Any) = this()
    /**
      *
      */
    var anchorType: String = js.native
    /**
      *
      */
    var baseRender: Boolean = js.native
  }
  
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/drawing/stencil/Text.html
    *
    * Creates a dojox.gfx Text (SVG or VML) based on data provided.
    * There are two text classes. TextBlock extends this one and
    * adds editable functionality, discovers text width etc.
    * This class displays text only. There is no line wrapping.
    * Multiple lines can be achieved by inserting \n linebreaks
    * in the text.
    *
    * @param options
    */
  @js.native
  class Text protected () extends _Base {
    def this(options: js.Any) = this()
    /**
      * The data used to create the dojox.gfx Text
      *
      */
    var StencilData: js.Object = js.native
    /**
      *
      */
    var StencilPoints: js.Array[_] = js.native
    /**
      * Text horizontal alignment.
      * Options: start, middle, end
      *
      */
    var align: String = js.native
    /**
      *
      */
    var anchorType: String = js.native
    /**
      *
      */
    var baseRender: Boolean = js.native
    /**
      * Text vertical alignment
      * Options: top, middle, bottom (FIXME: bottom not supported)
      *
      */
    var valign: String = js.native
    /**
      * Getter for text.
      *
      */
    def getText(): js.Any = js.native
    /**
      *
      * @param text
      * @param w
      */
    def makeFit(text: js.Any, w: js.Any): js.Object = js.native
    def render(text: String): Unit = js.native
    /**
      * Setter for text.
      *
      * @param text
      */
    def setText(text: js.Any): Unit = js.native
    /**
      * Register raw text, returning typeset form.
      * Uses function dojox.drawing.stencil.Text.typeset
      * for typesetting, if it exists.
      *
      * @param text
      */
    def typesetter(text: js.Any): js.Any = js.native
  }
  
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/drawing/stencil/_Base.html
    *
    * The base class used for all Stencils.
    * All stencils extend this base class.
    * Most methods and events can be found here.
    *
    * @param options
    */
  @js.native
  class _Base protected () extends js.Object {
    def this(options: js.Any) = this()
    /**
      *
      */
    var drawingType: String = js.native
    /**
      * Whether the Stencil is enabled or not.
      *
      */
    var enabled: Boolean = js.native
    /**
      * The minimum size allowed for a render. If the size
      * is less, the shape is destroyed.
      *
      */
    var minimumSize: Double = js.native
    /**
      * The type of Stencil this is. Should be overridden
      * by extending classes.
      * FIXME: should this be declaredClass?
      *
      */
    var `type`: String = js.native
    /**
      *
      * @param args
      */
    def addShadow(args: js.Object): Unit = js.native
    /**
      *
      * @param options
      * @param create
      */
    def animate(options: js.Any, create: js.Any): Unit = js.native
    /**
      * Applies the transform to the stencil
      *
      * NOTE: PARTIALLY IMPLEMENTED.  Only applies x y coords.
      *
      * @param mx
      */
    def applyTransform(mx: js.Any): Unit = js.native
    /**
      * Changes properties in the style or disabled styles,
      * depending on whether the object is enabled.
      * Also can be used to change most position and size props.
      *
      * @param key
      * @param value               Optional
      */
    def attr(key: String, value: String): Unit = js.native
    /**
      * Changes properties in the style or disabled styles,
      * depending on whether the object is enabled.
      * Also can be used to change most position and size props.
      *
      * @param key
      * @param value               Optional
      */
    def attr(key: String, value: Double): Unit = js.native
    /**
      * Changes properties in the style or disabled styles,
      * depending on whether the object is enabled.
      * Also can be used to change most position and size props.
      *
      * @param key
      * @param value               Optional
      */
    def attr(key: js.Object, value: String): Unit = js.native
    /**
      * Changes properties in the style or disabled styles,
      * depending on whether the object is enabled.
      * Also can be used to change most position and size props.
      *
      * @param key
      * @param value               Optional
      */
    def attr(key: js.Object, value: Double): Unit = js.native
    /**
      * Convenience method for quick connects
      * See comments below for possiblities
      * functions can be strings
      *
      * @param o
      * @param e
      * @param s
      * @param m
      * @param once If true, the connection happens onlyonce then disconnects. Five args are requiredfor this functionality.
      */
    def connect(o: js.Any, e: js.Any, s: js.Any, m: js.Any, once: Boolean): js.Any = js.native
    /**
      * Internal. Registers this Stencil to receive
      * mouse events.
      *
      */
    def connectMouse(): Unit = js.native
    /**
      * Convenience method for batches of quick connects
      * Handles are not returned and therefore cannot be
      * disconnected until Shape destroy time
      *
      */
    def connectMult(): Unit = js.native
    /**
      * Converts data to points.
      *
      * @param data
      */
    def dataToPoints(data: js.Object): Unit = js.native
    /**
      * Called when the Stencil is deselected.
      * NOTE: Calling this will not deselect the Stencil
      * calling this just sets the style to the current
      * theme. 'manager.Stencil' should be used for selecting
      * and deselecting Stencils.
      *
      * @param useDelay Adds  slight delay before the style is set.
      */
    def deselect(useDelay: Boolean): Unit = js.native
    /**
      * Destroys this Stencil
      *
      */
    def destroy(): Unit = js.native
    /**
      * Disables Stencil so it is not selectable.
      * Changes the color to the disabled style.
      *
      */
    def disable(): Unit = js.native
    /**
      * Removes connections based on passed
      * handles arguments
      *
      * @param handles
      */
    def disconnect(handles: js.Array[_]): Unit = js.native
    /**
      * Removes connections based on passed
      * handles arguments
      *
      * @param handles
      */
    def disconnect(handles: js.Object): Unit = js.native
    /**
      * Internal. Unregisters this Stencil from receiving
      * mouse events.
      *
      */
    def disconnectMouse(): Unit = js.native
    /**
      * Enables Stencil so it is not selectable (if
      * it was selectable to begin with). Changes the
      * color to the current style.
      *
      */
    def enable(): Unit = js.native
    /**
      * Exports Stencil data
      *
      */
    def exporter(): js.Any = js.native
    /**
      * Gets angle of Stencil
      * NOTE: Only works for Lines, Arrows, Vectors and Axes
      * (works on points, not transforms)
      *
      */
    def getAngle(): js.Any = js.native
    /**
      * Returns the coordinates of the Stencil. This is often
      * different than the data or the points.
      *
      * NOTE: Won't work for paths or annotations (labels, Axes, arrow tips)
      * They should overwrite.
      *
      * NOTE: Primarily used for checking for if shape is off
      * canvas. Therefore Lines could get flipped. Use absolute
      * to prevent this.
      *
      * @param absolute Keeps lines from flipping (see note).
      */
    def getBounds(absolute: Boolean): js.Object = js.native
    /**
      * Get the text of the label.
      *
      */
    def getLabel(): js.Any = js.native
    /**
      * Gets radius (length) of Stencil.
      *
      * NOTE: Only works for Lines, Arrows and Vectors
      * (not for Ellipse, Axes has its own version)
      *
      */
    def getRadius(): js.Any = js.native
    /**
      * Returns the current transform (position) of the Stencil's
      * container
      *
      */
    def getTransform(): js.Object = js.native
    /**
      * Changes style to the highlight theme.
      *
      */
    def highlight(): Unit = js.native
    /**
      * Moves Stencil to the back of all other items
      * on the canvas.
      *
      */
    def moveToBack(): Unit = js.native
    /**
      * Moves Stencil to the front of all other items
      * on the canvas.
      *
      */
    def moveToFront(): Unit = js.native
    /**
      * Stub - Fires before render occurs.
      *
      * @param stencil
      */
    def onBeforeRender(stencil: js.Object): Unit = js.native
    /**
      * Stub - fires on change of dimensional
      * properties or a text change
      *
      * @param stencil
      */
    def onChangeData(stencil: js.Object): Unit = js.native
    /**
      * Fires when styles of shape has changed
      *
      * @param stencil
      */
    def onChangeStyle(stencil: js.Object): Unit = js.native
    /**
      *
      * @param value
      */
    def onChangeText(value: js.Any): Unit = js.native
    /**
      * Stub - fires before this is destroyed
      *
      * @param stencil
      */
    def onDelete(stencil: _Base): Unit = js.native
    /**
      * Mouse event, fired on mousedown on canvas
      *
      * @param obj
      */
    def onDown(obj: Event): Unit = js.native
    /**
      * Mouse event, fired on mousemove while mouse
      * is down on canvas
      *
      * @param obj
      */
    def onDrag(obj: Event): Unit = js.native
    /**
      * Stub - fires on change of any property,
      * including style properties
      *
      * @param stencil
      */
    def onModify(stencil: js.Object): Unit = js.native
    /**
      * Mouse event, fired on mousemove while mouse
      * is not down.
      * NOTE: Not currently implemented
      *
      * @param obj
      */
    def onMove(obj: Event): Unit = js.native
    /**
      * Stub - Fires on creation.
      * Drawing connects to this (once!) to be
      * notified of drag completion. But only if it
      * was registered as a Tool. Creating Stencil in and of
      * itself does not register it.
      *
      * This should fire
      * at the end of creation (not during drag)
      *
      * @param stencil
      */
    def onRender(stencil: js.Object): Unit = js.native
    /**
      * Called from anchor point mouse drag
      * also called from plugins.Pan.checkBounds
      *
      * @param anchor
      */
    def onTransform(anchor: Anchors): Unit = js.native
    /**
      * Fired at the start of a transform. This would be
      * an anchor drag or a selection.
      *
      * @param anchor
      */
    def onTransformBegin(anchor: Anchors): Unit = js.native
    /**
      * Called from anchor point up mouse up
      *
      * @param anchor
      */
    def onTransformEnd(anchor: Anchors): Unit = js.native
    /**
      * Mouse event, fired on mouseup
      *
      * @param obj
      */
    def onUp(obj: Event): Unit = js.native
    /**
      * Converts points to data
      *
      * @param points
      */
    def pointsToData(points: js.Array[_]): Unit = js.native
    /**
      * Internal. Prevent item from being drawn/rendered less
      * than zero on the X or Y.
      *
      */
    def preventNegativePos(): Unit = js.native
    /**
      * Removes shape(s), typically before a re-render
      * No args defaults to this.shape
      * Pass in multiple args to remove multiple shapes
      *
      */
    def remove(): Unit = js.native
    /**
      *
      */
    def removeShadow(): Unit = js.native
    /**
      * This Stencil's render description. Often
      * calls 'sub render' methods.
      *
      */
    def render(): Unit = js.native
    /**
      * Called when the Stencil is selected.
      * NOTE: Calling this will not select the Stencil
      * calling this just sets the style to the 'selected'
      * theme. 'manager.Stencil' should be used for selecting
      * Stencils.
      *
      */
    def select(): Unit = js.native
    /**
      * Setter for Stencil data; also converts
      * data to points. See individual Stencils
      * for specific data properties.
      *
      * @param data
      */
    def setData(data: js.Object): Unit = js.native
    /**
      * Creates and sets a label annotation for the Stencil.
      * If Stencil contains a labelPosition method, that will
      * be used for positioning. Otherwise
      * dojox.drawing.util.positioning.label is used.
      *
      * @param text The text to set as the label.
      */
    def setLabel(text: String): Unit = js.native
    /**
      * Setter for Stencil points; also converts
      * points to data. See individual Stencils
      * for specific points properties.
      *
      * @param points
      */
    def setPoints(points: js.Array[js.Object]): Unit = js.native
    /**
      * Sets the transform to the stencil
      *
      * NOTE: PARTIALLY IMPLEMENTED.  Only applies x y coords.
      *
      * @param mx
      */
    def setTransform(mx: js.Object): Unit = js.native
    /**
      * Moves object to a new X Y location
      * mx is additive. So mx.dx=1 will move the stencil
      * 1 pixel to the right from wherever it was.
      *
      * @param mx
      */
    def transformPoints(mx: js.Any): Unit = js.native
    /**
      * Changes style to the current theme.
      *
      */
    def unhighlight(): Unit = js.native
  }
  
}

