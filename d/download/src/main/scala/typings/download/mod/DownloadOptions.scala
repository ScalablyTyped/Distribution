package typings.download.mod

import org.scalablytyped.runtime.StringDictionary
import typings.decompress.mod.DecompressOptions
import typings.got.mod.GotBodyOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DownloadOptions
  extends GotBodyOptions[String]
     with DecompressOptions {
  /**
    * If set to true, try extracting the file using decompress.
    */
  var extract: js.UndefOr[Boolean] = js.native
  /**
    * Name of the saved file.
    */
  var filename: js.UndefOr[String] = js.native
  /**
    * Request Headers
    */
  @JSName("headers")
  var headers_DownloadOptions: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * Proxy endpoint
    */
  var proxy: js.UndefOr[String] = js.native
}

object DownloadOptions {
  @scala.inline
  def apply(): DownloadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DownloadOptions]
  }
  @scala.inline
  implicit class DownloadOptionsOps[Self <: DownloadOptions] (val x: Self) extends AnyVal {
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
    def setExtract(value: Boolean): Self = this.set("extract", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtract: Self = this.set("extract", js.undefined)
    @scala.inline
    def setFilename(value: String): Self = this.set("filename", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilename: Self = this.set("filename", js.undefined)
    @scala.inline
    def setHeaders(value: StringDictionary[String]): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    @scala.inline
    def setProxy(value: String): Self = this.set("proxy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProxy: Self = this.set("proxy", js.undefined)
  }
  
}

