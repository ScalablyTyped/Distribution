package typings.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IlmExplainLifecycle extends Generic {
  
  var index: String = js.native
  
  var only_errors: js.UndefOr[Boolean] = js.native
  
  var only_managed: js.UndefOr[Boolean] = js.native
}
object IlmExplainLifecycle {
  
  @scala.inline
  def apply(index: String): IlmExplainLifecycle = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[IlmExplainLifecycle]
  }
  
  @scala.inline
  implicit class IlmExplainLifecycleMutableBuilder[Self <: IlmExplainLifecycle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIndex(value: String): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnly_errors(value: Boolean): Self = StObject.set(x, "only_errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnly_errorsUndefined: Self = StObject.set(x, "only_errors", js.undefined)
    
    @scala.inline
    def setOnly_managed(value: Boolean): Self = StObject.set(x, "only_managed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnly_managedUndefined: Self = StObject.set(x, "only_managed", js.undefined)
  }
}
