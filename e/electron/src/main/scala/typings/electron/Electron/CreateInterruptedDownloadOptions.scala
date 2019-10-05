package typings.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateInterruptedDownloadOptions extends js.Object {
  /**
    * ETag header value.
    */
  var eTag: String
  /**
    * Last-Modified header value.
    */
  var lastModified: String
  /**
    * Total length of the download.
    */
  var length: Double
  var mimeType: js.UndefOr[String] = js.undefined
  /**
    * Start range for the download.
    */
  var offset: Double
  /**
    * Absolute path of the download.
    */
  var path: String
  /**
    * Time when download was started in number of seconds since UNIX epoch.
    */
  var startTime: js.UndefOr[Double] = js.undefined
  /**
    * Complete URL chain for the download.
    */
  var urlChain: js.Array[String]
}

object CreateInterruptedDownloadOptions {
  @scala.inline
  def apply(
    eTag: String,
    lastModified: String,
    length: Double,
    offset: Double,
    path: String,
    urlChain: js.Array[String],
    mimeType: String = null,
    startTime: Int | Double = null
  ): CreateInterruptedDownloadOptions = {
    val __obj = js.Dynamic.literal(eTag = eTag, lastModified = lastModified, length = length, offset = offset, path = path, urlChain = urlChain)
    if (mimeType != null) __obj.updateDynamic("mimeType")(mimeType)
    if (startTime != null) __obj.updateDynamic("startTime")(startTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateInterruptedDownloadOptions]
  }
}

