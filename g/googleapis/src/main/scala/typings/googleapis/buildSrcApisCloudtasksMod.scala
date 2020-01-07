package typings.googleapis

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.TopLevel
import typings.googleDashAuthDashLibrary.buildSrcAuthJwtclientMod.JWTOptions
import typings.googleapis.buildSrcApisCloudtasksV2Mod.cloudtasks_v2.Cloudtasks
import typings.googleapis.buildSrcApisCloudtasksV2Mod.cloudtasks_v2.Options
import typings.googleapis.googleapisStrings.v2
import typings.googleapis.googleapisStrings.v2beta2
import typings.googleapis.googleapisStrings.v2beta3
import typings.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typings.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import typings.googleapisDashCommon.googleapisDashCommonMod.AuthPlus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/cloudtasks", JSImport.Namespace)
@js.native
object buildSrcApisCloudtasksMod extends js.Object {
  def cloudtasks(options: Options): Cloudtasks = js.native
  def cloudtasks(options: typings.googleapis.buildSrcApisCloudtasksV2beta2Mod.cloudtasks_v2beta2.Options): typings.googleapis.buildSrcApisCloudtasksV2beta2Mod.cloudtasks_v2beta2.Cloudtasks = js.native
  def cloudtasks(options: typings.googleapis.buildSrcApisCloudtasksV2beta3Mod.cloudtasks_v2beta3.Options): typings.googleapis.buildSrcApisCloudtasksV2beta3Mod.cloudtasks_v2beta3.Cloudtasks = js.native
  @JSName("cloudtasks")
  def cloudtasks_v2(version: v2): Cloudtasks = js.native
  @JSName("cloudtasks")
  def cloudtasks_v2beta2(version: v2beta2): typings.googleapis.buildSrcApisCloudtasksV2beta2Mod.cloudtasks_v2beta2.Cloudtasks = js.native
  @JSName("cloudtasks")
  def cloudtasks_v2beta3(version: v2beta3): typings.googleapis.buildSrcApisCloudtasksV2beta3Mod.cloudtasks_v2beta3.Cloudtasks = js.native
  @js.native
  object VERSIONS extends js.Object {
    @js.native
    class v2 protected () extends Cloudtasks {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    
    @js.native
    class v2beta2 protected ()
      extends typings.googleapis.buildSrcApisCloudtasksV2beta2Mod.cloudtasks_v2beta2.Cloudtasks {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    
    @js.native
    class v2beta3 protected ()
      extends typings.googleapis.buildSrcApisCloudtasksV2beta3Mod.cloudtasks_v2beta3.Cloudtasks {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    
    @js.native
    object v2
      extends TopLevel[
              Instantiable2[/* options */ GlobalOptions, js.UndefOr[/* google */ GoogleConfigurable], Cloudtasks]
            ]
    
    @js.native
    object v2beta2
      extends TopLevel[
              Instantiable2[
                /* options */ GlobalOptions, 
                js.UndefOr[/* google */ GoogleConfigurable], 
                typings.googleapis.buildSrcApisCloudtasksV2beta2Mod.cloudtasks_v2beta2.Cloudtasks
              ]
            ]
    
    @js.native
    object v2beta3
      extends TopLevel[
              Instantiable2[
                /* options */ GlobalOptions, 
                js.UndefOr[/* google */ GoogleConfigurable], 
                typings.googleapis.buildSrcApisCloudtasksV2beta3Mod.cloudtasks_v2beta3.Cloudtasks
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

