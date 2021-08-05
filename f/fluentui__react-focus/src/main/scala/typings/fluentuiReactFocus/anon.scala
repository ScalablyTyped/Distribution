package typings.fluentuiReactFocus

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait ComponentPath extends StObject {
    
    var componentPath: js.UndefOr[String] = js.undefined
  }
  object ComponentPath {
    
    inline def apply(): ComponentPath = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ComponentPath]
    }
    
    extension [Self <: ComponentPath](x: Self) {
      
      inline def setComponentPath(value: String): Self = StObject.set(x, "componentPath", value.asInstanceOf[js.Any])
      
      inline def setComponentPathUndefined: Self = StObject.set(x, "componentPath", js.undefined)
    }
  }
}
