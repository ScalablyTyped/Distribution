package typings
package fpDashTsLib.libSemiringMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Semiring[A] extends js.Object {
  val one: A
  val zero: A
  def add(x: A, y: A): A
  def mul(x: A, y: A): A
}

