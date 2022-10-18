package typings.dxf

import typings.dxf.handlersEntitiesMod.Entity
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object handlersBlocksMod {
  
  trait Block extends StObject {
    
    var entities: js.UndefOr[js.Array[Entity]] = js.undefined
    
    var name: String
    
    var x: js.UndefOr[Double] = js.undefined
    
    var xref: js.UndefOr[Any] = js.undefined
    
    var y: js.UndefOr[Double] = js.undefined
    
    var z: js.UndefOr[Double] = js.undefined
  }
  object Block {
    
    inline def apply(name: String): Block = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Block]
    }
    
    extension [Self <: Block](x: Self) {
      
      inline def setEntities(value: js.Array[Entity]): Self = StObject.set(x, "entities", value.asInstanceOf[js.Any])
      
      inline def setEntitiesUndefined: Self = StObject.set(x, "entities", js.undefined)
      
      inline def setEntitiesVarargs(value: Entity*): Self = StObject.set(x, "entities", js.Array(value*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      inline def setXref(value: Any): Self = StObject.set(x, "xref", value.asInstanceOf[js.Any])
      
      inline def setXrefUndefined: Self = StObject.set(x, "xref", js.undefined)
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
      
      inline def setZ(value: Double): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
      
      inline def setZUndefined: Self = StObject.set(x, "z", js.undefined)
    }
  }
}
