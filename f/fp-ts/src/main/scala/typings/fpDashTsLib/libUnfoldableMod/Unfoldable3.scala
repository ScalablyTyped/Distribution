package typings
package fpDashTsLib.libUnfoldableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Unfoldable3[F /* <: fpDashTsLib.libHKTMod.URIS3 */] extends js.Object {
  val URI: F
  def unfoldr[U, L, A, B](b: B, f: js.Function1[/* b */ B, fpDashTsLib.libOptionMod.Option[js.Tuple2[A, B]]]): fpDashTsLib.libHKTMod.Type3[F, U, L, A]
}

