package typings
package firefoxDashWebextDashBrowserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Body extends js.Object {
  /** Post body. */
  var body: js.UndefOr[java.lang.String] = js.undefined
  var conflictAction: js.UndefOr[firefoxDashWebextDashBrowserLib.browserNs.downloadsNs.FilenameConflictAction] = js.undefined
  /** A file path relative to the Downloads directory to contain the downloaded file. */
  var filename: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Extra HTTP headers to send with the request if the URL uses the HTTP[s] protocol. Each header is represented
    * as a dictionary containing the keys `name` and either `value` or `binaryValue`, restricted to those allowed
    * by XMLHttpRequest.
    */
  var headers: js.UndefOr[js.Array[Anon_NameValue]] = js.undefined
  /** Whether to associate the download with a private browsing session. */
  var incognito: js.UndefOr[scala.Boolean] = js.undefined
  /** The HTTP method to use if the URL uses the HTTP[S] protocol. */
  var method: js.UndefOr[firefoxDashWebextDashBrowserLib.browserNs.downloadsNs._DownloadMethod] = js.undefined
  /**
    * Use a file-chooser to allow the user to select a filename. If the option is not specified, the file chooser
    * will be shown only if the Firefox "Always ask you where to save files" option is enabled (i.e. the pref
    * `browser.download.useDownloadDir` is set to `false`).
    */
  var saveAs: js.UndefOr[scala.Boolean] = js.undefined
  /** The URL to download. */
  var url: java.lang.String
}

object Anon_Body {
  @scala.inline
  def apply(
    url: java.lang.String,
    body: java.lang.String = null,
    conflictAction: firefoxDashWebextDashBrowserLib.browserNs.downloadsNs.FilenameConflictAction = null,
    filename: java.lang.String = null,
    headers: js.Array[Anon_NameValue] = null,
    incognito: js.UndefOr[scala.Boolean] = js.undefined,
    method: firefoxDashWebextDashBrowserLib.browserNs.downloadsNs._DownloadMethod = null,
    saveAs: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_Body = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("url")(url)
    if (body != null) __obj.updateDynamic("body")(body)
    if (conflictAction != null) __obj.updateDynamic("conflictAction")(conflictAction)
    if (filename != null) __obj.updateDynamic("filename")(filename)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (!js.isUndefined(incognito)) __obj.updateDynamic("incognito")(incognito)
    if (method != null) __obj.updateDynamic("method")(method)
    if (!js.isUndefined(saveAs)) __obj.updateDynamic("saveAs")(saveAs)
    __obj.asInstanceOf[Anon_Body]
  }
}

