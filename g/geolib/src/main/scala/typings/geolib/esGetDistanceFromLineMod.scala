package typings.geolib

import typings.geolib.esTypesMod.GeolibInputCoordinates
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esGetDistanceFromLineMod {
  
  @JSImport("geolib/es/getDistanceFromLine", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(point: GeolibInputCoordinates, lineStart: GeolibInputCoordinates, lineEnd: GeolibInputCoordinates): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(point.asInstanceOf[js.Any], lineStart.asInstanceOf[js.Any], lineEnd.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def default(
    point: GeolibInputCoordinates,
    lineStart: GeolibInputCoordinates,
    lineEnd: GeolibInputCoordinates,
    accuracy: Double
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(point.asInstanceOf[js.Any], lineStart.asInstanceOf[js.Any], lineEnd.asInstanceOf[js.Any], accuracy.asInstanceOf[js.Any])).asInstanceOf[Double]
}
