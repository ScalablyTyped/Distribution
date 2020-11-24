package typings.djv.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Resolved extends js.Object {
  
  def fn(args: js.Any*): js.Any = js.native
  
  var schema: js.Object = js.native
}
object Resolved {
  
  @scala.inline
  def apply(fn: /* repeated */ js.Any => js.Any, schema: js.Object): Resolved = {
    val __obj = js.Dynamic.literal(fn = js.Any.fromFunction1(fn), schema = schema.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resolved]
  }
  
  @scala.inline
  implicit class ResolvedOps[Self <: Resolved] (val x: Self) extends AnyVal {
    
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
    def setFn(value: /* repeated */ js.Any => js.Any): Self = this.set("fn", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSchema(value: js.Object): Self = this.set("schema", value.asInstanceOf[js.Any])
  }
}
