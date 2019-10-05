package typings.freedom.freedom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FreedomInCoreEnvOptions extends js.Object {
  var debug: js.UndefOr[String] = js.undefined
    // debug level
  var logger: js.UndefOr[String] = js.undefined
}

object FreedomInCoreEnvOptions {
  @scala.inline
  def apply(debug: String = null, logger: String = null): FreedomInCoreEnvOptions = {
    val __obj = js.Dynamic.literal()
    if (debug != null) __obj.updateDynamic("debug")(debug)
    if (logger != null) __obj.updateDynamic("logger")(logger)
    __obj.asInstanceOf[FreedomInCoreEnvOptions]
  }
}

