package typings
package fpDashTsLib.libOptionTMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionT3C[M /* <: fpDashTsLib.libHKTMod.URIS3 */, U, L]
  extends fpDashTsLib.libApplicativeMod.ApplicativeComposition3C1[M, fpDashTsLib.libOptionMod.URI, U, L] {
  def chain[A, B](
    f: js.Function1[
      /* a */ A, 
      fpDashTsLib.libHKTMod.Type3[M, U, L, fpDashTsLib.libOptionMod.Option[B]]
    ],
    fa: fpDashTsLib.libHKTMod.Type3[M, U, L, fpDashTsLib.libOptionMod.Option[A]]
  ): fpDashTsLib.libHKTMod.Type3[M, U, L, fpDashTsLib.libOptionMod.Option[B]]
}

