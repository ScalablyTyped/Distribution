package typings.egg.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartOptions extends js.Object {
  /** directory of application, default to `process.cwd()` */
  var baseDir: js.UndefOr[String] = js.native
  /** specify framework that can be absolute path or npm package */
  var framework: js.UndefOr[String] = js.native
  /** ignore single process mode warning */
  var ignoreWarning: js.UndefOr[Boolean] = js.native
}

object StartOptions {
  @scala.inline
  def apply(): StartOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartOptions]
  }
  @scala.inline
  implicit class StartOptionsOps[Self <: StartOptions] (val x: Self) extends AnyVal {
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
    def setBaseDir(value: String): Self = this.set("baseDir", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBaseDir: Self = this.set("baseDir", js.undefined)
    @scala.inline
    def setFramework(value: String): Self = this.set("framework", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFramework: Self = this.set("framework", js.undefined)
    @scala.inline
    def setIgnoreWarning(value: Boolean): Self = this.set("ignoreWarning", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnoreWarning: Self = this.set("ignoreWarning", js.undefined)
  }
  
}

