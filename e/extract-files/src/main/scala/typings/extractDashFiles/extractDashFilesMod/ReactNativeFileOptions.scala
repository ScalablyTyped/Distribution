package typings.extractDashFiles.extractDashFilesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactNativeFileOptions extends js.Object {
  var name: String
  var `type`: String
  var uri: String
}

object ReactNativeFileOptions {
  @scala.inline
  def apply(name: String, `type`: String, uri: String): ReactNativeFileOptions = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactNativeFileOptions]
  }
}

