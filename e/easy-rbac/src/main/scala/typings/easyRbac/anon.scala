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
    
    @scala.inline
    def apply(can: js.Array[String | RoleObject]): Can = {
      val __obj = js.Dynamic.literal(can = can.asInstanceOf[js.Any])
      __obj.asInstanceOf[Can]
    }
    
    @scala.inline
    implicit class CanMutableBuilder[Self <: Can] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCan(value: js.Array[String | RoleObject]): Self = StObject.set(x, "can", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCanVarargs(value: (String | RoleObject)*): Self = StObject.set(x, "can", js.Array(value :_*))
      
      @scala.inline
      def setInherits(value: js.Array[String]): Self = StObject.set(x, "inherits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInheritsUndefined: Self = StObject.set(x, "inherits", js.undefined)
      
      @scala.inline
      def setInheritsVarargs(value: String*): Self = StObject.set(x, "inherits", js.Array(value :_*))
    }
  }
}
