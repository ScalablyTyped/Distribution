package typings.googleapis.bigtableadminV2Mod.bigtableadminV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message for
  * google.bigtable.admin.v2.BigtableTableAdmin.GenerateConsistencyToken
  */
@js.native
trait SchemaGenerateConsistencyTokenResponse extends js.Object {
  /**
    * The generated consistency token.
    */
  var consistencyToken: js.UndefOr[String] = js.native
}

object SchemaGenerateConsistencyTokenResponse {
  @scala.inline
  def apply(consistencyToken: String = null): SchemaGenerateConsistencyTokenResponse = {
    val __obj = js.Dynamic.literal()
    if (consistencyToken != null) __obj.updateDynamic("consistencyToken")(consistencyToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGenerateConsistencyTokenResponse]
  }
}

