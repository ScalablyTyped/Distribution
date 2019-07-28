package typings.googleDashAdwordsDashScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdViewSpace extends js.Object {
  def expandedTextAd(): ExpandedTextAd
  def gmailImageAd(): GmailImageAd
  def gmailMultiProductAd(): GmailMultiProductAd
  def gmailSinglePromotionAd(): GmailSinglePromotionAd
  def html5Ad(): Html5Ad
  def imageAd(): ImageAd
  def responsiveDisplayAd(): ResponsiveDisplayAd
}

object AdViewSpace {
  @scala.inline
  def apply(
    expandedTextAd: () => ExpandedTextAd,
    gmailImageAd: () => GmailImageAd,
    gmailMultiProductAd: () => GmailMultiProductAd,
    gmailSinglePromotionAd: () => GmailSinglePromotionAd,
    html5Ad: () => Html5Ad,
    imageAd: () => ImageAd,
    responsiveDisplayAd: () => ResponsiveDisplayAd
  ): AdViewSpace = {
    val __obj = js.Dynamic.literal(expandedTextAd = js.Any.fromFunction0(expandedTextAd), gmailImageAd = js.Any.fromFunction0(gmailImageAd), gmailMultiProductAd = js.Any.fromFunction0(gmailMultiProductAd), gmailSinglePromotionAd = js.Any.fromFunction0(gmailSinglePromotionAd), html5Ad = js.Any.fromFunction0(html5Ad), imageAd = js.Any.fromFunction0(imageAd), responsiveDisplayAd = js.Any.fromFunction0(responsiveDisplayAd))
  
    __obj.asInstanceOf[AdViewSpace]
  }
}

