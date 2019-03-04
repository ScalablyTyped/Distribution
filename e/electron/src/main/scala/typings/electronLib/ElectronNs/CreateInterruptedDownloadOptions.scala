package typings
package electronLib.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateInterruptedDownloadOptions extends js.Object {
  /**
    * ETag header value.
    */
  var eTag: java.lang.String
  /**
    * Last-Modified header value.
    */
  var lastModified: java.lang.String
  /**
    * Total length of the download.
    */
  var length: scala.Double
  var mimeType: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Start range for the download.
    */
  var offset: scala.Double
  /**
    * Absolute path of the download.
    */
  var path: java.lang.String
  /**
    * Time when download was started in number of seconds since UNIX epoch.
    */
  var startTime: js.UndefOr[scala.Double] = js.undefined
  /**
    * Complete URL chain for the download.
    */
  var urlChain: js.Array[java.lang.String]
}

object CreateInterruptedDownloadOptions {
  @scala.inline
  def apply(
    eTag: java.lang.String,
    lastModified: java.lang.String,
    length: scala.Double,
    offset: scala.Double,
    path: java.lang.String,
    urlChain: js.Array[java.lang.String],
    mimeType: java.lang.String = null,
    startTime: scala.Int | scala.Double = null
  ): CreateInterruptedDownloadOptions = {
    val __obj = js.Dynamic.literal(eTag = eTag, lastModified = lastModified, length = length, offset = offset, path = path, urlChain = urlChain)
    if (mimeType != null) __obj.updateDynamic("mimeType")(mimeType)
    if (startTime != null) __obj.updateDynamic("startTime")(startTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateInterruptedDownloadOptions]
  }
}

