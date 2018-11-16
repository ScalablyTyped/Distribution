package typings
package fpDashTsLib.libMonadIOMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait MonadIO1[M /* <: fpDashTsLib.libHKTMod.URIS */]
  extends fpDashTsLib.libMonadMod.Monad1[M] {
  def fromIO[A](fa: fpDashTsLib.libIOMod.IO[A]): fpDashTsLib.libHKTMod.Type[M, A]
}

