package typings
package fpDashTsLib.libChainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Chain1[F /* <: fpDashTsLib.libHKTMod.URIS */]
  extends fpDashTsLib.libApplyMod.Apply1[F] {
  def chain[A, B](fa: fpDashTsLib.libHKTMod.Type[F, A], f: js.Function1[/* a */ A, fpDashTsLib.libHKTMod.Type[F, B]]): fpDashTsLib.libHKTMod.Type[F, B]
}

