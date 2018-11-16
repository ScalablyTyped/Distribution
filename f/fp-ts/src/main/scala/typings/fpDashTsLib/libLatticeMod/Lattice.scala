package typings
package fpDashTsLib.libLatticeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Lattice[A]
  extends fpDashTsLib.libJoinSemilatticeMod.JoinSemilattice[A]
     with fpDashTsLib.libMeetSemilatticeMod.MeetSemilattice[A]

