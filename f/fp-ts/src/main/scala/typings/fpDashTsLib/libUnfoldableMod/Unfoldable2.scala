package typings
package fpDashTsLib.libUnfoldableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Unfoldable2[F /* <: fpDashTsLib.libHKTMod.URIS2 */] extends js.Object {
  val URI: F
  def unfoldr[L, A, B](b: B, f: js.Function1[/* b */ B, fpDashTsLib.libOptionMod.Option[js.Tuple2[A, B]]]): fpDashTsLib.libHKTMod.Type2[F, L, A]
}

