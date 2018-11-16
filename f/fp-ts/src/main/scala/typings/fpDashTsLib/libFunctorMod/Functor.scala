package typings
package fpDashTsLib.libFunctorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Functor[F] extends js.Object {
  val URI: F
  def map[A, B](fa: fpDashTsLib.libHKTMod.HKT[F, A], f: js.Function1[/* a */ A, B]): fpDashTsLib.libHKTMod.HKT[F, B]
}

