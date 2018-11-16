package typings
package fpDashTsLib.libOptionTMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait OptionT2[M /* <: fpDashTsLib.libHKTMod.URIS2 */]
  extends fpDashTsLib.libApplicativeMod.ApplicativeComposition21[M, fpDashTsLib.libOptionMod.URI] {
  def chain[L, A, B](
    f: js.Function1[/* a */ A, fpDashTsLib.libHKTMod.Type2[M, L, fpDashTsLib.libOptionMod.Option[B]]],
    fa: fpDashTsLib.libHKTMod.Type2[M, L, fpDashTsLib.libOptionMod.Option[A]]
  ): fpDashTsLib.libHKTMod.Type2[M, L, fpDashTsLib.libOptionMod.Option[B]]
}

