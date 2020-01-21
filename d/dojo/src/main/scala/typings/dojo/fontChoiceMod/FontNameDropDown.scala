package typings.dojo.fontChoiceMod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dijit/_editor/plugins/FontChoice._FontNameDropDown.html
  *
  * Dropdown to select a font; goes in editor toolbar.
  * 
  * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.     
  * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree     
  */
@JSImport("dijit/_editor/plugins/FontChoice", "_FontNameDropDown")
@js.native
class FontNameDropDown ()
  extends typings.dojo.dijit._editor.plugins.FontChoice.FontNameDropDown {
  def this(params: js.Object) = this()
  def this(params: js.Object, srcNodeRef: HTMLElement) = this()
}

