package typings
package fpDashTsLib.libCategoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Category[F]
  extends fpDashTsLib.libSemigroupoidMod.Semigroupoid[F] {
  def id[A](): fpDashTsLib.libHKTMod.HKT2[F, A, A]
}

