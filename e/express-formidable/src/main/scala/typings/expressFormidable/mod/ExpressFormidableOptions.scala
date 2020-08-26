package typings.expressFormidable.mod

import typings.expressFormidable.expressFormidableStrings.md5
import typings.expressFormidable.expressFormidableStrings.multipart
import typings.expressFormidable.expressFormidableStrings.sha1
import typings.expressFormidable.expressFormidableStrings.urlencoded
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExpressFormidableOptions extends js.Object {
  var encoding: js.UndefOr[String] = js.native
  var hash: js.UndefOr[Boolean | sha1 | md5] = js.native
  var keepExtensions: js.UndefOr[Boolean] = js.native
  var maxFields: js.UndefOr[Double] = js.native
  var maxFieldsSize: js.UndefOr[Double] = js.native
  var maxFileSize: js.UndefOr[Double] = js.native
  var multiples: js.UndefOr[Boolean] = js.native
  var `type`: js.UndefOr[multipart | urlencoded] = js.native
  var uploadDir: js.UndefOr[String] = js.native
}

object ExpressFormidableOptions {
  @scala.inline
  def apply(): ExpressFormidableOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExpressFormidableOptions]
  }
  @scala.inline
  implicit class ExpressFormidableOptionsOps[Self <: ExpressFormidableOptions] (val x: Self) extends AnyVal {
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
    def setEncoding(value: String): Self = this.set("encoding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEncoding: Self = this.set("encoding", js.undefined)
    @scala.inline
    def setHash(value: Boolean | sha1 | md5): Self = this.set("hash", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHash: Self = this.set("hash", js.undefined)
    @scala.inline
    def setKeepExtensions(value: Boolean): Self = this.set("keepExtensions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeepExtensions: Self = this.set("keepExtensions", js.undefined)
    @scala.inline
    def setMaxFields(value: Double): Self = this.set("maxFields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxFields: Self = this.set("maxFields", js.undefined)
    @scala.inline
    def setMaxFieldsSize(value: Double): Self = this.set("maxFieldsSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxFieldsSize: Self = this.set("maxFieldsSize", js.undefined)
    @scala.inline
    def setMaxFileSize(value: Double): Self = this.set("maxFileSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxFileSize: Self = this.set("maxFileSize", js.undefined)
    @scala.inline
    def setMultiples(value: Boolean): Self = this.set("multiples", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMultiples: Self = this.set("multiples", js.undefined)
    @scala.inline
    def setType(value: multipart | urlencoded): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setUploadDir(value: String): Self = this.set("uploadDir", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUploadDir: Self = this.set("uploadDir", js.undefined)
  }
  
}

