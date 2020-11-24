package typings.fastCsvParse.tokenMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TokenArgs extends js.Object {
  
  var endCursor: Double = js.native
  
  var startCursor: Double = js.native
  
  var token: String = js.native
}
object TokenArgs {
  
  @scala.inline
  def apply(endCursor: Double, startCursor: Double, token: String): TokenArgs = {
    val __obj = js.Dynamic.literal(endCursor = endCursor.asInstanceOf[js.Any], startCursor = startCursor.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
    __obj.asInstanceOf[TokenArgs]
  }
  
  @scala.inline
  implicit class TokenArgsOps[Self <: TokenArgs] (val x: Self) extends AnyVal {
    
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
    def setEndCursor(value: Double): Self = this.set("endCursor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartCursor(value: Double): Self = this.set("startCursor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToken(value: String): Self = this.set("token", value.asInstanceOf[js.Any])
  }
}
