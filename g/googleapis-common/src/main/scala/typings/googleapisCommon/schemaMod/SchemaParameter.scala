package typings.googleapisCommon.schemaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaParameter extends js.Object {
  
  var default: String = js.native
  
  var description: String = js.native
  
  var enum: js.Array[String] = js.native
  
  var enumDescription: js.Array[String] = js.native
  
  var format: ParameterFormat = js.native
  
  var location: String = js.native
  
  var required: Boolean = js.native
  
  var `type`: SchemaType = js.native
}
object SchemaParameter {
  
  @scala.inline
  def apply(
    default: String,
    description: String,
    enum: js.Array[String],
    enumDescription: js.Array[String],
    format: ParameterFormat,
    location: String,
    required: Boolean,
    `type`: SchemaType
  ): SchemaParameter = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], enum = enum.asInstanceOf[js.Any], enumDescription = enumDescription.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaParameter]
  }
  
  @scala.inline
  implicit class SchemaParameterOps[Self <: SchemaParameter] (val x: Self) extends AnyVal {
    
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
    def setDefault(value: String): Self = this.set("default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnumVarargs(value: String*): Self = this.set("enum", js.Array(value :_*))
    
    @scala.inline
    def setEnum(value: js.Array[String]): Self = this.set("enum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnumDescriptionVarargs(value: String*): Self = this.set("enumDescription", js.Array(value :_*))
    
    @scala.inline
    def setEnumDescription(value: js.Array[String]): Self = this.set("enumDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormat(value: ParameterFormat): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocation(value: String): Self = this.set("location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequired(value: Boolean): Self = this.set("required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: SchemaType): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
