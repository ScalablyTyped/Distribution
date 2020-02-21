package typings.docxTemplates.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait runJSOptions extends js.Object {
  var ctx: js.Any
  var sandbox: js.Any
}

object runJSOptions {
  @scala.inline
  def apply(ctx: js.Any, sandbox: js.Any): runJSOptions = {
    val __obj = js.Dynamic.literal(ctx = ctx.asInstanceOf[js.Any], sandbox = sandbox.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[runJSOptions]
  }
}

