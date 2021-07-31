package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Base for all elements
  */
trait Element extends StObject {
  
  /**
    * Contains extended information for property 'fhir_comments'.
    */
  var _fhir_comments: js.UndefOr[js.Array[Element]] = js.undefined
  
  /**
    * Contains extended information for property 'id'.
    */
  var _id: js.UndefOr[Element] = js.undefined
  
  /**
    * Additional Content defined by implementations
    */
  var `extension`: js.UndefOr[js.Array[Extension]] = js.undefined
  
  /**
    * Content that would be comments in an XML.
    */
  var fhir_comments: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * xml:id (or equivalent in JSON)
    */
  var id: js.UndefOr[String] = js.undefined
}
object Element {
  
  @scala.inline
  def apply(): Element = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Element]
  }
  
  @scala.inline
  implicit class ElementMutableBuilder[Self <: Element] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExtension(value: js.Array[Extension]): Self = StObject.set(x, "extension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtensionUndefined: Self = StObject.set(x, "extension", js.undefined)
    
    @scala.inline
    def setExtensionVarargs(value: Extension*): Self = StObject.set(x, "extension", js.Array(value :_*))
    
    @scala.inline
    def setFhir_comments(value: js.Array[String]): Self = StObject.set(x, "fhir_comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFhir_commentsUndefined: Self = StObject.set(x, "fhir_comments", js.undefined)
    
    @scala.inline
    def setFhir_commentsVarargs(value: String*): Self = StObject.set(x, "fhir_comments", js.Array(value :_*))
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def set_fhir_comments(value: js.Array[Element]): Self = StObject.set(x, "_fhir_comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_fhir_commentsUndefined: Self = StObject.set(x, "_fhir_comments", js.undefined)
    
    @scala.inline
    def set_fhir_commentsVarargs(value: Element*): Self = StObject.set(x, "_fhir_comments", js.Array(value :_*))
    
    @scala.inline
    def set_id(value: Element): Self = StObject.set(x, "_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_idUndefined: Self = StObject.set(x, "_id", js.undefined)
  }
}
