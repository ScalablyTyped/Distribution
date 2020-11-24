package typings.googleapis

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.TopLevel
import typings.googleAuthLibrary.jwtclientMod.JWTOptions
import typings.googleapis.accesscontextmanagerV1Mod.accesscontextmanagerV1.Accesscontextmanager
import typings.googleapis.accesscontextmanagerV1Mod.accesscontextmanagerV1.Options
import typings.googleapis.googleapisStrings.v1
import typings.googleapis.googleapisStrings.v1beta
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import typings.googleapisCommon.mod.AuthPlus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/accesscontextmanager", JSImport.Namespace)
@js.native
object accesscontextmanagerMod extends js.Object {
  
  def accesscontextmanager(options: Options): Accesscontextmanager = js.native
  def accesscontextmanager(options: typings.googleapis.v1betaMod.accesscontextmanagerV1beta.Options): typings.googleapis.v1betaMod.accesscontextmanagerV1beta.Accesscontextmanager = js.native
  @JSName("accesscontextmanager")
  def accesscontextmanager_v1(version: v1): Accesscontextmanager = js.native
  @JSName("accesscontextmanager")
  def accesscontextmanager_v1beta(version: v1beta): typings.googleapis.v1betaMod.accesscontextmanagerV1beta.Accesscontextmanager = js.native
  
  @js.native
  object VERSIONS extends js.Object {
    
    @js.native
    class v1 protected () extends Accesscontextmanager {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    @js.native
    object v1
      extends TopLevel[
              Instantiable2[
                /* options */ GlobalOptions, 
                /* google */ js.UndefOr[GoogleConfigurable], 
                Accesscontextmanager
              ]
            ]
    
    @js.native
    class v1beta protected ()
      extends typings.googleapis.v1betaMod.accesscontextmanagerV1beta.Accesscontextmanager {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    @js.native
    object v1beta
      extends TopLevel[
              Instantiable2[
                /* options */ GlobalOptions, 
                /* google */ js.UndefOr[GoogleConfigurable], 
                typings.googleapis.v1betaMod.accesscontextmanagerV1beta.Accesscontextmanager
              ]
            ]
  }
  
  @js.native
  object auth extends TopLevel[AuthPlus] {
    
    @js.native
    /**
      * Google Compute Engine service account credentials.
      *
      * Retrieve access token from the metadata server.
      * See: https://developers.google.com/compute/docs/authentication
      */
    class Compute ()
      extends typings.googleAuthLibrary.mod.Compute
    
    @js.native
    class JWT protected ()
      extends typings.googleAuthLibrary.mod.JWT {
      /**
        * JWT service account credentials.
        *
        * Retrieve access token using gtoken.
        *
        * @param email service account email address.
        * @param keyFile path to private key file.
        * @param key value of key
        * @param scopes list of requested scopes or a single scope.
        * @param subject impersonated account's email address.
        * @param key_id the ID of the key
        */
      def this(options: JWTOptions) = this()
    }
  }
}
