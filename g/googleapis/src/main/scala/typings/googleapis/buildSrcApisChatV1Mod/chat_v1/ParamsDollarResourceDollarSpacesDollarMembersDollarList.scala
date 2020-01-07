package typings.googleapis.buildSrcApisChatV1Mod.chat_v1

import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.Compute
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.JWT
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.OAuth2Client
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsDollarResourceDollarSpacesDollarMembersDollarList extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Requested page size. The value is capped at 1000. Server may return fewer
    * results than requested. If unspecified, server will default to 100.
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * A token identifying a page of results the server should return.
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * Required. The resource name of the space for which membership list is to
    * be fetched, in the form "spaces/x".  Example: spaces/AAAAMpdlehY
    */
  var parent: js.UndefOr[String] = js.native
}

