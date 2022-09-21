package typings.dnsPacket.mod

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GenericOpt[T /* <: OptCodeType */] extends StObject {
  
  var code: OptCode[T]
  
  var data: js.UndefOr[Buffer] = js.undefined
  
  var `type`: js.UndefOr[T] = js.undefined
}
object GenericOpt {
  
  inline def apply[T /* <: OptCodeType */](code: OptCode[T]): GenericOpt[T] = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
    __obj.asInstanceOf[GenericOpt[T]]
  }
  
  extension [Self <: GenericOpt[?], T /* <: OptCodeType */](x: Self & GenericOpt[T]) {
    
    inline def setCode(value: OptCode[T]): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setData(value: Buffer): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setType(value: T): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
