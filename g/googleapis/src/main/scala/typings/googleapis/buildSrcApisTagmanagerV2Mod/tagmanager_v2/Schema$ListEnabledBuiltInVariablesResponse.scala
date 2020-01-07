package typings.googleapis.buildSrcApisTagmanagerV2Mod.tagmanager_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A list of enabled built-in variables.
  */
@js.native
trait Schema$ListEnabledBuiltInVariablesResponse extends js.Object {
  /**
    * All GTM BuiltInVariables of a GTM container.
    */
  var builtInVariable: js.UndefOr[js.Array[Schema$BuiltInVariable]] = js.native
  /**
    * Continuation token for fetching the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object Schema$ListEnabledBuiltInVariablesResponse {
  @scala.inline
  def apply(builtInVariable: js.Array[Schema$BuiltInVariable] = null, nextPageToken: String = null): Schema$ListEnabledBuiltInVariablesResponse = {
    val __obj = js.Dynamic.literal()
    if (builtInVariable != null) __obj.updateDynamic("builtInVariable")(builtInVariable.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ListEnabledBuiltInVariablesResponse]
  }
}

