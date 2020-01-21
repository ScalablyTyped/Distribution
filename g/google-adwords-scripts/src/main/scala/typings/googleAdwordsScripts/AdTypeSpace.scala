package typings.googleAdwordsScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdTypeSpace extends js.Object {
  def expandedTextAd(): Boolean
  def gmailImageAd(): Boolean
  def gmailMultiProductAd(): Boolean
  def gmailSinglePromotionAd(): Boolean
  def html5Ad(): Boolean
  def imageAd(): Boolean
  def responsiveDisplayAd(): Boolean
}

object AdTypeSpace {
  @scala.inline
  def apply(
    expandedTextAd: () => Boolean,
    gmailImageAd: () => Boolean,
    gmailMultiProductAd: () => Boolean,
    gmailSinglePromotionAd: () => Boolean,
    html5Ad: () => Boolean,
    imageAd: () => Boolean,
    responsiveDisplayAd: () => Boolean
  ): AdTypeSpace = {
    val __obj = js.Dynamic.literal(expandedTextAd = js.Any.fromFunction0(expandedTextAd), gmailImageAd = js.Any.fromFunction0(gmailImageAd), gmailMultiProductAd = js.Any.fromFunction0(gmailMultiProductAd), gmailSinglePromotionAd = js.Any.fromFunction0(gmailSinglePromotionAd), html5Ad = js.Any.fromFunction0(html5Ad), imageAd = js.Any.fromFunction0(imageAd), responsiveDisplayAd = js.Any.fromFunction0(responsiveDisplayAd))
  
    __obj.asInstanceOf[AdTypeSpace]
  }
}

