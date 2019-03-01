package typings
package googleDotAnalyticsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleAnalytics extends js.Object {
  var async: scala.Boolean
  var src: java.lang.String
  var `type`: java.lang.String
}

object GoogleAnalytics {
  @scala.inline
  def apply(async: scala.Boolean, src: java.lang.String, `type`: java.lang.String): GoogleAnalytics = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("async")(async)
    __obj.updateDynamic("src")(src)
    __obj.asInstanceOf[GoogleAnalytics]
  }
}

