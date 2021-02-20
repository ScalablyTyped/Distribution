package typings.forgeDi

import typings.forgeDi.constructorMod.Constructor
import typings.forgeDi.dependencyMod.Dependency
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object inspectorMod {
  
  @js.native
  trait Inspector extends StObject {
    
    def findConstructor(func: Constructor): Constructor = js.native
    
    def getDependencies(func: js.Function): js.Array[Dependency] = js.native
  }
  object Inspector {
    
    @scala.inline
    def apply(findConstructor: Constructor => Constructor, getDependencies: js.Function => js.Array[Dependency]): Inspector = {
      val __obj = js.Dynamic.literal(findConstructor = js.Any.fromFunction1(findConstructor), getDependencies = js.Any.fromFunction1(getDependencies))
      __obj.asInstanceOf[Inspector]
    }
    
    @scala.inline
    implicit class InspectorMutableBuilder[Self <: Inspector] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFindConstructor(value: Constructor => Constructor): Self = StObject.set(x, "findConstructor", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetDependencies(value: js.Function => js.Array[Dependency]): Self = StObject.set(x, "getDependencies", js.Any.fromFunction1(value))
    }
  }
}
