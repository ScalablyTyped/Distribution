package typings.googleDashAuthDashLibrary

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object buildSrcAuthOauth2clientMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.gaxios.buildSrcCommonMod.GaxiosResponse
  import typings.gaxios.gaxiosMod.GaxiosError
  import typings.googleDashAuthDashLibrary.buildSrcAuthCredentialsMod.Credentials
  import typings.googleDashAuthDashLibrary.buildSrcCryptoCryptoMod.JwkCertificate

  type Certificates = StringDictionary[String | JwkCertificate]
  type GetAccessTokenCallback = js.Function3[
    /* err */ GaxiosError[js.Any] | Null, 
    /* token */ js.UndefOr[String | Null], 
    /* res */ js.UndefOr[GaxiosResponse[js.Any] | Null], 
    Unit
  ]
  type GetFederatedSignonCertsCallback = js.Function3[
    /* err */ GaxiosError[js.Any] | Null, 
    /* certs */ js.UndefOr[Certificates], 
    /* response */ js.UndefOr[GaxiosResponse[Unit] | Null], 
    Unit
  ]
  type GetTokenCallback = js.Function3[
    /* err */ GaxiosError[js.Any] | Null, 
    /* token */ js.UndefOr[Credentials | Null], 
    /* res */ js.UndefOr[GaxiosResponse[js.Any] | Null], 
    Unit
  ]
  type Headers = StringDictionary[String]
  type RefreshAccessTokenCallback = js.Function3[
    /* err */ GaxiosError[js.Any] | Null, 
    /* credentials */ js.UndefOr[Credentials | Null], 
    /* res */ js.UndefOr[GaxiosResponse[js.Any] | Null], 
    Unit
  ]
  type RequestMetadataCallback = js.Function3[
    /* err */ GaxiosError[js.Any] | Null, 
    /* headers */ js.UndefOr[Headers], 
    /* res */ js.UndefOr[GaxiosResponse[Unit] | Null], 
    Unit
  ]
}
