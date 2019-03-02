package typings
package atFirebaseFunctionsDashTypesLib.atFirebaseFunctionsDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HttpsCallableOptions extends js.Object {
  var timeout: js.UndefOr[scala.Double] = js.undefined
}

object HttpsCallableOptions {
  @scala.inline
  def apply(timeout: scala.Int | scala.Double = null): HttpsCallableOptions = {
    val __obj = js.Dynamic.literal()
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpsCallableOptions]
  }
}

