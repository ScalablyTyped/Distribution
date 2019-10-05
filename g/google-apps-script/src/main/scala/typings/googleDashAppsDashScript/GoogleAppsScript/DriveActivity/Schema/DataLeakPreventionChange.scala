package typings.googleDashAppsDashScript.GoogleAppsScript.DriveActivity.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataLeakPreventionChange extends js.Object {
  var `type`: js.UndefOr[String] = js.undefined
}

object DataLeakPreventionChange {
  @scala.inline
  def apply(`type`: String = null): DataLeakPreventionChange = {
    val __obj = js.Dynamic.literal()
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[DataLeakPreventionChange]
  }
}

