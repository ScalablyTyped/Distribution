package typings.googleapis.chromemanagementV1Mod.chromemanagementV1

import typings.googleapisCommon.apiMod.APIRequestContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/chromemanagement/v1", "chromemanagement_v1.Resource$Customers")
@js.native
open class ResourceCustomers protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var apps: ResourceCustomersApps = js.native
  
  var context: APIRequestContext = js.native
  
  var reports: ResourceCustomersReports = js.native
  
  var telemetry: ResourceCustomersTelemetry = js.native
}
