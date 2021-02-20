package typings.geolib

import typings.geolib.typesMod.GeolibDistanceFn
import typings.geolib.typesMod.GeolibInputCoordinatesWithTime
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getSpeedMod {
  
  @JSImport("geolib/es/getSpeed", JSImport.Default)
  @js.native
  def default(start: GeolibInputCoordinatesWithTime, end: GeolibInputCoordinatesWithTime): Double = js.native
  @JSImport("geolib/es/getSpeed", JSImport.Default)
  @js.native
  def default(
    start: GeolibInputCoordinatesWithTime,
    end: GeolibInputCoordinatesWithTime,
    distanceFn: GeolibDistanceFn
  ): Double = js.native
}
