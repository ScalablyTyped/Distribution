package typings
package fpDashTsLib.libOrdMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Ord[A]
  extends fpDashTsLib.libSetoidMod.Setoid[A] {
  def compare(x: A, y: A): fpDashTsLib.libOrderingMod.Ordering
}

