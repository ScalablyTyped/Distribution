package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodesNodeReloadError
  extends StObject
     with NodesNodeReloadResult {
  
  var name: Name
  
  var reload_exception: js.UndefOr[ErrorCause] = js.undefined
}
object NodesNodeReloadError {
  
  inline def apply(name: Name): NodesNodeReloadError = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodesNodeReloadError]
  }
  
  extension [Self <: NodesNodeReloadError](x: Self) {
    
    inline def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setReload_exception(value: ErrorCause): Self = StObject.set(x, "reload_exception", value.asInstanceOf[js.Any])
    
    inline def setReload_exceptionUndefined: Self = StObject.set(x, "reload_exception", js.undefined)
  }
}
