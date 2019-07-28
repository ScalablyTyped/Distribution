package typings.atGoogleDashCloudCommon.buildSrcUtilMod

import typings.googleDashAuthDashLibrary.buildSrcAuthCredentialsMod.CredentialBody
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.GoogleAuth
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MakeAuthenticatedRequest extends js.Object {
  var authClient: GoogleAuth = js.native
  def apply(reqOpts: DecorateRequestOptions): Unit | Abortable = js.native
  def apply(reqOpts: DecorateRequestOptions, callback: BodyResponseCallback): Unit | Abortable = js.native
  def apply(reqOpts: DecorateRequestOptions, options: MakeAuthenticatedRequestOptions): Unit | Abortable = js.native
  def getCredentials(
    callback: js.Function2[
      /* err */ js.UndefOr[Error | Null], 
      /* credentials */ js.UndefOr[CredentialBody], 
      Unit
    ]
  ): Unit = js.native
}

