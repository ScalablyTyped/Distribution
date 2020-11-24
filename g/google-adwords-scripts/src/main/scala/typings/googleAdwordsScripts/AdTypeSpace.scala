package typings.googleAdwordsScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AdTypeSpace extends js.Object {
  
  def expandedTextAd(): Boolean = js.native
  
  def gmailImageAd(): Boolean = js.native
  
  def gmailMultiProductAd(): Boolean = js.native
  
  def gmailSinglePromotionAd(): Boolean = js.native
  
  def html5Ad(): Boolean = js.native
  
  def imageAd(): Boolean = js.native
  
  def responsiveDisplayAd(): Boolean = js.native
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
  
  @scala.inline
  implicit class AdTypeSpaceOps[Self <: AdTypeSpace] (val x: Self) extends AnyVal {
    
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
    def setExpandedTextAd(value: () => Boolean): Self = this.set("expandedTextAd", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGmailImageAd(value: () => Boolean): Self = this.set("gmailImageAd", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGmailMultiProductAd(value: () => Boolean): Self = this.set("gmailMultiProductAd", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGmailSinglePromotionAd(value: () => Boolean): Self = this.set("gmailSinglePromotionAd", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHtml5Ad(value: () => Boolean): Self = this.set("html5Ad", js.Any.fromFunction0(value))
    
    @scala.inline
    def setImageAd(value: () => Boolean): Self = this.set("imageAd", js.Any.fromFunction0(value))
    
    @scala.inline
    def setResponsiveDisplayAd(value: () => Boolean): Self = this.set("responsiveDisplayAd", js.Any.fromFunction0(value))
  }
}
