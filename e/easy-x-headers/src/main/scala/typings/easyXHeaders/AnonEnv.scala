package typings.easyXHeaders

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEnv extends js.Object {
  var cwd: js.UndefOr[String] = js.undefined
  var encoding: js.UndefOr[String] = js.undefined
  var env: js.UndefOr[js.Any] = js.undefined
  var gid: js.UndefOr[Double] = js.undefined
  var input: js.UndefOr[String | typings.node.Buffer] = js.undefined
  var killSignal: js.UndefOr[String] = js.undefined
  var maxBuffer: js.UndefOr[Double] = js.undefined
  var stdio: js.UndefOr[js.Any] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
  var uid: js.UndefOr[Double] = js.undefined
}

object AnonEnv {
  @scala.inline
  def apply(
    cwd: String = null,
    encoding: String = null,
    env: js.Any = null,
    gid: Int | Double = null,
    input: String | typings.node.Buffer = null,
    killSignal: String = null,
    maxBuffer: Int | Double = null,
    stdio: js.Any = null,
    timeout: Int | Double = null,
    uid: Int | Double = null
  ): AnonEnv = {
    val __obj = js.Dynamic.literal()
    if (cwd != null) __obj.updateDynamic("cwd")(cwd.asInstanceOf[js.Any])
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (env != null) __obj.updateDynamic("env")(env.asInstanceOf[js.Any])
    if (gid != null) __obj.updateDynamic("gid")(gid.asInstanceOf[js.Any])
    if (input != null) __obj.updateDynamic("input")(input.asInstanceOf[js.Any])
    if (killSignal != null) __obj.updateDynamic("killSignal")(killSignal.asInstanceOf[js.Any])
    if (maxBuffer != null) __obj.updateDynamic("maxBuffer")(maxBuffer.asInstanceOf[js.Any])
    if (stdio != null) __obj.updateDynamic("stdio")(stdio.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (uid != null) __obj.updateDynamic("uid")(uid.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEnv]
  }
}

