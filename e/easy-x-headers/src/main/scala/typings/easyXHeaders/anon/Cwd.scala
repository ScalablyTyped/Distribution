package typings.easyXHeaders.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cwd extends js.Object {
  var customFds: js.UndefOr[js.Any] = js.undefined
  var cwd: js.UndefOr[String] = js.undefined
  var encoding: js.UndefOr[String] = js.undefined
  var env: js.UndefOr[js.Any] = js.undefined
  var killSignal: js.UndefOr[String] = js.undefined
  var maxBuffer: js.UndefOr[String] = js.undefined
  var stdio: js.UndefOr[js.Any] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
}

object Cwd {
  @scala.inline
  def apply(
    customFds: js.Any = null,
    cwd: String = null,
    encoding: String = null,
    env: js.Any = null,
    killSignal: String = null,
    maxBuffer: String = null,
    stdio: js.Any = null,
    timeout: js.UndefOr[Double] = js.undefined
  ): Cwd = {
    val __obj = js.Dynamic.literal()
    if (customFds != null) __obj.updateDynamic("customFds")(customFds.asInstanceOf[js.Any])
    if (cwd != null) __obj.updateDynamic("cwd")(cwd.asInstanceOf[js.Any])
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (env != null) __obj.updateDynamic("env")(env.asInstanceOf[js.Any])
    if (killSignal != null) __obj.updateDynamic("killSignal")(killSignal.asInstanceOf[js.Any])
    if (maxBuffer != null) __obj.updateDynamic("maxBuffer")(maxBuffer.asInstanceOf[js.Any])
    if (stdio != null) __obj.updateDynamic("stdio")(stdio.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cwd]
  }
}

