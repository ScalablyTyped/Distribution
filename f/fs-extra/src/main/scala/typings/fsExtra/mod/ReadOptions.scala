package typings.fsExtra.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReadOptions extends js.Object {
  var encoding: js.UndefOr[String] = js.native
  var flag: js.UndefOr[String] = js.native
  var fs: js.UndefOr[js.Object] = js.native
  var reviver: js.UndefOr[js.Any] = js.native
  var throws: js.UndefOr[Boolean] = js.native
}

object ReadOptions {
  @scala.inline
  def apply(): ReadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReadOptions]
  }
  @scala.inline
  implicit class ReadOptionsOps[Self <: ReadOptions] (val x: Self) extends AnyVal {
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
    def setFlag(value: String): Self = this.set("flag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlag: Self = this.set("flag", js.undefined)
    @scala.inline
    def setFs(value: js.Object): Self = this.set("fs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFs: Self = this.set("fs", js.undefined)
    @scala.inline
    def setReviver(value: js.Any): Self = this.set("reviver", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReviver: Self = this.set("reviver", js.undefined)
    @scala.inline
    def setThrows(value: Boolean): Self = this.set("throws", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThrows: Self = this.set("throws", js.undefined)
  }
  
}

