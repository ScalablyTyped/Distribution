package typings.googleapis.cloudbuildV1Mod.cloudbuildV1

import typings.googleapisCommon.apiMod.APIRequestContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/cloudbuild/v1", "cloudbuild_v1.Resource$Projects$Locations")
@js.native
open class ResourceProjectsLocations protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var bitbucketServerConfigs: ResourceProjectsLocationsBitbucketserverconfigs = js.native
  
  var builds: ResourceProjectsLocationsBuilds = js.native
  
  var context: APIRequestContext = js.native
  
  var githubEnterpriseConfigs: ResourceProjectsLocationsGithubenterpriseconfigs = js.native
  
  var operations: ResourceProjectsLocationsOperations = js.native
  
  var triggers: ResourceProjectsLocationsTriggers = js.native
  
  var workerPools: ResourceProjectsLocationsWorkerpools = js.native
}
