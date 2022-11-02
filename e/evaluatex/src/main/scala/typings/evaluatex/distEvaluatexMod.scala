package typings.evaluatex

import typings.evaluatex.mod.Constants
import typings.evaluatex.mod.EvaluatexResult
import typings.evaluatex.mod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEvaluatexMod {
  
  @JSImport("evaluatex/dist/evaluatex", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(/** an ASCII or LaTeX expression to be parsed and evaluated. */
  expression: String): EvaluatexResult = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(expression.asInstanceOf[js.Any]).asInstanceOf[EvaluatexResult]
  inline def default(
    /** an ASCII or LaTeX expression to be parsed and evaluated. */
  expression: String,
    /** a map of constant values - values that don't change if you invoke fn more than once. */
  constants: Unit,
    /** a map of options for the compiler. */
  options: Options
  ): EvaluatexResult = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(expression.asInstanceOf[js.Any], constants.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[EvaluatexResult]
  inline def default(
    /** an ASCII or LaTeX expression to be parsed and evaluated. */
  expression: String,
    /** a map of constant values - values that don't change if you invoke fn more than once. */
  constants: Constants
  ): EvaluatexResult = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(expression.asInstanceOf[js.Any], constants.asInstanceOf[js.Any])).asInstanceOf[EvaluatexResult]
  inline def default(
    /** an ASCII or LaTeX expression to be parsed and evaluated. */
  expression: String,
    /** a map of constant values - values that don't change if you invoke fn more than once. */
  constants: Constants,
    /** a map of options for the compiler. */
  options: Options
  ): EvaluatexResult = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(expression.asInstanceOf[js.Any], constants.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[EvaluatexResult]
}
