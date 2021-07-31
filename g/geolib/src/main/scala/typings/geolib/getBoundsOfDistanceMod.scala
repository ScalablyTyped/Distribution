package typings.geolib

import typings.geolib.anon.Latitude
import typings.geolib.typesMod.GeolibInputCoordinates
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getBoundsOfDistanceMod {
  
  @JSImport("geolib/es/getBoundsOfDistance", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(point: GeolibInputCoordinates, distance: Double): js.Array[Latitude] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(point.asInstanceOf[js.Any], distance.asInstanceOf[js.Any])).asInstanceOf[js.Array[Latitude]]
}
