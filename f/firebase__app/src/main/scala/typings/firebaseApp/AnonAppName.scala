package typings.firebaseApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAppName extends js.Object {
  var appName: String
}

object AnonAppName {
  @scala.inline
  def apply(appName: String): AnonAppName = {
    val __obj = js.Dynamic.literal(appName = appName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAppName]
  }
}

