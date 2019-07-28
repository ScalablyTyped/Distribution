package typings.gapiDotClientDotAndroidenterprise.gapiNs.clientNs.androidenterpriseNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServiceAccountKeysListResponse extends js.Object {
  /** The service account credentials. */
  var serviceAccountKey: js.UndefOr[js.Array[ServiceAccountKey]] = js.undefined
}

object ServiceAccountKeysListResponse {
  @scala.inline
  def apply(serviceAccountKey: js.Array[ServiceAccountKey] = null): ServiceAccountKeysListResponse = {
    val __obj = js.Dynamic.literal()
    if (serviceAccountKey != null) __obj.updateDynamic("serviceAccountKey")(serviceAccountKey)
    __obj.asInstanceOf[ServiceAccountKeysListResponse]
  }
}

