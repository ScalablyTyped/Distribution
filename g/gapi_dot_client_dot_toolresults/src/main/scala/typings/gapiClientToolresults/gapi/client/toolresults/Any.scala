package typings.gapiClientToolresults.gapi.client.toolresults

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Any extends js.Object {
  /**
    * A URL/resource name whose content describes the type of the serialized protocol buffer message.
    *
    * For URLs which use the scheme `http`, `https`, or no scheme, the following restrictions and interpretations apply:
    *
    * &#42; If no scheme is provided, `https` is assumed. &#42; The last segment of the URL's path must represent the fully qualified name of the type (as in
    * `path/google.protobuf.Duration`). The name should be in a canonical form (e.g., leading "." is not accepted). &#42; An HTTP GET on the URL must yield a
    * [google.protobuf.Type][] value in binary format, or produce an error. &#42; Applications are allowed to cache lookup results based on the URL, or have them
    * precompiled into a binary to avoid any lookup. Therefore, binary compatibility needs to be preserved on changes to types. (Use versioned type names to
    * manage breaking changes.)
    *
    * Schemes other than `http`, `https` (or the empty scheme) might be used with implementation specific semantics.
    */
  var typeUrl: js.UndefOr[String] = js.native
  /** Must be a valid serialized protocol buffer of the above specified type. */
  var value: js.UndefOr[String] = js.native
}

object Any {
  @scala.inline
  def apply(): Any = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Any]
  }
  @scala.inline
  implicit class AnyOps[Self <: Any] (val x: Self) extends AnyVal {
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
    def setTypeUrl(value: String): Self = this.set("typeUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTypeUrl: Self = this.set("typeUrl", js.undefined)
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

