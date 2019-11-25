package typings.gapiDotClientDotToolresults.gapi.client.toolresults

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  var typeUrl: js.UndefOr[String] = js.undefined
  /** Must be a valid serialized protocol buffer of the above specified type. */
  var value: js.UndefOr[String] = js.undefined
}

object Any {
  @scala.inline
  def apply(typeUrl: String = null, value: String = null): Any = {
    val __obj = js.Dynamic.literal()
    if (typeUrl != null) __obj.updateDynamic("typeUrl")(typeUrl.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Any]
  }
}

