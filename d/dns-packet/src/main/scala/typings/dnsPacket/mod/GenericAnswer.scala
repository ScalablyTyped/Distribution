package typings.dnsPacket.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GenericAnswer[T] extends StObject {
  
  var name: String
  
  var `type`: T
}
object GenericAnswer {
  
  inline def apply[T](name: String, `type`: T): GenericAnswer[T] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GenericAnswer[T]]
  }
  
  extension [Self <: GenericAnswer[?], T](x: Self & GenericAnswer[T]) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: T): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
