package typings.docxTemplates.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Ctx extends js.Object {
  var ctx: js.Object = js.native
  var sandbox: js.Object = js.native
}

object Ctx {
  @scala.inline
  def apply(ctx: js.Object, sandbox: js.Object): Ctx = {
    val __obj = js.Dynamic.literal(ctx = ctx.asInstanceOf[js.Any], sandbox = sandbox.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ctx]
  }
  @scala.inline
  implicit class CtxOps[Self <: Ctx] (val x: Self) extends AnyVal {
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
    def setCtx(value: js.Object): Self = this.set("ctx", value.asInstanceOf[js.Any])
    @scala.inline
    def setSandbox(value: js.Object): Self = this.set("sandbox", value.asInstanceOf[js.Any])
  }
  
}

