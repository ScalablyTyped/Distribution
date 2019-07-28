package typings.firebaseDashAdmin.adminNs.firestoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@google-cloud/firestore", "GeoPoint")
@js.native
class GeoPoint protected ()
  extends typings.atGoogleDashCloudFirestore.FirebaseFirestoreNs.GeoPoint {
  /**
    * Creates a new immutable GeoPoint object with the provided latitude and
    * longitude values.
    * @param latitude The latitude as number between -90 and 90.
    * @param longitude The longitude as number between -180 and 180.
    */
  def this(latitude: Double, longitude: Double) = this()
}

