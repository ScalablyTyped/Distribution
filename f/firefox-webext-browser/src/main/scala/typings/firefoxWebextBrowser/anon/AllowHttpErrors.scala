package typings.firefoxWebextBrowser.anon

import typings.firefoxWebextBrowser.browser.downloads.DownloadMethod
import typings.firefoxWebextBrowser.browser.downloads.FilenameConflictAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AllowHttpErrors extends js.Object {
  /**
    * When this flag is set to `true`, then the browser will allow downloads to proceed after encountering HTTP
    * errors such as `404 Not Found`.
    */
  var allowHttpErrors: js.UndefOr[Boolean] = js.native
  /** Post body. */
  var body: js.UndefOr[String] = js.native
  var conflictAction: js.UndefOr[FilenameConflictAction] = js.native
  /** A file path relative to the Downloads directory to contain the downloaded file. */
  var filename: js.UndefOr[String] = js.native
  /**
    * Extra HTTP headers to send with the request if the URL uses the HTTP[s] protocol. Each header is represented
    * as a dictionary containing the keys `name` and either `value` or `binaryValue`, restricted to those allowed
    * by XMLHttpRequest.
    */
  var headers: js.UndefOr[js.Array[Value]] = js.native
  /** Whether to associate the download with a private browsing session. */
  var incognito: js.UndefOr[Boolean] = js.native
  /** The HTTP method to use if the URL uses the HTTP[S] protocol. */
  var method: js.UndefOr[DownloadMethod] = js.native
  /**
    * Use a file-chooser to allow the user to select a filename. If the option is not specified, the file chooser
    * will be shown only if the Firefox "Always ask you where to save files" option is enabled (i.e. the pref
    * `browser.download.useDownloadDir` is set to `false`).
    */
  var saveAs: js.UndefOr[Boolean] = js.native
  /** The URL to download. */
  var url: String = js.native
}

object AllowHttpErrors {
  @scala.inline
  def apply(url: String): AllowHttpErrors = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllowHttpErrors]
  }
  @scala.inline
  implicit class AllowHttpErrorsOps[Self <: AllowHttpErrors] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def setAllowHttpErrors(value: Boolean): Self = this.set("allowHttpErrors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowHttpErrors: Self = this.set("allowHttpErrors", js.undefined)
    @scala.inline
    def setBody(value: String): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBody: Self = this.set("body", js.undefined)
    @scala.inline
    def setConflictAction(value: FilenameConflictAction): Self = this.set("conflictAction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConflictAction: Self = this.set("conflictAction", js.undefined)
    @scala.inline
    def setFilename(value: String): Self = this.set("filename", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilename: Self = this.set("filename", js.undefined)
    @scala.inline
    def setHeadersVarargs(value: Value*): Self = this.set("headers", js.Array(value :_*))
    @scala.inline
    def setHeaders(value: js.Array[Value]): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    @scala.inline
    def setIncognito(value: Boolean): Self = this.set("incognito", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncognito: Self = this.set("incognito", js.undefined)
    @scala.inline
    def setMethod(value: DownloadMethod): Self = this.set("method", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
    @scala.inline
    def setSaveAs(value: Boolean): Self = this.set("saveAs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSaveAs: Self = this.set("saveAs", js.undefined)
  }
  
}

