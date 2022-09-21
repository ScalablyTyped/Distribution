package typings.googleapis.cloudbuildV1Mod.cloudbuildV1

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/cloudbuild/v1", "cloudbuild_v1.Cloudbuild")
@js.native
open class Cloudbuild protected () extends StObject {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  
  var context: APIRequestContext = js.native
  
  var locations: ResourceLocations = js.native
  
  var operations: ResourceOperations = js.native
  
  var projects: ResourceProjects = js.native
  
  var v1: ResourceV1 = js.native
}
