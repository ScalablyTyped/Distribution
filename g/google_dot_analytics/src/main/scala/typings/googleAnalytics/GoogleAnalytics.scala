package typings.googleAnalytics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleAnalytics extends js.Object {
  var async: Boolean
  var src: String
  var `type`: String
}

object GoogleAnalytics {
  @scala.inline
  def apply(async: Boolean, src: String, `type`: String): GoogleAnalytics = {
    val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleAnalytics]
  }
}

