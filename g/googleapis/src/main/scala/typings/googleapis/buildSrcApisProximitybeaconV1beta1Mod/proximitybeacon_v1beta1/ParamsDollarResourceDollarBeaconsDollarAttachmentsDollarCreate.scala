package typings.googleapis.buildSrcApisProximitybeaconV1beta1Mod.proximitybeacon_v1beta1

import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.Compute
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.JWT
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.OAuth2Client
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsDollarResourceDollarBeaconsDollarAttachmentsDollarCreate extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Beacon on which the attachment should be created. A beacon name has the
    * format "beacons/N!beaconId" where the beaconId is the base16 ID broadcast
    * by the beacon and N is a code for the beacon's type. Possible values are
    * `3` for Eddystone-UID, `4` for Eddystone-EID, `1` for iBeacon, or `5` for
    * AltBeacon. For Eddystone-EID beacons, you may use either the current EID
    * or the beacon's "stable" UID. Required.
    */
  var beaconName: js.UndefOr[String] = js.native
  /**
    * The project id of the project the attachment will belong to. If the
    * project id is not specified then the project making the request is used.
    * Optional.
    */
  var projectId: js.UndefOr[String] = js.native
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[Schema$BeaconAttachment] = js.native
}

