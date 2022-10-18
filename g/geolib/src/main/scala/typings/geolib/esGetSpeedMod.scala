package typings.geolib

import typings.geolib.esTypesMod.GeolibDistanceFn
import typings.geolib.esTypesMod.GeolibInputCoordinatesWithTime
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esGetSpeedMod {
  
  @JSImport("geolib/es/getSpeed", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(start: GeolibInputCoordinatesWithTime, end: GeolibInputCoordinatesWithTime): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def default(
    start: GeolibInputCoordinatesWithTime,
    end: GeolibInputCoordinatesWithTime,
    distanceFn: GeolibDistanceFn
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(start.asInstanceOf[js.Any], end.asInstanceOf[js.Any], distanceFn.asInstanceOf[js.Any])).asInstanceOf[Double]
}
