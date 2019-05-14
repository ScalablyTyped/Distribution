package typings
package fpDashTsLib.es6BooleanAlgebraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts/es6/BooleanAlgebra", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val booleanAlgebraBoolean: BooleanAlgebra[scala.Boolean] = js.native
  val booleanAlgebraVoid: BooleanAlgebra[scala.Unit] = js.native
  def getDualBooleanAlgebra[A](B: BooleanAlgebra[A]): BooleanAlgebra[A] = js.native
  def getFunctionBooleanAlgebra[B](B: BooleanAlgebra[B]): js.Function0[BooleanAlgebra[js.Function1[/* a */ _, B]]] = js.native
}

