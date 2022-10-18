package typings.forgeDi

import typings.forgeDi.distFrameworkConstructorMod.Constructor
import typings.forgeDi.distFrameworkDependencyMod.Dependency
import typings.forgeDi.distInspectorsInspectorMod.Inspector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distInspectorsRegexInspectorMod {
  
  @JSImport("forge-di/dist/inspectors/RegexInspector", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with RegexInspector {
    
    /* CompleteClass */
    override def findConstructor(func: Constructor): Constructor = js.native
    
    /* CompleteClass */
    override def getDependencies(func: js.Function): js.Array[Dependency] = js.native
    
    /* private */ /* CompleteClass */
    var getParameterNames: Any = js.native
  }
  
  trait RegexInspector
    extends StObject
       with Inspector {
    
    /* private */ var getParameterNames: Any
  }
  object RegexInspector {
    
    inline def apply(
      findConstructor: Constructor => Constructor,
      getDependencies: js.Function => js.Array[Dependency],
      getParameterNames: Any
    ): RegexInspector = {
      val __obj = js.Dynamic.literal(findConstructor = js.Any.fromFunction1(findConstructor), getDependencies = js.Any.fromFunction1(getDependencies), getParameterNames = getParameterNames.asInstanceOf[js.Any])
      __obj.asInstanceOf[RegexInspector]
    }
    
    extension [Self <: RegexInspector](x: Self) {
      
      inline def setGetParameterNames(value: Any): Self = StObject.set(x, "getParameterNames", value.asInstanceOf[js.Any])
    }
  }
}
