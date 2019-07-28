package typings.googleDashAuthDashLibrary

import typings.googleDashAuthDashLibrary.buildSrcAuthJwtclientMod.JWT
import typings.googleDashAuthDashLibrary.buildSrcAuthOauth2clientMod.OAuth2Client
import typings.googleDashAuthDashLibrary.buildSrcAuthRefreshclientMod.UserRefreshClient
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object buildSrcAuthGoogleauthMod {
  type ADCCallback = js.Function3[
    /* err */ Error | Null, 
    /* credential */ js.UndefOr[OAuth2Client], 
    /* projectId */ js.UndefOr[String | Null], 
    Unit
  ]
  type CredentialCallback = js.Function2[/* err */ Error | Null, /* result */ js.UndefOr[UserRefreshClient | JWT], Unit]
  type ProjectIdCallback = js.Function2[/* err */ js.UndefOr[Error | Null], /* projectId */ js.UndefOr[String | Null], Unit]
}
