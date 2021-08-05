package typings.forgeDi

import typings.forgeDi.constructorMod.Constructor
import typings.forgeDi.dependencyMod.Dependency
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object inspectorMod {
  
  trait Inspector extends StObject {
    
    def findConstructor(func: Constructor): Constructor
    
    def getDependencies(func: js.Function): js.Array[Dependency]
  }
  object Inspector {
    
    inline def apply(findConstructor: Constructor => Constructor, getDependencies: js.Function => js.Array[Dependency]): Inspector = {
      val __obj = js.Dynamic.literal(findConstructor = js.Any.fromFunction1(findConstructor), getDependencies = js.Any.fromFunction1(getDependencies))
      __obj.asInstanceOf[Inspector]
    }
    
    extension [Self <: Inspector](x: Self) {
      
      inline def setFindConstructor(value: Constructor => Constructor): Self = StObject.set(x, "findConstructor", js.Any.fromFunction1(value))
      
      inline def setGetDependencies(value: js.Function => js.Array[Dependency]): Self = StObject.set(x, "getDependencies", js.Any.fromFunction1(value))
    }
  }
}
