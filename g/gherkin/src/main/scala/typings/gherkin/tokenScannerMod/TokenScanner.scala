package typings.gherkin.tokenScannerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TokenScanner extends js.Object {
  
  var lineNumber: js.Any = js.native
  
  var lines: js.Any = js.native
  
  def read(): typings.gherkin.tokenMod.default = js.native
}
object TokenScanner {
  
  @scala.inline
  def apply(lineNumber: js.Any, lines: js.Any, read: () => typings.gherkin.tokenMod.default): TokenScanner = {
    val __obj = js.Dynamic.literal(lineNumber = lineNumber.asInstanceOf[js.Any], lines = lines.asInstanceOf[js.Any], read = js.Any.fromFunction0(read))
    __obj.asInstanceOf[TokenScanner]
  }
  
  @scala.inline
  implicit class TokenScannerOps[Self <: TokenScanner] (val x: Self) extends AnyVal {
    
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
    def setLineNumber(value: js.Any): Self = this.set("lineNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLines(value: js.Any): Self = this.set("lines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRead(value: () => typings.gherkin.tokenMod.default): Self = this.set("read", js.Any.fromFunction0(value))
  }
}
