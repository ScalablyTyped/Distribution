package typings.gapiDotClientDotSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartCustomNumberFormatOptions extends js.Object {
  /**
    * Custom prefix to be prepended to the chart attribute.
    * This field is optional.
    */
  var prefix: js.UndefOr[String] = js.undefined
  /**
    * Custom suffix to be appended to the chart attribute.
    * This field is optional.
    */
  var suffix: js.UndefOr[String] = js.undefined
}

object ChartCustomNumberFormatOptions {
  @scala.inline
  def apply(prefix: String = null, suffix: String = null): ChartCustomNumberFormatOptions = {
    val __obj = js.Dynamic.literal()
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (suffix != null) __obj.updateDynamic("suffix")(suffix.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartCustomNumberFormatOptions]
  }
}

