package typings.gapiDotClientDotMl.gapiNs.clientNs.mlNs

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleApi__HttpBody extends js.Object {
  /** The HTTP Content-Type string representing the content type of the body. */
  var contentType: js.UndefOr[String] = js.undefined
  /** HTTP body binary data. */
  var data: js.UndefOr[String] = js.undefined
  /**
    * Application specific response metadata. Must be set in the first response
    * for streaming APIs.
    */
  var extensions: js.UndefOr[js.Array[Record[String, _]]] = js.undefined
}

object GoogleApi__HttpBody {
  @scala.inline
  def apply(contentType: String = null, data: String = null, extensions: js.Array[Record[String, _]] = null): GoogleApi__HttpBody = {
    val __obj = js.Dynamic.literal()
    if (contentType != null) __obj.updateDynamic("contentType")(contentType)
    if (data != null) __obj.updateDynamic("data")(data)
    if (extensions != null) __obj.updateDynamic("extensions")(extensions)
    __obj.asInstanceOf[GoogleApi__HttpBody]
  }
}

