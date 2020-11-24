package typings.gapiYoutube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleApiYouTubeThumbnailResource extends js.Object {
  
  /**
    * The default thumbnail image. The default thumbnail for a video – or a resource that refers to a video, such as a playlist item or search result – is 120px wide and 90px tall. The default thumbnail for a channel is 88px wide and 88px tall.
    */
  var default: GoogleApiYouTubeThumbnailItemResource = js.native
  
  /**
    * A high resolution version of the thumbnail image. For a video (or a resource that refers to a video), this image is 480px wide and 360px tall. For a channel, this image is 800px wide and 800px tall.
    */
  var high: GoogleApiYouTubeThumbnailItemResource = js.native
  
  /**
    * A very high resolution version of the thumbnail image. For a video (or a resource that refers to a video), this image is 480px wide and 360px tall. For a channel, this image is 800px wide and 800px tall.
    */
  var maxres: js.UndefOr[GoogleApiYouTubeThumbnailItemResource] = js.native
  
  /**
    * A higher resolution version of the thumbnail image. For a video (or a resource that refers to a video), this image is 320px wide and 180px tall. For a channel, this image is 240px wide and 240px tall.
    */
  var medium: GoogleApiYouTubeThumbnailItemResource = js.native
  
  /**
    * A standard resolution version of the thumbnail image. For a video (or a resource that refers to a video), this image is 480px wide and 360px tall. For a channel, this image is 800px wide and 800px tall.
    */
  var standard: js.UndefOr[GoogleApiYouTubeThumbnailItemResource] = js.native
}
object GoogleApiYouTubeThumbnailResource {
  
  @scala.inline
  def apply(
    default: GoogleApiYouTubeThumbnailItemResource,
    high: GoogleApiYouTubeThumbnailItemResource,
    medium: GoogleApiYouTubeThumbnailItemResource
  ): GoogleApiYouTubeThumbnailResource = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any], high = high.asInstanceOf[js.Any], medium = medium.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleApiYouTubeThumbnailResource]
  }
  
  @scala.inline
  implicit class GoogleApiYouTubeThumbnailResourceOps[Self <: GoogleApiYouTubeThumbnailResource] (val x: Self) extends AnyVal {
    
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
    def setDefault(value: GoogleApiYouTubeThumbnailItemResource): Self = this.set("default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHigh(value: GoogleApiYouTubeThumbnailItemResource): Self = this.set("high", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMedium(value: GoogleApiYouTubeThumbnailItemResource): Self = this.set("medium", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxres(value: GoogleApiYouTubeThumbnailItemResource): Self = this.set("maxres", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxres: Self = this.set("maxres", js.undefined)
    
    @scala.inline
    def setStandard(value: GoogleApiYouTubeThumbnailItemResource): Self = this.set("standard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStandard: Self = this.set("standard", js.undefined)
  }
}
