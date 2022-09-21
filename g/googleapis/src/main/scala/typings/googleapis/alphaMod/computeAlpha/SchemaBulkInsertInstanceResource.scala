package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBulkInsertInstanceResource extends StObject {
  
  /**
    * The maximum number of instances to create.
    */
  var count: js.UndefOr[String | Null] = js.undefined
  
  /**
    * DEPRECATED: Please use instance_properties instead.
    */
  var instance: js.UndefOr[SchemaInstance] = js.undefined
  
  /**
    * The instance properties defining the VM instances to be created. Required if sourceInstanceTemplate is not provided.
    */
  var instanceProperties: js.UndefOr[SchemaInstanceProperties] = js.undefined
  
  /**
    * Policy for chosing target zone. For more information, see Create VMs in bulk .
    */
  var locationPolicy: js.UndefOr[SchemaLocationPolicy] = js.undefined
  
  /**
    * The minimum number of instances to create. If no min_count is specified then count is used as the default value. If min_count instances cannot be created, then no instances will be created and instances already created will be deleted.
    */
  var minCount: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The string pattern used for the names of the VMs. Either name_pattern or per_instance_properties must be set. The pattern must contain one continuous sequence of placeholder hash characters (#) with each character corresponding to one digit of the generated instance name. Example: a name_pattern of inst-#### generates instance names such as inst-0001 and inst-0002. If existing instances in the same project and zone have names that match the name pattern then the generated instance numbers start after the biggest existing number. For example, if there exists an instance with name inst-0050, then instance names generated using the pattern inst-#### begin with inst-0051. The name pattern placeholder #...# can contain up to 18 characters.
    */
  var namePattern: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Per-instance properties to be set on individual instances. Keys of this map specify requested instance names. Can be empty if name_pattern is used.
    */
  var perInstanceProperties: js.UndefOr[StringDictionary[SchemaBulkInsertInstanceResourcePerInstanceProperties] | Null] = js.undefined
  
  /**
    * Specifies the instance template from which to create instances. You may combine sourceInstanceTemplate with instanceProperties to override specific values from an existing instance template. Bulk API follows the semantics of JSON Merge Patch described by RFC 7396. It can be a full or partial URL. For example, the following are all valid URLs to an instance template: - https://www.googleapis.com/compute/v1/projects/project /global/instanceTemplates/instanceTemplate - projects/project/global/instanceTemplates/instanceTemplate - global/instanceTemplates/instanceTemplate This field is optional.
    */
  var sourceInstanceTemplate: js.UndefOr[String | Null] = js.undefined
}
object SchemaBulkInsertInstanceResource {
  
  inline def apply(): SchemaBulkInsertInstanceResource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBulkInsertInstanceResource]
  }
  
  extension [Self <: SchemaBulkInsertInstanceResource](x: Self) {
    
    inline def setCount(value: String): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setCountNull: Self = StObject.set(x, "count", null)
    
    inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    inline def setInstance(value: SchemaInstance): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
    
    inline def setInstanceProperties(value: SchemaInstanceProperties): Self = StObject.set(x, "instanceProperties", value.asInstanceOf[js.Any])
    
    inline def setInstancePropertiesUndefined: Self = StObject.set(x, "instanceProperties", js.undefined)
    
    inline def setInstanceUndefined: Self = StObject.set(x, "instance", js.undefined)
    
    inline def setLocationPolicy(value: SchemaLocationPolicy): Self = StObject.set(x, "locationPolicy", value.asInstanceOf[js.Any])
    
    inline def setLocationPolicyUndefined: Self = StObject.set(x, "locationPolicy", js.undefined)
    
    inline def setMinCount(value: String): Self = StObject.set(x, "minCount", value.asInstanceOf[js.Any])
    
    inline def setMinCountNull: Self = StObject.set(x, "minCount", null)
    
    inline def setMinCountUndefined: Self = StObject.set(x, "minCount", js.undefined)
    
    inline def setNamePattern(value: String): Self = StObject.set(x, "namePattern", value.asInstanceOf[js.Any])
    
    inline def setNamePatternNull: Self = StObject.set(x, "namePattern", null)
    
    inline def setNamePatternUndefined: Self = StObject.set(x, "namePattern", js.undefined)
    
    inline def setPerInstanceProperties(value: StringDictionary[SchemaBulkInsertInstanceResourcePerInstanceProperties]): Self = StObject.set(x, "perInstanceProperties", value.asInstanceOf[js.Any])
    
    inline def setPerInstancePropertiesNull: Self = StObject.set(x, "perInstanceProperties", null)
    
    inline def setPerInstancePropertiesUndefined: Self = StObject.set(x, "perInstanceProperties", js.undefined)
    
    inline def setSourceInstanceTemplate(value: String): Self = StObject.set(x, "sourceInstanceTemplate", value.asInstanceOf[js.Any])
    
    inline def setSourceInstanceTemplateNull: Self = StObject.set(x, "sourceInstanceTemplate", null)
    
    inline def setSourceInstanceTemplateUndefined: Self = StObject.set(x, "sourceInstanceTemplate", js.undefined)
  }
}
