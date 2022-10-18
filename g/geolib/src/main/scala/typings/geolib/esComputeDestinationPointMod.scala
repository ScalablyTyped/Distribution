package typings.geolib

import typings.geolib.anon.Latitude
import typings.geolib.esTypesMod.GeolibInputCoordinates
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esComputeDestinationPointMod {
  
  @JSImport("geolib/es/computeDestinationPoint", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(start: GeolibInputCoordinates, distance: Double, bearing: Double): Latitude = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(start.asInstanceOf[js.Any], distance.asInstanceOf[js.Any], bearing.asInstanceOf[js.Any])).asInstanceOf[Latitude]
  inline def default(start: GeolibInputCoordinates, distance: Double, bearing: Double, radius: Double): Latitude = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(start.asInstanceOf[js.Any], distance.asInstanceOf[js.Any], bearing.asInstanceOf[js.Any], radius.asInstanceOf[js.Any])).asInstanceOf[Latitude]
}
