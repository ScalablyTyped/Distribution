package typings.googleapis.alphaMod.computeAlpha

import typings.googleapis.anon.Code
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains a list of VmEndpointNatMappings.
  */
trait SchemaVmEndpointNatMappingsList extends StObject {
  
  /**
    * [Output Only] The unique identifier for the resource. This identifier is
    * defined by the server.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * [Output Only] Type of resource. Always compute#vmEndpointNatMappingsList
    * for lists of Nat mappings of VM endpoints.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * [Output Only] This token allows you to get the next page of results for
    * list requests. If the number of results is larger than maxResults, use
    * the nextPageToken as a value for the query parameter pageToken in the
    * next list request. Subsequent list requests will have their own
    * nextPageToken to continue paging through the results.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /**
    * [Output Only] A list of Nat mapping information of VM endpoints.
    */
  var result: js.UndefOr[js.Array[SchemaVmEndpointNatMappings]] = js.undefined
  
  /**
    * [Output Only] Server-defined URL for this resource.
    */
  var selfLink: js.UndefOr[String] = js.undefined
  
  /**
    * [Output Only] Informational warning message.
    */
  var warning: js.UndefOr[Code] = js.undefined
}
object SchemaVmEndpointNatMappingsList {
  
  @scala.inline
  def apply(): SchemaVmEndpointNatMappingsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVmEndpointNatMappingsList]
  }
  
  @scala.inline
  implicit class SchemaVmEndpointNatMappingsListMutableBuilder[Self <: SchemaVmEndpointNatMappingsList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setResult(value: js.Array[SchemaVmEndpointNatMappings]): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
    
    @scala.inline
    def setResultVarargs(value: SchemaVmEndpointNatMappings*): Self = StObject.set(x, "result", js.Array(value :_*))
    
    @scala.inline
    def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
    
    @scala.inline
    def setWarning(value: Code): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWarningUndefined: Self = StObject.set(x, "warning", js.undefined)
  }
}
