package typings.elasticsearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IndicesCreateParams extends GenericParams {
  
  var index: String = js.native
  
  var masterTimeout: js.UndefOr[TimeSpan] = js.native
  
  var timeout: js.UndefOr[TimeSpan] = js.native
  
  var updateAllTypes: js.UndefOr[Boolean] = js.native
  
  var waitForActiveShards: js.UndefOr[String] = js.native
}
object IndicesCreateParams {
  
  @scala.inline
  def apply(index: String): IndicesCreateParams = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndicesCreateParams]
  }
  
  @scala.inline
  implicit class IndicesCreateParamsMutableBuilder[Self <: IndicesCreateParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIndex(value: String): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMasterTimeout(value: TimeSpan): Self = StObject.set(x, "masterTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMasterTimeoutUndefined: Self = StObject.set(x, "masterTimeout", js.undefined)
    
    @scala.inline
    def setTimeout(value: TimeSpan): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    @scala.inline
    def setUpdateAllTypes(value: Boolean): Self = StObject.set(x, "updateAllTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateAllTypesUndefined: Self = StObject.set(x, "updateAllTypes", js.undefined)
    
    @scala.inline
    def setWaitForActiveShards(value: String): Self = StObject.set(x, "waitForActiveShards", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWaitForActiveShardsUndefined: Self = StObject.set(x, "waitForActiveShards", js.undefined)
  }
}
