package typings.elasticsearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IndicesRolloverParams extends GenericParams {
  
  var alias: js.UndefOr[String] = js.native
  
  var masterTimeout: js.UndefOr[TimeSpan] = js.native
  
  var newIndex: js.UndefOr[String] = js.native
  
  var timeout: js.UndefOr[TimeSpan] = js.native
  
  var waitForActiveShards: js.UndefOr[Double | String] = js.native
}
object IndicesRolloverParams {
  
  @scala.inline
  def apply(): IndicesRolloverParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IndicesRolloverParams]
  }
  
  @scala.inline
  implicit class IndicesRolloverParamsMutableBuilder[Self <: IndicesRolloverParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlias(value: String): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAliasUndefined: Self = StObject.set(x, "alias", js.undefined)
    
    @scala.inline
    def setMasterTimeout(value: TimeSpan): Self = StObject.set(x, "masterTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMasterTimeoutUndefined: Self = StObject.set(x, "masterTimeout", js.undefined)
    
    @scala.inline
    def setNewIndex(value: String): Self = StObject.set(x, "newIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewIndexUndefined: Self = StObject.set(x, "newIndex", js.undefined)
    
    @scala.inline
    def setTimeout(value: TimeSpan): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    @scala.inline
    def setWaitForActiveShards(value: Double | String): Self = StObject.set(x, "waitForActiveShards", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWaitForActiveShardsUndefined: Self = StObject.set(x, "waitForActiveShards", js.undefined)
  }
}
