package typings
package atGoogleDashCloudFirestoreLib.atGoogleDashCloudFirestoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@google-cloud/firestore", "GeoPoint")
@js.native
class GeoPoint protected ()
  extends atGoogleDashCloudFirestoreLib.FirebaseFirestoreNs.GeoPoint {
  /**
    * Creates a new immutable GeoPoint object with the provided latitude and
    * longitude values.
    * @param latitude The latitude as number between -90 and 90.
    * @param longitude The longitude as number between -180 and 180.
    */
  def this(latitude: scala.Double, longitude: scala.Double) = this()
}

