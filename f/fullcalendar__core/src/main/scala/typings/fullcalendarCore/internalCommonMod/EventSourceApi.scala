package typings.fullcalendarCore.internalCommonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventSourceApi extends StObject {
  
  var format: String
  
  var id: String
  
  def refetch(): Unit
  
  def remove(): Unit
  
  var url: String
}
object EventSourceApi {
  
  inline def apply(format: String, id: String, refetch: () => Unit, remove: () => Unit, url: String): EventSourceApi = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], refetch = js.Any.fromFunction0(refetch), remove = js.Any.fromFunction0(remove), url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventSourceApi]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EventSourceApi] (val x: Self) extends AnyVal {
    
    inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setRefetch(value: () => Unit): Self = StObject.set(x, "refetch", js.Any.fromFunction0(value))
    
    inline def setRemove(value: () => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction0(value))
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
