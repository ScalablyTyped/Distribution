package typings.epilogue

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Model extends StObject {
    
    var model: Any
  }
  object Model {
    
    inline def apply(model: Any): Model = {
      val __obj = js.Dynamic.literal(model = model.asInstanceOf[js.Any])
      __obj.asInstanceOf[Model]
    }
    
    extension [Self <: Model](x: Self) {
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    }
  }
  
  trait Plural extends StObject {
    
    var plural: String
    
    var singular: String
  }
  object Plural {
    
    inline def apply(plural: String, singular: String): Plural = {
      val __obj = js.Dynamic.literal(plural = plural.asInstanceOf[js.Any], singular = singular.asInstanceOf[js.Any])
      __obj.asInstanceOf[Plural]
    }
    
    extension [Self <: Plural](x: Self) {
      
      inline def setPlural(value: String): Self = StObject.set(x, "plural", value.asInstanceOf[js.Any])
      
      inline def setSingular(value: String): Self = StObject.set(x, "singular", value.asInstanceOf[js.Any])
    }
  }
}
