package typings.googleapis.appengineV1Mod.appengineV1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Files served directly to the user for a given URL, such as images, CSS
  * stylesheets, or JavaScript source files. Static file handlers describe
  * which files in the application directory are static files, and which URLs
  * serve them.
  */
@js.native
trait SchemaStaticFilesHandler extends js.Object {
  /**
    * Whether files should also be uploaded as code data. By default, files
    * declared in static file handlers are uploaded as static data and are only
    * served to end users; they cannot be read by the application. If enabled,
    * uploads are charged against both your code and static data storage
    * resource quotas.
    */
  var applicationReadable: js.UndefOr[Boolean] = js.native
  /**
    * Time a static file served by this handler should be cached by web proxies
    * and browsers.
    */
  var expiration: js.UndefOr[String] = js.native
  /**
    * HTTP headers to use for all responses from these URLs.
    */
  var httpHeaders: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * MIME type used to serve all files served by this handler.Defaults to
    * file-specific MIME types, which are derived from each file&#39;s filename
    * extension.
    */
  var mimeType: js.UndefOr[String] = js.native
  /**
    * Path to the static files matched by the URL pattern, from the application
    * root directory. The path can refer to text matched in groupings in the
    * URL pattern.
    */
  var path: js.UndefOr[String] = js.native
  /**
    * Whether this handler should match the request if the file referenced by
    * the handler does not exist.
    */
  var requireMatchingFile: js.UndefOr[Boolean] = js.native
  /**
    * Regular expression that matches the file paths for all files that should
    * be referenced by this handler.
    */
  var uploadPathRegex: js.UndefOr[String] = js.native
}

object SchemaStaticFilesHandler {
  @scala.inline
  def apply(
    applicationReadable: js.UndefOr[Boolean] = js.undefined,
    expiration: String = null,
    httpHeaders: StringDictionary[String] = null,
    mimeType: String = null,
    path: String = null,
    requireMatchingFile: js.UndefOr[Boolean] = js.undefined,
    uploadPathRegex: String = null
  ): SchemaStaticFilesHandler = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(applicationReadable)) __obj.updateDynamic("applicationReadable")(applicationReadable.asInstanceOf[js.Any])
    if (expiration != null) __obj.updateDynamic("expiration")(expiration.asInstanceOf[js.Any])
    if (httpHeaders != null) __obj.updateDynamic("httpHeaders")(httpHeaders.asInstanceOf[js.Any])
    if (mimeType != null) __obj.updateDynamic("mimeType")(mimeType.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (!js.isUndefined(requireMatchingFile)) __obj.updateDynamic("requireMatchingFile")(requireMatchingFile.asInstanceOf[js.Any])
    if (uploadPathRegex != null) __obj.updateDynamic("uploadPathRegex")(uploadPathRegex.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaStaticFilesHandler]
  }
}

