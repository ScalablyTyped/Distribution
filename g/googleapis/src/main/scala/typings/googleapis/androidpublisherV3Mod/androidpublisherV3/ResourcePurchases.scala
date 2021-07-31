package typings.googleapis.androidpublisherV3Mod.androidpublisherV3

import typings.googleapisCommon.apiMod.APIRequestContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/androidpublisher/v3", "androidpublisher_v3.Resource$Purchases")
@js.native
class ResourcePurchases protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  var products: ResourcePurchasesProducts = js.native
  
  var subscriptions: ResourcePurchasesSubscriptions = js.native
  
  var voidedpurchases: ResourcePurchasesVoidedpurchases = js.native
}
