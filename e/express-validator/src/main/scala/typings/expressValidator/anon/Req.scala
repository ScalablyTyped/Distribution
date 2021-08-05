package typings.expressValidator.anon

import typings.expressValidator.baseMod.Request
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
  
  extension [Self <: Req](x: Self) {
    
    inline def setReq(value: Request): Self = StObject.set(x, "req", value.asInstanceOf[js.Any])
  }
}
