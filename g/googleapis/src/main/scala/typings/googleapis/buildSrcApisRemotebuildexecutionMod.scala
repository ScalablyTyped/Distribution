package typings.googleapis

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.TopLevel
import typings.googleDashAuthDashLibrary.buildSrcAuthJwtclientMod.JWTOptions
import typings.googleapis.buildSrcApisRemotebuildexecutionV1Mod.remotebuildexecution_v1.Options
import typings.googleapis.buildSrcApisRemotebuildexecutionV1Mod.remotebuildexecution_v1.Remotebuildexecution
import typings.googleapis.googleapisStrings.v1
import typings.googleapis.googleapisStrings.v1alpha
import typings.googleapis.googleapisStrings.v2
import typings.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typings.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import typings.googleapisDashCommon.googleapisDashCommonMod.AuthPlus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/remotebuildexecution", JSImport.Namespace)
@js.native
object buildSrcApisRemotebuildexecutionMod extends js.Object {
  def remotebuildexecution(options: Options): Remotebuildexecution = js.native
  def remotebuildexecution(
    options: typings.googleapis.buildSrcApisRemotebuildexecutionV1alphaMod.remotebuildexecution_v1alpha.Options
  ): typings.googleapis.buildSrcApisRemotebuildexecutionV1alphaMod.remotebuildexecution_v1alpha.Remotebuildexecution = js.native
  def remotebuildexecution(options: typings.googleapis.buildSrcApisRemotebuildexecutionV2Mod.remotebuildexecution_v2.Options): typings.googleapis.buildSrcApisRemotebuildexecutionV2Mod.remotebuildexecution_v2.Remotebuildexecution = js.native
  @JSName("remotebuildexecution")
  def remotebuildexecution_v1(version: v1): Remotebuildexecution = js.native
  @JSName("remotebuildexecution")
  def remotebuildexecution_v1alpha(version: v1alpha): typings.googleapis.buildSrcApisRemotebuildexecutionV1alphaMod.remotebuildexecution_v1alpha.Remotebuildexecution = js.native
  @JSName("remotebuildexecution")
  def remotebuildexecution_v2(version: v2): typings.googleapis.buildSrcApisRemotebuildexecutionV2Mod.remotebuildexecution_v2.Remotebuildexecution = js.native
  @js.native
  object VERSIONS extends js.Object {
    @js.native
    class v1 protected () extends Remotebuildexecution {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    
    @js.native
    class v1alpha protected ()
      extends typings.googleapis.buildSrcApisRemotebuildexecutionV1alphaMod.remotebuildexecution_v1alpha.Remotebuildexecution {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    
    @js.native
    class v2 protected ()
      extends typings.googleapis.buildSrcApisRemotebuildexecutionV2Mod.remotebuildexecution_v2.Remotebuildexecution {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    
    @js.native
    object v1
      extends TopLevel[
              Instantiable2[
                /* options */ GlobalOptions, 
                js.UndefOr[/* google */ GoogleConfigurable], 
                Remotebuildexecution
              ]
            ]
    
    @js.native
    object v1alpha
      extends TopLevel[
              Instantiable2[
                /* options */ GlobalOptions, 
                js.UndefOr[/* google */ GoogleConfigurable], 
                typings.googleapis.buildSrcApisRemotebuildexecutionV1alphaMod.remotebuildexecution_v1alpha.Remotebuildexecution
              ]
            ]
    
    @js.native
    object v2
      extends TopLevel[
              Instantiable2[
                /* options */ GlobalOptions, 
                js.UndefOr[/* google */ GoogleConfigurable], 
                typings.googleapis.buildSrcApisRemotebuildexecutionV2Mod.remotebuildexecution_v2.Remotebuildexecution
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

