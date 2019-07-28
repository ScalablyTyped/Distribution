package typings.gapiDotClientDotVault.gapiNs.clientNs.vaultNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListHoldsResponse extends js.Object {
  /** The list of holds. */
  var holds: js.UndefOr[js.Array[Hold]] = js.undefined
  /**
    * Page token to retrieve the next page of results in the list.
    * If this is empty, then there are no more holds to list.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}

object ListHoldsResponse {
  @scala.inline
  def apply(holds: js.Array[Hold] = null, nextPageToken: String = null): ListHoldsResponse = {
    val __obj = js.Dynamic.literal()
    if (holds != null) __obj.updateDynamic("holds")(holds)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    __obj.asInstanceOf[ListHoldsResponse]
  }
}

