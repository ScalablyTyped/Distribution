package typings
package fpDashTsLib.libMonoidMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Monoid[A]
  extends fpDashTsLib.libSemigroupMod.Semigroup[A] {
  val empty: A
}

