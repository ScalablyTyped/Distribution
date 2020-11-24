package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Text node with attribution
  */
@js.native
trait Annotation extends Element {
  
  /**
    * Contains extended information for property 'authorString'.
    */
  var _authorString: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'text'.
    */
  var _text: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'time'.
    */
  var _time: js.UndefOr[Element] = js.native
  
  /**
    * Individual responsible for the annotation
    */
  var authorReference: js.UndefOr[Reference] = js.native
  
  /**
    * Individual responsible for the annotation
    */
  var authorString: js.UndefOr[String] = js.native
  
  /**
    * The annotation  - text content
    */
  var text: String = js.native
  
  /**
    * When the annotation was made
    */
  var time: js.UndefOr[dateTime] = js.native
}
object Annotation {
  
  @scala.inline
  def apply(text: String): Annotation = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Annotation]
  }
  
  @scala.inline
  implicit class AnnotationOps[Self <: Annotation] (val x: Self) extends AnyVal {
    
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
    def set_authorString(value: Element): Self = this.set("_authorString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_authorString: Self = this.set("_authorString", js.undefined)
    
    @scala.inline
    def set_text(value: Element): Self = this.set("_text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_text: Self = this.set("_text", js.undefined)
    
    @scala.inline
    def set_time(value: Element): Self = this.set("_time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_time: Self = this.set("_time", js.undefined)
    
    @scala.inline
    def setAuthorReference(value: Reference): Self = this.set("authorReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthorReference: Self = this.set("authorReference", js.undefined)
    
    @scala.inline
    def setAuthorString(value: String): Self = this.set("authorString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthorString: Self = this.set("authorString", js.undefined)
    
    @scala.inline
    def setTime(value: dateTime): Self = this.set("time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTime: Self = this.set("time", js.undefined)
  }
}
