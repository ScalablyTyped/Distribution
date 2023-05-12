package typings.embroiderMacros

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcGlimmerMacroConditionMod {
  
  @JSImport("@embroider/macros/src/glimmer/macro-condition", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def macroIfBlock(node: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("macroIfBlock")(node.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def macroIfExpression(node: Any, builders: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("macroIfExpression")(node.asInstanceOf[js.Any], builders.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def macroIfMustache(node: Any, builders: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("macroIfMustache")(node.asInstanceOf[js.Any], builders.asInstanceOf[js.Any])).asInstanceOf[Any]
}
