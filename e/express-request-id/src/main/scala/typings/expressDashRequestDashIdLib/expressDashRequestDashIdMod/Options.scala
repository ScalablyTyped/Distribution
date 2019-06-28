package typings
package expressDashRequestDashIdLib.expressDashRequestDashIdMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var attributeName: js.UndefOr[java.lang.String] = js.undefined
  var headerName: js.UndefOr[java.lang.String] = js.undefined
  var setHeader: js.UndefOr[scala.Boolean] = js.undefined
  var uuidVersion: js.UndefOr[java.lang.String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    attributeName: java.lang.String = null,
    headerName: java.lang.String = null,
    setHeader: js.UndefOr[scala.Boolean] = js.undefined,
    uuidVersion: java.lang.String = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (attributeName != null) __obj.updateDynamic("attributeName")(attributeName)
    if (headerName != null) __obj.updateDynamic("headerName")(headerName)
    if (!js.isUndefined(setHeader)) __obj.updateDynamic("setHeader")(setHeader)
    if (uuidVersion != null) __obj.updateDynamic("uuidVersion")(uuidVersion)
    __obj.asInstanceOf[Options]
  }
}

