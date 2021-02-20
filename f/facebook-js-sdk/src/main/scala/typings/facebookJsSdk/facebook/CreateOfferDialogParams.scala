package typings.facebookJsSdk.facebook

import typings.facebookJsSdk.facebookJsSdkStrings.APP_INSTALLS
import typings.facebookJsSdk.facebookJsSdkStrings.CONVERSIONS
import typings.facebookJsSdk.facebookJsSdkStrings.LINK_CLICKS
import typings.facebookJsSdk.facebookJsSdkStrings.OFFER_CLAIMS
import typings.facebookJsSdk.facebookJsSdkStrings.PRODUCT_CATALOG_SALES
import typings.facebookJsSdk.facebookJsSdkStrings.STORE_VISITS
import typings.facebookJsSdk.facebookJsSdkStrings.create_offer
import typings.facebookJsSdk.facebookJsSdkStrings.popup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateOfferDialogParams extends DialogParams {
  
  var account_id: String = js.native
  
  @JSName("display")
  var display_CreateOfferDialogParams: popup = js.native
  
  var method: create_offer = js.native
  
  var objective: APP_INSTALLS | CONVERSIONS | LINK_CLICKS | OFFER_CLAIMS | PRODUCT_CATALOG_SALES | STORE_VISITS = js.native
  
  var page_id: String = js.native
}
object CreateOfferDialogParams {
  
  @scala.inline
  def apply(
    account_id: String,
    display: popup,
    method: create_offer,
    objective: APP_INSTALLS | CONVERSIONS | LINK_CLICKS | OFFER_CLAIMS | PRODUCT_CATALOG_SALES | STORE_VISITS,
    page_id: String
  ): CreateOfferDialogParams = {
    val __obj = js.Dynamic.literal(account_id = account_id.asInstanceOf[js.Any], display = display.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], objective = objective.asInstanceOf[js.Any], page_id = page_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateOfferDialogParams]
  }
  
  @scala.inline
  implicit class CreateOfferDialogParamsMutableBuilder[Self <: CreateOfferDialogParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccount_id(value: String): Self = StObject.set(x, "account_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplay(value: popup): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethod(value: create_offer): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjective(
      value: APP_INSTALLS | CONVERSIONS | LINK_CLICKS | OFFER_CLAIMS | PRODUCT_CATALOG_SALES | STORE_VISITS
    ): Self = StObject.set(x, "objective", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPage_id(value: String): Self = StObject.set(x, "page_id", value.asInstanceOf[js.Any])
  }
}
