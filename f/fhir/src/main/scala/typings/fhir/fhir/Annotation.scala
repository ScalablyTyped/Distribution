package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
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
  implicit class AnnotationMutableBuilder[Self <: Annotation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthorReference(value: Reference): Self = StObject.set(x, "authorReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthorReferenceUndefined: Self = StObject.set(x, "authorReference", js.undefined)
    
    @scala.inline
    def setAuthorString(value: String): Self = StObject.set(x, "authorString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthorStringUndefined: Self = StObject.set(x, "authorString", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTime(value: dateTime): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
    
    @scala.inline
    def set_authorString(value: Element): Self = StObject.set(x, "_authorString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_authorStringUndefined: Self = StObject.set(x, "_authorString", js.undefined)
    
    @scala.inline
    def set_text(value: Element): Self = StObject.set(x, "_text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_textUndefined: Self = StObject.set(x, "_text", js.undefined)
    
    @scala.inline
    def set_time(value: Element): Self = StObject.set(x, "_time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_timeUndefined: Self = StObject.set(x, "_time", js.undefined)
  }
}
