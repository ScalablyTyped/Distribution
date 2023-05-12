package typings.esbuildPluginImportMap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Name extends StObject {
    
    var name: String
    
    def setup(build: Any): Unit
  }
  object Name {
    
    inline def apply(name: String, setup: Any => Unit): Name = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], setup = js.Any.fromFunction1(setup))
      __obj.asInstanceOf[Name]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Name] (val x: Self) extends AnyVal {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setSetup(value: Any => Unit): Self = StObject.set(x, "setup", js.Any.fromFunction1(value))
    }
  }
}
