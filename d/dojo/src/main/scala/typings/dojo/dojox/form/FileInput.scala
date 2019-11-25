package typings.dojo.dojox.form

import typings.dojo.Anon_Unwatch
import typings.dojo.dijit.form._FormWidget
import typings.dojo.dojoStrings.cancelText
import typings.dojo.dojoStrings.label
import typings.dojo.dojoStrings.value
import typings.std.Event
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/form/FileInput.html
  *
  * A styled input type="file"
  * A input type="file" form widget, with a button for uploading to be styled via css,
  * a cancel button to clear selection, and FormWidget mixin to provide standard dijit.form.Form
  * support (FIXME: maybe not fully implemented)
  *
  * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.
  * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree
  */
@JSGlobal("dojox.form.FileInput")
@js.native
class FileInput () extends _FormWidget {
  def this(params: js.Object) = this()
  def this(params: js.Object, srcNodeRef: HTMLElement) = this()
  /**
    * the title of the "Cancel" button
    *
    */
  var cancelText: String = js.native
  /**
    * the title text of the "Browse" button
    *
    */
  var label: String = js.native
  /**
    * Corresponds to the native HTML <input> element's attribute.
    *
    */
  @JSName("value")
  var value_FileInput: String = js.native
  @JSName("get")
  def get_cancelText(property: cancelText): String = js.native
  @JSName("get")
  def get_label(property: label): String = js.native
  /**
    * on click of cancel button, since we can't clear the input because of
    * security reasons, we destroy it, and add a new one in it's place.
    *
    * @param e
    */
  def reset(e: Event): Unit = js.native
  /**
    * method to allow use to change button label
    *
    * @param label
    * @param cssClass               OptionalThe class to use during the manipulation
    */
  def setLabel(label: String, cssClass: String): Unit = js.native
  @JSName("set")
  def set_cancelText(property: cancelText, value: String): Unit = js.native
  @JSName("set")
  def set_label(property: label, value: String): Unit = js.native
  @JSName("set")
  def set_value(property: value, value: String): Unit = js.native
  @JSName("watch")
  def watch_cancelText(
    property: cancelText,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_label(
    property: label,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): Anon_Unwatch = js.native
}

