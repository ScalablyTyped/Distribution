package typings.gapiDotClientDotAdsense

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Background extends js.Object {
  /** The color of the ad background. */
  var background: js.UndefOr[String] = js.undefined
  /** The color of the ad border. */
  var border: js.UndefOr[String] = js.undefined
  /** The color of the ad text. */
  var text: js.UndefOr[String] = js.undefined
  /** The color of the ad title. */
  var title: js.UndefOr[String] = js.undefined
  /** The color of the ad url. */
  var url: js.UndefOr[String] = js.undefined
}

object Anon_Background {
  @scala.inline
  def apply(
    background: String = null,
    border: String = null,
    text: String = null,
    title: String = null,
    url: String = null
  ): Anon_Background = {
    val __obj = js.Dynamic.literal()
    if (background != null) __obj.updateDynamic("background")(background)
    if (border != null) __obj.updateDynamic("border")(border)
    if (text != null) __obj.updateDynamic("text")(text)
    if (title != null) __obj.updateDynamic("title")(title)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[Anon_Background]
  }
}

