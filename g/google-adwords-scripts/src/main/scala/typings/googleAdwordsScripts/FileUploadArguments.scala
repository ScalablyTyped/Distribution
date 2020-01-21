package typings.googleAdwordsScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileUploadArguments extends js.Object {
  var fileLocale: js.UndefOr[String] = js.undefined
  var moneyInMicros: js.UndefOr[Boolean] = js.undefined
  var timeZone: js.UndefOr[String] = js.undefined
}

object FileUploadArguments {
  @scala.inline
  def apply(
    fileLocale: String = null,
    moneyInMicros: js.UndefOr[Boolean] = js.undefined,
    timeZone: String = null
  ): FileUploadArguments = {
    val __obj = js.Dynamic.literal()
    if (fileLocale != null) __obj.updateDynamic("fileLocale")(fileLocale.asInstanceOf[js.Any])
    if (!js.isUndefined(moneyInMicros)) __obj.updateDynamic("moneyInMicros")(moneyInMicros.asInstanceOf[js.Any])
    if (timeZone != null) __obj.updateDynamic("timeZone")(timeZone.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileUploadArguments]
  }
}

