package typings.googleDashAppsDashScript.GoogleAppsScript.Docs.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReplaceAllTextResponse extends js.Object {
  var occurrencesChanged: js.UndefOr[Double] = js.undefined
}

object ReplaceAllTextResponse {
  @scala.inline
  def apply(occurrencesChanged: Int | Double = null): ReplaceAllTextResponse = {
    val __obj = js.Dynamic.literal()
    if (occurrencesChanged != null) __obj.updateDynamic("occurrencesChanged")(occurrencesChanged.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplaceAllTextResponse]
  }
}

