package typings.fpTs

import typings.fpTs.latticeMod.Lattice
import typings.fpTs.ordMod.Ord_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distributiveLatticeMod {
  
  @JSImport("fp-ts/lib/DistributiveLattice", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getMinMaxDistributiveLattice[A](O: Ord_[A]): DistributiveLattice[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("getMinMaxDistributiveLattice")(O.asInstanceOf[js.Any]).asInstanceOf[DistributiveLattice[A]]
  
  type DistributiveLattice[A] = Lattice[A]
}
