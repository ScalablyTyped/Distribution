package typings.googleapis.authorizedbuyersmarketplaceV1Mod.authorizedbuyersmarketplaceV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceBuyersProposalsAddnote
  extends StObject
     with StandardParameters {
  
  /**
    * Name of the proposal. Format: `buyers/{accountId\}/proposals/{proposalId\}`
    */
  var proposal: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaAddNoteRequest] = js.undefined
}
object ParamsResourceBuyersProposalsAddnote {
  
  inline def apply(): ParamsResourceBuyersProposalsAddnote = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceBuyersProposalsAddnote]
  }
  
  extension [Self <: ParamsResourceBuyersProposalsAddnote](x: Self) {
    
    inline def setProposal(value: String): Self = StObject.set(x, "proposal", value.asInstanceOf[js.Any])
    
    inline def setProposalUndefined: Self = StObject.set(x, "proposal", js.undefined)
    
    inline def setRequestBody(value: SchemaAddNoteRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
