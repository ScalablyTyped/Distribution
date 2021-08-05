package typings.geolib

import typings.geolib.anon.Altitude
import typings.geolib.anon.AltitudeLatitude
import typings.geolib.typesMod.GeolibInputCoordinates
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getCoordinateKeysMod {
  
  @JSImport("geolib/es/getCoordinateKeys", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(point: GeolibInputCoordinates): AltitudeLatitude = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(point.asInstanceOf[js.Any]).asInstanceOf[AltitudeLatitude]
  inline def default(point: GeolibInputCoordinates, keysToLookup: Altitude): AltitudeLatitude = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(point.asInstanceOf[js.Any], keysToLookup.asInstanceOf[js.Any])).asInstanceOf[AltitudeLatitude]
}
