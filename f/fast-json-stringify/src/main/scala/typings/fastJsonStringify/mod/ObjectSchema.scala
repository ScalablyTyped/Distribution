package typings.fastJsonStringify.mod

import typings.fastJsonStringify.fastJsonStringifyStrings.`object`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ObjectSchema
  extends BaseSchema
     with Schema {
  
  /**
    * Specifies whether additional properties on the object are allowed, and optionally what schema they should
    * adhere to
    * @default false
    */
  var additionalProperties: js.UndefOr[Schema | Boolean] = js.native
  
  /**
    * Describe properties that have keys following a given pattern
    */
  var patternProperties: js.UndefOr[ObjectProperties] = js.native
  
  /**
    * Describe the properties of the object
    */
  var properties: js.UndefOr[ObjectProperties] = js.native
  
  /**
    * The required properties of the object
    */
  var required: js.UndefOr[js.Array[String]] = js.native
  
  var `type`: `object` = js.native
}
object ObjectSchema {
  
  @scala.inline
  def apply(`type`: `object`): ObjectSchema = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectSchema]
  }
  
  @scala.inline
  implicit class ObjectSchemaOps[Self <: ObjectSchema] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setType(value: `object`): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdditionalProperties(value: Schema | Boolean): Self = this.set("additionalProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdditionalProperties: Self = this.set("additionalProperties", js.undefined)
    
    @scala.inline
    def setPatternProperties(value: ObjectProperties): Self = this.set("patternProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePatternProperties: Self = this.set("patternProperties", js.undefined)
    
    @scala.inline
    def setProperties(value: ObjectProperties): Self = this.set("properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProperties: Self = this.set("properties", js.undefined)
    
    @scala.inline
    def setRequiredVarargs(value: String*): Self = this.set("required", js.Array(value :_*))
    
    @scala.inline
    def setRequired(value: js.Array[String]): Self = this.set("required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequired: Self = this.set("required", js.undefined)
  }
}
