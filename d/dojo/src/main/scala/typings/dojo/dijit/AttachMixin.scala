package typings.dojo.dijit

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dijit/_AttachMixin.html
  *
  * Mixin for widgets to attach to dom nodes and setup events via
  * convenient data-dojo-attach-point and data-dojo-attach-event DOM attributes.
  * 
  * Superclass of _TemplatedMixin, and can also be used standalone when templates are pre-rendered on the
  * server.
  * 
  * Does not [yet] handle widgets like ContentPane with this.containerNode set.   It should skip
  * scanning for data-dojo-attach-point and data-dojo-attach-event inside this.containerNode, but it
  * doesn't.
  * 
  * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.     
  * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified, replace srcNodeRef with my generated DOM tree.     
  */
@JSGlobal("dijit._AttachMixin")
@js.native
class AttachMixin () extends js.Object {
  def this(params: js.Object) = this()
  def this(params: js.Object, srcNodeRef: HTMLElement) = this()
  /**
    * Object to which attach points and events will be scoped.  Defaults
    * to 'this'.
    * 
    */
  var attachScope: js.Object = js.native
  /**
    * Search descendants of this.containerNode for data-dojo-attach-point and data-dojo-attach-event.
    * Should generally be left false (the default value) both for performance and to avoid failures when
    * this.containerNode holds other _AttachMixin instances with their own attach points and events.
    * 
    */
  var searchContainerNode: Boolean = js.native
  /**
    * Attach to DOM nodes marked with special attributes.
    * 
    */
  def buildRendering(): Unit = js.native
  /**
    * 
    */
  def destroyRendering(): Unit = js.native
}

