package typings.googleapis.billingbudgetsV1Mod.billingbudgetsV1

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/billingbudgets/v1", "billingbudgets_v1.Billingbudgets")
@js.native
open class Billingbudgets protected () extends StObject {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  
  var billingAccounts: ResourceBillingaccounts = js.native
  
  var context: APIRequestContext = js.native
}
