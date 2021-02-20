package typings.googleAuthLibrary

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object oauth2clientMod {
  
  type Certificates = org.scalablytyped.runtime.StringDictionary[java.lang.String | typings.googleAuthLibrary.cryptoCryptoMod.JwkCertificate]
  
  type GetAccessTokenCallback = js.Function3[
    /* err */ typings.gaxios.mod.GaxiosError[js.Any] | scala.Null, 
    /* token */ js.UndefOr[java.lang.String | scala.Null], 
    /* res */ js.UndefOr[typings.gaxios.commonMod.GaxiosResponse[js.Any] | scala.Null], 
    scala.Unit
  ]
  
  type GetFederatedSignonCertsCallback = js.Function3[
    /* err */ typings.gaxios.mod.GaxiosError[js.Any] | scala.Null, 
    /* certs */ js.UndefOr[typings.googleAuthLibrary.oauth2clientMod.Certificates], 
    /* response */ js.UndefOr[typings.gaxios.commonMod.GaxiosResponse[scala.Unit] | scala.Null], 
    scala.Unit
  ]
  
  type GetIapPublicKeysCallback = js.Function3[
    /* err */ typings.gaxios.mod.GaxiosError[js.Any] | scala.Null, 
    /* pubkeys */ js.UndefOr[typings.googleAuthLibrary.oauth2clientMod.PublicKeys], 
    /* response */ js.UndefOr[typings.gaxios.commonMod.GaxiosResponse[scala.Unit] | scala.Null], 
    scala.Unit
  ]
  
  type GetTokenCallback = js.Function3[
    /* err */ typings.gaxios.mod.GaxiosError[js.Any] | scala.Null, 
    /* token */ js.UndefOr[typings.googleAuthLibrary.credentialsMod.Credentials | scala.Null], 
    /* res */ js.UndefOr[typings.gaxios.commonMod.GaxiosResponse[js.Any] | scala.Null], 
    scala.Unit
  ]
  
  type Headers = org.scalablytyped.runtime.StringDictionary[java.lang.String]
  
  type PublicKeys = org.scalablytyped.runtime.StringDictionary[java.lang.String]
  
  type RefreshAccessTokenCallback = js.Function3[
    /* err */ typings.gaxios.mod.GaxiosError[js.Any] | scala.Null, 
    /* credentials */ js.UndefOr[typings.googleAuthLibrary.credentialsMod.Credentials | scala.Null], 
    /* res */ js.UndefOr[typings.gaxios.commonMod.GaxiosResponse[js.Any] | scala.Null], 
    scala.Unit
  ]
  
  type RequestMetadataCallback = js.Function3[
    /* err */ typings.gaxios.mod.GaxiosError[js.Any] | scala.Null, 
    /* headers */ js.UndefOr[typings.googleAuthLibrary.oauth2clientMod.Headers], 
    /* res */ js.UndefOr[typings.gaxios.commonMod.GaxiosResponse[scala.Unit] | scala.Null], 
    scala.Unit
  ]
}
