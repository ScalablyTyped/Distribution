package typings.dojo.dojox.widget

import typings.dojo.Anon_Unwatch
import typings.dojo.Fn_NewValue
import typings.dojo.dijit.TitlePane
import typings.dojo.dojoStrings.closable
import typings.dojo.dojoStrings.dragRestriction
import typings.dojo.dojoStrings.resizeChildren
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/widget/Portlet.html
  *
  * A container widget that is designed to be contained
  * in a dojox.layout.GridContainer. Child widgets can insert
  * an icon into the title bar of the Portlet, which when
  * clicked, executes the "toggle" method of the child widget.
  * A child widget must specify the attribute
  * "portletIconClass", and the optional class
  * "portletIconHoverClass", as well as the
  * "toggle" function.
  *
  * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.
  * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree
  */
@JSGlobal("dojox.widget.Portlet")
@js.native
class Portlet () extends TitlePane {
  def this(params: js.Object) = this()
  def this(params: js.Object, srcNodeRef: HTMLElement) = this()
  /**
    * If true, a close button is placed in the title bar,
    * and the Portlet can be hidden. If false, the Portlet
    * cannot be closed.
    *
    */
  var closable: Boolean = js.native
  /**
    * To remove the drag capability.
    *
    */
  var dragRestriction: Boolean = js.native
  /**
    * If true, when the Portlet is resized, any child widgets
    * with a 'resize' method have that method called.
    *
    */
  var resizeChildren: Boolean = js.native
  /**
    * Adds a child widget to the portlet.
    *
    * @param child
    */
  def addChild(child: js.Any): Unit = js.native
  @JSName("get")
  def get_closable(property: closable): Boolean = js.native
  @JSName("get")
  def get_dragRestriction(property: dragRestriction): Boolean = js.native
  @JSName("get")
  def get_resizeChildren(property: resizeChildren): Boolean = js.native
  def onClose(evt: js.Any): Boolean = js.native
  /**
    * Updates the Portlet size if any other Portlet
    * changes its size.
    *
    * @param widget
    */
  def onSizeChange(widget: js.Any): Unit = js.native
  /**
    * Stub function called when the size is changed.
    *
    */
  def onUpdateSize(): Unit = js.native
  @JSName("set")
  def set_closable(property: closable, value: Boolean): Unit = js.native
  @JSName("set")
  def set_dragRestriction(property: dragRestriction, value: Boolean): Unit = js.native
  @JSName("set")
  def set_resizeChildren(property: resizeChildren, value: Boolean): Unit = js.native
  @JSName("watch")
  def watch_closable(property: closable, callback: Fn_NewValue): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_dragRestriction(property: dragRestriction, callback: Fn_NewValue): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_resizeChildren(property: resizeChildren, callback: Fn_NewValue): Anon_Unwatch = js.native
}

