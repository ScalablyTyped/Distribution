package typings
package fpDashTsLib.libOptionTMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionT1[M /* <: fpDashTsLib.libHKTMod.URIS */]
  extends fpDashTsLib.libApplicativeMod.ApplicativeComposition11[M, fpDashTsLib.libOptionMod.URI] {
  def chain[A, B](
    f: js.Function1[/* a */ A, fpDashTsLib.libHKTMod.Type[M, fpDashTsLib.libOptionMod.Option[B]]],
    fa: fpDashTsLib.libHKTMod.Type[M, fpDashTsLib.libOptionMod.Option[A]]
  ): fpDashTsLib.libHKTMod.Type[M, fpDashTsLib.libOptionMod.Option[B]]
}

