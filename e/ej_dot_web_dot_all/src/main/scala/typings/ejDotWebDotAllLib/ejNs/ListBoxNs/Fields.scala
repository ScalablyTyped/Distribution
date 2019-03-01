package typings
package ejDotWebDotAllLib.ejNs.ListBoxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Fields extends js.Object {
  /** Defines the specific field name which contains Boolean values to specify whether the list items to be checked by default or not.
    */
  var checkBy: js.UndefOr[scala.Boolean] = js.undefined
  /** The grouping in the ListBox widget can be defined using this field.
    */
  var groupBy: js.UndefOr[java.lang.String] = js.undefined
  /** Defines the HTML attributes such as id, class, styles for the specific ListBox item.
    */
  var htmlAttributes: js.UndefOr[js.Any] = js.undefined
  /** Defines the specific field name which contains id values for the list items.
    */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** Defines the image attributes such as height, width, styles and so on.
    */
  var imageAttributes: js.UndefOr[java.lang.String] = js.undefined
  /** Defines the imageURL for the image to be displayed in the ListBox item.
    */
  var imageUrl: js.UndefOr[java.lang.String] = js.undefined
  /** Defines the specific field name which contains Boolean values to specify whether the list items to be selected by default or not.
    */
  var selectBy: js.UndefOr[scala.Boolean] = js.undefined
  /** Defines the sprite CSS class for the image to be displayed.
    */
  var spriteCssClass: js.UndefOr[java.lang.String] = js.undefined
  /** Defines the table name to get the specific set of list items to be loaded in the ListBox widget while rendering with remote data.
    */
  var tableName: js.UndefOr[java.lang.String] = js.undefined
  /** Defines the specific field name in the data source to load the list with data.
    */
  var text: js.UndefOr[java.lang.String] = js.undefined
  /** Defines the specific field name in the data source to load the list with data value property.
    */
  var value: js.UndefOr[java.lang.String] = js.undefined
}

object Fields {
  @scala.inline
  def apply(
    checkBy: js.UndefOr[scala.Boolean] = js.undefined,
    groupBy: java.lang.String = null,
    htmlAttributes: js.Any = null,
    id: java.lang.String = null,
    imageAttributes: java.lang.String = null,
    imageUrl: java.lang.String = null,
    selectBy: js.UndefOr[scala.Boolean] = js.undefined,
    spriteCssClass: java.lang.String = null,
    tableName: java.lang.String = null,
    text: java.lang.String = null,
    value: java.lang.String = null
  ): Fields = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(checkBy)) __obj.updateDynamic("checkBy")(checkBy)
    if (groupBy != null) __obj.updateDynamic("groupBy")(groupBy)
    if (htmlAttributes != null) __obj.updateDynamic("htmlAttributes")(htmlAttributes)
    if (id != null) __obj.updateDynamic("id")(id)
    if (imageAttributes != null) __obj.updateDynamic("imageAttributes")(imageAttributes)
    if (imageUrl != null) __obj.updateDynamic("imageUrl")(imageUrl)
    if (!js.isUndefined(selectBy)) __obj.updateDynamic("selectBy")(selectBy)
    if (spriteCssClass != null) __obj.updateDynamic("spriteCssClass")(spriteCssClass)
    if (tableName != null) __obj.updateDynamic("tableName")(tableName)
    if (text != null) __obj.updateDynamic("text")(text)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[Fields]
  }
}

