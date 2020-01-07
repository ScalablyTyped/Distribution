package typings.googleapis

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.TopLevel
import typings.googleDashAuthDashLibrary.buildSrcAuthJwtclientMod.JWTOptions
import typings.googleapis.buildSrcApisCloudtraceV1Mod.cloudtrace_v1.Cloudtrace
import typings.googleapis.buildSrcApisCloudtraceV1Mod.cloudtrace_v1.Options
import typings.googleapis.googleapisStrings.v1
import typings.googleapis.googleapisStrings.v2
import typings.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typings.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import typings.googleapisDashCommon.googleapisDashCommonMod.AuthPlus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/cloudtrace", JSImport.Namespace)
@js.native
object buildSrcApisCloudtraceMod extends js.Object {
  def cloudtrace(options: Options): Cloudtrace = js.native
  def cloudtrace(options: typings.googleapis.buildSrcApisCloudtraceV2Mod.cloudtrace_v2.Options): typings.googleapis.buildSrcApisCloudtraceV2Mod.cloudtrace_v2.Cloudtrace = js.native
  @JSName("cloudtrace")
  def cloudtrace_v1(version: v1): Cloudtrace = js.native
  @JSName("cloudtrace")
  def cloudtrace_v2(version: v2): typings.googleapis.buildSrcApisCloudtraceV2Mod.cloudtrace_v2.Cloudtrace = js.native
  @js.native
  object VERSIONS extends js.Object {
    @js.native
    class v1 protected () extends Cloudtrace {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    
    @js.native
    class v2 protected ()
      extends typings.googleapis.buildSrcApisCloudtraceV2Mod.cloudtrace_v2.Cloudtrace {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    
    @js.native
    object v1
      extends TopLevel[
              Instantiable2[/* options */ GlobalOptions, js.UndefOr[/* google */ GoogleConfigurable], Cloudtrace]
            ]
    
    @js.native
    object v2
      extends TopLevel[
              Instantiable2[
                /* options */ GlobalOptions, 
                js.UndefOr[/* google */ GoogleConfigurable], 
                typings.googleapis.buildSrcApisCloudtraceV2Mod.cloudtrace_v2.Cloudtrace
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

