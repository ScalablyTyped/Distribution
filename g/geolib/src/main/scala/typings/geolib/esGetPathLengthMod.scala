package typings.geolib

import typings.geolib.esTypesMod.GeolibInputCoordinates
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esGetPathLengthMod {
  
  @JSImport("geolib/es/getPathLength", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(points: js.Array[GeolibInputCoordinates]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(points.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def default(points: js.Array[GeolibInputCoordinates], distanceFn: DistanceFn): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(points.asInstanceOf[js.Any], distanceFn.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  type DistanceFn = js.Function2[/* point */ GeolibInputCoordinates, /* dest */ GeolibInputCoordinates, Double]
}
