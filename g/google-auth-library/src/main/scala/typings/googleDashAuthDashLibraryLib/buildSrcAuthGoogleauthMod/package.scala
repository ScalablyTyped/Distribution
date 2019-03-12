package typings
package googleDashAuthDashLibraryLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object buildSrcAuthGoogleauthMod {
  type ADCCallback = js.Function3[
    /* err */ stdLib.Error | scala.Null, 
    /* credential */ js.UndefOr[googleDashAuthDashLibraryLib.buildSrcAuthOauth2clientMod.OAuth2Client], 
    /* projectId */ js.UndefOr[java.lang.String | scala.Null], 
    scala.Unit
  ]
  type CredentialCallback = js.Function2[
    /* err */ stdLib.Error | scala.Null, 
    /* result */ js.UndefOr[
      googleDashAuthDashLibraryLib.buildSrcAuthRefreshclientMod.UserRefreshClient | googleDashAuthDashLibraryLib.buildSrcAuthJwtclientMod.JWT
    ], 
    scala.Unit
  ]
  type ProjectIdCallback = js.Function2[
    /* err */ js.UndefOr[stdLib.Error | scala.Null], 
    /* projectId */ js.UndefOr[java.lang.String | scala.Null], 
    scala.Unit
  ]
}
