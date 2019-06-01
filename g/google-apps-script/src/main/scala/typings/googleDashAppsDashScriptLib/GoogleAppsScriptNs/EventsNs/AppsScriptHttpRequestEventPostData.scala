package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.EventsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppsScriptHttpRequestEventPostData extends js.Object {
  var contents: java.lang.String
  var length: scala.Double
  var name: java.lang.String
  var `type`: java.lang.String
}

object AppsScriptHttpRequestEventPostData {
  @scala.inline
  def apply(contents: java.lang.String, length: scala.Double, name: java.lang.String, `type`: java.lang.String): AppsScriptHttpRequestEventPostData = {
    val __obj = js.Dynamic.literal(contents = contents, length = length, name = name)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[AppsScriptHttpRequestEventPostData]
  }
}

