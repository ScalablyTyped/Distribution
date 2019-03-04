package typings
package fbLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SendDialogParams extends js.Object {
   // "send"
  var app_id: java.lang.String
  var display: js.UndefOr[js.Any] = js.undefined
  var link: java.lang.String
  var method: java.lang.String
  var redirect_uri: js.UndefOr[java.lang.String] = js.undefined
  var to: js.UndefOr[java.lang.String] = js.undefined
}

object SendDialogParams {
  @scala.inline
  def apply(
    app_id: java.lang.String,
    link: java.lang.String,
    method: java.lang.String,
    display: js.Any = null,
    redirect_uri: java.lang.String = null,
    to: java.lang.String = null
  ): SendDialogParams = {
    val __obj = js.Dynamic.literal(app_id = app_id, link = link, method = method)
    if (display != null) __obj.updateDynamic("display")(display)
    if (redirect_uri != null) __obj.updateDynamic("redirect_uri")(redirect_uri)
    if (to != null) __obj.updateDynamic("to")(to)
    __obj.asInstanceOf[SendDialogParams]
  }
}

