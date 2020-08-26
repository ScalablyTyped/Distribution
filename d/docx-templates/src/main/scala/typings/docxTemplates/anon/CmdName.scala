package typings.docxTemplates.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CmdName extends js.Object {
  var cmdName: js.UndefOr[String] = js.native
  var cmdRest: String = js.native
}

object CmdName {
  @scala.inline
  def apply(cmdRest: String): CmdName = {
    val __obj = js.Dynamic.literal(cmdRest = cmdRest.asInstanceOf[js.Any])
    __obj.asInstanceOf[CmdName]
  }
  @scala.inline
  implicit class CmdNameOps[Self <: CmdName] (val x: Self) extends AnyVal {
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
    def setCmdRest(value: String): Self = this.set("cmdRest", value.asInstanceOf[js.Any])
    @scala.inline
    def setCmdName(value: String): Self = this.set("cmdName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCmdName: Self = this.set("cmdName", js.undefined)
  }
  
}

