package typings.elasticsearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CatAllocationParams extends CatCommonParams {
  
  var bytes: js.UndefOr[CatBytes] = js.native
  
  var nodeId: js.UndefOr[NameList] = js.native
}
object CatAllocationParams {
  
  @scala.inline
  def apply(format: String): CatAllocationParams = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any])
    __obj.asInstanceOf[CatAllocationParams]
  }
  
  @scala.inline
  implicit class CatAllocationParamsMutableBuilder[Self <: CatAllocationParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBytes(value: CatBytes): Self = StObject.set(x, "bytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBytesUndefined: Self = StObject.set(x, "bytes", js.undefined)
    
    @scala.inline
    def setNodeId(value: NameList): Self = StObject.set(x, "nodeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeIdUndefined: Self = StObject.set(x, "nodeId", js.undefined)
    
    @scala.inline
    def setNodeIdVarargs(value: String*): Self = StObject.set(x, "nodeId", js.Array(value :_*))
  }
}
