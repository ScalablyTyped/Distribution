package typings
package fpDashTsLib.libBoundedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Bounded[A]
  extends fpDashTsLib.libOrdMod.Ord[A] {
  val bottom: A
  val top: A
}

