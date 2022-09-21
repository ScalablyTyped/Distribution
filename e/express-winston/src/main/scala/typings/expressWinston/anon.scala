package typings.expressWinston

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Body extends StObject {
    
    var body: js.Array[String]
    
    var req: js.Array[String]
    
    var res: js.Array[String]
  }
  object Body {
    
    inline def apply(body: js.Array[String], req: js.Array[String], res: js.Array[String]): Body = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], req = req.asInstanceOf[js.Any], res = res.asInstanceOf[js.Any])
      __obj.asInstanceOf[Body]
    }
    
    extension [Self <: Body](x: Self) {
      
      inline def setBody(value: js.Array[String]): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyVarargs(value: String*): Self = StObject.set(x, "body", js.Array(value*))
      
      inline def setReq(value: js.Array[String]): Self = StObject.set(x, "req", value.asInstanceOf[js.Any])
      
      inline def setReqVarargs(value: String*): Self = StObject.set(x, "req", js.Array(value*))
      
      inline def setRes(value: js.Array[String]): Self = StObject.set(x, "res", value.asInstanceOf[js.Any])
      
      inline def setResVarargs(value: String*): Self = StObject.set(x, "res", js.Array(value*))
    }
  }
}
