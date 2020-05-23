package typings.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateInterruptedDownloadOptions extends js.Object {
  /**
    * ETag header value.
    */
  var eTag: js.UndefOr[String] = js.undefined
  /**
    * Last-Modified header value.
    */
  var lastModified: js.UndefOr[String] = js.undefined
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
    length: Double,
    offset: Double,
    path: String,
    urlChain: js.Array[String],
    eTag: String = null,
    lastModified: String = null,
    mimeType: String = null,
    startTime: js.UndefOr[Double] = js.undefined
  ): CreateInterruptedDownloadOptions = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], urlChain = urlChain.asInstanceOf[js.Any])
    if (eTag != null) __obj.updateDynamic("eTag")(eTag.asInstanceOf[js.Any])
    if (lastModified != null) __obj.updateDynamic("lastModified")(lastModified.asInstanceOf[js.Any])
    if (mimeType != null) __obj.updateDynamic("mimeType")(mimeType.asInstanceOf[js.Any])
    if (!js.isUndefined(startTime)) __obj.updateDynamic("startTime")(startTime.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateInterruptedDownloadOptions]
  }
}

