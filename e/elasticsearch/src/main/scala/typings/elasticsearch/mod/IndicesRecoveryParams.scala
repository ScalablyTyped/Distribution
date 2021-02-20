package typings.elasticsearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IndicesRecoveryParams extends GenericParams {
  
  var activeOnly: js.UndefOr[Boolean] = js.native
  
  var detailed: js.UndefOr[Boolean] = js.native
  
  var human: js.UndefOr[Boolean] = js.native
  
  var index: NameList = js.native
}
object IndicesRecoveryParams {
  
  @scala.inline
  def apply(index: NameList): IndicesRecoveryParams = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndicesRecoveryParams]
  }
  
  @scala.inline
  implicit class IndicesRecoveryParamsMutableBuilder[Self <: IndicesRecoveryParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActiveOnly(value: Boolean): Self = StObject.set(x, "activeOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveOnlyUndefined: Self = StObject.set(x, "activeOnly", js.undefined)
    
    @scala.inline
    def setDetailed(value: Boolean): Self = StObject.set(x, "detailed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetailedUndefined: Self = StObject.set(x, "detailed", js.undefined)
    
    @scala.inline
    def setHuman(value: Boolean): Self = StObject.set(x, "human", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHumanUndefined: Self = StObject.set(x, "human", js.undefined)
    
    @scala.inline
    def setIndex(value: NameList): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexVarargs(value: String*): Self = StObject.set(x, "index", js.Array(value :_*))
  }
}
