package typings.floatingUiCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcUtilsEvaluateMod {
  
  @JSImport("@floating-ui/core/src/utils/evaluate", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def evaluate[T, P](value: T, param: P): T = (^.asInstanceOf[js.Dynamic].applyDynamic("evaluate")(value.asInstanceOf[js.Any], param.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def evaluate[T, P](value: js.Function1[/* param */ P, T], param: P): T = (^.asInstanceOf[js.Dynamic].applyDynamic("evaluate")(value.asInstanceOf[js.Any], param.asInstanceOf[js.Any])).asInstanceOf[T]
}
