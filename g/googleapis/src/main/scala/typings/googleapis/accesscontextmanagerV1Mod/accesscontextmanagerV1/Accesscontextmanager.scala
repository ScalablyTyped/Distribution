package typings.googleapis.accesscontextmanagerV1Mod.accesscontextmanagerV1

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/accesscontextmanager/v1", "accesscontextmanager_v1.Accesscontextmanager")
@js.native
open class Accesscontextmanager protected () extends StObject {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  
  var accessPolicies: ResourceAccesspolicies = js.native
  
  var context: APIRequestContext = js.native
  
  var operations: ResourceOperations = js.native
  
  var organizations: ResourceOrganizations = js.native
}
