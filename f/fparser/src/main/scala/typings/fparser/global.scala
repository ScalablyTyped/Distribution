package typings.fparser

import typings.fparser.anon.Memoization
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  /* static members */
  object Formula {
    
    @JSGlobal("Formula")
    @js.native
    open class ^ protected ()
      extends typings.fparser.mod.^ {
      def this(fStr: String) = this()
      def this(fStr: String, options: Memoization) = this()
    }
    
    @JSGlobal("Formula")
    @js.native
    val ^ : js.Any = js.native
    
    inline def calc(formula: String, valueObj: js.Array[js.Object]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("calc")(formula.asInstanceOf[js.Any], valueObj.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def calc(formula: String, valueObj: js.Array[js.Object], options: Memoization): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("calc")(formula.asInstanceOf[js.Any], valueObj.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def calc(formula: String, valueObj: js.Object): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("calc")(formula.asInstanceOf[js.Any], valueObj.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def calc(formula: String, valueObj: js.Object, options: Memoization): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("calc")(formula.asInstanceOf[js.Any], valueObj.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
  }
}
