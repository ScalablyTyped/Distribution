package typings.googleAppsScript.GoogleAppsScript.Events

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
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppsScriptHttpRequestEventPostData]
  }
}

