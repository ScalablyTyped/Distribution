package typings.gapiClientAdsense

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonColor extends js.Object {
  /** Color to use when type is set to COLOR. */
  var color: js.UndefOr[String] = js.undefined
  /** Type of the backup option. Possible values are BLANK, COLOR and URL. */
  var `type`: js.UndefOr[String] = js.undefined
  /** URL to use when type is set to URL. */
  var url: js.UndefOr[String] = js.undefined
}

object AnonColor {
  @scala.inline
  def apply(color: String = null, `type`: String = null, url: String = null): AnonColor = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonColor]
  }
}

