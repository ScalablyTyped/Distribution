package typings.googlePicker

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Number extends StObject {
    
    var number: Any
    
    var `type`: String
  }
  object Number {
    
    inline def apply(number: Any, `type`: String): Number = {
      val __obj = js.Dynamic.literal(number = number.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Number]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Number] (val x: Self) extends AnyVal {
      
      inline def setNumber(value: Any): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Parent extends StObject {
    
    var parent: js.UndefOr[String] = js.undefined
    
    var query: js.UndefOr[String] = js.undefined
  }
  object Parent {
    
    inline def apply(): Parent = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Parent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Parent] (val x: Self) extends AnyVal {
      
      inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
      
      inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    }
  }
}
