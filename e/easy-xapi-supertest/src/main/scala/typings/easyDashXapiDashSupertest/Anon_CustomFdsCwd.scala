package typings.easyDashXapiDashSupertest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CustomFdsCwd extends js.Object {
  var customFds: js.UndefOr[js.Any] = js.undefined
  var cwd: js.UndefOr[String] = js.undefined
  var encoding: js.UndefOr[String] = js.undefined
  var env: js.UndefOr[js.Any] = js.undefined
  var killSignal: js.UndefOr[String] = js.undefined
  var maxBuffer: js.UndefOr[String] = js.undefined
  var stdio: js.UndefOr[js.Any] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
}

object Anon_CustomFdsCwd {
  @scala.inline
  def apply(
    customFds: js.Any = null,
    cwd: String = null,
    encoding: String = null,
    env: js.Any = null,
    killSignal: String = null,
    maxBuffer: String = null,
    stdio: js.Any = null,
    timeout: Int | Double = null
  ): Anon_CustomFdsCwd = {
    val __obj = js.Dynamic.literal()
    if (customFds != null) __obj.updateDynamic("customFds")(customFds)
    if (cwd != null) __obj.updateDynamic("cwd")(cwd)
    if (encoding != null) __obj.updateDynamic("encoding")(encoding)
    if (env != null) __obj.updateDynamic("env")(env)
    if (killSignal != null) __obj.updateDynamic("killSignal")(killSignal)
    if (maxBuffer != null) __obj.updateDynamic("maxBuffer")(maxBuffer)
    if (stdio != null) __obj.updateDynamic("stdio")(stdio)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_CustomFdsCwd]
  }
}

