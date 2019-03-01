package typings
package ejDotWebDotAllLib.ejNs.RadialMenuNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Item extends js.Object {
  /** Specifies radialmenu item badges.
    */
  var badge: js.UndefOr[ItemsBadge] = js.undefined
  /** specify the click event to corresponding image/text for performing some specific action.
    */
  var click: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the enable state of RadialMenu item.
    */
  var enabled: js.UndefOr[scala.Boolean] = js.undefined
  /** Specify the URL of the frame background image for radial menu item.
    */
  var imageUrl: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies to add sub level items .
    */
  var items: js.UndefOr[js.Array[_]] = js.undefined
  /** Specifies the template property of RadialMenu for SVG icon.
    */
  var prependTo: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the sliderSettings ticks for nested radial menu items.
    */
  var sliderSettings: js.UndefOr[ItemsSliderSettings] = js.undefined
  /** Specifies the text of RadialMenu item.
    */
  var text: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the type of nested radial menu item.
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object Item {
  @scala.inline
  def apply(
    badge: ItemsBadge = null,
    click: java.lang.String = null,
    enabled: js.UndefOr[scala.Boolean] = js.undefined,
    imageUrl: java.lang.String = null,
    items: js.Array[_] = null,
    prependTo: java.lang.String = null,
    sliderSettings: ItemsSliderSettings = null,
    text: java.lang.String = null,
    `type`: java.lang.String = null
  ): Item = {
    val __obj = js.Dynamic.literal()
    if (badge != null) __obj.updateDynamic("badge")(badge)
    if (click != null) __obj.updateDynamic("click")(click)
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (imageUrl != null) __obj.updateDynamic("imageUrl")(imageUrl)
    if (items != null) __obj.updateDynamic("items")(items)
    if (prependTo != null) __obj.updateDynamic("prependTo")(prependTo)
    if (sliderSettings != null) __obj.updateDynamic("sliderSettings")(sliderSettings)
    if (text != null) __obj.updateDynamic("text")(text)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Item]
  }
}

