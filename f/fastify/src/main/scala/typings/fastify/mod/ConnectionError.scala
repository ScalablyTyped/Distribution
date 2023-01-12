package typings.fastify.mod

import typings.fastify.anon.Data
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConnectionError
  extends StObject
     with Error {
  
  var bytesParsed: Double
  
  var code: String
  
  var rawPacket: Data
}
object ConnectionError {
  
  inline def apply(bytesParsed: Double, code: String, message: String, name: String, rawPacket: Data): ConnectionError = {
    val __obj = js.Dynamic.literal(bytesParsed = bytesParsed.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], rawPacket = rawPacket.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionError]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConnectionError] (val x: Self) extends AnyVal {
    
    inline def setBytesParsed(value: Double): Self = StObject.set(x, "bytesParsed", value.asInstanceOf[js.Any])
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setRawPacket(value: Data): Self = StObject.set(x, "rawPacket", value.asInstanceOf[js.Any])
  }
}
