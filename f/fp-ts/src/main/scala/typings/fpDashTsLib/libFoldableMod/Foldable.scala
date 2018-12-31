package typings
package fpDashTsLib.libFoldableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Foldable[F] extends js.Object {
  val URI: F
  def reduce[A, B](fa: fpDashTsLib.libHKTMod.HKT[F, A], b: B, f: js.Function2[/* b */ B, /* a */ A, B]): B
}

