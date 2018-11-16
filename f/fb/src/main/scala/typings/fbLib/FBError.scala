package typings
package fbLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait FBError extends js.Object {
  var code: scala.Double
  var error_subcode: js.UndefOr[scala.Double] = js.undefined
  var error_user_msg: js.UndefOr[java.lang.String] = js.undefined
  var error_user_title: js.UndefOr[java.lang.String] = js.undefined
  var fbtrace_id: java.lang.String
  var message: java.lang.String
  var `type`: java.lang.String
}

