package typings.fkill.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
  		Force kill the process.
  		@default false
  		*/
  val force: js.UndefOr[Boolean] = js.undefined
  /**
  		Ignore capitalization when killing a process.
  		Note that the case is always ignored on Windows.
  		@default false
  		*/
  val ignoreCase: js.UndefOr[Boolean] = js.undefined
  /**
  		Kill all child processes along with the parent process. _(Windows only)_
  		@default true
  		*/
  val tree: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    force: js.UndefOr[Boolean] = js.undefined,
    ignoreCase: js.UndefOr[Boolean] = js.undefined,
    tree: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(force)) __obj.updateDynamic("force")(force.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreCase)) __obj.updateDynamic("ignoreCase")(ignoreCase.get.asInstanceOf[js.Any])
    if (!js.isUndefined(tree)) __obj.updateDynamic("tree")(tree.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

