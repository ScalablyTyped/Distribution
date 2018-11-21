package typings
package fpDashTsLib.libIOMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts/lib/IO", JSImport.Namespace)
@js.native
object libIOModMembers extends js.Object {
  val URI: /* IO */ java.lang.String = js.native
  val getMonoid: js.Function1[
    /* M */ fpDashTsLib.libMonoidMod.Monoid[js.Any], 
    fpDashTsLib.libMonoidMod.Monoid[IO[js.Any]]
  ] = js.native
  val getSemigroup: js.Function1[
    /* S */ fpDashTsLib.libSemigroupMod.Semigroup[js.Any], 
    fpDashTsLib.libSemigroupMod.Semigroup[IO[js.Any]]
  ] = js.native
  val io: fpDashTsLib.libMonadMod.Monad1[URI] = js.native
}

