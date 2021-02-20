package typings.geolib

import typings.geolib.typesMod.GeolibInputCoordinates
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getGreatCircleBearingMod {
  
  /**
    * Gets great circle bearing of two points. See description of getRhumbLineBearing for more information
    */
  @JSImport("geolib/es/getGreatCircleBearing", JSImport.Default)
  @js.native
  def default(origin: GeolibInputCoordinates, dest: GeolibInputCoordinates): Double = js.native
}
