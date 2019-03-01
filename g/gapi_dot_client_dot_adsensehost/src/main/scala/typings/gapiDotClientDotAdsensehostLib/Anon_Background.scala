package typings
package gapiDotClientDotAdsensehostLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Background extends js.Object {
  /** The color of the ad background. */
  var background: js.UndefOr[java.lang.String] = js.undefined
  /** The color of the ad border. */
  var border: js.UndefOr[java.lang.String] = js.undefined
  /** The color of the ad text. */
  var text: js.UndefOr[java.lang.String] = js.undefined
  /** The color of the ad title. */
  var title: js.UndefOr[java.lang.String] = js.undefined
  /** The color of the ad url. */
  var url: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Background {
  @scala.inline
  def apply(
    background: java.lang.String = null,
    border: java.lang.String = null,
    text: java.lang.String = null,
    title: java.lang.String = null,
    url: java.lang.String = null
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

