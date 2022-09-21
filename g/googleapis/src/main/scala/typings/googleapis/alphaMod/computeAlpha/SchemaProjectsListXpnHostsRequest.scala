package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaProjectsListXpnHostsRequest extends StObject {
  
  /**
    * Optional organization ID managed by Cloud Resource Manager, for which to list shared VPC host projects. If not specified, the organization will be inferred from the project.
    */
  var organization: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Opt-in for partial page behavior which provides a partial filled page (number of items on which may be smaller than maxResults) within the API deadline. If opt-in, then the user should rely on if nextPageToken is empty in the response to determine if there is a next page. Empty page is also valid and possible. The default value is false.
    */
  var returnPartialPage: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaProjectsListXpnHostsRequest {
  
  inline def apply(): SchemaProjectsListXpnHostsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProjectsListXpnHostsRequest]
  }
  
  extension [Self <: SchemaProjectsListXpnHostsRequest](x: Self) {
    
    inline def setOrganization(value: String): Self = StObject.set(x, "organization", value.asInstanceOf[js.Any])
    
    inline def setOrganizationNull: Self = StObject.set(x, "organization", null)
    
    inline def setOrganizationUndefined: Self = StObject.set(x, "organization", js.undefined)
    
    inline def setReturnPartialPage(value: Boolean): Self = StObject.set(x, "returnPartialPage", value.asInstanceOf[js.Any])
    
    inline def setReturnPartialPageNull: Self = StObject.set(x, "returnPartialPage", null)
    
    inline def setReturnPartialPageUndefined: Self = StObject.set(x, "returnPartialPage", js.undefined)
  }
}
