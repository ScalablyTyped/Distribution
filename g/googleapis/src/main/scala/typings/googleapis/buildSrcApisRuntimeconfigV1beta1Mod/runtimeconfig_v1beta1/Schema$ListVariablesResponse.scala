package typings.googleapis.buildSrcApisRuntimeconfigV1beta1Mod.runtimeconfig_v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response for the `ListVariables()` method.
  */
@js.native
trait Schema$ListVariablesResponse extends js.Object {
  /**
    * This token allows you to get the next page of results for list requests.
    * If the number of results is larger than `pageSize`, use the
    * `nextPageToken` as a value for the query parameter `pageToken` in the
    * next list request. Subsequent list requests will have their own
    * `nextPageToken` to continue paging through the results
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * A list of variables and their values. The order of returned variable
    * objects is arbitrary.
    */
  var variables: js.UndefOr[js.Array[Schema$Variable]] = js.native
}

object Schema$ListVariablesResponse {
  @scala.inline
  def apply(nextPageToken: String = null, variables: js.Array[Schema$Variable] = null): Schema$ListVariablesResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (variables != null) __obj.updateDynamic("variables")(variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ListVariablesResponse]
  }
}

