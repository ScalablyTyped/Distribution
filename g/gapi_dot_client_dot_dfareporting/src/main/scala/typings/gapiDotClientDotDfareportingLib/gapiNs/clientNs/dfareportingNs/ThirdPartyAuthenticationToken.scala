package typings
package gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThirdPartyAuthenticationToken extends js.Object {
  /** Name of the third-party authentication token. */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** Value of the third-party authentication token. This is a read-only, auto-generated field. */
  var value: js.UndefOr[java.lang.String] = js.undefined
}

object ThirdPartyAuthenticationToken {
  @scala.inline
  def apply(name: java.lang.String = null, value: java.lang.String = null): ThirdPartyAuthenticationToken = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[ThirdPartyAuthenticationToken]
  }
}

