package typings.fastify.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StatusCode
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var statusCode: String | Double
}
object StatusCode {
  
  inline def apply(statusCode: String | Double): StatusCode = {
    val __obj = js.Dynamic.literal(statusCode = statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatusCode]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StatusCode] (val x: Self) extends AnyVal {
    
    inline def setStatusCode(value: String | Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
  }
}
