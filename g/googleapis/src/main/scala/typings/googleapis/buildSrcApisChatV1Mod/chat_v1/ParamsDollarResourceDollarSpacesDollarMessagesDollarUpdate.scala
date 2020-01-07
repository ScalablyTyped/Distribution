package typings.googleapis.buildSrcApisChatV1Mod.chat_v1

import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.Compute
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.JWT
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.OAuth2Client
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsDollarResourceDollarSpacesDollarMessagesDollarUpdate extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Resource name, in the form "spaces/x/messages/x".  Example:
    * spaces/AAAAMpdlehY/messages/UMxbHmzDlr4.UMxbHmzDlr4
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[Schema$Message] = js.native
  /**
    * Required. The field paths to be updated.  Currently supported field
    * paths: "text", "cards".
    */
  var updateMask: js.UndefOr[String] = js.native
}

