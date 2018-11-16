package typings
package gapiDotClientDotAppengineLib.gapiNs.clientNs.appengineNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait StaticFilesHandler extends js.Object {
  /**
               * Whether files should also be uploaded as code data. By default, files declared in static file handlers are uploaded as static data and are only served
               * to end users; they cannot be read by the application. If enabled, uploads are charged against both your code and static data storage resource quotas.
               */
  var applicationReadable: js.UndefOr[scala.Boolean] = js.undefined
  /** Time a static file served by this handler should be cached by web proxies and browsers. */
  var expiration: js.UndefOr[java.lang.String] = js.undefined
  /** HTTP headers to use for all responses from these URLs. */
  var httpHeaders: js.UndefOr[stdLib.Record[java.lang.String, java.lang.String]] = js.undefined
  /** MIME type used to serve all files served by this handler.Defaults to file-specific MIME types, which are derived from each file's filename extension. */
  var mimeType: js.UndefOr[java.lang.String] = js.undefined
  /**
               * Path to the static files matched by the URL pattern, from the application root directory. The path can refer to text matched in groupings in the URL
               * pattern.
               */
  var path: js.UndefOr[java.lang.String] = js.undefined
  /** Whether this handler should match the request if the file referenced by the handler does not exist. */
  var requireMatchingFile: js.UndefOr[scala.Boolean] = js.undefined
  /** Regular expression that matches the file paths for all files that should be referenced by this handler. */
  var uploadPathRegex: js.UndefOr[java.lang.String] = js.undefined
}

