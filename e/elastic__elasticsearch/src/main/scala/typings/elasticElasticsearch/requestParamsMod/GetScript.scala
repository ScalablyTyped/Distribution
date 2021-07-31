package typings.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetScript
  extends StObject
     with Generic {
  
  var id: String
  
  var master_timeout: js.UndefOr[String] = js.undefined
}
object GetScript {
  
  @scala.inline
  def apply(id: String): GetScript = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetScript]
  }
  
  @scala.inline
  implicit class GetScriptMutableBuilder[Self <: GetScript] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaster_timeout(value: String): Self = StObject.set(x, "master_timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaster_timeoutUndefined: Self = StObject.set(x, "master_timeout", js.undefined)
  }
}
