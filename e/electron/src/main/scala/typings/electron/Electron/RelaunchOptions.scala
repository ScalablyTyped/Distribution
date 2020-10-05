package typings.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RelaunchOptions extends js.Object {
  var args: js.UndefOr[js.Array[String]] = js.native
  var execPath: js.UndefOr[String] = js.native
}

object RelaunchOptions {
  @scala.inline
  def apply(): RelaunchOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RelaunchOptions]
  }
  @scala.inline
  implicit class RelaunchOptionsOps[Self <: RelaunchOptions] (val x: Self) extends AnyVal {
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
    def setArgsVarargs(value: String*): Self = this.set("args", js.Array(value :_*))
    @scala.inline
    def setArgs(value: js.Array[String]): Self = this.set("args", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArgs: Self = this.set("args", js.undefined)
    @scala.inline
    def setExecPath(value: String): Self = this.set("execPath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExecPath: Self = this.set("execPath", js.undefined)
  }
  
}

