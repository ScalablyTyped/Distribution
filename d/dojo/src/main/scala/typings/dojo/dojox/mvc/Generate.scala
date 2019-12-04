package typings.dojo.dojox.mvc

import typings.dojo.Anon_Unwatch
import typings.dojo.dojoStrings.children
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/mvc/Generate.html
  *
  * A container that generates a view based on the data model its bound to.
  * A generate introspects its data binding and creates a view contained in
  * it that allows displaying the bound data. Child dijits or custom view
  * components inside it inherit their parent data binding context from it.
  *
  * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.
  * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree
  */
@JSGlobal("dojox.mvc.Generate")
@js.native
class Generate () extends _Container {
  def this(params: js.Object) = this()
  def this(params: js.Object, srcNodeRef: HTMLElement) = this()
  /**
    * The array of data model that is used to render child nodes.
    *
    */
  var children: js.Object = js.native
  @JSName("get")
  def get_children(property: children): js.Object = js.native
  @JSName("set")
  def set_children(property: children, value: js.Object): Unit = js.native
  @JSName("watch")
  def watch_children(
    property: children,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Object], 
      /* newValue */ js.UndefOr[js.Object], 
      Unit
    ]
  ): Anon_Unwatch = js.native
}

