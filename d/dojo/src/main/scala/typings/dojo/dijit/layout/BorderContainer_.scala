package typings.dojo.dijit.layout

import typings.dojo.Anon_Unwatch
import typings.dojo.Fn_NewValue
import typings.dojo.dojoStrings.gutters
import typings.dojo.dojoStrings.liveSplitters
import typings.dojo.dojoStrings.persist
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dijit/layout/BorderContainer.html
  *
  * A BorderContainer is a dijit/LayoutContainer that can have draggable splitters between the children,
  * in order to adjust their sizes.
  * 
  * In addition, it automatically adds some space between the children even
  * if they don't have a draggable splitter between them, and space between the edge of the BorderContainer
  * and the children that are adjacent to the edge.  Note that the intended style is that all the children
  * have borders, but (despite the name) the BorderContainer itself does not.
  * 
  * See BorderContainer.ChildWidgetProperties for details on the properties that can be set on
  * children of a BorderContainer.
  * 
  * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.     
  * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree     
  */
@JSGlobal("dijit.layout.BorderContainer")
@js.native
class BorderContainer_ () extends LayoutContainer {
  def this(params: js.Object) = this()
  def this(params: js.Object, srcNodeRef: HTMLElement) = this()
  /**
    * Give each pane a border and margin.
    * Margin determined by domNode.paddingLeft.
    * When false, only resizable panes have a gutter (i.e. draggable splitter) for resizing.
    * 
    */
  var gutters: Boolean = js.native
  /**
    * Specifies whether splitters resize as you drag (true) or only upon mouseup (false)
    * 
    */
  var liveSplitters: Boolean = js.native
  /**
    * Save splitter positions in a cookie.
    * 
    */
  var persist: Boolean = js.native
  /**
    * Returns the widget responsible for rendering the splitter associated with region
    * 
    * @param region             
    */
  def getSplitter(region: String): js.Any = js.native
  @JSName("get")
  def get_gutters(property: gutters): Boolean = js.native
  @JSName("get")
  def get_liveSplitters(property: liveSplitters): Boolean = js.native
  @JSName("get")
  def get_persist(property: persist): Boolean = js.native
  /**
    * 
    * @param newSize             
    * @param currentSize             
    */
  def resize(newSize: js.Any, currentSize: js.Any): Unit = js.native
  @JSName("set")
  def set_gutters(property: gutters, value: Boolean): Unit = js.native
  @JSName("set")
  def set_liveSplitters(property: liveSplitters, value: Boolean): Unit = js.native
  @JSName("set")
  def set_persist(property: persist, value: Boolean): Unit = js.native
  @JSName("watch")
  def watch_gutters(property: gutters, callback: Fn_NewValue): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_liveSplitters(property: liveSplitters, callback: Fn_NewValue): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_persist(property: persist, callback: Fn_NewValue): Anon_Unwatch = js.native
}

