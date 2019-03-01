package typings
package gapiDotClientDotMlLib.gapiNs.clientNs.mlNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleApi__HttpBody extends js.Object {
  /** The HTTP Content-Type string representing the content type of the body. */
  var contentType: js.UndefOr[java.lang.String] = js.undefined
  /** HTTP body binary data. */
  var data: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Application specific response metadata. Must be set in the first response
    * for streaming APIs.
    */
  var extensions: js.UndefOr[js.Array[stdLib.Record[java.lang.String, _]]] = js.undefined
}

object GoogleApi__HttpBody {
  @scala.inline
  def apply(
    contentType: java.lang.String = null,
    data: java.lang.String = null,
    extensions: js.Array[stdLib.Record[java.lang.String, _]] = null
  ): GoogleApi__HttpBody = {
    val __obj = js.Dynamic.literal()
    if (contentType != null) __obj.updateDynamic("contentType")(contentType)
    if (data != null) __obj.updateDynamic("data")(data)
    if (extensions != null) __obj.updateDynamic("extensions")(extensions)
    __obj.asInstanceOf[GoogleApi__HttpBody]
  }
}

