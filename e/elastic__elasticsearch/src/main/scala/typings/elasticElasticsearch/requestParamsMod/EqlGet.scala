package typings.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EqlGet
  extends StObject
     with Generic {
  
  var id: String
  
  var keep_alive: js.UndefOr[String] = js.undefined
  
  var wait_for_completion_timeout: js.UndefOr[String] = js.undefined
}
object EqlGet {
  
  @scala.inline
  def apply(id: String): EqlGet = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[EqlGet]
  }
  
  @scala.inline
  implicit class EqlGetMutableBuilder[Self <: EqlGet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeep_alive(value: String): Self = StObject.set(x, "keep_alive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeep_aliveUndefined: Self = StObject.set(x, "keep_alive", js.undefined)
    
    @scala.inline
    def setWait_for_completion_timeout(value: String): Self = StObject.set(x, "wait_for_completion_timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWait_for_completion_timeoutUndefined: Self = StObject.set(x, "wait_for_completion_timeout", js.undefined)
  }
}
