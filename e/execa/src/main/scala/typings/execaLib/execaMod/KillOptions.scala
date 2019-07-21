package typings
package execaLib.execaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KillOptions extends js.Object {
  /**
  		Milliseconds to wait for the child process to terminate before sending `SIGKILL`.
  		Can be disabled with `false`.
  		@default 5000
  		*/
  var forceKillAfterTimeout: js.UndefOr[scala.Double | execaLib.execaLibNumbers.`false`] = js.undefined
}

object KillOptions {
  @scala.inline
  def apply(forceKillAfterTimeout: scala.Double | execaLib.execaLibNumbers.`false` = null): KillOptions = {
    val __obj = js.Dynamic.literal()
    if (forceKillAfterTimeout != null) __obj.updateDynamic("forceKillAfterTimeout")(forceKillAfterTimeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[KillOptions]
  }
}

