package typings.electron.Electron

import typings.node.Buffer
import typings.node.NodeJS.ReadableStream
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProtocolResponse extends js.Object {
  // Docs: http://electronjs.org/docs/api/structures/protocol-response
  /**
    * The charset of response body, default is `"utf-8"`.
    */
  var charset: js.UndefOr[String] = js.undefined
  /**
    * The response body. When returning stream as response, this is a Node.js readable
    * stream representing the response body. When returning `Buffer` as response, this
    * is a `Buffer`. When returning `String` as response, this is a `String`. This is
    * ignored for other types of responses.
    */
  var data: js.UndefOr[Buffer | String | ReadableStream] = js.undefined
  /**
    * When assigned, the `request` will fail with the `error` number . For the
    * available error numbers you can use, please see the net error list.
    */
  var error: js.UndefOr[Double] = js.undefined
  /**
    * An object containing the response headers. The keys must be String, and values
    * must be either String or Array of String.
    */
  var headers: js.UndefOr[Record[String, String | js.Array[String]]] = js.undefined
  /**
    * The HTTP `method`. This is only used for file and URL responses.
    */
  var method: js.UndefOr[String] = js.undefined
  /**
    * The MIME type of response body, default is `"text/html"`. Setting `mimeType`
    * would implicitly set the `content-type` header in response, but if
    * `content-type` is already set in `headers`, the `mimeType` would be ignored.
    */
  var mimeType: js.UndefOr[String] = js.undefined
  /**
    * Path to the file which would be sent as response body. This is only used for
    * file responses.
    */
  var path: js.UndefOr[String] = js.undefined
  /**
    * The `referrer` URL. This is only used for file and URL responses.
    */
  var referrer: js.UndefOr[String] = js.undefined
  /**
    * The session used for requesting URL, by default the HTTP request will reuse the
    * current session. Setting `session` to `null` would use a random independent
    * session. This is only used for URL responses.
    */
  var session: js.UndefOr[Session_] = js.undefined
  /**
    * The HTTP response code, default is 200.
    */
  var statusCode: js.UndefOr[Double] = js.undefined
  /**
    * The data used as upload data. This is only used for URL responses when `method`
    * is `"POST"`.
    */
  var uploadData: js.UndefOr[ProtocolResponseUploadData] = js.undefined
  /**
    * Download the `url` and pipe the result as response body. This is only used for
    * URL responses.
    */
  var url: js.UndefOr[String] = js.undefined
}

object ProtocolResponse {
  @scala.inline
  def apply(
    charset: String = null,
    data: Buffer | String | ReadableStream = null,
    error: js.UndefOr[Double] = js.undefined,
    headers: Record[String, String | js.Array[String]] = null,
    method: String = null,
    mimeType: String = null,
    path: String = null,
    referrer: String = null,
    session: Session_ = null,
    statusCode: js.UndefOr[Double] = js.undefined,
    uploadData: ProtocolResponseUploadData = null,
    url: String = null
  ): ProtocolResponse = {
    val __obj = js.Dynamic.literal()
    if (charset != null) __obj.updateDynamic("charset")(charset.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (!js.isUndefined(error)) __obj.updateDynamic("error")(error.get.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (mimeType != null) __obj.updateDynamic("mimeType")(mimeType.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (referrer != null) __obj.updateDynamic("referrer")(referrer.asInstanceOf[js.Any])
    if (session != null) __obj.updateDynamic("session")(session.asInstanceOf[js.Any])
    if (!js.isUndefined(statusCode)) __obj.updateDynamic("statusCode")(statusCode.get.asInstanceOf[js.Any])
    if (uploadData != null) __obj.updateDynamic("uploadData")(uploadData.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProtocolResponse]
  }
}

