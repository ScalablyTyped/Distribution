package typings.googleapis

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.TopLevel
import typings.googleAuthLibrary.jwtclientMod.JWTOptions
import typings.googleapis.bigtableadminV1Mod.bigtableadminV1.Bigtableadmin
import typings.googleapis.bigtableadminV1Mod.bigtableadminV1.Options
import typings.googleapis.googleapisStrings.v1
import typings.googleapis.googleapisStrings.v2
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import typings.googleapisCommon.mod.AuthPlus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/bigtableadmin", JSImport.Namespace)
@js.native
object bigtableadminMod extends js.Object {
  def bigtableadmin(options: Options): Bigtableadmin = js.native
  def bigtableadmin(options: typings.googleapis.bigtableadminV2Mod.bigtableadminV2.Options): typings.googleapis.bigtableadminV2Mod.bigtableadminV2.Bigtableadmin = js.native
  @JSName("bigtableadmin")
  def bigtableadmin_v1(version: v1): Bigtableadmin = js.native
  @JSName("bigtableadmin")
  def bigtableadmin_v2(version: v2): typings.googleapis.bigtableadminV2Mod.bigtableadminV2.Bigtableadmin = js.native
  @js.native
  object VERSIONS extends js.Object {
    @js.native
    class v1 protected () extends Bigtableadmin {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    
    @js.native
    class v2 protected ()
      extends typings.googleapis.bigtableadminV2Mod.bigtableadminV2.Bigtableadmin {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    
    @js.native
    object v1
      extends TopLevel[
              Instantiable2[
                /* options */ GlobalOptions, 
                /* google */ js.UndefOr[GoogleConfigurable], 
                Bigtableadmin
              ]
            ]
    
    @js.native
    object v2
      extends TopLevel[
              Instantiable2[
                /* options */ GlobalOptions, 
                /* google */ js.UndefOr[GoogleConfigurable], 
                typings.googleapis.bigtableadminV2Mod.bigtableadminV2.Bigtableadmin
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

