package typings.forgeDi

import typings.forgeDi.distFrameworkConstructorMod.Constructor
import typings.forgeDi.distFrameworkDependencyMod.Dependency
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distInspectorsInspectorMod {
  
  trait Inspector extends StObject {
    
    def findConstructor(func: Constructor[Any]): Constructor[Any]
    
    def getDependencies(func: js.Function): js.Array[Dependency]
  }
  object Inspector {
    
    inline def apply(
      findConstructor: Constructor[Any] => Constructor[Any],
      getDependencies: js.Function => js.Array[Dependency]
    ): Inspector = {
      val __obj = js.Dynamic.literal(findConstructor = js.Any.fromFunction1(findConstructor), getDependencies = js.Any.fromFunction1(getDependencies))
      __obj.asInstanceOf[Inspector]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Inspector] (val x: Self) extends AnyVal {
      
      inline def setFindConstructor(value: Constructor[Any] => Constructor[Any]): Self = StObject.set(x, "findConstructor", js.Any.fromFunction1(value))
      
      inline def setGetDependencies(value: js.Function => js.Array[Dependency]): Self = StObject.set(x, "getDependencies", js.Any.fromFunction1(value))
    }
  }
}
