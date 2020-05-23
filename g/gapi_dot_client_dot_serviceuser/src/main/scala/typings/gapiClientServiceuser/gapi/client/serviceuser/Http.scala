package typings.gapiClientServiceuser.gapi.client.serviceuser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Http extends js.Object {
  /**
    * When set to true, URL path parmeters will be fully URI-decoded except in
    * cases of single segment matches in reserved expansion, where "%2F" will be
    * left encoded.
    *
    * The default behavior is to not decode RFC 6570 reserved characters in multi
    * segment matches.
    */
  var fullyDecodeReservedExpansion: js.UndefOr[Boolean] = js.undefined
  /**
    * A list of HTTP configuration rules that apply to individual API methods.
    *
    * &#42;&#42;NOTE:&#42;&#42; All service configuration rules follow "last one wins" order.
    */
  var rules: js.UndefOr[js.Array[HttpRule]] = js.undefined
}

object Http {
  @scala.inline
  def apply(fullyDecodeReservedExpansion: js.UndefOr[Boolean] = js.undefined, rules: js.Array[HttpRule] = null): Http = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(fullyDecodeReservedExpansion)) __obj.updateDynamic("fullyDecodeReservedExpansion")(fullyDecodeReservedExpansion.get.asInstanceOf[js.Any])
    if (rules != null) __obj.updateDynamic("rules")(rules.asInstanceOf[js.Any])
    __obj.asInstanceOf[Http]
  }
}

