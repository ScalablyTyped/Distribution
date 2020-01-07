package typings.googleapis.buildSrcApisRuntimeconfigV1beta1Mod.runtimeconfig_v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response for the `ListWaiters()` method. Order of returned waiter objects
  * is arbitrary.
  */
@js.native
trait Schema$ListWaitersResponse extends js.Object {
  /**
    * This token allows you to get the next page of results for list requests.
    * If the number of results is larger than `pageSize`, use the
    * `nextPageToken` as a value for the query parameter `pageToken` in the
    * next list request. Subsequent list requests will have their own
    * `nextPageToken` to continue paging through the results
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * Found waiters in the project.
    */
  var waiters: js.UndefOr[js.Array[Schema$Waiter]] = js.native
}

object Schema$ListWaitersResponse {
  @scala.inline
  def apply(nextPageToken: String = null, waiters: js.Array[Schema$Waiter] = null): Schema$ListWaitersResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (waiters != null) __obj.updateDynamic("waiters")(waiters.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ListWaitersResponse]
  }
}

