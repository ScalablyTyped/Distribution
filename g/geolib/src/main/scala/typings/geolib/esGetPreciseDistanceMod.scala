package typings.geolib

import typings.geolib.esTypesMod.GeolibInputCoordinates
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esGetPreciseDistanceMod {
  
  @JSImport("geolib/es/getPreciseDistance", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(start: GeolibInputCoordinates, end: GeolibInputCoordinates): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def default(start: GeolibInputCoordinates, end: GeolibInputCoordinates, accuracy: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(start.asInstanceOf[js.Any], end.asInstanceOf[js.Any], accuracy.asInstanceOf[js.Any])).asInstanceOf[Double]
}
