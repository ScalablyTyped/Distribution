package typings.googleMaps.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SnappedPoint extends StObject {
  
  /** contains a `latitude` and `longitude` value. */
  var location: LatLngLiteralVerbose = js.native
  
  /**
    * An integer that indicates the corresponding value in the original request.
    * Each value in the request should map to a snapped value in the response.
    * These values are indexed from `0`, so a point with an `originalIndex` of `4` will be the snapped value
    * of the 5th latitude/longitude passed to the `path` parameter.
    */
  var originalIndex: Double = js.native
  
  /**
    * A unique identifier for a place. All place IDs returned by the Roads API will correspond to road segments.
    * The `placeId` can be passed in a speed limits request to determine the speed limit along that road segment.
    */
  var placeId: String = js.native
}
object SnappedPoint {
  
  @scala.inline
  def apply(location: LatLngLiteralVerbose, originalIndex: Double, placeId: String): SnappedPoint = {
    val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any], originalIndex = originalIndex.asInstanceOf[js.Any], placeId = placeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SnappedPoint]
  }
  
  @scala.inline
  implicit class SnappedPointMutableBuilder[Self <: SnappedPoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLocation(value: LatLngLiteralVerbose): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginalIndex(value: Double): Self = StObject.set(x, "originalIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaceId(value: String): Self = StObject.set(x, "placeId", value.asInstanceOf[js.Any])
  }
}
