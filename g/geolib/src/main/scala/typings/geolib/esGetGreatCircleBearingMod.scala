package typings.geolib

import typings.geolib.esTypesMod.GeolibInputCoordinates
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esGetGreatCircleBearingMod {
  
  @JSImport("geolib/es/getGreatCircleBearing", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Gets great circle bearing of two points. See description of getRhumbLineBearing for more information
    */
  inline def default(origin: GeolibInputCoordinates, dest: GeolibInputCoordinates): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(origin.asInstanceOf[js.Any], dest.asInstanceOf[js.Any])).asInstanceOf[Double]
}
