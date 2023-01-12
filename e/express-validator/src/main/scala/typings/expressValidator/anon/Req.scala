package typings.expressValidator.anon

import typings.expressValidator.srcBaseMod.Request
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Req extends StObject {
  
  var req: Request
}
object Req {
  
  inline def apply(req: Request): Req = {
    val __obj = js.Dynamic.literal(req = req.asInstanceOf[js.Any])
    __obj.asInstanceOf[Req]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Req] (val x: Self) extends AnyVal {
    
    inline def setReq(value: Request): Self = StObject.set(x, "req", value.asInstanceOf[js.Any])
  }
}
