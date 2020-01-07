package typings.googleapis.buildSrcApisProximitybeaconV1beta1Mod.proximitybeacon_v1beta1

import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.Compute
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.JWT
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.OAuth2Client
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsDollarResourceDollarBeaconsDollarAttachmentsDollarList extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Beacon whose attachments should be fetched. A beacon name has the format
    * "beacons/N!beaconId" where the beaconId is the base16 ID broadcast by the
    * beacon and N is a code for the beacon's type. Possible values are `3` for
    * Eddystone-UID, `4` for Eddystone-EID, `1` for iBeacon, or `5` for
    * AltBeacon. For Eddystone-EID beacons, you may use either the current EID
    * or the beacon's "stable" UID. Required.
    */
  var beaconName: js.UndefOr[String] = js.native
  /**
    * Specifies the namespace and type of attachment to include in response in
    * <var>namespace/type</var> format. Accepts `x/x` to specify "all types in
    * all namespaces".
    */
  var namespacedType: js.UndefOr[String] = js.native
  /**
    * The project id to list beacon attachments under. This field can be used
    * when "*" is specified to mean all attachment namespaces. Projects may
    * have multiple attachments with multiple namespaces. If "*" is specified
    * and the projectId string is empty, then the project making the request is
    * used. Optional.
    */
  var projectId: js.UndefOr[String] = js.native
}

