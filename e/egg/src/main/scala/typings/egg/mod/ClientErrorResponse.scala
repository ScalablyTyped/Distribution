package typings.egg.mod

import org.scalablytyped.runtime.StringDictionary
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClientErrorResponse extends StObject {
  
  var body: String | Buffer
  
  var headers: StringDictionary[String]
  
  var status: Double
}
object ClientErrorResponse {
  
  inline def apply(body: String | Buffer, headers: StringDictionary[String], status: Double): ClientErrorResponse = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientErrorResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClientErrorResponse] (val x: Self) extends AnyVal {
    
    inline def setBody(value: String | Buffer): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: StringDictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
