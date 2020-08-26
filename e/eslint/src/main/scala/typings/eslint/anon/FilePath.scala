package typings.eslint.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FilePath extends js.Object {
  var filePath: js.UndefOr[String] = js.native
  var warnIgnored: js.UndefOr[Boolean] = js.native
}

object FilePath {
  @scala.inline
  def apply(): FilePath = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilePath]
  }
  @scala.inline
  implicit class FilePathOps[Self <: FilePath] (val x: Self) extends AnyVal {
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
    def setFilePath(value: String): Self = this.set("filePath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilePath: Self = this.set("filePath", js.undefined)
    @scala.inline
    def setWarnIgnored(value: Boolean): Self = this.set("warnIgnored", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWarnIgnored: Self = this.set("warnIgnored", js.undefined)
  }
  
}

