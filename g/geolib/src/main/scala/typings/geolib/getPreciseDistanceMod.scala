package typings.geolib

import typings.geolib.typesMod.GeolibInputCoordinates
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("geolib/es/getPreciseDistance", JSImport.Namespace)
@js.native
object getPreciseDistanceMod extends js.Object {
  
  def default(start: GeolibInputCoordinates, end: GeolibInputCoordinates): Double = js.native
  def default(start: GeolibInputCoordinates, end: GeolibInputCoordinates, accuracy: Double): Double = js.native
}
