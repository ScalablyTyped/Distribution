package typings.googleDashAppsDashScript.GoogleAppsScript.FusionTables.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Line extends js.Object {
  var coordinates: js.UndefOr[js.Array[js.Array[Double]]] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object Line {
  @scala.inline
  def apply(coordinates: js.Array[js.Array[Double]] = null, `type`: String = null): Line = {
    val __obj = js.Dynamic.literal()
    if (coordinates != null) __obj.updateDynamic("coordinates")(coordinates)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Line]
  }
}

