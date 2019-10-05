package typings.atGoogleDashCloudFirestore.FirebaseFirestore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("FirebaseFirestore.GeoPoint")
@js.native
class GeoPoint protected () extends js.Object {
  /**
    * Creates a new immutable GeoPoint object with the provided latitude and
    * longitude values.
    * @param latitude The latitude as number between -90 and 90.
    * @param longitude The longitude as number between -180 and 180.
    */
  def this(latitude: Double, longitude: Double) = this()
  val latitude: Double = js.native
  val longitude: Double = js.native
  /**
    * Returns true if this `GeoPoint` is equal to the provided one.
    *
    * @param other The `GeoPoint` to compare against.
    * @return true if this `GeoPoint` is equal to the provided one.
    */
  def isEqual(other: GeoPoint): Boolean = js.native
}

