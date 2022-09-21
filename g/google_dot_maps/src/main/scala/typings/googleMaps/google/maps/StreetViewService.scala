package typings.googleMaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A <code>StreetViewService</code> object performs searches for Street View
  * data.
  */
@js.native
trait StreetViewService extends StObject {
  
  /**
    * Retrieves the <code>StreetViewPanoramaData</code> for a panorama that
    * matches the supplied Street View query request. The
    * <code>StreetViewPanoramaData</code> is passed to the provided callback.
    */
  def getPanorama(request: StreetViewLocationRequest): js.Promise[StreetViewResponse] = js.native
  def getPanorama(
    request: StreetViewLocationRequest,
    callback: js.Function2[/* a */ StreetViewPanoramaData | Null, /* b */ StreetViewStatus, Unit]
  ): js.Promise[StreetViewResponse] = js.native
  def getPanorama(request: StreetViewPanoRequest): js.Promise[StreetViewResponse] = js.native
  def getPanorama(
    request: StreetViewPanoRequest,
    callback: js.Function2[/* a */ StreetViewPanoramaData | Null, /* b */ StreetViewStatus, Unit]
  ): js.Promise[StreetViewResponse] = js.native
}
