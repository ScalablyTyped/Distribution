package typings.googleapis.appengineV1alphaMod.appengineV1alpha

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/appengine/v1alpha", "appengine_v1alpha.Appengine")
@js.native
open class Appengine protected () extends StObject {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  
  var apps: ResourceApps = js.native
  
  var context: APIRequestContext = js.native
  
  var projects: ResourceProjects = js.native
}
