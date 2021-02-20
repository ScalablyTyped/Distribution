package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Parameters for the operation/query
  */
@js.native
trait OperationDefinitionParameter extends BackboneElement {
  
  /**
    * Contains extended information for property 'documentation'.
    */
  var _documentation: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'max'.
    */
  var _max: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'min'.
    */
  var _min: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'name'.
    */
  var _name: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'searchType'.
    */
  var _searchType: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'type'.
    */
  var _type: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'use'.
    */
  var _use: js.UndefOr[Element] = js.native
  
  /**
    * ValueSet details if this is coded
    */
  var binding: js.UndefOr[OperationDefinitionParameterBinding] = js.native
  
  /**
    * Description of meaning/use
    */
  var documentation: js.UndefOr[String] = js.native
  
  /**
    * Maximum Cardinality (a number or *)
    */
  var max: String = js.native
  
  /**
    * Minimum Cardinality
    */
  var min: integer = js.native
  
  /**
    * Name in Parameters.parameter.name or in URL
    */
  var name: code = js.native
  
  /**
    * Parts of a nested Parameter
    */
  var part: js.UndefOr[js.Array[OperationDefinitionParameter]] = js.native
  
  /**
    * Profile on the type
    */
  var profile: js.UndefOr[Reference] = js.native
  
  /**
    * number | date | string | token | reference | composite | quantity | uri
    */
  var searchType: js.UndefOr[code] = js.native
  
  /**
    * What type this parameter has
    */
  var `type`: js.UndefOr[code] = js.native
  
  /**
    * in | out
    */
  var use: code = js.native
}
object OperationDefinitionParameter {
  
  @scala.inline
  def apply(max: String, min: integer, name: code, use: code): OperationDefinitionParameter = {
    val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], use = use.asInstanceOf[js.Any])
    __obj.asInstanceOf[OperationDefinitionParameter]
  }
  
  @scala.inline
  implicit class OperationDefinitionParameterMutableBuilder[Self <: OperationDefinitionParameter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBinding(value: OperationDefinitionParameterBinding): Self = StObject.set(x, "binding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBindingUndefined: Self = StObject.set(x, "binding", js.undefined)
    
    @scala.inline
    def setDocumentation(value: String): Self = StObject.set(x, "documentation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentationUndefined: Self = StObject.set(x, "documentation", js.undefined)
    
    @scala.inline
    def setMax(value: String): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMin(value: integer): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: code): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPart(value: js.Array[OperationDefinitionParameter]): Self = StObject.set(x, "part", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartUndefined: Self = StObject.set(x, "part", js.undefined)
    
    @scala.inline
    def setPartVarargs(value: OperationDefinitionParameter*): Self = StObject.set(x, "part", js.Array(value :_*))
    
    @scala.inline
    def setProfile(value: Reference): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfileUndefined: Self = StObject.set(x, "profile", js.undefined)
    
    @scala.inline
    def setSearchType(value: code): Self = StObject.set(x, "searchType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchTypeUndefined: Self = StObject.set(x, "searchType", js.undefined)
    
    @scala.inline
    def setType(value: code): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setUse(value: code): Self = StObject.set(x, "use", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_documentation(value: Element): Self = StObject.set(x, "_documentation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_documentationUndefined: Self = StObject.set(x, "_documentation", js.undefined)
    
    @scala.inline
    def set_max(value: Element): Self = StObject.set(x, "_max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_maxUndefined: Self = StObject.set(x, "_max", js.undefined)
    
    @scala.inline
    def set_min(value: Element): Self = StObject.set(x, "_min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_minUndefined: Self = StObject.set(x, "_min", js.undefined)
    
    @scala.inline
    def set_name(value: Element): Self = StObject.set(x, "_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_nameUndefined: Self = StObject.set(x, "_name", js.undefined)
    
    @scala.inline
    def set_searchType(value: Element): Self = StObject.set(x, "_searchType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_searchTypeUndefined: Self = StObject.set(x, "_searchType", js.undefined)
    
    @scala.inline
    def set_type(value: Element): Self = StObject.set(x, "_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_typeUndefined: Self = StObject.set(x, "_type", js.undefined)
    
    @scala.inline
    def set_use(value: Element): Self = StObject.set(x, "_use", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_useUndefined: Self = StObject.set(x, "_use", js.undefined)
  }
}
