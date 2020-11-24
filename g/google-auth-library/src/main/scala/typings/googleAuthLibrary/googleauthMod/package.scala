package typings.googleAuthLibrary

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object googleauthMod {
  
  type ADCCallback = js.Function3[
    /* err */ typings.std.Error | scala.Null, 
    /* credential */ js.UndefOr[typings.googleAuthLibrary.oauth2clientMod.OAuth2Client], 
    /* projectId */ js.UndefOr[java.lang.String | scala.Null], 
    scala.Unit
  ]
  
  type CredentialCallback = js.Function2[
    /* err */ typings.std.Error | scala.Null, 
    /* result */ js.UndefOr[
      typings.googleAuthLibrary.refreshclientMod.UserRefreshClient | typings.googleAuthLibrary.jwtclientMod.JWT
    ], 
    scala.Unit
  ]
  
  type ProjectIdCallback = js.Function2[
    /* err */ js.UndefOr[typings.std.Error | scala.Null], 
    /* projectId */ js.UndefOr[java.lang.String | scala.Null], 
    scala.Unit
  ]
}
