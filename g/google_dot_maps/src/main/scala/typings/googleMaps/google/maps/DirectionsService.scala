package typings.googleMaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A service for computing directions between two or more places.
  */
@js.native
trait DirectionsService extends StObject {
  
  /**
    * Issue a directions search request.
    */
  def route(request: DirectionsRequest): js.Promise[DirectionsResult] = js.native
  def route(
    request: DirectionsRequest,
    callback: js.Function2[/* a */ DirectionsResult | Null, /* b */ DirectionsStatus, Unit]
  ): js.Promise[DirectionsResult] = js.native
}
