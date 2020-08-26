package typings.gapiClientServicemanagement.gapi.client.servicemanagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Http extends js.Object {
  /**
    * When set to true, URL path parmeters will be fully URI-decoded except in
    * cases of single segment matches in reserved expansion, where "%2F" will be
    * left encoded.
    *
    * The default behavior is to not decode RFC 6570 reserved characters in multi
    * segment matches.
    */
  var fullyDecodeReservedExpansion: js.UndefOr[Boolean] = js.native
  /**
    * A list of HTTP configuration rules that apply to individual API methods.
    *
    * &#42;&#42;NOTE:&#42;&#42; All service configuration rules follow "last one wins" order.
    */
  var rules: js.UndefOr[js.Array[HttpRule]] = js.native
}

object Http {
  @scala.inline
  def apply(): Http = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Http]
  }
  @scala.inline
  implicit class HttpOps[Self <: Http] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFullyDecodeReservedExpansion(value: Boolean): Self = this.set("fullyDecodeReservedExpansion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFullyDecodeReservedExpansion: Self = this.set("fullyDecodeReservedExpansion", js.undefined)
    @scala.inline
    def setRulesVarargs(value: HttpRule*): Self = this.set("rules", js.Array(value :_*))
    @scala.inline
    def setRules(value: js.Array[HttpRule]): Self = this.set("rules", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRules: Self = this.set("rules", js.undefined)
  }
  
}

