package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.mod._Global_.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxGalleryItem extends CollectionWidgetItem {
  /** Specifies the text passed to the alt attribute of the image markup element. */
  var imageAlt: js.UndefOr[String] = js.undefined
  /** Specifies the URL of the image displayed by the item. */
  var imageSrc: js.UndefOr[String] = js.undefined
}

object dxGalleryItem {
  @scala.inline
  def apply(
    disabled: js.UndefOr[Boolean] = js.undefined,
    html: String = null,
    imageAlt: String = null,
    imageSrc: String = null,
    template: typings.devextreme.mod.DevExpress.core.template | (js.Function0[String | Element | JQuery]) = null,
    text: String = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): dxGalleryItem = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (html != null) __obj.updateDynamic("html")(html.asInstanceOf[js.Any])
    if (imageAlt != null) __obj.updateDynamic("imageAlt")(imageAlt.asInstanceOf[js.Any])
    if (imageSrc != null) __obj.updateDynamic("imageSrc")(imageSrc.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxGalleryItem]
  }
}

