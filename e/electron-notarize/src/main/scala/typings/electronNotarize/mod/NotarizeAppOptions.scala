package typings.electronNotarize.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotarizeAppOptions extends js.Object {
  var appBundleId: String
  var appPath: String
}

object NotarizeAppOptions {
  @scala.inline
  def apply(appBundleId: String, appPath: String): NotarizeAppOptions = {
    val __obj = js.Dynamic.literal(appBundleId = appBundleId.asInstanceOf[js.Any], appPath = appPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotarizeAppOptions]
  }
}

