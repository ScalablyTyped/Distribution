package typings.firefoxWebextBrowser

import typings.firefoxWebextBrowser.browser.downloads.DownloadMethod
import typings.firefoxWebextBrowser.browser.downloads.FilenameConflictAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBody extends js.Object {
  /** Post body. */
  var body: js.UndefOr[String] = js.undefined
  var conflictAction: js.UndefOr[FilenameConflictAction] = js.undefined
  /** A file path relative to the Downloads directory to contain the downloaded file. */
  var filename: js.UndefOr[String] = js.undefined
  /**
    * Extra HTTP headers to send with the request if the URL uses the HTTP[s] protocol. Each header is represented
    * as a dictionary containing the keys `name` and either `value` or `binaryValue`, restricted to those allowed
    * by XMLHttpRequest.
    */
  var headers: js.UndefOr[js.Array[AnonNameValue]] = js.undefined
  /** Whether to associate the download with a private browsing session. */
  var incognito: js.UndefOr[Boolean] = js.undefined
  /** The HTTP method to use if the URL uses the HTTP[S] protocol. */
  var method: js.UndefOr[DownloadMethod] = js.undefined
  /**
    * Use a file-chooser to allow the user to select a filename. If the option is not specified, the file chooser
    * will be shown only if the Firefox "Always ask you where to save files" option is enabled (i.e. the pref
    * `browser.download.useDownloadDir` is set to `false`).
    */
  var saveAs: js.UndefOr[Boolean] = js.undefined
  /** The URL to download. */
  var url: String
}

object AnonBody {
  @scala.inline
  def apply(
    url: String,
    body: String = null,
    conflictAction: FilenameConflictAction = null,
    filename: String = null,
    headers: js.Array[AnonNameValue] = null,
    incognito: js.UndefOr[Boolean] = js.undefined,
    method: DownloadMethod = null,
    saveAs: js.UndefOr[Boolean] = js.undefined
  ): AnonBody = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (conflictAction != null) __obj.updateDynamic("conflictAction")(conflictAction.asInstanceOf[js.Any])
    if (filename != null) __obj.updateDynamic("filename")(filename.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (!js.isUndefined(incognito)) __obj.updateDynamic("incognito")(incognito.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (!js.isUndefined(saveAs)) __obj.updateDynamic("saveAs")(saveAs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBody]
  }
}

