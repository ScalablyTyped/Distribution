package typings.googleapis.buildSrcApisBigtableadminV2Mod.bigtableadmin_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message for
  * google.bigtable.admin.v2.BigtableTableAdmin.GenerateConsistencyToken
  */
@js.native
trait Schema$GenerateConsistencyTokenResponse extends js.Object {
  /**
    * The generated consistency token.
    */
  var consistencyToken: js.UndefOr[String] = js.native
}

object Schema$GenerateConsistencyTokenResponse {
  @scala.inline
  def apply(consistencyToken: String = null): Schema$GenerateConsistencyTokenResponse = {
    val __obj = js.Dynamic.literal()
    if (consistencyToken != null) __obj.updateDynamic("consistencyToken")(consistencyToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GenerateConsistencyTokenResponse]
  }
}

