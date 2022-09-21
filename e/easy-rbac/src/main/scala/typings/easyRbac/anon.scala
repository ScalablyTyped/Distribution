package typings.easyRbac

import typings.easyRbac.mod.RoleObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Can extends StObject {
    
    var can: js.Array[String | RoleObject]
    
    var inherits: js.UndefOr[js.Array[String]] = js.undefined
  }
  object Can {
    
    inline def apply(can: js.Array[String | RoleObject]): Can = {
      val __obj = js.Dynamic.literal(can = can.asInstanceOf[js.Any])
      __obj.asInstanceOf[Can]
    }
    
    extension [Self <: Can](x: Self) {
      
      inline def setCan(value: js.Array[String | RoleObject]): Self = StObject.set(x, "can", value.asInstanceOf[js.Any])
      
      inline def setCanVarargs(value: (String | RoleObject)*): Self = StObject.set(x, "can", js.Array(value*))
      
      inline def setInherits(value: js.Array[String]): Self = StObject.set(x, "inherits", value.asInstanceOf[js.Any])
      
      inline def setInheritsUndefined: Self = StObject.set(x, "inherits", js.undefined)
      
      inline def setInheritsVarargs(value: String*): Self = StObject.set(x, "inherits", js.Array(value*))
    }
  }
}
