package typings
package fpDashTsLib.libMonadIOMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait MonadIO3[M /* <: fpDashTsLib.libHKTMod.URIS3 */]
  extends fpDashTsLib.libMonadMod.Monad3[M] {
  def fromIO[U, L, A](fa: fpDashTsLib.libIOMod.IO[A]): fpDashTsLib.libHKTMod.Type3[M, U, L, A]
}

