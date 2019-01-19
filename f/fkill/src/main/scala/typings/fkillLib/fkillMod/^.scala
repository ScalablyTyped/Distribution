package typings
package fkillLib.fkillMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fkill", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
    * Fabulously kill processes. Cross-platform.
    *
    * @param input One or more process IDs/names/ports to kill.
    * To kill a port, prefix it with a colon. For example: `:8080`.
    */
  def apply(input: scala.Double | java.lang.String | (js.Array[java.lang.String | scala.Double])): js.Promise[scala.Unit] = js.native
  def apply(
    input: scala.Double | java.lang.String | (js.Array[java.lang.String | scala.Double]),
    options: fkillLib.fkillMod.fkillNs.Options
  ): js.Promise[scala.Unit] = js.native
}

