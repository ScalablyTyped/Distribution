package typings
package fpDashTsLib.libMonadIOMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait MonadIO2[M /* <: fpDashTsLib.libHKTMod.URIS2 */]
  extends fpDashTsLib.libMonadMod.Monad2[M] {
  def fromIO[L, A](fa: fpDashTsLib.libIOMod.IO[A]): fpDashTsLib.libHKTMod.Type2[M, L, A]
}

