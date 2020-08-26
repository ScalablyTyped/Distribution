package typings.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebSource extends js.Object {
  // Docs: http://electronjs.org/docs/api/structures/web-source
  var code: String = js.native
  /**
    * Default is 1.
    */
  var startLine: js.UndefOr[Double] = js.native
  var url: js.UndefOr[String] = js.native
}

object WebSource {
  @scala.inline
  def apply(code: String): WebSource = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebSource]
  }
  @scala.inline
  implicit class WebSourceOps[Self <: WebSource] (val x: Self) extends AnyVal {
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
    def setCode(value: String): Self = this.set("code", value.asInstanceOf[js.Any])
    @scala.inline
    def setStartLine(value: Double): Self = this.set("startLine", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartLine: Self = this.set("startLine", js.undefined)
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
  
}

