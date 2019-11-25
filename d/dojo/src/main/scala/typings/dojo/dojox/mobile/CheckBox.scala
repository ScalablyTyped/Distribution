package typings.dojo.dojox.mobile

import typings.dojo.Anon_Unwatch
import typings.dojo.dojoStrings.readOnly
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/mobile/CheckBox.html
  *
  * A non-templated checkbox widget that can be in two states
  * (checked or not checked).
  *
  * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.
  * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.dojo.dijit.form._CheckBoxMixin because Inheritance from two classes. Inlined readOnly, reset */ @JSGlobal("dojox.mobile.CheckBox")
@js.native
class CheckBox () extends ToggleButton {
  def this(params: js.Object) = this()
  def this(params: js.Object, srcNodeRef: HTMLElement) = this()
  /**
    * Should this widget respond to user input?
    * In markup, this is specified as "readOnly".
    * Similar to disabled except readOnly form values are submitted.
    *
    */
  var readOnly: Boolean = js.native
  @JSName("get")
  def get_readOnly(property: readOnly): Boolean = js.native
  @JSName("set")
  def set_readOnly(property: readOnly, value: Boolean): Unit = js.native
  @JSName("watch")
  def watch_readOnly(
    property: readOnly,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): Anon_Unwatch = js.native
}

