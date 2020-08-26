package typings.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Resumable extends js.Object {
  var resumable: js.UndefOr[Multipart] = js.native
  var simple: js.UndefOr[Multipart] = js.native
}

object Resumable {
  @scala.inline
  def apply(): Resumable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Resumable]
  }
  @scala.inline
  implicit class ResumableOps[Self <: Resumable] (val x: Self) extends AnyVal {
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
    def setResumable(value: Multipart): Self = this.set("resumable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResumable: Self = this.set("resumable", js.undefined)
    @scala.inline
    def setSimple(value: Multipart): Self = this.set("simple", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSimple: Self = this.set("simple", js.undefined)
  }
  
}

