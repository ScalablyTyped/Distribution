package typings.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IlmGetLifecycle
  extends StObject
     with Generic {
  
  var policy: js.UndefOr[String] = js.undefined
}
object IlmGetLifecycle {
  
  @scala.inline
  def apply(): IlmGetLifecycle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IlmGetLifecycle]
  }
  
  @scala.inline
  implicit class IlmGetLifecycleMutableBuilder[Self <: IlmGetLifecycle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPolicy(value: String): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyUndefined: Self = StObject.set(x, "policy", js.undefined)
  }
}
