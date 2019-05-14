package typings
package fpDashTsLib.es6Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts/es6", "booleanAlgebra")
@js.native
object booleanAlgebraNs extends js.Object {
  val booleanAlgebraBoolean: fpDashTsLib.es6BooleanAlgebraMod.BooleanAlgebra[scala.Boolean] = js.native
  val booleanAlgebraVoid: fpDashTsLib.es6BooleanAlgebraMod.BooleanAlgebra[scala.Unit] = js.native
  def getDualBooleanAlgebra[A](B: fpDashTsLib.es6BooleanAlgebraMod.BooleanAlgebra[A]): fpDashTsLib.es6BooleanAlgebraMod.BooleanAlgebra[A] = js.native
  def getFunctionBooleanAlgebra[B](B: fpDashTsLib.es6BooleanAlgebraMod.BooleanAlgebra[B]): js.Function0[fpDashTsLib.es6BooleanAlgebraMod.BooleanAlgebra[js.Function1[/* a */ _, B]]] = js.native
}

