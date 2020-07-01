package typings.electronNotarize.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<electron-notarize.electron-notarize.NotarizeAppOptions, 'appPath'> */
trait NotarizeStapleOptions extends js.Object {
  var appPath: String
}

object NotarizeStapleOptions {
  @scala.inline
  def apply(appPath: String): NotarizeStapleOptions = {
    val __obj = js.Dynamic.literal(appPath = appPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotarizeStapleOptions]
  }
}

