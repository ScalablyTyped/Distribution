package typings.forgeApis.anon

import typings.forgeApis.forgeApisInts.`200`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StatusCode extends StObject {
  
  var statusCode: `200`
}
object StatusCode {
  
  inline def apply(): StatusCode = {
    val __obj = js.Dynamic.literal(statusCode = 200)
    __obj.asInstanceOf[StatusCode]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StatusCode] (val x: Self) extends AnyVal {
    
    inline def setStatusCode(value: `200`): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
  }
}
