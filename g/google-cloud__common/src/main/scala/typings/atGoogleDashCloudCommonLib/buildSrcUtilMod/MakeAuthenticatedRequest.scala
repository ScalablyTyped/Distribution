package typings
package atGoogleDashCloudCommonLib.buildSrcUtilMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MakeAuthenticatedRequest extends js.Object {
  var authClient: googleDashAuthDashLibraryLib.googleDashAuthDashLibraryMod.GoogleAuth = js.native
  def apply(reqOpts: DecorateRequestOptions): scala.Unit | Abortable = js.native
  def apply(reqOpts: DecorateRequestOptions, callback: BodyResponseCallback): scala.Unit | Abortable = js.native
  def apply(reqOpts: DecorateRequestOptions, options: MakeAuthenticatedRequestOptions): scala.Unit | Abortable = js.native
  def getCredentials(
    callback: js.Function2[
      /* err */ js.UndefOr[stdLib.Error | scala.Null], 
      /* credentials */ js.UndefOr[googleDashAuthDashLibraryLib.buildSrcAuthCredentialsMod.CredentialBody], 
      scala.Unit
    ]
  ): scala.Unit = js.native
}

