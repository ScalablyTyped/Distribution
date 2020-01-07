package typings.googleapis

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.TopLevel
import typings.googleDashAuthDashLibrary.buildSrcAuthJwtclientMod.JWTOptions
import typings.googleapis.buildSrcApisGamesManagementV1managementMod.gamesManagement_v1management.Gamesmanagement
import typings.googleapis.buildSrcApisGamesManagementV1managementMod.gamesManagement_v1management.Options
import typings.googleapis.googleapisStrings.v1management
import typings.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typings.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import typings.googleapisDashCommon.googleapisDashCommonMod.AuthPlus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/gamesManagement", JSImport.Namespace)
@js.native
object buildSrcApisGamesManagementMod extends js.Object {
  def gamesManagement(options: Options): Gamesmanagement = js.native
  @JSName("gamesManagement")
  def gamesManagement_v1management(version: v1management): Gamesmanagement = js.native
  @js.native
  object VERSIONS extends js.Object {
    @js.native
    class v1management protected () extends Gamesmanagement {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    
    @js.native
    object v1management
      extends TopLevel[
              Instantiable2[
                /* options */ GlobalOptions, 
                js.UndefOr[/* google */ GoogleConfigurable], 
                Gamesmanagement
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
      extends typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.Compute
    
    @js.native
    class JWT protected ()
      extends typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.JWT {
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

