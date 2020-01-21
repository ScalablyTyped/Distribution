package typings.dojo.inlineEditBoxMod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dijit/InlineEditBox._InlineEditor.html
  *
  * Internal widget used by InlineEditBox, displayed when in editing mode
  * to display the editor and maybe save/cancel buttons.  Calling code should
  * connect to save/cancel methods to detect when editing is finished
  * 
  * Has mainly the same parameters as InlineEditBox, plus these values:
  * 
  * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.     
  * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree     
  */
@JSImport("dijit/InlineEditBox", "_InlineEditor")
@js.native
class InlineEditor ()
  extends typings.dojo.dijit.InlineEditBox.InlineEditor {
  def this(params: js.Object) = this()
  def this(params: js.Object, srcNodeRef: HTMLElement) = this()
}

