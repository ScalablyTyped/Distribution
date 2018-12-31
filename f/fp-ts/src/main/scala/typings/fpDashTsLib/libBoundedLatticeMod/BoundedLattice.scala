package typings
package fpDashTsLib.libBoundedLatticeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BoundedLattice[A]
  extends fpDashTsLib.libBoundedJoinSemilatticeMod.BoundedJoinSemilattice[A]
     with fpDashTsLib.libBoundedMeetSemilatticeMod.BoundedMeetSemilattice[A]

