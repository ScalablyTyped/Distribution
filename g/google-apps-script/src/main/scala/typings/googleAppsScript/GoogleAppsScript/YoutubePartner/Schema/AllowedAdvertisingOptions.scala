package typings.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AllowedAdvertisingOptions extends js.Object {
  
  var adsOnEmbeds: js.UndefOr[Boolean] = js.native
  
  var kind: js.UndefOr[String] = js.native
  
  var licAdFormats: js.UndefOr[js.Array[String]] = js.native
  
  var ugcAdFormats: js.UndefOr[js.Array[String]] = js.native
}
object AllowedAdvertisingOptions {
  
  @scala.inline
  def apply(): AllowedAdvertisingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AllowedAdvertisingOptions]
  }
  
  @scala.inline
  implicit class AllowedAdvertisingOptionsOps[Self <: AllowedAdvertisingOptions] (val x: Self) extends AnyVal {
    
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
    def setAdsOnEmbeds(value: Boolean): Self = this.set("adsOnEmbeds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdsOnEmbeds: Self = this.set("adsOnEmbeds", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setLicAdFormatsVarargs(value: String*): Self = this.set("licAdFormats", js.Array(value :_*))
    
    @scala.inline
    def setLicAdFormats(value: js.Array[String]): Self = this.set("licAdFormats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLicAdFormats: Self = this.set("licAdFormats", js.undefined)
    
    @scala.inline
    def setUgcAdFormatsVarargs(value: String*): Self = this.set("ugcAdFormats", js.Array(value :_*))
    
    @scala.inline
    def setUgcAdFormats(value: js.Array[String]): Self = this.set("ugcAdFormats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUgcAdFormats: Self = this.set("ugcAdFormats", js.undefined)
  }
}
