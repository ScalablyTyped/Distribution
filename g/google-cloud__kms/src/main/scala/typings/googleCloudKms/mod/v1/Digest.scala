package typings.googleCloudKms.mod.v1

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Digest extends js.Object {
  var sha256: js.UndefOr[Buffer] = js.native
  var sha384: js.UndefOr[Buffer] = js.native
  var sha512: js.UndefOr[Buffer] = js.native
}

object Digest {
  @scala.inline
  def apply(): Digest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Digest]
  }
  @scala.inline
  implicit class DigestOps[Self <: Digest] (val x: Self) extends AnyVal {
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
    def setSha256(value: Buffer): Self = this.set("sha256", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSha256: Self = this.set("sha256", js.undefined)
    @scala.inline
    def setSha384(value: Buffer): Self = this.set("sha384", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSha384: Self = this.set("sha384", js.undefined)
    @scala.inline
    def setSha512(value: Buffer): Self = this.set("sha512", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSha512: Self = this.set("sha512", js.undefined)
  }
  
}

