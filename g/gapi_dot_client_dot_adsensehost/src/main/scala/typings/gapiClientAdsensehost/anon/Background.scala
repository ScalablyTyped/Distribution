package typings.gapiClientAdsensehost.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Background extends js.Object {
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

object Background {
  @scala.inline
  def apply(
    background: String = null,
    border: String = null,
    text: String = null,
    title: String = null,
    url: String = null
  ): Background = {
    val __obj = js.Dynamic.literal()
    if (background != null) __obj.updateDynamic("background")(background.asInstanceOf[js.Any])
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Background]
  }
}

