package typings.googleapis.cloudresourcemanagerV3Mod.cloudresourcemanagerV3

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/cloudresourcemanager/v3", "cloudresourcemanager_v3.Cloudresourcemanager")
@js.native
open class Cloudresourcemanager protected () extends StObject {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  
  var context: APIRequestContext = js.native
  
  var effectiveTags: ResourceEffectivetags = js.native
  
  var folders: ResourceFolders = js.native
  
  var liens: ResourceLiens = js.native
  
  var operations: ResourceOperations = js.native
  
  var organizations: ResourceOrganizations = js.native
  
  var projects: ResourceProjects = js.native
  
  var tagBindings: ResourceTagbindings = js.native
  
  var tagKeys: ResourceTagkeys = js.native
  
  var tagValues: ResourceTagvalues = js.native
}
