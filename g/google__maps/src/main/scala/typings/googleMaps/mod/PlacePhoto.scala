package typings.googleMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlacePhoto extends js.Object {
  
  /** the maximum height of the image. */
  var height: Double = js.native
  
  /** contains any required attributions. This field will always be present, but may be empty. */
  var html_attributions: js.Array[String] = js.native
  
  /** a string used to identify the photo when you perform a Photo request. */
  var photo_reference: String = js.native
  
  /** the maximum width of the image. */
  var width: Double = js.native
}
object PlacePhoto {
  
  @scala.inline
  def apply(height: Double, html_attributions: js.Array[String], photo_reference: String, width: Double): PlacePhoto = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], html_attributions = html_attributions.asInstanceOf[js.Any], photo_reference = photo_reference.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlacePhoto]
  }
  
  @scala.inline
  implicit class PlacePhotoOps[Self <: PlacePhoto] (val x: Self) extends AnyVal {
    
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
    def setHtml_attributionsVarargs(value: String*): Self = this.set("html_attributions", js.Array(value :_*))
    
    @scala.inline
    def setHtml_attributions(value: js.Array[String]): Self = this.set("html_attributions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhoto_reference(value: String): Self = this.set("photo_reference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
  }
}
