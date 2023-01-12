package typings.fastJsonStringify.mod

import typings.fastJsonStringify.fastJsonStringifyStrings.`object`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObjectSchema
  extends StObject
     with BaseSchema
     with Schema {
  
  /**
    * Specifies whether additional properties on the object are allowed, and optionally what schema they should
    * adhere to
    * @default false
    */
  var additionalProperties: js.UndefOr[Schema | Boolean] = js.undefined
  
  /**
    * Describe properties that have keys following a given pattern
    */
  var patternProperties: js.UndefOr[ObjectProperties] = js.undefined
  
  /**
    * Describe the properties of the object
    */
  var properties: js.UndefOr[ObjectProperties] = js.undefined
  
  /**
    * The required properties of the object
    */
  var required: js.UndefOr[js.Array[String]] = js.undefined
  
  var `type`: `object`
}
object ObjectSchema {
  
  inline def apply(): ObjectSchema = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("object")
    __obj.asInstanceOf[ObjectSchema]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ObjectSchema] (val x: Self) extends AnyVal {
    
    inline def setAdditionalProperties(value: Schema | Boolean): Self = StObject.set(x, "additionalProperties", value.asInstanceOf[js.Any])
    
    inline def setAdditionalPropertiesUndefined: Self = StObject.set(x, "additionalProperties", js.undefined)
    
    inline def setPatternProperties(value: ObjectProperties): Self = StObject.set(x, "patternProperties", value.asInstanceOf[js.Any])
    
    inline def setPatternPropertiesUndefined: Self = StObject.set(x, "patternProperties", js.undefined)
    
    inline def setProperties(value: ObjectProperties): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    inline def setRequired(value: js.Array[String]): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
    
    inline def setRequiredVarargs(value: String*): Self = StObject.set(x, "required", js.Array(value*))
    
    inline def setType(value: `object`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
