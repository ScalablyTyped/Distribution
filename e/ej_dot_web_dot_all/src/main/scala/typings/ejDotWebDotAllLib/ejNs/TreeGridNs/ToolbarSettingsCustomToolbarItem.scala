package typings
package ejDotWebDotAllLib.ejNs.TreeGridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToolbarSettingsCustomToolbarItem extends js.Object {
  /** Allows the user to insert the custom icons in toolbar using script templates. Using this property we can bind HTML elements and other EJ controls to TreeGrid toolbar.
    */
  var templateID: js.UndefOr[java.lang.String] = js.undefined
  /** Allows the user to insert the custom icons in toolbar using CSS class name selector.
    */
  var text: js.UndefOr[java.lang.String] = js.undefined
  /** Allows the user to display custom tooltip text for TreeGrid custom toolbar items.
    */
  var tooltipText: js.UndefOr[java.lang.String] = js.undefined
}

object ToolbarSettingsCustomToolbarItem {
  @scala.inline
  def apply(
    templateID: java.lang.String = null,
    text: java.lang.String = null,
    tooltipText: java.lang.String = null
  ): ToolbarSettingsCustomToolbarItem = {
    val __obj = js.Dynamic.literal()
    if (templateID != null) __obj.updateDynamic("templateID")(templateID)
    if (text != null) __obj.updateDynamic("text")(text)
    if (tooltipText != null) __obj.updateDynamic("tooltipText")(tooltipText)
    __obj.asInstanceOf[ToolbarSettingsCustomToolbarItem]
  }
}

