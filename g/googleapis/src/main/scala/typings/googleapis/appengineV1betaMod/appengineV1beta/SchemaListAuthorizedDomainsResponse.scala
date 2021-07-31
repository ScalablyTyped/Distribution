package typings.googleapis.appengineV1betaMod.appengineV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response message for AuthorizedDomains.ListAuthorizedDomains.
  */
trait SchemaListAuthorizedDomainsResponse extends StObject {
  
  /**
    * The authorized domains belonging to the user.
    */
  var domains: js.UndefOr[js.Array[SchemaAuthorizedDomain]] = js.undefined
  
  /**
    * Continuation token for fetching the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object SchemaListAuthorizedDomainsResponse {
  
  @scala.inline
  def apply(): SchemaListAuthorizedDomainsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListAuthorizedDomainsResponse]
  }
  
  @scala.inline
  implicit class SchemaListAuthorizedDomainsResponseMutableBuilder[Self <: SchemaListAuthorizedDomainsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDomains(value: js.Array[SchemaAuthorizedDomain]): Self = StObject.set(x, "domains", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainsUndefined: Self = StObject.set(x, "domains", js.undefined)
    
    @scala.inline
    def setDomainsVarargs(value: SchemaAuthorizedDomain*): Self = StObject.set(x, "domains", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
