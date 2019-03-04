package typings
package firebaseLib.firebaseMod.firebaseNs.firestoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeoPoint extends js.Object {
  val latitude: scala.Double
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
  def apply(isEqual: js.Function1[GeoPoint, scala.Boolean], latitude: scala.Double, longitude: scala.Double): GeoPoint = {
    val __obj = js.Dynamic.literal(isEqual = isEqual, latitude = latitude, longitude = longitude)
  
    __obj.asInstanceOf[GeoPoint]
  }
}

