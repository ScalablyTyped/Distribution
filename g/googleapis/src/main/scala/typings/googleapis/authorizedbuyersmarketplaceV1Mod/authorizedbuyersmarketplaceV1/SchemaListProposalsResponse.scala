package typings.googleapis.authorizedbuyersmarketplaceV1Mod.authorizedbuyersmarketplaceV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListProposalsResponse extends StObject {
  
  /**
    * Continuation token for fetching the next page of results.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The list of proposals.
    */
  var proposals: js.UndefOr[js.Array[SchemaProposal]] = js.undefined
}
object SchemaListProposalsResponse {
  
  inline def apply(): SchemaListProposalsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListProposalsResponse]
  }
  
  extension [Self <: SchemaListProposalsResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setProposals(value: js.Array[SchemaProposal]): Self = StObject.set(x, "proposals", value.asInstanceOf[js.Any])
    
    inline def setProposalsUndefined: Self = StObject.set(x, "proposals", js.undefined)
    
    inline def setProposalsVarargs(value: SchemaProposal*): Self = StObject.set(x, "proposals", js.Array(value*))
  }
}
