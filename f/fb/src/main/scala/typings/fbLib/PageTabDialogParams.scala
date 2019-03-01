package typings
package fbLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PageTabDialogParams extends js.Object {
   // "pagetab"
  var app_id: java.lang.String
  var display: js.UndefOr[js.Any] = js.undefined
  var method: java.lang.String
  var redirect_uri: js.UndefOr[java.lang.String] = js.undefined
}

object PageTabDialogParams {
  @scala.inline
  def apply(
    app_id: java.lang.String,
    method: java.lang.String,
    display: js.Any = null,
    redirect_uri: java.lang.String = null
  ): PageTabDialogParams = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("app_id")(app_id)
    __obj.updateDynamic("method")(method)
    if (display != null) __obj.updateDynamic("display")(display)
    if (redirect_uri != null) __obj.updateDynamic("redirect_uri")(redirect_uri)
    __obj.asInstanceOf[PageTabDialogParams]
  }
}

