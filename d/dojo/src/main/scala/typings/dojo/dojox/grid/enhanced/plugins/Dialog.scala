package typings.dojo.dojox.grid.enhanced.plugins

import typings.dojo.Anon_Unwatch
import typings.dojo.Fn_NewValueOldValue
import typings.dojo.dojoStrings.refNode
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/grid/enhanced/plugins/Dialog.html
  *
  *
  * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.
  * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree
  */
@JSGlobal("dojox.grid.enhanced.plugins.Dialog")
@js.native
class Dialog ()
  extends typings.dojo.dijit.Dialog {
  def this(params: js.Object) = this()
  def this(params: js.Object, srcNodeRef: HTMLElement) = this()
  /**
    *
    */
  var refNode: js.Object = js.native
  @JSName("get")
  def get_refNode(property: refNode): js.Object = js.native
  /**
    * Returns true if all of the widgets are valid.
    * Deprecated, will be removed in 2.0.  Use get("state") instead.
    *
    */
  @JSName("isValid")
  def isValid_MDialog(): Boolean = js.native
  @JSName("set")
  def set_refNode(property: refNode, value: js.Object): Unit = js.native
  @JSName("watch")
  def watch_refNode(property: refNode, callback: Fn_NewValueOldValue): Anon_Unwatch = js.native
}

