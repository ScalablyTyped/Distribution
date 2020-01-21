package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaServiceAccountKeysListResponse extends js.Object {
  /**
    * The service account credentials.
    */
  var serviceAccountKey: js.UndefOr[js.Array[SchemaServiceAccountKey]] = js.native
}

object SchemaServiceAccountKeysListResponse {
  @scala.inline
  def apply(serviceAccountKey: js.Array[SchemaServiceAccountKey] = null): SchemaServiceAccountKeysListResponse = {
    val __obj = js.Dynamic.literal()
    if (serviceAccountKey != null) __obj.updateDynamic("serviceAccountKey")(serviceAccountKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaServiceAccountKeysListResponse]
  }
}

