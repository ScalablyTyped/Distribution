package typings.googleapis.buildSrcApisStreetviewpublishV1Mod.streetviewpublish_v1

import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.Compute
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.JWT
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.OAuth2Client
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsDollarResourceDollarPhotoDollarUpdate extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Required. A unique identifier for a photo.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[Schema$Photo] = js.native
  /**
    * Mask that identifies fields on the photo metadata to update. If not
    * present, the old Photo metadata is entirely replaced with the new Photo
    * metadata in this request. The update fails if invalid fields are
    * specified. Multiple fields can be specified in a comma-delimited list.
    * The following fields are valid:  * `pose.heading` * `pose.latLngPair` *
    * `pose.pitch` * `pose.roll` * `pose.level` * `pose.altitude` *
    * `connections` * `places`   <aside class="note"><b>Note:</b> When
    * updateMask contains repeated fields, the entire set of repeated values
    * get replaced with the new contents. For example, if updateMask contains
    * `connections` and `UpdatePhotoRequest.photo.connections` is empty, all
    * connections are removed.</aside>
    */
  var updateMask: js.UndefOr[String] = js.native
}

