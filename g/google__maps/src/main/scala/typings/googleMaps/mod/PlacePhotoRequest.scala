package typings.googleMaps.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlacePhotoRequest extends StObject {
  
  /**
    * Specifies the maximum desired height or width, in pixels, of the image returned by the Place Photos service.
    * If the image is smaller than the values specified, the original image will be returned.
    * If the image is larger in either dimension, it will be scaled to match the smaller of the two dimensions,
    * restricted to its original aspect ratio. Both the `maxheight` and `maxwidth` properties accept an integer between 1 and 1600.
    */
  var maxheight: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the maximum desired height or width, in pixels, of the image returned by the Place Photos service.
    * If the image is smaller than the values specified, the original image will be returned.
    * If the image is larger in either dimension, it will be scaled to match the smaller of the two dimensions,
    * restricted to its original aspect ratio. Both the `maxheight` and `maxwidth` properties accept an integer between 1 and 1600.
    */
  var maxwidth: js.UndefOr[Double] = js.undefined
  
  /**
    * string identifier that uniquely identifies a photo.
    * Photo references are returned from either a Place Search or Place Details request.
    */
  var photoreference: String
}
object PlacePhotoRequest {
  
  @scala.inline
  def apply(photoreference: String): PlacePhotoRequest = {
    val __obj = js.Dynamic.literal(photoreference = photoreference.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlacePhotoRequest]
  }
  
  @scala.inline
  implicit class PlacePhotoRequestMutableBuilder[Self <: PlacePhotoRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxheight(value: Double): Self = StObject.set(x, "maxheight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxheightUndefined: Self = StObject.set(x, "maxheight", js.undefined)
    
    @scala.inline
    def setMaxwidth(value: Double): Self = StObject.set(x, "maxwidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxwidthUndefined: Self = StObject.set(x, "maxwidth", js.undefined)
    
    @scala.inline
    def setPhotoreference(value: String): Self = StObject.set(x, "photoreference", value.asInstanceOf[js.Any])
  }
}
