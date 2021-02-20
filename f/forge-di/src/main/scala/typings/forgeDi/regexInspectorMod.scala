package typings.forgeDi

import typings.forgeDi.constructorMod.Constructor
import typings.forgeDi.dependencyMod.Dependency
import typings.forgeDi.inspectorMod.Inspector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object regexInspectorMod {
  
  @JSImport("forge-di/dist/inspectors/RegexInspector", JSImport.Default)
  @js.native
  class default () extends RegexInspector
  
  @js.native
  trait RegexInspector extends Inspector {
    
    var getParameterNames: js.Any = js.native
  }
  object RegexInspector {
    
    @scala.inline
    def apply(
      findConstructor: Constructor => Constructor,
      getDependencies: js.Function => js.Array[Dependency],
      getParameterNames: js.Any
    ): RegexInspector = {
      val __obj = js.Dynamic.literal(findConstructor = js.Any.fromFunction1(findConstructor), getDependencies = js.Any.fromFunction1(getDependencies), getParameterNames = getParameterNames.asInstanceOf[js.Any])
      __obj.asInstanceOf[RegexInspector]
    }
    
    @scala.inline
    implicit class RegexInspectorMutableBuilder[Self <: RegexInspector] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetParameterNames(value: js.Any): Self = StObject.set(x, "getParameterNames", value.asInstanceOf[js.Any])
    }
  }
}
