package typings
package dialogflowLib.dialogflowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListEntityTypesRequest extends js.Object {
  var languageCode: js.UndefOr[java.lang.String] = js.undefined
  var pageSize: js.UndefOr[scala.Double] = js.undefined
  var parent: java.lang.String
}

object ListEntityTypesRequest {
  @scala.inline
  def apply(
    parent: java.lang.String,
    languageCode: java.lang.String = null,
    pageSize: scala.Int | scala.Double = null
  ): ListEntityTypesRequest = {
    val __obj = js.Dynamic.literal(parent = parent)
    if (languageCode != null) __obj.updateDynamic("languageCode")(languageCode)
    if (pageSize != null) __obj.updateDynamic("pageSize")(pageSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListEntityTypesRequest]
  }
}

