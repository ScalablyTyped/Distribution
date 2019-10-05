package typings.googleDashAppsDashScript.GoogleAppsScript.Analytics.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait McfDataRowsConversionPathValue extends js.Object {
  var interactionType: js.UndefOr[String] = js.undefined
  var nodeValue: js.UndefOr[String] = js.undefined
}

object McfDataRowsConversionPathValue {
  @scala.inline
  def apply(interactionType: String = null, nodeValue: String = null): McfDataRowsConversionPathValue = {
    val __obj = js.Dynamic.literal()
    if (interactionType != null) __obj.updateDynamic("interactionType")(interactionType)
    if (nodeValue != null) __obj.updateDynamic("nodeValue")(nodeValue)
    __obj.asInstanceOf[McfDataRowsConversionPathValue]
  }
}

