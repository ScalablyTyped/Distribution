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
  
  inline def apply(): Element = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Element]
  }
  
  extension [Self <: Element](x: Self) {
    
    inline def setExtension(value: js.Array[Extension]): Self = StObject.set(x, "extension", value.asInstanceOf[js.Any])
    
    inline def setExtensionUndefined: Self = StObject.set(x, "extension", js.undefined)
    
    inline def setExtensionVarargs(value: Extension*): Self = StObject.set(x, "extension", js.Array(value :_*))
    
    inline def setFhir_comments(value: js.Array[String]): Self = StObject.set(x, "fhir_comments", value.asInstanceOf[js.Any])
    
    inline def setFhir_commentsUndefined: Self = StObject.set(x, "fhir_comments", js.undefined)
    
    inline def setFhir_commentsVarargs(value: String*): Self = StObject.set(x, "fhir_comments", js.Array(value :_*))
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def set_fhir_comments(value: js.Array[Element]): Self = StObject.set(x, "_fhir_comments", value.asInstanceOf[js.Any])
    
    inline def set_fhir_commentsUndefined: Self = StObject.set(x, "_fhir_comments", js.undefined)
    
    inline def set_fhir_commentsVarargs(value: Element*): Self = StObject.set(x, "_fhir_comments", js.Array(value :_*))
    
    inline def set_id(value: Element): Self = StObject.set(x, "_id", value.asInstanceOf[js.Any])
    
    inline def set_idUndefined: Self = StObject.set(x, "_id", js.undefined)
  }
}
