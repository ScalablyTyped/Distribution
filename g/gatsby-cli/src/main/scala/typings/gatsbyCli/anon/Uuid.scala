package typings.gatsbyCli.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Uuid extends StObject {
  
  var current: js.UndefOr[Double] = js.undefined
  
  var id: String
  
  var statusText: js.UndefOr[String] = js.undefined
  
  var total: js.UndefOr[Double] = js.undefined
  
  var uuid: String
}
object Uuid {
  
  inline def apply(id: String, uuid: String): Uuid = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
    __obj.asInstanceOf[Uuid]
  }
  
  extension [Self <: Uuid](x: Self) {
    
    inline def setCurrent(value: Double): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
    
    inline def setCurrentUndefined: Self = StObject.set(x, "current", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setStatusText(value: String): Self = StObject.set(x, "statusText", value.asInstanceOf[js.Any])
    
    inline def setStatusTextUndefined: Self = StObject.set(x, "statusText", js.undefined)
    
    inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    
    inline def setTotalUndefined: Self = StObject.set(x, "total", js.undefined)
    
    inline def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
  }
}
