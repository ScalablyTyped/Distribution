package typings
package fpDashTsLib.fpDashTsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts", "boundedDistributiveLattice")
@js.native
object boundedDistributiveLatticeNs extends js.Object {
  def getMinMaxBoundedDistributiveLattice[A](O: fpDashTsLib.libOrdMod.Ord[A]): js.Function2[
    /* min */ A, 
    /* max */ A, 
    fpDashTsLib.libBoundedDistributiveLatticeMod.BoundedDistributiveLattice[A]
  ] = js.native
}

