package typings.googleapis.buildSrcApisVaultV1Mod.vault_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides the list of matters.
  */
@js.native
trait Schema$ListMattersResponse extends js.Object {
  /**
    * List of matters.
    */
  var matters: js.UndefOr[js.Array[Schema$Matter]] = js.native
  /**
    * Page token to retrieve the next page of results in the list.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object Schema$ListMattersResponse {
  @scala.inline
  def apply(matters: js.Array[Schema$Matter] = null, nextPageToken: String = null): Schema$ListMattersResponse = {
    val __obj = js.Dynamic.literal()
    if (matters != null) __obj.updateDynamic("matters")(matters.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ListMattersResponse]
  }
}

