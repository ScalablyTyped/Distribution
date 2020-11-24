package typings.easyXHeaders.readlineMod

import typings.easyXHeaders.NodeJS.ReadableStream
import typings.easyXHeaders.NodeJS.WritableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReadLineOptions extends js.Object {
  
  var completer: js.UndefOr[js.Function] = js.native
  
  var input: ReadableStream = js.native
  
  var output: WritableStream = js.native
  
  var terminal: js.UndefOr[Boolean] = js.native
}
object ReadLineOptions {
  
  @scala.inline
  def apply(input: ReadableStream, output: WritableStream): ReadLineOptions = {
    val __obj = js.Dynamic.literal(input = input.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadLineOptions]
  }
  
  @scala.inline
  implicit class ReadLineOptionsOps[Self <: ReadLineOptions] (val x: Self) extends AnyVal {
    
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
    def setInput(value: ReadableStream): Self = this.set("input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutput(value: WritableStream): Self = this.set("output", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompleter(value: js.Function): Self = this.set("completer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompleter: Self = this.set("completer", js.undefined)
    
    @scala.inline
    def setTerminal(value: Boolean): Self = this.set("terminal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTerminal: Self = this.set("terminal", js.undefined)
  }
}
