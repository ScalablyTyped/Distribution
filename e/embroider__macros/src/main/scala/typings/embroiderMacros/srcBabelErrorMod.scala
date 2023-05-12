package typings.embroiderMacros

import typings.babelTraverse.mod.NodePath
import typings.babelTypes.mod.Node
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcBabelErrorMod {
  
  @JSImport("@embroider/macros/src/babel/error", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(path: NodePath[Node], message: String): MacroError = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(path.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[MacroError]
  
  trait MacroError
    extends StObject
       with Error {
    
    var `type`: String
  }
  object MacroError {
    
    inline def apply(message: String, name: String, `type`: String): MacroError = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[MacroError]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MacroError] (val x: Self) extends AnyVal {
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
