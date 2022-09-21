package typings.googleAuthLibrary.oauth2clientMod

import org.scalablytyped.runtime.StringDictionary
import typings.gaxios.commonMod.GaxiosResponse
import typings.gaxios.mod.GaxiosError
import typings.googleAuthLibrary.credentialsMod.Credentials
import typings.googleAuthLibrary.cryptoCryptoMod.JwkCertificate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type Certificates = StringDictionary[String | JwkCertificate]

type GetAccessTokenCallback = js.Function3[
/* err */ GaxiosError[Any] | Null, 
/* token */ js.UndefOr[String | Null], 
/* res */ js.UndefOr[GaxiosResponse[Any] | Null], 
Unit]

type GetFederatedSignonCertsCallback = js.Function3[
/* err */ GaxiosError[Any] | Null, 
/* certs */ js.UndefOr[Certificates], 
/* response */ js.UndefOr[GaxiosResponse[Unit] | Null], 
Unit]

type GetIapPublicKeysCallback = js.Function3[
/* err */ GaxiosError[Any] | Null, 
/* pubkeys */ js.UndefOr[PublicKeys], 
/* response */ js.UndefOr[GaxiosResponse[Unit] | Null], 
Unit]

type GetRefreshHandlerCallback = js.Function0[js.Promise[AccessTokenResponse]]

type GetTokenCallback = js.Function3[
/* err */ GaxiosError[Any] | Null, 
/* token */ js.UndefOr[Credentials | Null], 
/* res */ js.UndefOr[GaxiosResponse[Any] | Null], 
Unit]

type Headers = StringDictionary[String]

type PublicKeys = StringDictionary[String]

type RefreshAccessTokenCallback = js.Function3[
/* err */ GaxiosError[Any] | Null, 
/* credentials */ js.UndefOr[Credentials | Null], 
/* res */ js.UndefOr[GaxiosResponse[Any] | Null], 
Unit]

type RequestMetadataCallback = js.Function3[
/* err */ GaxiosError[Any] | Null, 
/* headers */ js.UndefOr[Headers], 
/* res */ js.UndefOr[GaxiosResponse[Unit] | Null], 
Unit]
