package typings.externalEditor.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IFileOptions extends js.Object {
  var dir: js.UndefOr[String] = js.native
  var mode: js.UndefOr[Double] = js.native
  var postfix: js.UndefOr[String] = js.native
  var prefix: js.UndefOr[String] = js.native
  var template: js.UndefOr[String] = js.native
}

object IFileOptions {
  @scala.inline
  def apply(): IFileOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IFileOptions]
  }
  @scala.inline
  implicit class IFileOptionsOps[Self <: IFileOptions] (val x: Self) extends AnyVal {
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
    def setDir(value: String): Self = this.set("dir", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDir: Self = this.set("dir", js.undefined)
    @scala.inline
    def setMode(value: Double): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    @scala.inline
    def setPostfix(value: String): Self = this.set("postfix", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePostfix: Self = this.set("postfix", js.undefined)
    @scala.inline
    def setPrefix(value: String): Self = this.set("prefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefix: Self = this.set("prefix", js.undefined)
    @scala.inline
    def setTemplate(value: String): Self = this.set("template", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemplate: Self = this.set("template", js.undefined)
  }
  
}

