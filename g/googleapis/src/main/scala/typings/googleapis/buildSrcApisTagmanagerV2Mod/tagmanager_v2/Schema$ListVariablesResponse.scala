package typings.googleapis.buildSrcApisTagmanagerV2Mod.tagmanager_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * List Variables Response.
  */
@js.native
trait Schema$ListVariablesResponse extends js.Object {
  /**
    * Continuation token for fetching the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * All GTM Variables of a GTM Container.
    */
  var variable: js.UndefOr[js.Array[Schema$Variable]] = js.native
}

object Schema$ListVariablesResponse {
  @scala.inline
  def apply(nextPageToken: String = null, variable: js.Array[Schema$Variable] = null): Schema$ListVariablesResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (variable != null) __obj.updateDynamic("variable")(variable.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ListVariablesResponse]
  }
}

