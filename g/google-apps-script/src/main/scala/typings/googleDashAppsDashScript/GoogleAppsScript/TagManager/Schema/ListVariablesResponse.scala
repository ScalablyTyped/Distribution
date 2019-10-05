package typings.googleDashAppsDashScript.GoogleAppsScript.TagManager.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListVariablesResponse extends js.Object {
  var nextPageToken: js.UndefOr[String] = js.undefined
  var variable: js.UndefOr[js.Array[Variable]] = js.undefined
}

object ListVariablesResponse {
  @scala.inline
  def apply(nextPageToken: String = null, variable: js.Array[Variable] = null): ListVariablesResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    if (variable != null) __obj.updateDynamic("variable")(variable)
    __obj.asInstanceOf[ListVariablesResponse]
  }
}

