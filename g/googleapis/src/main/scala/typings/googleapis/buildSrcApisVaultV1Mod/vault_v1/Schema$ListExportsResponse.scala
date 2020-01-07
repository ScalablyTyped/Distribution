package typings.googleapis.buildSrcApisVaultV1Mod.vault_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The holds for a matter.
  */
@js.native
trait Schema$ListExportsResponse extends js.Object {
  /**
    * The list of exports.
    */
  var exports: js.UndefOr[js.Array[Schema$Export]] = js.native
  /**
    * Page token to retrieve the next page of results in the list.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object Schema$ListExportsResponse {
  @scala.inline
  def apply(exports: js.Array[Schema$Export] = null, nextPageToken: String = null): Schema$ListExportsResponse = {
    val __obj = js.Dynamic.literal()
    if (exports != null) __obj.updateDynamic("exports")(exports.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ListExportsResponse]
  }
}

