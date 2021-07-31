package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Base Resource
  */
trait ResourceBase extends StObject {
  
  /**
    * Contains extended information for property 'id'.
    */
  var _id: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'implicitRules'.
    */
  var _implicitRules: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'language'.
    */
  var _language: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'resourceType'.
    */
  var _resourceType: js.UndefOr[Element] = js.undefined
  
  /**
    * Logical id of this artifact
    */
  var id: js.UndefOr[typings.fhir.fhir.id] = js.undefined
  
  /**
    * A set of rules under which this content was created
    */
  var implicitRules: js.UndefOr[uri] = js.undefined
  
  /**
    * Language of the resource content
    */
  var language: js.UndefOr[code] = js.undefined
  
  /**
    * Metadata about the resource
    */
  var meta: js.UndefOr[Meta] = js.undefined
  
  /**
    * The type of the resource.
    */
  var resourceType: js.UndefOr[code] = js.undefined
}
object ResourceBase {
  
  @scala.inline
  def apply(): ResourceBase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceBase]
  }
  
  @scala.inline
  implicit class ResourceBaseMutableBuilder[Self <: ResourceBase] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: id): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setImplicitRules(value: uri): Self = StObject.set(x, "implicitRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImplicitRulesUndefined: Self = StObject.set(x, "implicitRules", js.undefined)
    
    @scala.inline
    def setLanguage(value: code): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    @scala.inline
    def setMeta(value: Meta): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
    
    @scala.inline
    def setResourceType(value: code): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceTypeUndefined: Self = StObject.set(x, "resourceType", js.undefined)
    
    @scala.inline
    def set_id(value: Element): Self = StObject.set(x, "_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_idUndefined: Self = StObject.set(x, "_id", js.undefined)
    
    @scala.inline
    def set_implicitRules(value: Element): Self = StObject.set(x, "_implicitRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_implicitRulesUndefined: Self = StObject.set(x, "_implicitRules", js.undefined)
    
    @scala.inline
    def set_language(value: Element): Self = StObject.set(x, "_language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_languageUndefined: Self = StObject.set(x, "_language", js.undefined)
    
    @scala.inline
    def set_resourceType(value: Element): Self = StObject.set(x, "_resourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_resourceTypeUndefined: Self = StObject.set(x, "_resourceType", js.undefined)
  }
}
