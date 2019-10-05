package typings.dojo.dojox.mobile

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/mobile/ExpandingTextArea.html
  *
  * Non-templated TEXTAREA widget with the capability to adjust its
  * height according to the amount of data.
  * A textarea that dynamically expands/contracts (changing its height) as
  * the user types, to display all the text without requiring a vertical scroll bar.
  *
  * Takes all the parameters (name, value, etc.) that a vanilla textarea takes.
  * Rows are not supported since this widget adjusts its height.
  *
  * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.
  * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.dojo.dijit.form._ExpandingTextAreaMixin because Inheritance from two classes. Inlined postCreate, resize, startup */ @JSGlobal("dojox.mobile.ExpandingTextArea")
@js.native
class ExpandingTextArea () extends TextArea {
  def this(params: js.Object) = this()
  def this(params: js.Object, srcNodeRef: HTMLElement) = this()
  /**
    * Resizes the textarea vertically (should be called after a style/value change)
    *
    */
  /**
    * Resizes the textarea vertically (should be called after a style/value change)
    * 
    */
  def resize(): Unit = js.native
}

