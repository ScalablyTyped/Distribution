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

