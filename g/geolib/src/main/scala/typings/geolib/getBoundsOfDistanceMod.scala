package typings.geolib

import typings.geolib.anon.Latitude
import typings.geolib.typesMod.GeolibInputCoordinates
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("geolib/es/getBoundsOfDistance", JSImport.Namespace)
@js.native
object getBoundsOfDistanceMod extends js.Object {
  
  def default(point: GeolibInputCoordinates, distance: Double): js.Array[Latitude] = js.native
}
