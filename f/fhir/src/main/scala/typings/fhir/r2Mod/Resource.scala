package typings.fhir.r2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Resource extends StObject {
  
  var _id: js.UndefOr[Element] = js.undefined
  
  var _implicitRules: js.UndefOr[Element] = js.undefined
  
  var _language: js.UndefOr[Element] = js.undefined
  
  /**
    * The logical id of the resource, as used in the URL for the resource. Once assigned, this value never changes.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * A reference to a set of rules that were followed when the resource was constructed, and which must be understood when processing the content.
    */
  var implicitRules: js.UndefOr[String] = js.undefined
  
  /**
    * The base language in which the resource is written.
    */
  var language: js.UndefOr[String] = js.undefined
  
  /**
    * The metadata about the resource. This is content that is maintained by the infrastructure. Changes to the content may not always be associated with version changes to the resource.
    */
  var meta: js.UndefOr[Meta] = js.undefined
  
  /** Resource Type Name (for serialization) */
  val resourceType: String
}
object Resource {
  
  inline def apply(resourceType: String): Resource = {
    val __obj = js.Dynamic.literal(resourceType = resourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  
  extension [Self <: Resource](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setImplicitRules(value: String): Self = StObject.set(x, "implicitRules", value.asInstanceOf[js.Any])
    
    inline def setImplicitRulesUndefined: Self = StObject.set(x, "implicitRules", js.undefined)
    
    inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    inline def setMeta(value: Meta): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    
    inline def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
    
    inline def setResourceType(value: String): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def set_id(value: Element): Self = StObject.set(x, "_id", value.asInstanceOf[js.Any])
    
    inline def set_idUndefined: Self = StObject.set(x, "_id", js.undefined)
    
    inline def set_implicitRules(value: Element): Self = StObject.set(x, "_implicitRules", value.asInstanceOf[js.Any])
    
    inline def set_implicitRulesUndefined: Self = StObject.set(x, "_implicitRules", js.undefined)
    
    inline def set_language(value: Element): Self = StObject.set(x, "_language", value.asInstanceOf[js.Any])
    
    inline def set_languageUndefined: Self = StObject.set(x, "_language", js.undefined)
  }
}
