package typings.googleapis

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.TopLevel
import typings.googleDashAuthDashLibrary.buildSrcAuthJwtclientMod.JWTOptions
import typings.googleapis.buildSrcApisPubsubV1Mod.pubsub_v1.Options
import typings.googleapis.buildSrcApisPubsubV1Mod.pubsub_v1.Pubsub
import typings.googleapis.googleapisStrings.v1
import typings.googleapis.googleapisStrings.v1beta1a
import typings.googleapis.googleapisStrings.v1beta2
import typings.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typings.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import typings.googleapisDashCommon.googleapisDashCommonMod.AuthPlus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/pubsub", JSImport.Namespace)
@js.native
object buildSrcApisPubsubMod extends js.Object {
  def pubsub(options: Options): Pubsub = js.native
  def pubsub(options: typings.googleapis.buildSrcApisPubsubV1beta1aMod.pubsub_v1beta1a.Options): typings.googleapis.buildSrcApisPubsubV1beta1aMod.pubsub_v1beta1a.Pubsub = js.native
  def pubsub(options: typings.googleapis.buildSrcApisPubsubV1beta2Mod.pubsub_v1beta2.Options): typings.googleapis.buildSrcApisPubsubV1beta2Mod.pubsub_v1beta2.Pubsub = js.native
  @JSName("pubsub")
  def pubsub_v1(version: v1): Pubsub = js.native
  @JSName("pubsub")
  def pubsub_v1beta1a(version: v1beta1a): typings.googleapis.buildSrcApisPubsubV1beta1aMod.pubsub_v1beta1a.Pubsub = js.native
  @JSName("pubsub")
  def pubsub_v1beta2(version: v1beta2): typings.googleapis.buildSrcApisPubsubV1beta2Mod.pubsub_v1beta2.Pubsub = js.native
  @js.native
  object VERSIONS extends js.Object {
    @js.native
    class v1 protected () extends Pubsub {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    
    @js.native
    class v1beta1a protected ()
      extends typings.googleapis.buildSrcApisPubsubV1beta1aMod.pubsub_v1beta1a.Pubsub {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    
    @js.native
    class v1beta2 protected ()
      extends typings.googleapis.buildSrcApisPubsubV1beta2Mod.pubsub_v1beta2.Pubsub {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    
    @js.native
    object v1
      extends TopLevel[
              Instantiable2[/* options */ GlobalOptions, js.UndefOr[/* google */ GoogleConfigurable], Pubsub]
            ]
    
    @js.native
    object v1beta1a
      extends TopLevel[
              Instantiable2[
                /* options */ GlobalOptions, 
                js.UndefOr[/* google */ GoogleConfigurable], 
                typings.googleapis.buildSrcApisPubsubV1beta1aMod.pubsub_v1beta1a.Pubsub
              ]
            ]
    
    @js.native
    object v1beta2
      extends TopLevel[
              Instantiable2[
                /* options */ GlobalOptions, 
                js.UndefOr[/* google */ GoogleConfigurable], 
                typings.googleapis.buildSrcApisPubsubV1beta2Mod.pubsub_v1beta2.Pubsub
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

