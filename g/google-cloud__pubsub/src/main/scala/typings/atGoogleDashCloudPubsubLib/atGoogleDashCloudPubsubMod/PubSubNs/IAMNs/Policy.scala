package typings
package atGoogleDashCloudPubsubLib.atGoogleDashCloudPubsubMod.PubSubNs.IAMNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Policy extends js.Object {
  var bindings: js.UndefOr[js.Array[_]] = js.undefined
  var etag: js.UndefOr[java.lang.String] = js.undefined
  var rules: js.UndefOr[js.Array[js.Object]] = js.undefined
}

object Policy {
  @scala.inline
  def apply(bindings: js.Array[_] = null, etag: java.lang.String = null, rules: js.Array[js.Object] = null): Policy = {
    val __obj = js.Dynamic.literal()
    if (bindings != null) __obj.updateDynamic("bindings")(bindings)
    if (etag != null) __obj.updateDynamic("etag")(etag)
    if (rules != null) __obj.updateDynamic("rules")(rules)
    __obj.asInstanceOf[Policy]
  }
}

