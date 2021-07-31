package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Boundary extends StObject {
  
  var boundary: js.UndefOr[js.Array[js.Array[Latitude]]] = js.undefined
  
  var cachePolicy: js.UndefOr[String] = js.undefined
  
  var countryCode: js.UndefOr[String] = js.undefined
  
  var latitude: js.UndefOr[Double] = js.undefined
  
  var longitude: js.UndefOr[Double] = js.undefined
  
  var mapType: js.UndefOr[String] = js.undefined
  
  var viewport: js.UndefOr[Hi] = js.undefined
  
  var zoom: js.UndefOr[Double] = js.undefined
}
object Boundary {
  
  @scala.inline
  def apply(): Boundary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Boundary]
  }
  
  @scala.inline
  implicit class BoundaryMutableBuilder[Self <: Boundary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBoundary(value: js.Array[js.Array[Latitude]]): Self = StObject.set(x, "boundary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoundaryUndefined: Self = StObject.set(x, "boundary", js.undefined)
    
    @scala.inline
    def setBoundaryVarargs(value: js.Array[Latitude]*): Self = StObject.set(x, "boundary", js.Array(value :_*))
    
    @scala.inline
    def setCachePolicy(value: String): Self = StObject.set(x, "cachePolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCachePolicyUndefined: Self = StObject.set(x, "cachePolicy", js.undefined)
    
    @scala.inline
    def setCountryCode(value: String): Self = StObject.set(x, "countryCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountryCodeUndefined: Self = StObject.set(x, "countryCode", js.undefined)
    
    @scala.inline
    def setLatitude(value: Double): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLatitudeUndefined: Self = StObject.set(x, "latitude", js.undefined)
    
    @scala.inline
    def setLongitude(value: Double): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongitudeUndefined: Self = StObject.set(x, "longitude", js.undefined)
    
    @scala.inline
    def setMapType(value: String): Self = StObject.set(x, "mapType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMapTypeUndefined: Self = StObject.set(x, "mapType", js.undefined)
    
    @scala.inline
    def setViewport(value: Hi): Self = StObject.set(x, "viewport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewportUndefined: Self = StObject.set(x, "viewport", js.undefined)
    
    @scala.inline
    def setZoom(value: Double): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoomUndefined: Self = StObject.set(x, "zoom", js.undefined)
  }
}
