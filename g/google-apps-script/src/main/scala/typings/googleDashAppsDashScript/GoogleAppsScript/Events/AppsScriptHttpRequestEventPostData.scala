package typings.googleDashAppsDashScript.GoogleAppsScript.Events

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppsScriptHttpRequestEventPostData extends js.Object {
  var contents: String
  var length: Double
  var name: String
  var `type`: String
}

object AppsScriptHttpRequestEventPostData {
  @scala.inline
  def apply(contents: String, length: Double, name: String, `type`: String): AppsScriptHttpRequestEventPostData = {
    val __obj = js.Dynamic.literal(contents = contents, length = length, name = name)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[AppsScriptHttpRequestEventPostData]
  }
}

