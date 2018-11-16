package typings
package fpDashTsLib.libMonadIOMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait MonadIO2C[M /* <: fpDashTsLib.libHKTMod.URIS2 */, L]
  extends fpDashTsLib.libMonadMod.Monad2C[M, L] {
  def fromIO[A](fa: fpDashTsLib.libIOMod.IO[A]): fpDashTsLib.libHKTMod.Type2[M, L, A]
}

