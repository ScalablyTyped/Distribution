package typings
package firebaseLib.firebaseMod.firebaseNs.firestoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeoPoint extends js.Object {
  /**
    * The latitude of this GeoPoint instance.
    */
  val latitude: scala.Double
  /**
    * The longitude of this GeoPoint instance.
    */
  val longitude: scala.Double
  /**
    * Returns true if this `GeoPoint` is equal to the provided one.
    *
    * @param other The `GeoPoint` to compare against.
    * @return true if this `GeoPoint` is equal to the provided one.
    */
  def isEqual(other: GeoPoint): scala.Boolean
}

object GeoPoint {
  @scala.inline
  def apply(isEqual: GeoPoint => scala.Boolean, latitude: scala.Double, longitude: scala.Double): GeoPoint = {
    val __obj = js.Dynamic.literal(isEqual = js.Any.fromFunction1(isEqual), latitude = latitude, longitude = longitude)
  
    __obj.asInstanceOf[GeoPoint]
  }
}

