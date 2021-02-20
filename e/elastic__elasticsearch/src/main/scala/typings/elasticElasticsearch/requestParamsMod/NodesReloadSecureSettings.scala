package typings.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NodesReloadSecureSettings[T] extends Generic {
  
  var body: js.UndefOr[T] = js.native
  
  var node_id: js.UndefOr[String | js.Array[String]] = js.native
  
  var timeout: js.UndefOr[String] = js.native
}
object NodesReloadSecureSettings {
  
  @scala.inline
  def apply[T](): NodesReloadSecureSettings[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodesReloadSecureSettings[T]]
  }
  
  @scala.inline
  implicit class NodesReloadSecureSettingsMutableBuilder[Self <: NodesReloadSecureSettings[_], T] (val x: Self with NodesReloadSecureSettings[T]) extends AnyVal {
    
    @scala.inline
    def setBody(value: T): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    @scala.inline
    def setNode_id(value: String | js.Array[String]): Self = StObject.set(x, "node_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNode_idUndefined: Self = StObject.set(x, "node_id", js.undefined)
    
    @scala.inline
    def setNode_idVarargs(value: String*): Self = StObject.set(x, "node_id", js.Array(value :_*))
    
    @scala.inline
    def setTimeout(value: String): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
