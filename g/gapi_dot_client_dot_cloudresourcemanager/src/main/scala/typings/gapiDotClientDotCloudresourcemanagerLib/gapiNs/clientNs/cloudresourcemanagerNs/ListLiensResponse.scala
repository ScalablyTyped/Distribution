package typings
package gapiDotClientDotCloudresourcemanagerLib.gapiNs.clientNs.cloudresourcemanagerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListLiensResponse extends js.Object {
  /** A list of Liens. */
  var liens: js.UndefOr[js.Array[Lien]] = js.undefined
  /**
    * Token to retrieve the next page of results, or empty if there are no more
    * results in the list.
    */
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
}

object ListLiensResponse {
  @scala.inline
  def apply(liens: js.Array[Lien] = null, nextPageToken: java.lang.String = null): ListLiensResponse = {
    val __obj = js.Dynamic.literal()
    if (liens != null) __obj.updateDynamic("liens")(liens)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    __obj.asInstanceOf[ListLiensResponse]
  }
}

