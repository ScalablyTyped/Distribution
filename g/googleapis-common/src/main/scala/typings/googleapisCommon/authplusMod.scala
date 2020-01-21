package typings.googleapisCommon

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.googleAuthLibrary.jwtclientMod.JWTOptions
import typings.googleAuthLibrary.mod.GoogleAuth
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis-common/build/src/authplus", JSImport.Namespace)
@js.native
object authplusMod extends js.Object {
  @js.native
  class AuthPlus () extends GoogleAuth {
    var Compute: Instantiable0[typings.googleAuthLibrary.mod.Compute] = js.native
    var JWT: Instantiable1[/* options */ JWTOptions, typings.googleAuthLibrary.mod.JWT] = js.native
    var OAuth2: TypeofClassOAuth2Client = js.native
  }
  
}

