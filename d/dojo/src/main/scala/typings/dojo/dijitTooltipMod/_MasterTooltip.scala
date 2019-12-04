package typings.dojo.dijitTooltipMod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dijit/Tooltip._MasterTooltip.html
  *
  * Internal widget that holds the actual tooltip markup,
  * which occurs once per page.
  * Called by Tooltip widgets which are just containers to hold
  * the markup
  * 
  * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.     
  * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree     
  */
@JSImport("dijit/Tooltip", "_MasterTooltip")
@js.native
class _MasterTooltip ()
  extends typings.dojo.dijit.Tooltip._MasterTooltip {
  def this(params: js.Object) = this()
  def this(params: js.Object, srcNodeRef: HTMLElement) = this()
}

