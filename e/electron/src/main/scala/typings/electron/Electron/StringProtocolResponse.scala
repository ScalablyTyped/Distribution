package typings.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StringProtocolResponse extends js.Object {
  // Docs: http://electronjs.org/docs/api/structures/string-protocol-response
  /**
    * Charset of the response.
    */
  var charset: js.UndefOr[String] = js.undefined
  /**
    * A string representing the response body.
    */
  var data: String | Null
  /**
    * MIME type of the response.
    */
  var mimeType: js.UndefOr[String] = js.undefined
}

object StringProtocolResponse {
  @scala.inline
  def apply(charset: String = null, data: String = null, mimeType: String = null): StringProtocolResponse = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    if (charset != null) __obj.updateDynamic("charset")(charset.asInstanceOf[js.Any])
    if (mimeType != null) __obj.updateDynamic("mimeType")(mimeType.asInstanceOf[js.Any])
    __obj.asInstanceOf[StringProtocolResponse]
  }
}

