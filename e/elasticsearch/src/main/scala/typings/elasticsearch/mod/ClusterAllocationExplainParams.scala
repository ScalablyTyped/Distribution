package typings.elasticsearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClusterAllocationExplainParams
  extends StObject
     with GenericParams {
  
  var includeDiskInfo: js.UndefOr[Boolean] = js.undefined
  
  var includeYesDecisions: js.UndefOr[Boolean] = js.undefined
}
object ClusterAllocationExplainParams {
  
  inline def apply(): ClusterAllocationExplainParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterAllocationExplainParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClusterAllocationExplainParams] (val x: Self) extends AnyVal {
    
    inline def setIncludeDiskInfo(value: Boolean): Self = StObject.set(x, "includeDiskInfo", value.asInstanceOf[js.Any])
    
    inline def setIncludeDiskInfoUndefined: Self = StObject.set(x, "includeDiskInfo", js.undefined)
    
    inline def setIncludeYesDecisions(value: Boolean): Self = StObject.set(x, "includeYesDecisions", value.asInstanceOf[js.Any])
    
    inline def setIncludeYesDecisionsUndefined: Self = StObject.set(x, "includeYesDecisions", js.undefined)
  }
}
