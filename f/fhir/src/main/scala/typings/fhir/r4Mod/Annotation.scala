package typings.fhir.r4Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Annotation
  extends StObject
     with Element {
  
  var _authorString: js.UndefOr[Element] = js.undefined
  
  var _text: js.UndefOr[Element] = js.undefined
  
  var _time: js.UndefOr[Element] = js.undefined
  
  /**
    * Organization is used when there's no need for specific attribution as to who made the comment.
    */
  var authorReference: js.UndefOr[Reference] = js.undefined
  
  /**
    * Organization is used when there's no need for specific attribution as to who made the comment.
    */
  var authorString: js.UndefOr[String] = js.undefined
  
  /**
    * The text of the annotation in markdown format.
    */
  var text: String
  
  /**
    * Indicates when this particular annotation was made.
    */
  var time: js.UndefOr[String] = js.undefined
}
object Annotation {
  
  inline def apply(text: String): Annotation = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Annotation]
  }
  
  extension [Self <: Annotation](x: Self) {
    
    inline def setAuthorReference(value: Reference): Self = StObject.set(x, "authorReference", value.asInstanceOf[js.Any])
    
    inline def setAuthorReferenceUndefined: Self = StObject.set(x, "authorReference", js.undefined)
    
    inline def setAuthorString(value: String): Self = StObject.set(x, "authorString", value.asInstanceOf[js.Any])
    
    inline def setAuthorStringUndefined: Self = StObject.set(x, "authorString", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTime(value: String): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    inline def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
    
    inline def set_authorString(value: Element): Self = StObject.set(x, "_authorString", value.asInstanceOf[js.Any])
    
    inline def set_authorStringUndefined: Self = StObject.set(x, "_authorString", js.undefined)
    
    inline def set_text(value: Element): Self = StObject.set(x, "_text", value.asInstanceOf[js.Any])
    
    inline def set_textUndefined: Self = StObject.set(x, "_text", js.undefined)
    
    inline def set_time(value: Element): Self = StObject.set(x, "_time", value.asInstanceOf[js.Any])
    
    inline def set_timeUndefined: Self = StObject.set(x, "_time", js.undefined)
  }
}
