package typings.ejDotWebDotAll.ej.Toolbar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Fields extends js.Object {
  /** Defines the group name for the item.
    */
  var group: js.UndefOr[String] = js.undefined
  /** Defines the HTML attributes such as id, class, styles for the item to extend the capability.
    */
  var htmlAttributes: js.UndefOr[js.Any] = js.undefined
  /** Defines id for the tag.
    */
  var id: js.UndefOr[String] = js.undefined
  /** Defines the image attributes such as height, width, styles and so on.
    */
  var imageAttributes: js.UndefOr[String] = js.undefined
  /** Defines the imageURL for the image location.
    */
  var imageUrl: js.UndefOr[String] = js.undefined
  /** Defines the sprite CSS for the image tag.
    */
  var spriteCssClass: js.UndefOr[String] = js.undefined
  /** Allows you to add  template as toolbar item
    */
  var template: js.UndefOr[String] = js.undefined
  /** Defines the text content for the tag.
    */
  var text: js.UndefOr[String] = js.undefined
  /** Defines the tooltip text for the tag.
    */
  var tooltipText: js.UndefOr[String] = js.undefined
}

object Fields {
  @scala.inline
  def apply(
    group: String = null,
    htmlAttributes: js.Any = null,
    id: String = null,
    imageAttributes: String = null,
    imageUrl: String = null,
    spriteCssClass: String = null,
    template: String = null,
    text: String = null,
    tooltipText: String = null
  ): Fields = {
    val __obj = js.Dynamic.literal()
    if (group != null) __obj.updateDynamic("group")(group)
    if (htmlAttributes != null) __obj.updateDynamic("htmlAttributes")(htmlAttributes)
    if (id != null) __obj.updateDynamic("id")(id)
    if (imageAttributes != null) __obj.updateDynamic("imageAttributes")(imageAttributes)
    if (imageUrl != null) __obj.updateDynamic("imageUrl")(imageUrl)
    if (spriteCssClass != null) __obj.updateDynamic("spriteCssClass")(spriteCssClass)
    if (template != null) __obj.updateDynamic("template")(template)
    if (text != null) __obj.updateDynamic("text")(text)
    if (tooltipText != null) __obj.updateDynamic("tooltipText")(tooltipText)
    __obj.asInstanceOf[Fields]
  }
}

