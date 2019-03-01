package typings
package freedomLib.freedomNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FreedomInCoreEnvOptions extends js.Object {
  var debug: js.UndefOr[java.lang.String] = js.undefined
    // debug level
  var logger: js.UndefOr[java.lang.String] = js.undefined
}

object FreedomInCoreEnvOptions {
  @scala.inline
  def apply(debug: java.lang.String = null, logger: java.lang.String = null): FreedomInCoreEnvOptions = {
    val __obj = js.Dynamic.literal()
    if (debug != null) __obj.updateDynamic("debug")(debug)
    if (logger != null) __obj.updateDynamic("logger")(logger)
    __obj.asInstanceOf[FreedomInCoreEnvOptions]
  }
}

