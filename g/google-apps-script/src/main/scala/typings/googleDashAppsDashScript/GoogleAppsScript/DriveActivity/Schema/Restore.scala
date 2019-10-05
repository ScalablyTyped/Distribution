package typings.googleDashAppsDashScript.GoogleAppsScript.DriveActivity.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Restore extends js.Object {
  var `type`: js.UndefOr[String] = js.undefined
}

object Restore {
  @scala.inline
  def apply(`type`: String = null): Restore = {
    val __obj = js.Dynamic.literal()
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Restore]
  }
}

