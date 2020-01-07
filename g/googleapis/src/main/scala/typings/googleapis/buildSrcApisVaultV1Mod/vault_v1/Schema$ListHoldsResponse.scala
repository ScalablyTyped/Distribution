package typings.googleapis.buildSrcApisVaultV1Mod.vault_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The holds for a matter.
  */
@js.native
trait Schema$ListHoldsResponse extends js.Object {
  /**
    * The list of holds.
    */
  var holds: js.UndefOr[js.Array[Schema$Hold]] = js.native
  /**
    * Page token to retrieve the next page of results in the list. If this is
    * empty, then there are no more holds to list.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object Schema$ListHoldsResponse {
  @scala.inline
  def apply(holds: js.Array[Schema$Hold] = null, nextPageToken: String = null): Schema$ListHoldsResponse = {
    val __obj = js.Dynamic.literal()
    if (holds != null) __obj.updateDynamic("holds")(holds.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ListHoldsResponse]
  }
}

