package typings.googleCloudFirestore.FirebaseFirestore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeoPoint extends js.Object {
  val latitude: Double
  val longitude: Double
  /**
    * Returns true if this `GeoPoint` is equal to the provided one.
    *
    * @param other The `GeoPoint` to compare against.
    * @return true if this `GeoPoint` is equal to the provided one.
    */
  def isEqual(other: GeoPoint): Boolean
}

object GeoPoint {
  @scala.inline
  def apply(isEqual: GeoPoint => Boolean, latitude: Double, longitude: Double): GeoPoint = {
    val __obj = js.Dynamic.literal(isEqual = js.Any.fromFunction1(isEqual), latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeoPoint]
  }
}

