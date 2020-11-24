package typings.googleapisCommon.schemaMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaItem extends js.Object {
  
  @JSName("$ref")
  var $ref: js.UndefOr[String] = js.native
  
  var additionalProperties: js.UndefOr[StringDictionary[SchemaItem]] = js.native
  
  var default: js.UndefOr[String] = js.native
  
  var description: js.UndefOr[String] = js.native
  
  var format: js.UndefOr[ParameterFormat] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var items: js.UndefOr[StringDictionary[SchemaItem]] = js.native
  
  var properties: js.UndefOr[StringDictionary[SchemaItem]] = js.native
  
  var `type`: js.UndefOr[SchemaType] = js.native
}
object SchemaItem {
  
  @scala.inline
  def apply(): SchemaItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaItem]
  }
  
  @scala.inline
  implicit class SchemaItemOps[Self <: SchemaItem] (val x: Self) extends AnyVal {
    
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
    def set$ref(value: String): Self = this.set("$ref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$ref: Self = this.set("$ref", js.undefined)
    
    @scala.inline
    def setAdditionalProperties(value: StringDictionary[SchemaItem]): Self = this.set("additionalProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdditionalProperties: Self = this.set("additionalProperties", js.undefined)
    
    @scala.inline
    def setDefault(value: String): Self = this.set("default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefault: Self = this.set("default", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setFormat(value: ParameterFormat): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setItems(value: StringDictionary[SchemaItem]): Self = this.set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    
    @scala.inline
    def setProperties(value: StringDictionary[SchemaItem]): Self = this.set("properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProperties: Self = this.set("properties", js.undefined)
    
    @scala.inline
    def setType(value: SchemaType): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
