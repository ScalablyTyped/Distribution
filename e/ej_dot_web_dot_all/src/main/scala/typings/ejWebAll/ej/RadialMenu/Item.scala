package typings.ejWebAll.ej.RadialMenu

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Item extends js.Object {
  /** Specifies radialmenu item badges.
    */
  var badge: js.UndefOr[ItemsBadge] = js.undefined
  /** specify the click event to corresponding image/text for performing some specific action.
    */
  var click: js.UndefOr[String] = js.undefined
  /** Specifies the enable state of RadialMenu item.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  /** Specify the URL of the frame background image for radial menu item.
    */
  var imageUrl: js.UndefOr[String] = js.undefined
  /** Specifies to add sub level items .
    */
  var items: js.UndefOr[js.Array[_]] = js.undefined
  /** Specifies the template property of RadialMenu for SVG icon.
    */
  var prependTo: js.UndefOr[String] = js.undefined
  /** Specifies the sliderSettings ticks for nested radial menu items.
    */
  var sliderSettings: js.UndefOr[ItemsSliderSettings] = js.undefined
  /** Specifies the text of RadialMenu item.
    */
  var text: js.UndefOr[String] = js.undefined
  /** Specifies the type of nested radial menu item.
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object Item {
  @scala.inline
  def apply(
    badge: ItemsBadge = null,
    click: String = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    imageUrl: String = null,
    items: js.Array[_] = null,
    prependTo: String = null,
    sliderSettings: ItemsSliderSettings = null,
    text: String = null,
    `type`: String = null
  ): Item = {
    val __obj = js.Dynamic.literal()
    if (badge != null) __obj.updateDynamic("badge")(badge.asInstanceOf[js.Any])
    if (click != null) __obj.updateDynamic("click")(click.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (imageUrl != null) __obj.updateDynamic("imageUrl")(imageUrl.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (prependTo != null) __obj.updateDynamic("prependTo")(prependTo.asInstanceOf[js.Any])
    if (sliderSettings != null) __obj.updateDynamic("sliderSettings")(sliderSettings.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Item]
  }
}

