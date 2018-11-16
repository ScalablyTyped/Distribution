package typings
package fpDashTsLib.libRingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Ring[A]
  extends fpDashTsLib.libSemiringMod.Semiring[A] {
  def sub(x: A, y: A): A
}

