package typings.googleapis.buildSrcApisChatV1Mod.chat_v1

import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.Compute
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.JWT
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.OAuth2Client
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsDollarResourceDollarSpacesDollarMessagesDollarCreate extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Required. Space resource name, in the form "spaces/x". Example:
    * spaces/AAAAMpdlehY
    */
  var parent: js.UndefOr[String] = js.native
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[Schema$Message] = js.native
  /**
    * Opaque thread identifier string that can be specified to group messages
    * into a single thread. If this is the first message with a given thread
    * identifier, a new thread is created. Subsequent messages with the same
    * thread identifier will be posted into the same thread. This relieves bots
    * and webhooks from having to store the Hangouts Chat thread ID of a thread
    * (created earlier by them) to post further updates to it.  Has no effect
    * if thread field, corresponding to an existing thread, is set in message.
    */
  var threadKey: js.UndefOr[String] = js.native
}

