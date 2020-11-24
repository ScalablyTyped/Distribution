package typings.devexpressUtils.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Result[TOptions] extends js.Object {
  
  var result: TOptions = js.native
  
  var set: js.Any = js.native
}
object Result {
  
  @scala.inline
  def apply[TOptions](result: TOptions, set: js.Any): Result[TOptions] = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any], set = set.asInstanceOf[js.Any])
    __obj.asInstanceOf[Result[TOptions]]
  }
  
  @scala.inline
  implicit class ResultOps[Self <: Result[_], TOptions] (val x: Self with Result[TOptions]) extends AnyVal {
    
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
    def setResult(value: TOptions): Self = this.set("result", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSet(value: js.Any): Self = this.set("set", value.asInstanceOf[js.Any])
  }
}
