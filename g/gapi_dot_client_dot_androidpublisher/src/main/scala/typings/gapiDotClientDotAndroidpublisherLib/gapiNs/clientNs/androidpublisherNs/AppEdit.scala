package typings
package gapiDotClientDotAndroidpublisherLib.gapiNs.clientNs.androidpublisherNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppEdit extends js.Object {
  /** The time at which the edit will expire and will be no longer valid for use in any subsequent API calls (encoded as seconds since the Epoch). */
  var expiryTimeSeconds: js.UndefOr[java.lang.String] = js.undefined
  /** The ID of the edit that can be used in subsequent API calls. */
  var id: js.UndefOr[java.lang.String] = js.undefined
}

object AppEdit {
  @scala.inline
  def apply(expiryTimeSeconds: java.lang.String = null, id: java.lang.String = null): AppEdit = {
    val __obj = js.Dynamic.literal()
    if (expiryTimeSeconds != null) __obj.updateDynamic("expiryTimeSeconds")(expiryTimeSeconds)
    if (id != null) __obj.updateDynamic("id")(id)
    __obj.asInstanceOf[AppEdit]
  }
}

