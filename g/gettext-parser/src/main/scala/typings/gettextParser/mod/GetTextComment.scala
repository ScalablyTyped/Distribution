package typings.gettextParser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetTextComment extends js.Object {
  
  var extracted: String = js.native
  
  var flag: String = js.native
  
  var previous: String = js.native
  
  var reference: String = js.native
  
  var translator: String = js.native
}
object GetTextComment {
  
  @scala.inline
  def apply(extracted: String, flag: String, previous: String, reference: String, translator: String): GetTextComment = {
    val __obj = js.Dynamic.literal(extracted = extracted.asInstanceOf[js.Any], flag = flag.asInstanceOf[js.Any], previous = previous.asInstanceOf[js.Any], reference = reference.asInstanceOf[js.Any], translator = translator.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTextComment]
  }
  
  @scala.inline
  implicit class GetTextCommentOps[Self <: GetTextComment] (val x: Self) extends AnyVal {
    
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
    def setExtracted(value: String): Self = this.set("extracted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlag(value: String): Self = this.set("flag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrevious(value: String): Self = this.set("previous", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReference(value: String): Self = this.set("reference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTranslator(value: String): Self = this.set("translator", value.asInstanceOf[js.Any])
  }
}
