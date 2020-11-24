package typings.evernote.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AdvertiserName extends js.Object {
  
  var advertiserName: js.UndefOr[String] = js.native
  
  var destinationUrl: js.UndefOr[String] = js.native
  
  var displayFrequency: js.UndefOr[Double] = js.native
  
  var displaySeconds: js.UndefOr[Double] = js.native
  
  var height: js.UndefOr[Double] = js.native
  
  var html: js.UndefOr[String] = js.native
  
  var id: js.UndefOr[Double] = js.native
  
  var image: js.UndefOr[String] = js.native
  
  var imageMime: js.UndefOr[String] = js.native
  
  var imageUrl: js.UndefOr[String] = js.native
  
  var openInTrunk: js.UndefOr[Boolean] = js.native
  
  var score: js.UndefOr[Double] = js.native
  
  var width: js.UndefOr[Double] = js.native
}
object AdvertiserName {
  
  @scala.inline
  def apply(): AdvertiserName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdvertiserName]
  }
  
  @scala.inline
  implicit class AdvertiserNameOps[Self <: AdvertiserName] (val x: Self) extends AnyVal {
    
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
    def setAdvertiserName(value: String): Self = this.set("advertiserName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdvertiserName: Self = this.set("advertiserName", js.undefined)
    
    @scala.inline
    def setDestinationUrl(value: String): Self = this.set("destinationUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDestinationUrl: Self = this.set("destinationUrl", js.undefined)
    
    @scala.inline
    def setDisplayFrequency(value: Double): Self = this.set("displayFrequency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayFrequency: Self = this.set("displayFrequency", js.undefined)
    
    @scala.inline
    def setDisplaySeconds(value: Double): Self = this.set("displaySeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplaySeconds: Self = this.set("displaySeconds", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setHtml(value: String): Self = this.set("html", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHtml: Self = this.set("html", js.undefined)
    
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setImage(value: String): Self = this.set("image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImage: Self = this.set("image", js.undefined)
    
    @scala.inline
    def setImageMime(value: String): Self = this.set("imageMime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageMime: Self = this.set("imageMime", js.undefined)
    
    @scala.inline
    def setImageUrl(value: String): Self = this.set("imageUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageUrl: Self = this.set("imageUrl", js.undefined)
    
    @scala.inline
    def setOpenInTrunk(value: Boolean): Self = this.set("openInTrunk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpenInTrunk: Self = this.set("openInTrunk", js.undefined)
    
    @scala.inline
    def setScore(value: Double): Self = this.set("score", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScore: Self = this.set("score", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
