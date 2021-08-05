package typings.expressCorrelationId

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Header extends StObject {
    
    var header: js.UndefOr[String] = js.undefined
  }
  object Header {
    
    inline def apply(): Header = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Header]
    }
    
    extension [Self <: Header](x: Self) {
      
      inline def setHeader(value: String): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    }
  }
}
