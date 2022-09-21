package typings.googleapis.cloudbuildMod

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cloudbuildV1beta1 {
  
  @JSImport("googleapis/build/src/apis/cloudbuild", "cloudbuild_v1beta1.Cloudbuild")
  @js.native
  open class Cloudbuild protected ()
    extends typings.googleapis.cloudbuildV1beta1Mod.cloudbuildV1beta1.Cloudbuild {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @JSImport("googleapis/build/src/apis/cloudbuild", "cloudbuild_v1beta1.Resource$Projects")
  @js.native
  open class ResourceProjects protected ()
    extends typings.googleapis.cloudbuildV1beta1Mod.cloudbuildV1beta1.ResourceProjects {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis/build/src/apis/cloudbuild", "cloudbuild_v1beta1.Resource$Projects$Locations")
  @js.native
  open class ResourceProjectsLocations protected ()
    extends typings.googleapis.cloudbuildV1beta1Mod.cloudbuildV1beta1.ResourceProjectsLocations {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis/build/src/apis/cloudbuild", "cloudbuild_v1beta1.Resource$Projects$Locations$Operations")
  @js.native
  open class ResourceProjectsLocationsOperations protected ()
    extends typings.googleapis.cloudbuildV1beta1Mod.cloudbuildV1beta1.ResourceProjectsLocationsOperations {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis/build/src/apis/cloudbuild", "cloudbuild_v1beta1.Resource$Projects$Locations$Workerpools")
  @js.native
  open class ResourceProjectsLocationsWorkerpools protected ()
    extends typings.googleapis.cloudbuildV1beta1Mod.cloudbuildV1beta1.ResourceProjectsLocationsWorkerpools {
    def this(context: APIRequestContext) = this()
  }
}
