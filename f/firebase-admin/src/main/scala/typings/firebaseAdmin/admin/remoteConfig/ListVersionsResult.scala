package typings.firebaseAdmin.admin.remoteConfig

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListVersionsResult extends js.Object {
  /**
    * Token to retrieve the next page of results, or empty if there are no more results
    * in the list.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  /**
    * A list of version metadata objects, sorted in reverse chronological order.
    */
  var versions: js.Array[Version]
}

object ListVersionsResult {
  @scala.inline
  def apply(versions: js.Array[Version], nextPageToken: String = null): ListVersionsResult = {
    val __obj = js.Dynamic.literal(versions = versions.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListVersionsResult]
  }
}

