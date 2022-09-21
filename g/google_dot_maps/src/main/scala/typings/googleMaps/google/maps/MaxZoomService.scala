package typings.googleMaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A service for obtaining the highest zoom level at which satellite imagery
  * is available for a given location.
  */
@js.native
trait MaxZoomService extends StObject {
  
  /**
    * Returns the maximum zoom level for which detailed imagery is available at
    * a particular <code>LatLng</code> for the <code>satellite</code> map type.
    * As this request is asynchronous, you must pass a <code>callback</code>
    * function which will be executed upon completion of the request, being
    * passed a <code>MaxZoomResult</code>.
    */
  def getMaxZoomAtLatLng(): js.Promise[MaxZoomResult] = js.native
  def getMaxZoomAtLatLng(latlng: Null, callback: js.Function1[/* a */ MaxZoomResult, Unit]): js.Promise[MaxZoomResult] = js.native
  def getMaxZoomAtLatLng(latlng: LatLng): js.Promise[MaxZoomResult] = js.native
  def getMaxZoomAtLatLng(latlng: LatLngLiteral): js.Promise[MaxZoomResult] = js.native
  def getMaxZoomAtLatLng(latlng: LatLngLiteral, callback: js.Function1[/* a */ MaxZoomResult, Unit]): js.Promise[MaxZoomResult] = js.native
  def getMaxZoomAtLatLng(latlng: LatLng, callback: js.Function1[/* a */ MaxZoomResult, Unit]): js.Promise[MaxZoomResult] = js.native
}
