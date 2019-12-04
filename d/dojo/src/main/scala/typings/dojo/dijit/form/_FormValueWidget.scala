package typings.dojo.dijit.form

import typings.dojo.Anon_Unwatch
import typings.dojo.dojoStrings.readOnly
import typings.dojo.dojoStrings.value
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dijit/form/_FormValueWidget.html
  *
  * Base class for widgets corresponding to native HTML elements such as <input> or <select>
  * that have user changeable values.
  * Each _FormValueWidget represents a single input value, and has a (possibly hidden) <input> element,
  * to which it serializes it's input value, so that form submission (either normal submission or via FormBind?)
  * works as expected.
  * 
  * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.     
  * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree     
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.dojo.dijit.form._FormWidgetMixin because Already inherited
- typings.dojo.dijit.form._FormValueMixin because Inheritance from two classes. Inlined readOnly, compare, create, destroy, focus, isFocusable, postCreate, reset, undo, onChange */ @JSGlobal("dijit.form._FormValueWidget")
@js.native
class _FormValueWidget () extends _FormWidget {
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
  /**
    * Reset the widget's value to what it was at initialization time
    * 
    */
  def reset(): Unit = js.native
  @JSName("set")
  def set_readOnly(property: readOnly, value: Boolean): Unit = js.native
  @JSName("set")
  def set_value(property: value, value: js.Any): Unit = js.native
  /**
    * Restore the value to the last value passed to onChange
    * 
    */
  def undo(): Unit = js.native
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

