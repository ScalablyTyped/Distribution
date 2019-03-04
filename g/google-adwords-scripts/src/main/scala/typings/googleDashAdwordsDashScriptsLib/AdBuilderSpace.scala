package typings
package googleDashAdwordsDashScriptsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdBuilderSpace extends js.Object {
  def expandedTextAdBuilder(): ExpandedTextAdBuilder[ExpandedTextAd]
  def gmailImageAdBuilder(): GmailImageAdBuilder[GmailImageAd]
  def gmailMultiProductAdBuilder(): GmailMultiProductAdBuilder[GmailMultiProductAd]
  def gmailSinglePromotionAdBuilder(): GmailSinglePromotionAdBuilder[GmailSinglePromotionAd]
  def html5AdBuilder(): Html5AdBuilder[Html5Ad]
  def imageAdBuilder(): ImageAdBuilder[ImageAd]
  def responsiveDisplayAdBuilder(): ResponsiveDisplayAdBuilder[ResponsiveDisplayAd]
}

object AdBuilderSpace {
  @scala.inline
  def apply(
    expandedTextAdBuilder: js.Function0[ExpandedTextAdBuilder[ExpandedTextAd]],
    gmailImageAdBuilder: js.Function0[GmailImageAdBuilder[GmailImageAd]],
    gmailMultiProductAdBuilder: js.Function0[GmailMultiProductAdBuilder[GmailMultiProductAd]],
    gmailSinglePromotionAdBuilder: js.Function0[GmailSinglePromotionAdBuilder[GmailSinglePromotionAd]],
    html5AdBuilder: js.Function0[Html5AdBuilder[Html5Ad]],
    imageAdBuilder: js.Function0[ImageAdBuilder[ImageAd]],
    responsiveDisplayAdBuilder: js.Function0[ResponsiveDisplayAdBuilder[ResponsiveDisplayAd]]
  ): AdBuilderSpace = {
    val __obj = js.Dynamic.literal(expandedTextAdBuilder = expandedTextAdBuilder, gmailImageAdBuilder = gmailImageAdBuilder, gmailMultiProductAdBuilder = gmailMultiProductAdBuilder, gmailSinglePromotionAdBuilder = gmailSinglePromotionAdBuilder, html5AdBuilder = html5AdBuilder, imageAdBuilder = imageAdBuilder, responsiveDisplayAdBuilder = responsiveDisplayAdBuilder)
  
    __obj.asInstanceOf[AdBuilderSpace]
  }
}

