package typings.expressMyconnection

import typings.expressMyconnection.mysql.Connection
import typings.expressMyconnection.mysql.MysqlError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Express {
  
  trait Request extends StObject {
    
    var getConnection: js.UndefOr[
        js.Function1[
          /* callback */ js.Function2[/* err */ MysqlError, /* connection */ Connection, Unit], 
          Unit
        ]
      ] = js.undefined
  }
  object Request {
    
    inline def apply(): Request = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Request]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Request] (val x: Self) extends AnyVal {
      
      inline def setGetConnection(
        value: /* callback */ js.Function2[/* err */ MysqlError, /* connection */ Connection, Unit] => Unit
      ): Self = StObject.set(x, "getConnection", js.Any.fromFunction1(value))
      
      inline def setGetConnectionUndefined: Self = StObject.set(x, "getConnection", js.undefined)
    }
  }
}
