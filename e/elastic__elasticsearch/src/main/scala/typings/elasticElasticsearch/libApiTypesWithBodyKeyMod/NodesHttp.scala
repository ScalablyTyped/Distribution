package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodesHttp extends StObject {
  
  var clients: js.UndefOr[js.Array[NodesClient]] = js.undefined
  
  var current_open: js.UndefOr[integer] = js.undefined
  
  var total_opened: js.UndefOr[long] = js.undefined
}
object NodesHttp {
  
  inline def apply(): NodesHttp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodesHttp]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NodesHttp] (val x: Self) extends AnyVal {
    
    inline def setClients(value: js.Array[NodesClient]): Self = StObject.set(x, "clients", value.asInstanceOf[js.Any])
    
    inline def setClientsUndefined: Self = StObject.set(x, "clients", js.undefined)
    
    inline def setClientsVarargs(value: NodesClient*): Self = StObject.set(x, "clients", js.Array(value*))
    
    inline def setCurrent_open(value: integer): Self = StObject.set(x, "current_open", value.asInstanceOf[js.Any])
    
    inline def setCurrent_openUndefined: Self = StObject.set(x, "current_open", js.undefined)
    
    inline def setTotal_opened(value: long): Self = StObject.set(x, "total_opened", value.asInstanceOf[js.Any])
    
    inline def setTotal_openedUndefined: Self = StObject.set(x, "total_opened", js.undefined)
  }
}
