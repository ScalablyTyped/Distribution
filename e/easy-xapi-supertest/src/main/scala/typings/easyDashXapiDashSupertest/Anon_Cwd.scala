package typings.easyDashXapiDashSupertest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Cwd extends js.Object {
  var cwd: js.UndefOr[String] = js.undefined
  var encoding: js.UndefOr[String] = js.undefined
  var env: js.UndefOr[js.Any] = js.undefined
}

object Anon_Cwd {
  @scala.inline
  def apply(cwd: String = null, encoding: String = null, env: js.Any = null): Anon_Cwd = {
    val __obj = js.Dynamic.literal()
    if (cwd != null) __obj.updateDynamic("cwd")(cwd)
    if (encoding != null) __obj.updateDynamic("encoding")(encoding)
    if (env != null) __obj.updateDynamic("env")(env)
    __obj.asInstanceOf[Anon_Cwd]
  }
}

