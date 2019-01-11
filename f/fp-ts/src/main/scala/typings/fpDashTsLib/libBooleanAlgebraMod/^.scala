package typings
package fpDashTsLib.libBooleanAlgebraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts/lib/BooleanAlgebra", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val booleanAlgebraBoolean: fpDashTsLib.libBooleanAlgebraMod.BooleanAlgebra[scala.Boolean] = js.native
  val booleanAlgebraVoid: fpDashTsLib.libBooleanAlgebraMod.BooleanAlgebra[scala.Unit] = js.native
  def getDualBooleanAlgebra[A](B: fpDashTsLib.libBooleanAlgebraMod.BooleanAlgebra[A]): fpDashTsLib.libBooleanAlgebraMod.BooleanAlgebra[A] = js.native
  def getFunctionBooleanAlgebra[B](B: fpDashTsLib.libBooleanAlgebraMod.BooleanAlgebra[B]): js.Function0[fpDashTsLib.libBooleanAlgebraMod.BooleanAlgebra[js.Function1[/* a */ _, B]]] = js.native
}

