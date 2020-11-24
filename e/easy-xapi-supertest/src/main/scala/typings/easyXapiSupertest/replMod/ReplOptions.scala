package typings.easyXapiSupertest.replMod

import typings.easyXapiSupertest.NodeJS.ReadableStream
import typings.easyXapiSupertest.NodeJS.WritableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReplOptions extends js.Object {
  
  var eval: js.UndefOr[js.Function] = js.native
  
  var ignoreUndefined: js.UndefOr[Boolean] = js.native
  
  var input: js.UndefOr[ReadableStream] = js.native
  
  var output: js.UndefOr[WritableStream] = js.native
  
  var prompt: js.UndefOr[String] = js.native
  
  var terminal: js.UndefOr[Boolean] = js.native
  
  var useColors: js.UndefOr[Boolean] = js.native
  
  var useGlobal: js.UndefOr[Boolean] = js.native
  
  var writer: js.UndefOr[js.Function] = js.native
}
object ReplOptions {
  
  @scala.inline
  def apply(): ReplOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReplOptions]
  }
  
  @scala.inline
  implicit class ReplOptionsOps[Self <: ReplOptions] (val x: Self) extends AnyVal {
    
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
    def setEval(value: js.Function): Self = this.set("eval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEval: Self = this.set("eval", js.undefined)
    
    @scala.inline
    def setIgnoreUndefined(value: Boolean): Self = this.set("ignoreUndefined", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreUndefined: Self = this.set("ignoreUndefined", js.undefined)
    
    @scala.inline
    def setInput(value: ReadableStream): Self = this.set("input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInput: Self = this.set("input", js.undefined)
    
    @scala.inline
    def setOutput(value: WritableStream): Self = this.set("output", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutput: Self = this.set("output", js.undefined)
    
    @scala.inline
    def setPrompt(value: String): Self = this.set("prompt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrompt: Self = this.set("prompt", js.undefined)
    
    @scala.inline
    def setTerminal(value: Boolean): Self = this.set("terminal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTerminal: Self = this.set("terminal", js.undefined)
    
    @scala.inline
    def setUseColors(value: Boolean): Self = this.set("useColors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseColors: Self = this.set("useColors", js.undefined)
    
    @scala.inline
    def setUseGlobal(value: Boolean): Self = this.set("useGlobal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseGlobal: Self = this.set("useGlobal", js.undefined)
    
    @scala.inline
    def setWriter(value: js.Function): Self = this.set("writer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWriter: Self = this.set("writer", js.undefined)
  }
}
