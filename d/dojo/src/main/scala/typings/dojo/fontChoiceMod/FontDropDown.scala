package typings.dojo.fontChoiceMod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dijit/_editor/plugins/FontChoice._FontDropDown.html
  *
  * Base class for widgets that contains a label (like "Font:")
  * and a FilteringSelect drop down to pick a value.
  * Used as Toolbar entry.
  * 
  * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.     
  * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree     
  */
@JSImport("dijit/_editor/plugins/FontChoice", "_FontDropDown")
@js.native
class FontDropDown ()
  extends typings.dojo.dijit._editor.plugins.FontChoice.FontDropDown {
  def this(params: js.Object) = this()
  def this(params: js.Object, srcNodeRef: HTMLElement) = this()
}

