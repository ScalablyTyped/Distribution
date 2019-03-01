package typings
package googleDashAdwordsDashScriptsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdTypeSpace extends js.Object {
  def expandedTextAd(): scala.Boolean
  def gmailImageAd(): scala.Boolean
  def gmailMultiProductAd(): scala.Boolean
  def gmailSinglePromotionAd(): scala.Boolean
  def html5Ad(): scala.Boolean
  def imageAd(): scala.Boolean
  def responsiveDisplayAd(): scala.Boolean
}

object AdTypeSpace {
  @scala.inline
  def apply(
    expandedTextAd: js.Function0[scala.Boolean],
    gmailImageAd: js.Function0[scala.Boolean],
    gmailMultiProductAd: js.Function0[scala.Boolean],
    gmailSinglePromotionAd: js.Function0[scala.Boolean],
    html5Ad: js.Function0[scala.Boolean],
    imageAd: js.Function0[scala.Boolean],
    responsiveDisplayAd: js.Function0[scala.Boolean]
  ): AdTypeSpace = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("expandedTextAd")(expandedTextAd)
    __obj.updateDynamic("gmailImageAd")(gmailImageAd)
    __obj.updateDynamic("gmailMultiProductAd")(gmailMultiProductAd)
    __obj.updateDynamic("gmailSinglePromotionAd")(gmailSinglePromotionAd)
    __obj.updateDynamic("html5Ad")(html5Ad)
    __obj.updateDynamic("imageAd")(imageAd)
    __obj.updateDynamic("responsiveDisplayAd")(responsiveDisplayAd)
    __obj.asInstanceOf[AdTypeSpace]
  }
}

