package typings
package fpDashTsLib.libFoldableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Foldable1[F /* <: fpDashTsLib.libHKTMod.URIS */] extends js.Object {
  val URI: F
  def reduce[A, B](fa: fpDashTsLib.libHKTMod.Type[F, A], b: B, f: js.Function2[/* b */ B, /* a */ A, B]): B
}

