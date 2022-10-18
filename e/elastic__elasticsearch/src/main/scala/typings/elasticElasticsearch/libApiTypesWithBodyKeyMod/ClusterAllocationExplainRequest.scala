package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import typings.elasticElasticsearch.anon.Currentnode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClusterAllocationExplainRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  /** @deprecated The use of the 'body' key has been deprecated, move the nested keys to the top level object. */
  var body: js.UndefOr[Currentnode] = js.undefined
  
  var include_disk_info: js.UndefOr[Boolean] = js.undefined
  
  var include_yes_decisions: js.UndefOr[Boolean] = js.undefined
}
object ClusterAllocationExplainRequest {
  
  inline def apply(): ClusterAllocationExplainRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterAllocationExplainRequest]
  }
  
  extension [Self <: ClusterAllocationExplainRequest](x: Self) {
    
    inline def setBody(value: Currentnode): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setInclude_disk_info(value: Boolean): Self = StObject.set(x, "include_disk_info", value.asInstanceOf[js.Any])
    
    inline def setInclude_disk_infoUndefined: Self = StObject.set(x, "include_disk_info", js.undefined)
    
    inline def setInclude_yes_decisions(value: Boolean): Self = StObject.set(x, "include_yes_decisions", value.asInstanceOf[js.Any])
    
    inline def setInclude_yes_decisionsUndefined: Self = StObject.set(x, "include_yes_decisions", js.undefined)
  }
}
