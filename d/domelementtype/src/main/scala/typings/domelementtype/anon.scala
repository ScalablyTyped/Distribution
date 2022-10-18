package typings.domelementtype

import typings.domelementtype.libEsmMod.ElementType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Type extends StObject {
    
    var `type`: ElementType
  }
  object Type {
    
    inline def apply(`type`: ElementType): Type = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Type]
    }
    
    extension [Self <: Type](x: Self) {
      
      inline def setType(value: ElementType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait TypeElementType extends StObject {
    
    var `type`: typings.domelementtype.mod.ElementType
  }
  object TypeElementType {
    
    inline def apply(`type`: typings.domelementtype.mod.ElementType): TypeElementType = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[TypeElementType]
    }
    
    extension [Self <: TypeElementType](x: Self) {
      
      inline def setType(value: typings.domelementtype.mod.ElementType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
