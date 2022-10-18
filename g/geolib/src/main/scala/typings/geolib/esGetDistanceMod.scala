package typings.geolib

import typings.geolib.esTypesMod.GeolibInputCoordinates
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esGetDistanceMod {
  
  @JSImport("geolib/es/getDistance", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(from: GeolibInputCoordinates, to: GeolibInputCoordinates): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def default(from: GeolibInputCoordinates, to: GeolibInputCoordinates, accuracy: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], accuracy.asInstanceOf[js.Any])).asInstanceOf[Double]
}
