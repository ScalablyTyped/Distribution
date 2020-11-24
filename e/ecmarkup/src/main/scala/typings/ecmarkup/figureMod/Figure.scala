package typings.ecmarkup.figureMod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Builder * / any */ @js.native
trait Figure extends js.Object {
  
  var caption: String = js.native
  
  var captionElem: HTMLElement | Null = js.native
  
  var id: String | Null = js.native
  
  var isInformative: Boolean = js.native
  
  var number: Double = js.native
  
  var `type`: String = js.native
}
object Figure {
  
  @scala.inline
  def apply(caption: String, isInformative: Boolean, number: Double, `type`: String): Figure = {
    val __obj = js.Dynamic.literal(caption = caption.asInstanceOf[js.Any], isInformative = isInformative.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Figure]
  }
  
  @scala.inline
  implicit class FigureOps[Self <: Figure] (val x: Self) extends AnyVal {
    
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
    def setCaption(value: String): Self = this.set("caption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsInformative(value: Boolean): Self = this.set("isInformative", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumber(value: Double): Self = this.set("number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaptionElem(value: HTMLElement): Self = this.set("captionElem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaptionElemNull: Self = this.set("captionElem", null)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdNull: Self = this.set("id", null)
  }
}
