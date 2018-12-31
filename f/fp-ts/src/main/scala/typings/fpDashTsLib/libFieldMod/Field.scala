package typings
package fpDashTsLib.libFieldMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Field[A]
  extends fpDashTsLib.libRingMod.Ring[A] {
  def degree(a: A): scala.Double
  def div(x: A, y: A): A
  def mod(x: A, y: A): A
}

