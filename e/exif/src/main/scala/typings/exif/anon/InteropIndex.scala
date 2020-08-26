package typings.exif.anon

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InteropIndex extends js.Object {
  var InteropIndex: js.UndefOr[String] = js.native
  var InteropVersion: js.UndefOr[Buffer] = js.native
}

object InteropIndex {
  @scala.inline
  def apply(): InteropIndex = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InteropIndex]
  }
  @scala.inline
  implicit class InteropIndexOps[Self <: InteropIndex] (val x: Self) extends AnyVal {
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
    def setInteropIndex(value: String): Self = this.set("InteropIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInteropIndex: Self = this.set("InteropIndex", js.undefined)
    @scala.inline
    def setInteropVersion(value: Buffer): Self = this.set("InteropVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInteropVersion: Self = this.set("InteropVersion", js.undefined)
  }
  
}

