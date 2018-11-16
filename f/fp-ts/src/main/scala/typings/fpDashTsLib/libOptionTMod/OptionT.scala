package typings
package fpDashTsLib.libOptionTMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait OptionT[M]
  extends fpDashTsLib.libApplicativeMod.ApplicativeComposition[M, fpDashTsLib.libOptionMod.URI] {
  def chain[A, B](
    f: js.Function1[/* a */ A, fpDashTsLib.libHKTMod.HKT[M, fpDashTsLib.libOptionMod.Option[B]]],
    fa: fpDashTsLib.libHKTMod.HKT[M, fpDashTsLib.libOptionMod.Option[A]]
  ): fpDashTsLib.libHKTMod.HKT[M, fpDashTsLib.libOptionMod.Option[B]]
}

