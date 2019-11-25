package typings.expressDashRequestDashId.expressDashRequestDashIdMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var attributeName: js.UndefOr[String] = js.undefined
  var headerName: js.UndefOr[String] = js.undefined
  var setHeader: js.UndefOr[Boolean] = js.undefined
  var uuidVersion: js.UndefOr[String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    attributeName: String = null,
    headerName: String = null,
    setHeader: js.UndefOr[Boolean] = js.undefined,
    uuidVersion: String = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (attributeName != null) __obj.updateDynamic("attributeName")(attributeName.asInstanceOf[js.Any])
    if (headerName != null) __obj.updateDynamic("headerName")(headerName.asInstanceOf[js.Any])
    if (!js.isUndefined(setHeader)) __obj.updateDynamic("setHeader")(setHeader.asInstanceOf[js.Any])
    if (uuidVersion != null) __obj.updateDynamic("uuidVersion")(uuidVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

