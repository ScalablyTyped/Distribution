package typings
package fpDashTsLib.libApplicativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Applicative[F]
  extends fpDashTsLib.libApplyMod.Apply[F] {
  def of[A](a: A): fpDashTsLib.libHKTMod.HKT[F, A]
}

