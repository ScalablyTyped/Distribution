package typings.devtoolsProtocol.mod.Protocol.Network

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchInResponseBodyRequest extends StObject {
  
  /**
    * If true, search is case sensitive.
    */
  var caseSensitive: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If true, treats string parameter as regex.
    */
  var isRegex: js.UndefOr[Boolean] = js.undefined
  
  /**
    * String to search for.
    */
  var query: String
  
  /**
    * Identifier of the network response to search.
    */
  var requestId: RequestId
}
object SearchInResponseBodyRequest {
  
  @scala.inline
  def apply(query: String, requestId: RequestId): SearchInResponseBodyRequest = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchInResponseBodyRequest]
  }
  
  @scala.inline
  implicit class SearchInResponseBodyRequestMutableBuilder[Self <: SearchInResponseBodyRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCaseSensitive(value: Boolean): Self = StObject.set(x, "caseSensitive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaseSensitiveUndefined: Self = StObject.set(x, "caseSensitive", js.undefined)
    
    @scala.inline
    def setIsRegex(value: Boolean): Self = StObject.set(x, "isRegex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsRegexUndefined: Self = StObject.set(x, "isRegex", js.undefined)
    
    @scala.inline
    def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestId(value: RequestId): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
  }
}
