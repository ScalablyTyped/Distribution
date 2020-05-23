package typings.ejWebAll.ej.DropDownList

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Fields extends js.Object {
  /** Used to group the items.
    */
  var groupBy: js.UndefOr[String] = js.undefined
  /** Defines the HTML attributes such as ID, class, and styles for the item.
    */
  var htmlAttributes: js.UndefOr[js.Any] = js.undefined
  /** Defines the ID for the tag.
    */
  var id: js.UndefOr[String] = js.undefined
  /** Defines the image attributes such as height, width, styles, and so on.
    */
  var imageAttributes: js.UndefOr[String] = js.undefined
  /** Defines the imageURL for the image location.
    */
  var imageUrl: js.UndefOr[String] = js.undefined
  /** Defines the tag value to be selected initially.
    */
  var selected: js.UndefOr[Boolean] = js.undefined
  /** Defines the sprite CSS for the image tag.
    */
  var spriteCssClass: js.UndefOr[String] = js.undefined
  /** Defines the table name for tag value or display text while rendering remote data.
    */
  var tableName: js.UndefOr[String] = js.undefined
  /** Defines the text content for the tag.
    */
  var text: js.UndefOr[String] = js.undefined
  /** Defines the tag value.
    */
  var value: js.UndefOr[String] = js.undefined
}

object Fields {
  @scala.inline
  def apply(
    groupBy: String = null,
    htmlAttributes: js.Any = null,
    id: String = null,
    imageAttributes: String = null,
    imageUrl: String = null,
    selected: js.UndefOr[Boolean] = js.undefined,
    spriteCssClass: String = null,
    tableName: String = null,
    text: String = null,
    value: String = null
  ): Fields = {
    val __obj = js.Dynamic.literal()
    if (groupBy != null) __obj.updateDynamic("groupBy")(groupBy.asInstanceOf[js.Any])
    if (htmlAttributes != null) __obj.updateDynamic("htmlAttributes")(htmlAttributes.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (imageAttributes != null) __obj.updateDynamic("imageAttributes")(imageAttributes.asInstanceOf[js.Any])
    if (imageUrl != null) __obj.updateDynamic("imageUrl")(imageUrl.asInstanceOf[js.Any])
    if (!js.isUndefined(selected)) __obj.updateDynamic("selected")(selected.get.asInstanceOf[js.Any])
    if (spriteCssClass != null) __obj.updateDynamic("spriteCssClass")(spriteCssClass.asInstanceOf[js.Any])
    if (tableName != null) __obj.updateDynamic("tableName")(tableName.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fields]
  }
}

