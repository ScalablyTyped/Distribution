package typings
package firstDashRunLib.firstDashRunMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("first-run", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
    * Check if it's the first time the process is run.
    */
  def apply(): scala.Boolean = js.native
  def apply(options: firstDashRunLib.firstDashRunMod.firstRunNs.Options): scala.Boolean = js.native
  /**
    * Clear the state.
    */
  def clear(): scala.Unit = js.native
}

