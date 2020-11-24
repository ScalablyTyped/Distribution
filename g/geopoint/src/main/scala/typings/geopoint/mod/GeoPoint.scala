package typings.geopoint.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GeoPoint extends js.Object {
  
  def boundingCoordinates(distance: Double): js.Tuple2[GeoPoint, GeoPoint] = js.native
  def boundingCoordinates(distance: Double, radius: js.UndefOr[scala.Nothing], inKilometers: Boolean): js.Tuple2[GeoPoint, GeoPoint] = js.native
  def boundingCoordinates(distance: Double, radius: Double): js.Tuple2[GeoPoint, GeoPoint] = js.native
  def boundingCoordinates(distance: Double, radius: Double, inKilometers: Boolean): js.Tuple2[GeoPoint, GeoPoint] = js.native
  
  def distanceTo(point: GeoPoint): Double = js.native
  def distanceTo(point: GeoPoint, inKilometers: Boolean): Double = js.native
  
  def latitude(): Double = js.native
  def latitude(inRadians: Boolean): Double = js.native
  
  def longitude(): Double = js.native
  def longitude(inRadians: Boolean): Double = js.native
}
