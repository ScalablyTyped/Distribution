package typings
package extractDashFilesLib.extractDashFilesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactNativeFileOptions extends js.Object {
  var name: java.lang.String
  var `type`: java.lang.String
  var uri: java.lang.String
}

object ReactNativeFileOptions {
  @scala.inline
  def apply(name: java.lang.String, `type`: java.lang.String, uri: java.lang.String): ReactNativeFileOptions = {
    val __obj = js.Dynamic.literal(name = name, uri = uri)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ReactNativeFileOptions]
  }
}

