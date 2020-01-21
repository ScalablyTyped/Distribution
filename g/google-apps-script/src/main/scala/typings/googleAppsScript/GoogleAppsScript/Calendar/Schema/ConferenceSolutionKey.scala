package typings.googleAppsScript.GoogleAppsScript.Calendar.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConferenceSolutionKey extends js.Object {
  var `type`: js.UndefOr[String] = js.undefined
}

object ConferenceSolutionKey {
  @scala.inline
  def apply(`type`: String = null): ConferenceSolutionKey = {
    val __obj = js.Dynamic.literal()
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConferenceSolutionKey]
  }
}

