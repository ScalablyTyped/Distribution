package typings.easyJsend.Express

import typings.easyJsend.anon.Limit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MakePartialInput extends js.Object {
  
  var model: js.Any = js.native
  
  var opts: Limit = js.native
  
  var result: js.Any = js.native
  
  var search: js.Object = js.native
}
object MakePartialInput {
  
  @scala.inline
  def apply(model: js.Any, opts: Limit, result: js.Any, search: js.Object): MakePartialInput = {
    val __obj = js.Dynamic.literal(model = model.asInstanceOf[js.Any], opts = opts.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any])
    __obj.asInstanceOf[MakePartialInput]
  }
  
  @scala.inline
  implicit class MakePartialInputOps[Self <: MakePartialInput] (val x: Self) extends AnyVal {
    
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
    def setModel(value: js.Any): Self = this.set("model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpts(value: Limit): Self = this.set("opts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResult(value: js.Any): Self = this.set("result", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearch(value: js.Object): Self = this.set("search", value.asInstanceOf[js.Any])
  }
}
