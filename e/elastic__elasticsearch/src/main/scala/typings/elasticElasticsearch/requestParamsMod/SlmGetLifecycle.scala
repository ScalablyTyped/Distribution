package typings.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SlmGetLifecycle
  extends StObject
     with Generic {
  
  var policy_id: js.UndefOr[String | js.Array[String]] = js.undefined
}
object SlmGetLifecycle {
  
  @scala.inline
  def apply(): SlmGetLifecycle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SlmGetLifecycle]
  }
  
  @scala.inline
  implicit class SlmGetLifecycleMutableBuilder[Self <: SlmGetLifecycle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPolicy_id(value: String | js.Array[String]): Self = StObject.set(x, "policy_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicy_idUndefined: Self = StObject.set(x, "policy_id", js.undefined)
    
    @scala.inline
    def setPolicy_idVarargs(value: String*): Self = StObject.set(x, "policy_id", js.Array(value :_*))
  }
}
