package typings
package fpDashTsLib.libBooleanAlgebraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts/lib/BooleanAlgebra", JSImport.Namespace)
@js.native
object libBooleanAlgebraModMembers extends js.Object {
  val booleanAlgebraBoolean: BooleanAlgebra[scala.Boolean] = js.native
  val booleanAlgebraVoid: BooleanAlgebra[scala.Unit] = js.native
  val getDualBooleanAlgebra: js.Function1[/* B */ BooleanAlgebra[js.Any], BooleanAlgebra[js.Any]] = js.native
  val getFunctionBooleanAlgebra: js.Function1[
    /* B */ BooleanAlgebra[js.Any], 
    js.Function0[BooleanAlgebra[js.Function1[/* a */ js.Any, js.Any]]]
  ] = js.native
}

