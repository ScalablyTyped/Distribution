package typings.firebaseApp.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppName extends js.Object {
  var appName: String
}

object AppName {
  @scala.inline
  def apply(appName: String): AppName = {
    val __obj = js.Dynamic.literal(appName = appName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppName]
  }
}

