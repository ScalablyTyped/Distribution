package typings
package fkillLib.fkillMod.fkillNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * Force kill the process.
    * @default false
    */
  var force: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Ignore capitalization when killing a process.
    * Note that the case is always ignored on Windows.
    * @default false
    */
  var ignoreCase: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Kill all child processes along with the parent process. *(Windows only)*
    * @default true
    */
  var tree: js.UndefOr[scala.Boolean] = js.undefined
}

