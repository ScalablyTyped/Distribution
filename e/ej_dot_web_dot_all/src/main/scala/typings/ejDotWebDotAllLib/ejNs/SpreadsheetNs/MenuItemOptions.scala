package typings
package ejDotWebDotAllLib.ejNs.SpreadsheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MenuItemOptions extends js.Object {
  /** Pass the id to update the menu item
    */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** Pass the parent id to update the menu item
    */
  var parentId: js.UndefOr[java.lang.String] = js.undefined
  /** Pass the sprite css class to update the menu item
    */
  var spriteCssClass: js.UndefOr[java.lang.String] = js.undefined
  /** Pass the text to update the menu item
    */
  var text: js.UndefOr[java.lang.String] = js.undefined
}

object MenuItemOptions {
  @scala.inline
  def apply(
    id: java.lang.String = null,
    parentId: java.lang.String = null,
    spriteCssClass: java.lang.String = null,
    text: java.lang.String = null
  ): MenuItemOptions = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id)
    if (parentId != null) __obj.updateDynamic("parentId")(parentId)
    if (spriteCssClass != null) __obj.updateDynamic("spriteCssClass")(spriteCssClass)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[MenuItemOptions]
  }
}

