package typings.electronWinstaller.optionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Metadata extends js.Object {
  var author: js.UndefOr[String | PersonMetadata] = js.native
  var authors: js.UndefOr[String | js.Array[PersonMetadata]] = js.native
  var copyright: js.UndefOr[String] = js.native
  var description: js.UndefOr[String] = js.native
  var iconUrl: js.UndefOr[String] = js.native
  var name: js.UndefOr[String] = js.native
  var owners: js.UndefOr[String | js.Array[PersonMetadata]] = js.native
  var productName: js.UndefOr[String] = js.native
  var version: js.UndefOr[String] = js.native
}

object Metadata {
  @scala.inline
  def apply(): Metadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Metadata]
  }
  @scala.inline
  implicit class MetadataOps[Self <: Metadata] (val x: Self) extends AnyVal {
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
    def setAuthor(value: String | PersonMetadata): Self = this.set("author", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthor: Self = this.set("author", js.undefined)
    @scala.inline
    def setAuthorsVarargs(value: PersonMetadata*): Self = this.set("authors", js.Array(value :_*))
    @scala.inline
    def setAuthors(value: String | js.Array[PersonMetadata]): Self = this.set("authors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthors: Self = this.set("authors", js.undefined)
    @scala.inline
    def setCopyright(value: String): Self = this.set("copyright", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCopyright: Self = this.set("copyright", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setIconUrl(value: String): Self = this.set("iconUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIconUrl: Self = this.set("iconUrl", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setOwnersVarargs(value: PersonMetadata*): Self = this.set("owners", js.Array(value :_*))
    @scala.inline
    def setOwners(value: String | js.Array[PersonMetadata]): Self = this.set("owners", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOwners: Self = this.set("owners", js.undefined)
    @scala.inline
    def setProductName(value: String): Self = this.set("productName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProductName: Self = this.set("productName", js.undefined)
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
  
}

