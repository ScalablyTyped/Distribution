package typings.gapiClientServiceuser.gapi.client.serviceuser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaDownload extends js.Object {
  /**
    * A boolean that determines whether a notification for the completion of a
    * download should be sent to the backend.
    */
  var completeNotification: js.UndefOr[Boolean] = js.undefined
  /**
    * DO NOT USE FIELDS BELOW THIS LINE UNTIL THIS WARNING IS REMOVED.
    *
    * Specify name of the download service if one is used for download.
    */
  var downloadService: js.UndefOr[String] = js.undefined
  /** Name of the Scotty dropzone to use for the current API. */
  var dropzone: js.UndefOr[String] = js.undefined
  /** Whether download is enabled. */
  var enabled: js.UndefOr[Boolean] = js.undefined
  /**
    * Optional maximum acceptable size for direct download.
    * The size is specified in bytes.
    */
  var maxDirectDownloadSize: js.UndefOr[String] = js.undefined
  /**
    * A boolean that determines if direct download from ESF should be used for
    * download of this media.
    */
  var useDirectDownload: js.UndefOr[Boolean] = js.undefined
}

object MediaDownload {
  @scala.inline
  def apply(
    completeNotification: js.UndefOr[Boolean] = js.undefined,
    downloadService: String = null,
    dropzone: String = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    maxDirectDownloadSize: String = null,
    useDirectDownload: js.UndefOr[Boolean] = js.undefined
  ): MediaDownload = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(completeNotification)) __obj.updateDynamic("completeNotification")(completeNotification.asInstanceOf[js.Any])
    if (downloadService != null) __obj.updateDynamic("downloadService")(downloadService.asInstanceOf[js.Any])
    if (dropzone != null) __obj.updateDynamic("dropzone")(dropzone.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (maxDirectDownloadSize != null) __obj.updateDynamic("maxDirectDownloadSize")(maxDirectDownloadSize.asInstanceOf[js.Any])
    if (!js.isUndefined(useDirectDownload)) __obj.updateDynamic("useDirectDownload")(useDirectDownload.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaDownload]
  }
}

