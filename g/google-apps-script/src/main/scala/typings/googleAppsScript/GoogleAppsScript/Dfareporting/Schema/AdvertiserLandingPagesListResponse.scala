package typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AdvertiserLandingPagesListResponse extends js.Object {
  
  var kind: js.UndefOr[String] = js.native
  
  var landingPages: js.UndefOr[js.Array[LandingPage]] = js.native
  
  var nextPageToken: js.UndefOr[String] = js.native
}
object AdvertiserLandingPagesListResponse {
  
  @scala.inline
  def apply(): AdvertiserLandingPagesListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdvertiserLandingPagesListResponse]
  }
  
  @scala.inline
  implicit class AdvertiserLandingPagesListResponseOps[Self <: AdvertiserLandingPagesListResponse] (val x: Self) extends AnyVal {
    
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
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setLandingPagesVarargs(value: LandingPage*): Self = this.set("landingPages", js.Array(value :_*))
    
    @scala.inline
    def setLandingPages(value: js.Array[LandingPage]): Self = this.set("landingPages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLandingPages: Self = this.set("landingPages", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
}
