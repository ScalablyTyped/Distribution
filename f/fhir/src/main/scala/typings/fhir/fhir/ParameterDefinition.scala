package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Definition of a parameter to a module
  */
trait ParameterDefinition
  extends StObject
     with Element {
  
  /**
    * Contains extended information for property 'documentation'.
    */
  var _documentation: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'max'.
    */
  var _max: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'min'.
    */
  var _min: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'name'.
    */
  var _name: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'type'.
    */
  var _type: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'use'.
    */
  var _use: js.UndefOr[Element] = js.undefined
  
  /**
    * A brief description of the parameter
    */
  var documentation: js.UndefOr[String] = js.undefined
  
  /**
    * Maximum cardinality (a number of *)
    */
  var max: js.UndefOr[String] = js.undefined
  
  /**
    * Minimum cardinality
    */
  var min: js.UndefOr[integer] = js.undefined
  
  /**
    * Name used to access the parameter value
    */
  var name: js.UndefOr[code] = js.undefined
  
  /**
    * What profile the value is expected to be
    */
  var profile: js.UndefOr[Reference] = js.undefined
  
  /**
    * What type of value
    */
  var `type`: code
  
  /**
    * in | out
    */
  var use: code
}
object ParameterDefinition {
  
  inline def apply(`type`: code, use: code): ParameterDefinition = {
    val __obj = js.Dynamic.literal(use = use.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParameterDefinition]
  }
  
  extension [Self <: ParameterDefinition](x: Self) {
    
    inline def setDocumentation(value: String): Self = StObject.set(x, "documentation", value.asInstanceOf[js.Any])
    
    inline def setDocumentationUndefined: Self = StObject.set(x, "documentation", js.undefined)
    
    inline def setMax(value: String): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMin(value: integer): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    inline def setName(value: code): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setProfile(value: Reference): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
    
    inline def setProfileUndefined: Self = StObject.set(x, "profile", js.undefined)
    
    inline def setType(value: code): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUse(value: code): Self = StObject.set(x, "use", value.asInstanceOf[js.Any])
    
    inline def set_documentation(value: Element): Self = StObject.set(x, "_documentation", value.asInstanceOf[js.Any])
    
    inline def set_documentationUndefined: Self = StObject.set(x, "_documentation", js.undefined)
    
    inline def set_max(value: Element): Self = StObject.set(x, "_max", value.asInstanceOf[js.Any])
    
    inline def set_maxUndefined: Self = StObject.set(x, "_max", js.undefined)
    
    inline def set_min(value: Element): Self = StObject.set(x, "_min", value.asInstanceOf[js.Any])
    
    inline def set_minUndefined: Self = StObject.set(x, "_min", js.undefined)
    
    inline def set_name(value: Element): Self = StObject.set(x, "_name", value.asInstanceOf[js.Any])
    
    inline def set_nameUndefined: Self = StObject.set(x, "_name", js.undefined)
    
    inline def set_type(value: Element): Self = StObject.set(x, "_type", value.asInstanceOf[js.Any])
    
    inline def set_typeUndefined: Self = StObject.set(x, "_type", js.undefined)
    
    inline def set_use(value: Element): Self = StObject.set(x, "_use", value.asInstanceOf[js.Any])
    
    inline def set_useUndefined: Self = StObject.set(x, "_use", js.undefined)
  }
}
