package typings.gapiDotClientDotAdsense

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Color extends js.Object {
  /** Color to use when type is set to COLOR. */
  var color: js.UndefOr[String] = js.undefined
  /** Type of the backup option. Possible values are BLANK, COLOR and URL. */
  var `type`: js.UndefOr[String] = js.undefined
  /** URL to use when type is set to URL. */
  var url: js.UndefOr[String] = js.undefined
}

object Anon_Color {
  @scala.inline
  def apply(color: String = null, `type`: String = null, url: String = null): Anon_Color = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[Anon_Color]
  }
}

