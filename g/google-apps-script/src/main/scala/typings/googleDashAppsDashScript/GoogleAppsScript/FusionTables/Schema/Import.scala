package typings.googleDashAppsDashScript.GoogleAppsScript.FusionTables.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Import extends js.Object {
  var kind: js.UndefOr[String] = js.undefined
  var numRowsReceived: js.UndefOr[String] = js.undefined
}

object Import {
  @scala.inline
  def apply(kind: String = null, numRowsReceived: String = null): Import = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (numRowsReceived != null) __obj.updateDynamic("numRowsReceived")(numRowsReceived)
    __obj.asInstanceOf[Import]
  }
}

