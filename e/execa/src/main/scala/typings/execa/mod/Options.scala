package typings.execa.mod

import typings.node.Buffer
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options[EncodingType] extends CommonOptions[EncodingType] {
  
  /**
  		Write some input to the `stdin` of your binary.
  		*/
  val input: js.UndefOr[String | Buffer | Readable] = js.native
}
object Options {
  
  @scala.inline
  def apply[EncodingType](): Options[EncodingType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options[EncodingType]]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options[_], EncodingType] (val x: Self with Options[EncodingType]) extends AnyVal {
    
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
    def setInput(value: String | Buffer | Readable): Self = this.set("input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInput: Self = this.set("input", js.undefined)
  }
}
