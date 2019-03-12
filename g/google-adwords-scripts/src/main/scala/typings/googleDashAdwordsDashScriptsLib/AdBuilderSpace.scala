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
    expandedTextAdBuilder: () => ExpandedTextAdBuilder[ExpandedTextAd],
    gmailImageAdBuilder: () => GmailImageAdBuilder[GmailImageAd],
    gmailMultiProductAdBuilder: () => GmailMultiProductAdBuilder[GmailMultiProductAd],
    gmailSinglePromotionAdBuilder: () => GmailSinglePromotionAdBuilder[GmailSinglePromotionAd],
    html5AdBuilder: () => Html5AdBuilder[Html5Ad],
    imageAdBuilder: () => ImageAdBuilder[ImageAd],
    responsiveDisplayAdBuilder: () => ResponsiveDisplayAdBuilder[ResponsiveDisplayAd]
  ): AdBuilderSpace = {
    val __obj = js.Dynamic.literal(expandedTextAdBuilder = js.Any.fromFunction0(expandedTextAdBuilder), gmailImageAdBuilder = js.Any.fromFunction0(gmailImageAdBuilder), gmailMultiProductAdBuilder = js.Any.fromFunction0(gmailMultiProductAdBuilder), gmailSinglePromotionAdBuilder = js.Any.fromFunction0(gmailSinglePromotionAdBuilder), html5AdBuilder = js.Any.fromFunction0(html5AdBuilder), imageAdBuilder = js.Any.fromFunction0(imageAdBuilder), responsiveDisplayAdBuilder = js.Any.fromFunction0(responsiveDisplayAdBuilder))
  
    __obj.asInstanceOf[AdBuilderSpace]
  }
}

