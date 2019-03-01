package typings
package ejDotWebDotAllLib.ejNs.GridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToolbarSettingsCustomToolbarItem extends js.Object {
  /** Gets or sets a value that indicates whether to add custom toolbar item as a template element.
    */
  var templateID: js.UndefOr[java.lang.String] = js.undefined
  /** Gets or sets a value that indicates whether to add custom toolbar item with a custom tooltip.
    */
  var tooltip: js.UndefOr[java.lang.String] = js.undefined
}

object ToolbarSettingsCustomToolbarItem {
  @scala.inline
  def apply(templateID: java.lang.String = null, tooltip: java.lang.String = null): ToolbarSettingsCustomToolbarItem = {
    val __obj = js.Dynamic.literal()
    if (templateID != null) __obj.updateDynamic("templateID")(templateID)
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip)
    __obj.asInstanceOf[ToolbarSettingsCustomToolbarItem]
  }
}

