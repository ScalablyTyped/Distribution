package typings.geolib

import typings.geolib.esTypesMod.GeolibInputCoordinates
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esOrderByDistanceMod {
  
  @JSImport("geolib/es/orderByDistance", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(point: GeolibInputCoordinates, coords: js.Array[GeolibInputCoordinates]): js.Array[GeolibInputCoordinates] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(point.asInstanceOf[js.Any], coords.asInstanceOf[js.Any])).asInstanceOf[js.Array[GeolibInputCoordinates]]
  inline def default(point: GeolibInputCoordinates, coords: js.Array[GeolibInputCoordinates], distanceFn: DistanceFn): js.Array[GeolibInputCoordinates] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(point.asInstanceOf[js.Any], coords.asInstanceOf[js.Any], distanceFn.asInstanceOf[js.Any])).asInstanceOf[js.Array[GeolibInputCoordinates]]
  
  type DistanceFn = js.Function2[/* point */ GeolibInputCoordinates, /* dest */ GeolibInputCoordinates, Double]
}
