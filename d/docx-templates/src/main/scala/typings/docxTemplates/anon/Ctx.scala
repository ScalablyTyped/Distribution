package typings.docxTemplates.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Ctx extends js.Object {
  var ctx: js.Object
  var sandbox: js.Object
}

object Ctx {
  @scala.inline
  def apply(ctx: js.Object, sandbox: js.Object): Ctx = {
    val __obj = js.Dynamic.literal(ctx = ctx.asInstanceOf[js.Any], sandbox = sandbox.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ctx]
  }
}

