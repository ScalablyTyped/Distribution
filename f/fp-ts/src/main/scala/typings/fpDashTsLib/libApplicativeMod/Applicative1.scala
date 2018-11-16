package typings
package fpDashTsLib.libApplicativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Applicative1[F /* <: fpDashTsLib.libHKTMod.URIS */]
  extends fpDashTsLib.libApplyMod.Apply1[F] {
  def of[A](a: A): fpDashTsLib.libHKTMod.Type[F, A]
}

