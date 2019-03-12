package typings
package fpDashTsLib.libSemiringMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts/lib/Semiring", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def getFunctionSemiring[A, B](S: Semiring[B]): Semiring[js.Function1[/* a */ A, B]] = js.native
}

