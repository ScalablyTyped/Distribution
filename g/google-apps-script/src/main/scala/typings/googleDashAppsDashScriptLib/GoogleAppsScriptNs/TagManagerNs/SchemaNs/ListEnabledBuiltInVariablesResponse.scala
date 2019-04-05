package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.TagManagerNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListEnabledBuiltInVariablesResponse extends js.Object {
  var builtInVariable: js.UndefOr[js.Array[BuiltInVariable]] = js.undefined
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
}

object ListEnabledBuiltInVariablesResponse {
  @scala.inline
  def apply(builtInVariable: js.Array[BuiltInVariable] = null, nextPageToken: java.lang.String = null): ListEnabledBuiltInVariablesResponse = {
    val __obj = js.Dynamic.literal()
    if (builtInVariable != null) __obj.updateDynamic("builtInVariable")(builtInVariable)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    __obj.asInstanceOf[ListEnabledBuiltInVariablesResponse]
  }
}

