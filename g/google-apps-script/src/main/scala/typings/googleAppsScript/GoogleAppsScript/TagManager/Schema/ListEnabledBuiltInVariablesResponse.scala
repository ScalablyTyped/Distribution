package typings.googleAppsScript.GoogleAppsScript.TagManager.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListEnabledBuiltInVariablesResponse extends js.Object {
  var builtInVariable: js.UndefOr[js.Array[BuiltInVariable]] = js.undefined
  var nextPageToken: js.UndefOr[String] = js.undefined
}

object ListEnabledBuiltInVariablesResponse {
  @scala.inline
  def apply(builtInVariable: js.Array[BuiltInVariable] = null, nextPageToken: String = null): ListEnabledBuiltInVariablesResponse = {
    val __obj = js.Dynamic.literal()
    if (builtInVariable != null) __obj.updateDynamic("builtInVariable")(builtInVariable.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListEnabledBuiltInVariablesResponse]
  }
}

