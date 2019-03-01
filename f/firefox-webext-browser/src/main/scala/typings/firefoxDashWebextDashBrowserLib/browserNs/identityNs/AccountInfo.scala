package typings
package firefoxDashWebextDashBrowserLib.browserNs.identityNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* identity types */
/** An object encapsulating an OAuth account id. */
trait AccountInfo extends js.Object {
  /** A unique identifier for the account. This ID will not change for the lifetime of the account. */
  var id: java.lang.String
}

object AccountInfo {
  @scala.inline
  def apply(id: java.lang.String): AccountInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("id")(id)
    __obj.asInstanceOf[AccountInfo]
  }
}

