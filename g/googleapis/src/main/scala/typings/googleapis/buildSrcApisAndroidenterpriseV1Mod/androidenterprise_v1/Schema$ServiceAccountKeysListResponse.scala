package typings.googleapis.buildSrcApisAndroidenterpriseV1Mod.androidenterprise_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$ServiceAccountKeysListResponse extends js.Object {
  /**
    * The service account credentials.
    */
  var serviceAccountKey: js.UndefOr[js.Array[Schema$ServiceAccountKey]] = js.native
}

object Schema$ServiceAccountKeysListResponse {
  @scala.inline
  def apply(serviceAccountKey: js.Array[Schema$ServiceAccountKey] = null): Schema$ServiceAccountKeysListResponse = {
    val __obj = js.Dynamic.literal()
    if (serviceAccountKey != null) __obj.updateDynamic("serviceAccountKey")(serviceAccountKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ServiceAccountKeysListResponse]
  }
}

