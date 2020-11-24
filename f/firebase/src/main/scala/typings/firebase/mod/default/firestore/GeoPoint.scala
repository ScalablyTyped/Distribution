package typings.firebase.mod.default.firestore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("firebase", "firestore.GeoPoint")
@js.native
class GeoPoint protected () extends js.Object {
  /**
    * Creates a new immutable GeoPoint object with the provided latitude and
    * longitude values.
    * @param latitude The latitude as number between -90 and 90.
    * @param longitude The longitude as number between -180 and 180.
    */
  def this(latitude: Double, longitude: Double) = this()
  
  /**
    * Returns true if this `GeoPoint` is equal to the provided one.
    *
    * @param other The `GeoPoint` to compare against.
    * @return true if this `GeoPoint` is equal to the provided one.
    */
  def isEqual(other: typings.firebase.mod.firebase.firestore.GeoPoint): Boolean = js.native
  
  /**
    * The latitude of this GeoPoint instance.
    */
  val latitude: Double = js.native
  
  /**
    * The longitude of this GeoPoint instance.
    */
  val longitude: Double = js.native
}
