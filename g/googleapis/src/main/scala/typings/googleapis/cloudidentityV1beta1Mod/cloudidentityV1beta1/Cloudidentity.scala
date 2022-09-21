package typings.googleapis.cloudidentityV1beta1Mod.cloudidentityV1beta1

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/cloudidentity/v1beta1", "cloudidentity_v1beta1.Cloudidentity")
@js.native
open class Cloudidentity protected () extends StObject {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  
  var context: APIRequestContext = js.native
  
  var customers: ResourceCustomers = js.native
  
  var devices: ResourceDevices = js.native
  
  var groups: ResourceGroups = js.native
  
  var orgUnits: ResourceOrgunits = js.native
}
