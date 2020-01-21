package typings.gapiClientDfareporting.gapi.client.dfareporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThirdPartyAuthenticationToken extends js.Object {
  /** Name of the third-party authentication token. */
  var name: js.UndefOr[String] = js.undefined
  /** Value of the third-party authentication token. This is a read-only, auto-generated field. */
  var value: js.UndefOr[String] = js.undefined
}

object ThirdPartyAuthenticationToken {
  @scala.inline
  def apply(name: String = null, value: String = null): ThirdPartyAuthenticationToken = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThirdPartyAuthenticationToken]
  }
}

