package typings.gapiDotClientDotAppengine.gapiNs.clientNs.appengineNs

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StaticFilesHandler extends js.Object {
  /**
    * Whether files should also be uploaded as code data. By default, files declared in static file handlers are uploaded as static data and are only served
    * to end users; they cannot be read by the application. If enabled, uploads are charged against both your code and static data storage resource quotas.
    */
  var applicationReadable: js.UndefOr[Boolean] = js.undefined
  /** Time a static file served by this handler should be cached by web proxies and browsers. */
  var expiration: js.UndefOr[String] = js.undefined
  /** HTTP headers to use for all responses from these URLs. */
  var httpHeaders: js.UndefOr[Record[String, String]] = js.undefined
  /** MIME type used to serve all files served by this handler.Defaults to file-specific MIME types, which are derived from each file's filename extension. */
  var mimeType: js.UndefOr[String] = js.undefined
  /**
    * Path to the static files matched by the URL pattern, from the application root directory. The path can refer to text matched in groupings in the URL
    * pattern.
    */
  var path: js.UndefOr[String] = js.undefined
  /** Whether this handler should match the request if the file referenced by the handler does not exist. */
  var requireMatchingFile: js.UndefOr[Boolean] = js.undefined
  /** Regular expression that matches the file paths for all files that should be referenced by this handler. */
  var uploadPathRegex: js.UndefOr[String] = js.undefined
}

object StaticFilesHandler {
  @scala.inline
  def apply(
    applicationReadable: js.UndefOr[Boolean] = js.undefined,
    expiration: String = null,
    httpHeaders: Record[String, String] = null,
    mimeType: String = null,
    path: String = null,
    requireMatchingFile: js.UndefOr[Boolean] = js.undefined,
    uploadPathRegex: String = null
  ): StaticFilesHandler = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(applicationReadable)) __obj.updateDynamic("applicationReadable")(applicationReadable)
    if (expiration != null) __obj.updateDynamic("expiration")(expiration)
    if (httpHeaders != null) __obj.updateDynamic("httpHeaders")(httpHeaders)
    if (mimeType != null) __obj.updateDynamic("mimeType")(mimeType)
    if (path != null) __obj.updateDynamic("path")(path)
    if (!js.isUndefined(requireMatchingFile)) __obj.updateDynamic("requireMatchingFile")(requireMatchingFile)
    if (uploadPathRegex != null) __obj.updateDynamic("uploadPathRegex")(uploadPathRegex)
    __obj.asInstanceOf[StaticFilesHandler]
  }
}

