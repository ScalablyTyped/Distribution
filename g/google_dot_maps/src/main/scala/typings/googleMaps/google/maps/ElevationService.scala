package typings.googleMaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Defines a service class that talks directly to Google servers for
  * requesting elevation data.
  */
@js.native
trait ElevationService extends StObject {
  
  /**
    * Makes an elevation request along a path, where the elevation data are
    * returned as distance-based samples along that path.
    */
  def getElevationAlongPath(request: PathElevationRequest): js.Promise[PathElevationResponse] = js.native
  def getElevationAlongPath(
    request: PathElevationRequest,
    callback: js.Function2[/* a */ js.Array[ElevationResult] | Null, /* b */ ElevationStatus, Unit]
  ): js.Promise[PathElevationResponse] = js.native
  
  /**
    * Makes an elevation request for a list of discrete locations.
    */
  def getElevationForLocations(request: LocationElevationRequest): js.Promise[LocationElevationResponse] = js.native
  def getElevationForLocations(
    request: LocationElevationRequest,
    callback: js.Function2[/* a */ js.Array[ElevationResult] | Null, /* b */ ElevationStatus, Unit]
  ): js.Promise[LocationElevationResponse] = js.native
}
