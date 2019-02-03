package typings
package fpDashTsLib.libGroupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Group[A]
  extends fpDashTsLib.libMonoidMod.Monoid[A] {
  def inverse(a: A): A
}

