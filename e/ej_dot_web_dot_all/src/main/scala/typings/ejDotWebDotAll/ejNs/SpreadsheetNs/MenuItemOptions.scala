package typings.ejDotWebDotAll.ejNs.SpreadsheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MenuItemOptions extends js.Object {
  /** Pass the id to update the menu item
    */
  var id: js.UndefOr[String] = js.undefined
  /** Pass the parent id to update the menu item
    */
  var parentId: js.UndefOr[String] = js.undefined
  /** Pass the sprite css class to update the menu item
    */
  var spriteCssClass: js.UndefOr[String] = js.undefined
  /** Pass the text to update the menu item
    */
  var text: js.UndefOr[String] = js.undefined
}

object MenuItemOptions {
  @scala.inline
  def apply(id: String = null, parentId: String = null, spriteCssClass: String = null, text: String = null): MenuItemOptions = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id)
    if (parentId != null) __obj.updateDynamic("parentId")(parentId)
    if (spriteCssClass != null) __obj.updateDynamic("spriteCssClass")(spriteCssClass)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[MenuItemOptions]
  }
}

