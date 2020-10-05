package typings.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateInterruptedDownloadOptions extends js.Object {
  /**
    * ETag header value.
    */
  var eTag: js.UndefOr[String] = js.native
  /**
    * Last-Modified header value.
    */
  var lastModified: js.UndefOr[String] = js.native
  /**
    * Total length of the download.
    */
  var length: Double = js.native
  var mimeType: js.UndefOr[String] = js.native
  /**
    * Start range for the download.
    */
  var offset: Double = js.native
  /**
    * Absolute path of the download.
    */
  var path: String = js.native
  /**
    * Time when download was started in number of seconds since UNIX epoch.
    */
  var startTime: js.UndefOr[Double] = js.native
  /**
    * Complete URL chain for the download.
    */
  var urlChain: js.Array[String] = js.native
}

object CreateInterruptedDownloadOptions {
  @scala.inline
  def apply(length: Double, offset: Double, path: String, urlChain: js.Array[String]): CreateInterruptedDownloadOptions = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], urlChain = urlChain.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateInterruptedDownloadOptions]
  }
  @scala.inline
  implicit class CreateInterruptedDownloadOptionsOps[Self <: CreateInterruptedDownloadOptions] (val x: Self) extends AnyVal {
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
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
    @scala.inline
    def setOffset(value: Double): Self = this.set("offset", value.asInstanceOf[js.Any])
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrlChainVarargs(value: String*): Self = this.set("urlChain", js.Array(value :_*))
    @scala.inline
    def setUrlChain(value: js.Array[String]): Self = this.set("urlChain", value.asInstanceOf[js.Any])
    @scala.inline
    def setETag(value: String): Self = this.set("eTag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteETag: Self = this.set("eTag", js.undefined)
    @scala.inline
    def setLastModified(value: String): Self = this.set("lastModified", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastModified: Self = this.set("lastModified", js.undefined)
    @scala.inline
    def setMimeType(value: String): Self = this.set("mimeType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMimeType: Self = this.set("mimeType", js.undefined)
    @scala.inline
    def setStartTime(value: Double): Self = this.set("startTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartTime: Self = this.set("startTime", js.undefined)
  }
  
}

