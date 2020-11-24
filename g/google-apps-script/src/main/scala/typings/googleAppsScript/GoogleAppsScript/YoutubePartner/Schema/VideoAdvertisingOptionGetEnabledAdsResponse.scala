package typings.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VideoAdvertisingOptionGetEnabledAdsResponse extends js.Object {
  
  var adBreaks: js.UndefOr[js.Array[AdBreak]] = js.native
  
  var adsOnEmbeds: js.UndefOr[Boolean] = js.native
  
  var countriesRestriction: js.UndefOr[js.Array[CountriesRestriction]] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var kind: js.UndefOr[String] = js.native
}
object VideoAdvertisingOptionGetEnabledAdsResponse {
  
  @scala.inline
  def apply(): VideoAdvertisingOptionGetEnabledAdsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VideoAdvertisingOptionGetEnabledAdsResponse]
  }
  
  @scala.inline
  implicit class VideoAdvertisingOptionGetEnabledAdsResponseOps[Self <: VideoAdvertisingOptionGetEnabledAdsResponse] (val x: Self) extends AnyVal {
    
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
    def setAdBreaksVarargs(value: AdBreak*): Self = this.set("adBreaks", js.Array(value :_*))
    
    @scala.inline
    def setAdBreaks(value: js.Array[AdBreak]): Self = this.set("adBreaks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdBreaks: Self = this.set("adBreaks", js.undefined)
    
    @scala.inline
    def setAdsOnEmbeds(value: Boolean): Self = this.set("adsOnEmbeds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdsOnEmbeds: Self = this.set("adsOnEmbeds", js.undefined)
    
    @scala.inline
    def setCountriesRestrictionVarargs(value: CountriesRestriction*): Self = this.set("countriesRestriction", js.Array(value :_*))
    
    @scala.inline
    def setCountriesRestriction(value: js.Array[CountriesRestriction]): Self = this.set("countriesRestriction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCountriesRestriction: Self = this.set("countriesRestriction", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
  }
}
