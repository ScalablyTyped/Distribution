package typings.googleapis.appengineV1betaMod.appengineV1beta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Single source file that is part of the version to be deployed. Each source
  * file that is deployed must be specified separately.
  */
@js.native
trait SchemaFileInfo extends js.Object {
  /**
    * The MIME type of the file.Defaults to the value from Google Cloud
    * Storage.
    */
  var mimeType: js.UndefOr[String] = js.native
  /**
    * The SHA1 hash of the file, in hex.
    */
  var sha1Sum: js.UndefOr[String] = js.native
  /**
    * URL source to use to fetch this file. Must be a URL to a resource in
    * Google Cloud Storage in the form
    * &#39;http(s)://storage.googleapis.com/&lt;bucket&gt;/&lt;object&gt;&#39;.
    */
  var sourceUrl: js.UndefOr[String] = js.native
}

object SchemaFileInfo {
  @scala.inline
  def apply(): SchemaFileInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFileInfo]
  }
  @scala.inline
  implicit class SchemaFileInfoOps[Self <: SchemaFileInfo] (val x: Self) extends AnyVal {
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
    def setMimeType(value: String): Self = this.set("mimeType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMimeType: Self = this.set("mimeType", js.undefined)
    @scala.inline
    def setSha1Sum(value: String): Self = this.set("sha1Sum", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSha1Sum: Self = this.set("sha1Sum", js.undefined)
    @scala.inline
    def setSourceUrl(value: String): Self = this.set("sourceUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceUrl: Self = this.set("sourceUrl", js.undefined)
  }
  
}

