package typings.googleapis.beyondcorpV1alphaMod.beyondcorpV1alpha

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/beyondcorp/v1alpha", "beyondcorp_v1alpha.Beyondcorp")
@js.native
open class Beyondcorp protected () extends StObject {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  
  var context: APIRequestContext = js.native
  
  var organizations: ResourceOrganizations = js.native
  
  var projects: ResourceProjects = js.native
}
