package typings.gapiYoutube

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleApiYouTubeThumbnailResource extends StObject {
  
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
  implicit class GoogleApiYouTubeThumbnailResourceMutableBuilder[Self <: GoogleApiYouTubeThumbnailResource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefault(value: GoogleApiYouTubeThumbnailItemResource): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHigh(value: GoogleApiYouTubeThumbnailItemResource): Self = StObject.set(x, "high", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxres(value: GoogleApiYouTubeThumbnailItemResource): Self = StObject.set(x, "maxres", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxresUndefined: Self = StObject.set(x, "maxres", js.undefined)
    
    @scala.inline
    def setMedium(value: GoogleApiYouTubeThumbnailItemResource): Self = StObject.set(x, "medium", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStandard(value: GoogleApiYouTubeThumbnailItemResource): Self = StObject.set(x, "standard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStandardUndefined: Self = StObject.set(x, "standard", js.undefined)
  }
}
