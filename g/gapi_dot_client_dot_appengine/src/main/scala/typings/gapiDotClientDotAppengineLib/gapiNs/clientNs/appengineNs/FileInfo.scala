package typings
package gapiDotClientDotAppengineLib.gapiNs.clientNs.appengineNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileInfo extends js.Object {
  /** The MIME type of the file.Defaults to the value from Google Cloud Storage. */
  var mimeType: js.UndefOr[java.lang.String] = js.undefined
  /** The SHA1 hash of the file, in hex. */
  var sha1Sum: js.UndefOr[java.lang.String] = js.undefined
  /**
    * URL source to use to fetch this file. Must be a URL to a resource in Google Cloud Storage in the form
    * 'http(s)://storage.googleapis.com/<bucket>/<object>'.
    */
  var sourceUrl: js.UndefOr[java.lang.String] = js.undefined
}

