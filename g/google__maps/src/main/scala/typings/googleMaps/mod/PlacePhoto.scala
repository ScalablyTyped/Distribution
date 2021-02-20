package typings.googleMaps.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlacePhoto extends StObject {
  
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
  implicit class PlacePhotoMutableBuilder[Self <: PlacePhoto] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHtml_attributions(value: js.Array[String]): Self = StObject.set(x, "html_attributions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHtml_attributionsVarargs(value: String*): Self = StObject.set(x, "html_attributions", js.Array(value :_*))
    
    @scala.inline
    def setPhoto_reference(value: String): Self = StObject.set(x, "photo_reference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
