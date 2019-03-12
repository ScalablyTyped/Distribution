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
    expandedTextAd: () => scala.Boolean,
    gmailImageAd: () => scala.Boolean,
    gmailMultiProductAd: () => scala.Boolean,
    gmailSinglePromotionAd: () => scala.Boolean,
    html5Ad: () => scala.Boolean,
    imageAd: () => scala.Boolean,
    responsiveDisplayAd: () => scala.Boolean
  ): AdTypeSpace = {
    val __obj = js.Dynamic.literal(expandedTextAd = js.Any.fromFunction0(expandedTextAd), gmailImageAd = js.Any.fromFunction0(gmailImageAd), gmailMultiProductAd = js.Any.fromFunction0(gmailMultiProductAd), gmailSinglePromotionAd = js.Any.fromFunction0(gmailSinglePromotionAd), html5Ad = js.Any.fromFunction0(html5Ad), imageAd = js.Any.fromFunction0(imageAd), responsiveDisplayAd = js.Any.fromFunction0(responsiveDisplayAd))
  
    __obj.asInstanceOf[AdTypeSpace]
  }
}

