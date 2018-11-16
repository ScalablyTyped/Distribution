package typings
package fbLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait RequestsDialogParams extends js.Object {
  var action_type: js.UndefOr[java.lang.String] = js.undefined
   // "apprequests"
  var app_id: js.UndefOr[java.lang.String] = js.undefined
  var data: js.UndefOr[java.lang.String] = js.undefined
  var exclude_ids: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var filters: js.Array[java.lang.String] | Anon_Name
  var max_recipients: js.UndefOr[scala.Double] = js.undefined
  var message: java.lang.String
  var method: java.lang.String
   // "send" | "askfor" | "turn"
  var object_id: js.UndefOr[java.lang.String] = js.undefined
  var redirect_uri: js.UndefOr[java.lang.String] = js.undefined
  var suggestions: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
  var to: js.UndefOr[java.lang.String] = js.undefined
}

