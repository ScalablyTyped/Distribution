package typings
package fpDashTsLib.libHeytingAlgebraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait HeytingAlgebra[A]
  extends fpDashTsLib.libBoundedDistributiveLatticeMod.BoundedDistributiveLattice[A] {
  def implies(x: A, y: A): A
  def not(x: A): A
}

