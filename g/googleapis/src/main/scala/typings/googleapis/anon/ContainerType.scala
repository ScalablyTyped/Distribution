package typings.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContainerType extends js.Object {
  var containerType: js.UndefOr[String] = js.native
  var sha1Checksum: js.UndefOr[String] = js.native
  var source: js.UndefOr[String] = js.native
}

object ContainerType {
  @scala.inline
  def apply(): ContainerType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContainerType]
  }
  @scala.inline
  implicit class ContainerTypeOps[Self <: ContainerType] (val x: Self) extends AnyVal {
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
    def setContainerType(value: String): Self = this.set("containerType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainerType: Self = this.set("containerType", js.undefined)
    @scala.inline
    def setSha1Checksum(value: String): Self = this.set("sha1Checksum", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSha1Checksum: Self = this.set("sha1Checksum", js.undefined)
    @scala.inline
    def setSource(value: String): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
  }
  
}

