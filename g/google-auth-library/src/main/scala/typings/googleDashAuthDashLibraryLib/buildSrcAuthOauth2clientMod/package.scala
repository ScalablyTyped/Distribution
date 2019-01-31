package typings
package googleDashAuthDashLibraryLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object buildSrcAuthOauth2clientMod {
  type GetAccessTokenCallback = js.Function3[
    /* err */ gaxiosLib.gaxiosMod.GaxiosError[js.Any] | scala.Null, 
    /* token */ js.UndefOr[java.lang.String | scala.Null], 
    /* res */ js.UndefOr[gaxiosLib.buildSrcCommonMod.GaxiosResponse[js.Any] | scala.Null], 
    scala.Unit
  ]
  type GetFederatedSignonCertsCallback = js.Function3[
    /* err */ gaxiosLib.gaxiosMod.GaxiosError[js.Any] | scala.Null, 
    /* certs */ js.UndefOr[Certificates], 
    /* response */ js.UndefOr[gaxiosLib.buildSrcCommonMod.GaxiosResponse[scala.Unit] | scala.Null], 
    scala.Unit
  ]
  type GetTokenCallback = js.Function3[
    /* err */ gaxiosLib.gaxiosMod.GaxiosError[js.Any] | scala.Null, 
    /* token */ js.UndefOr[googleDashAuthDashLibraryLib.buildSrcAuthCredentialsMod.Credentials | scala.Null], 
    /* res */ js.UndefOr[gaxiosLib.buildSrcCommonMod.GaxiosResponse[js.Any] | scala.Null], 
    scala.Unit
  ]
  type RefreshAccessTokenCallback = js.Function3[
    /* err */ gaxiosLib.gaxiosMod.GaxiosError[js.Any] | scala.Null, 
    /* credentials */ js.UndefOr[googleDashAuthDashLibraryLib.buildSrcAuthCredentialsMod.Credentials | scala.Null], 
    /* res */ js.UndefOr[gaxiosLib.buildSrcCommonMod.GaxiosResponse[js.Any] | scala.Null], 
    scala.Unit
  ]
  type RequestMetadataCallback = js.Function3[
    /* err */ gaxiosLib.gaxiosMod.GaxiosError[js.Any] | scala.Null, 
    /* headers */ js.UndefOr[Headers], 
    /* res */ js.UndefOr[gaxiosLib.buildSrcCommonMod.GaxiosResponse[scala.Unit] | scala.Null], 
    scala.Unit
  ]
}
