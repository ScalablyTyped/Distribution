package typings.dnsPacket.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Question extends StObject {
  
  var `class`: js.UndefOr[RecordClass] = js.undefined
  
  var name: String
  
  var `type`: RecordType
}
object Question {
  
  inline def apply(name: String, `type`: RecordType): Question = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Question]
  }
  
  extension [Self <: Question](x: Self) {
    
    inline def setClass(value: RecordClass): Self = StObject.set(x, "class", value.asInstanceOf[js.Any])
    
    inline def setClassUndefined: Self = StObject.set(x, "class", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: RecordType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
