package typings.geolib

import typings.geolib.esTypesMod.GeolibInputCoordinates
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esFindNearestMod {
  
  @JSImport("geolib/es/findNearest", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(point: GeolibInputCoordinates, coords: js.Array[GeolibInputCoordinates]): GeolibInputCoordinates = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(point.asInstanceOf[js.Any], coords.asInstanceOf[js.Any])).asInstanceOf[GeolibInputCoordinates]
}
