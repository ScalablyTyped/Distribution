package typings.gapiYoutube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleApiYouTubeThumbnailItemResource extends js.Object {
  
  /**
    * The images height.
    */
  var height: Double = js.native
  
  /**
    * The images URL.
    */
  var url: String = js.native
  
  /**
    * The images width.
    */
  var width: Double = js.native
}
object GoogleApiYouTubeThumbnailItemResource {
  
  @scala.inline
  def apply(height: Double, url: String, width: Double): GoogleApiYouTubeThumbnailItemResource = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleApiYouTubeThumbnailItemResource]
  }
  
  @scala.inline
  implicit class GoogleApiYouTubeThumbnailItemResourceOps[Self <: GoogleApiYouTubeThumbnailItemResource] (val x: Self) extends AnyVal {
    
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
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
  }
}
