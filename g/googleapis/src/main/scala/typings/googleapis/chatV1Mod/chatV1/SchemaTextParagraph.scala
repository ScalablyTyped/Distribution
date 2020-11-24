package typings.googleapis.chatV1Mod.chatV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A paragraph of text. Formatted text supported.
  */
@js.native
trait SchemaTextParagraph extends js.Object {
  
  var text: js.UndefOr[String] = js.native
}
object SchemaTextParagraph {
  
  @scala.inline
  def apply(): SchemaTextParagraph = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTextParagraph]
  }
  
  @scala.inline
  implicit class SchemaTextParagraphOps[Self <: SchemaTextParagraph] (val x: Self) extends AnyVal {
    
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
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
  }
}
