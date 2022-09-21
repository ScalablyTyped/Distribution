package typings.googleapis.cloudfunctionsMod

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cloudfunctionsV1 {
  
  @JSImport("googleapis/build/src/apis/cloudfunctions", "cloudfunctions_v1.Cloudfunctions")
  @js.native
  open class Cloudfunctions protected ()
    extends typings.googleapis.cloudfunctionsV1Mod.cloudfunctionsV1.Cloudfunctions {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @JSImport("googleapis/build/src/apis/cloudfunctions", "cloudfunctions_v1.Resource$Operations")
  @js.native
  open class ResourceOperations protected ()
    extends typings.googleapis.cloudfunctionsV1Mod.cloudfunctionsV1.ResourceOperations {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis/build/src/apis/cloudfunctions", "cloudfunctions_v1.Resource$Projects")
  @js.native
  open class ResourceProjects protected ()
    extends typings.googleapis.cloudfunctionsV1Mod.cloudfunctionsV1.ResourceProjects {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis/build/src/apis/cloudfunctions", "cloudfunctions_v1.Resource$Projects$Locations")
  @js.native
  open class ResourceProjectsLocations protected ()
    extends typings.googleapis.cloudfunctionsV1Mod.cloudfunctionsV1.ResourceProjectsLocations {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis/build/src/apis/cloudfunctions", "cloudfunctions_v1.Resource$Projects$Locations$Functions")
  @js.native
  open class ResourceProjectsLocationsFunctions protected ()
    extends typings.googleapis.cloudfunctionsV1Mod.cloudfunctionsV1.ResourceProjectsLocationsFunctions {
    def this(context: APIRequestContext) = this()
  }
}
