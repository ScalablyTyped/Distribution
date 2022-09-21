package typings.fluentuiReactComponentRef

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Kind extends StObject {
    
    var kind: Null
  }
  object Kind {
    
    inline def apply(kind: Null): Kind = {
      val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
      __obj.asInstanceOf[Kind]
    }
    
    extension [Self <: Kind](x: Self) {
      
      inline def setKind(value: Null): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    }
  }
}
