package typings.googleAdwordsScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdBuilderSpace extends js.Object {
  def expandedTextAdBuilder(): ExpandedTextAdBuilder[ExpandedTextAd] = js.native
  def gmailImageAdBuilder(): GmailImageAdBuilder[GmailImageAd] = js.native
  def gmailMultiProductAdBuilder(): GmailMultiProductAdBuilder[GmailMultiProductAd] = js.native
  def gmailSinglePromotionAdBuilder(): GmailSinglePromotionAdBuilder[GmailSinglePromotionAd] = js.native
  def html5AdBuilder(): Html5AdBuilder[Html5Ad] = js.native
  def imageAdBuilder(): ImageAdBuilder[ImageAd] = js.native
  def responsiveDisplayAdBuilder(): ResponsiveDisplayAdBuilder[ResponsiveDisplayAd] = js.native
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
  @scala.inline
  implicit class AdBuilderSpaceOps[Self <: AdBuilderSpace] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setExpandedTextAdBuilder(value: () => ExpandedTextAdBuilder[ExpandedTextAd]): Self = this.set("expandedTextAdBuilder", js.Any.fromFunction0(value))
    @scala.inline
    def setGmailImageAdBuilder(value: () => GmailImageAdBuilder[GmailImageAd]): Self = this.set("gmailImageAdBuilder", js.Any.fromFunction0(value))
    @scala.inline
    def setGmailMultiProductAdBuilder(value: () => GmailMultiProductAdBuilder[GmailMultiProductAd]): Self = this.set("gmailMultiProductAdBuilder", js.Any.fromFunction0(value))
    @scala.inline
    def setGmailSinglePromotionAdBuilder(value: () => GmailSinglePromotionAdBuilder[GmailSinglePromotionAd]): Self = this.set("gmailSinglePromotionAdBuilder", js.Any.fromFunction0(value))
    @scala.inline
    def setHtml5AdBuilder(value: () => Html5AdBuilder[Html5Ad]): Self = this.set("html5AdBuilder", js.Any.fromFunction0(value))
    @scala.inline
    def setImageAdBuilder(value: () => ImageAdBuilder[ImageAd]): Self = this.set("imageAdBuilder", js.Any.fromFunction0(value))
    @scala.inline
    def setResponsiveDisplayAdBuilder(value: () => ResponsiveDisplayAdBuilder[ResponsiveDisplayAd]): Self = this.set("responsiveDisplayAdBuilder", js.Any.fromFunction0(value))
  }
  
}

