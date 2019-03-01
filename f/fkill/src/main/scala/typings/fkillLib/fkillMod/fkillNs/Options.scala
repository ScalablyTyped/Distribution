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

object Options {
  @scala.inline
  def apply(
    force: js.UndefOr[scala.Boolean] = js.undefined,
    ignoreCase: js.UndefOr[scala.Boolean] = js.undefined,
    tree: js.UndefOr[scala.Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(force)) __obj.updateDynamic("force")(force)
    if (!js.isUndefined(ignoreCase)) __obj.updateDynamic("ignoreCase")(ignoreCase)
    if (!js.isUndefined(tree)) __obj.updateDynamic("tree")(tree)
    __obj.asInstanceOf[Options]
  }
}

