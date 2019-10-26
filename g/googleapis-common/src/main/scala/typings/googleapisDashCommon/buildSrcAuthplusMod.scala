package typings.googleapisDashCommon

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.googleDashAuthDashLibrary.buildSrcAuthJwtclientMod.JWTOptions
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.GoogleAuth
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis-common/build/src/authplus", JSImport.Namespace)
@js.native
object buildSrcAuthplusMod extends js.Object {
  @js.native
  class AuthPlus () extends GoogleAuth {
    var Compute: Instantiable0[typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.Compute] = js.native
    var JWT: Instantiable1[
        /* options */ JWTOptions, 
        typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.JWT
      ] = js.native
    var OAuth2: TypeofClassOAuth2Client = js.native
  }
  
}

