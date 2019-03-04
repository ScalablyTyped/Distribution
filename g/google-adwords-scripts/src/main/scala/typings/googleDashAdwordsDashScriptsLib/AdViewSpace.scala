package typings
package googleDashAdwordsDashScriptsLib

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
    expandedTextAd: js.Function0[ExpandedTextAd],
    gmailImageAd: js.Function0[GmailImageAd],
    gmailMultiProductAd: js.Function0[GmailMultiProductAd],
    gmailSinglePromotionAd: js.Function0[GmailSinglePromotionAd],
    html5Ad: js.Function0[Html5Ad],
    imageAd: js.Function0[ImageAd],
    responsiveDisplayAd: js.Function0[ResponsiveDisplayAd]
  ): AdViewSpace = {
    val __obj = js.Dynamic.literal(expandedTextAd = expandedTextAd, gmailImageAd = gmailImageAd, gmailMultiProductAd = gmailMultiProductAd, gmailSinglePromotionAd = gmailSinglePromotionAd, html5Ad = html5Ad, imageAd = imageAd, responsiveDisplayAd = responsiveDisplayAd)
  
    __obj.asInstanceOf[AdViewSpace]
  }
}

