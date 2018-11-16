package typings
package fpDashTsLib.fpDashTsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts", "booleanAlgebra")
@js.native
object booleanAlgebraNs extends js.Object {
  val booleanAlgebraBoolean: fpDashTsLib.libBooleanAlgebraMod.BooleanAlgebra[scala.Boolean] = js.native
  val booleanAlgebraVoid: fpDashTsLib.libBooleanAlgebraMod.BooleanAlgebra[scala.Unit] = js.native
  val getDualBooleanAlgebra: js.Function1[
    /* B */ fpDashTsLib.libBooleanAlgebraMod.BooleanAlgebra[js.Any], 
    fpDashTsLib.libBooleanAlgebraMod.BooleanAlgebra[js.Any]
  ] = js.native
  val getFunctionBooleanAlgebra: js.Function1[
    /* B */ fpDashTsLib.libBooleanAlgebraMod.BooleanAlgebra[js.Any], 
    js.Function0[
      fpDashTsLib.libBooleanAlgebraMod.BooleanAlgebra[js.Function1[/* a */ js.Any, js.Any]]
    ]
  ] = js.native
}

