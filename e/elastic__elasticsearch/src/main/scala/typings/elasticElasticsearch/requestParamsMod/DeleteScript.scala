package typings.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteScript
  extends StObject
     with Generic {
  
  var id: String
  
  var master_timeout: js.UndefOr[String] = js.undefined
  
  var timeout: js.UndefOr[String] = js.undefined
}
object DeleteScript {
  
  @scala.inline
  def apply(id: String): DeleteScript = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteScript]
  }
  
  @scala.inline
  implicit class DeleteScriptMutableBuilder[Self <: DeleteScript] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaster_timeout(value: String): Self = StObject.set(x, "master_timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaster_timeoutUndefined: Self = StObject.set(x, "master_timeout", js.undefined)
    
    @scala.inline
    def setTimeout(value: String): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
