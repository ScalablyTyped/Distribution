package typings.exprEval.mod

import typings.exprEval.anon.Abs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParserOptions extends js.Object {
  
  var allowMemberAccess: js.UndefOr[Boolean] = js.native
  
  var operators: js.UndefOr[Abs] = js.native
}
object ParserOptions {
  
  @scala.inline
  def apply(): ParserOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParserOptions]
  }
  
  @scala.inline
  implicit class ParserOptionsOps[Self <: ParserOptions] (val x: Self) extends AnyVal {
    
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
    def setAllowMemberAccess(value: Boolean): Self = this.set("allowMemberAccess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowMemberAccess: Self = this.set("allowMemberAccess", js.undefined)
    
    @scala.inline
    def setOperators(value: Abs): Self = this.set("operators", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOperators: Self = this.set("operators", js.undefined)
  }
}
