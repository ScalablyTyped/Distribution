package typings.forkTsCheckerWebpackPlugin.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Compiler extends js.Object {
  var compiler: js.UndefOr[String] = js.native
  var enabled: js.UndefOr[Boolean] = js.native
}

object Compiler {
  @scala.inline
  def apply(): Compiler = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Compiler]
  }
  @scala.inline
  implicit class CompilerOps[Self <: Compiler] (val x: Self) extends AnyVal {
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
    def setCompiler(value: String): Self = this.set("compiler", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompiler: Self = this.set("compiler", js.undefined)
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
  }
  
}

