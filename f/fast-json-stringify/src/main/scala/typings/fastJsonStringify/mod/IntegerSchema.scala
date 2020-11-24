package typings.fastJsonStringify.mod

import typings.fastJsonStringify.fastJsonStringifyStrings.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IntegerSchema
  extends BaseSchema
     with Schema {
  
  var `type`: integer = js.native
}
object IntegerSchema {
  
  @scala.inline
  def apply(`type`: integer): IntegerSchema = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntegerSchema]
  }
  
  @scala.inline
  implicit class IntegerSchemaOps[Self <: IntegerSchema] (val x: Self) extends AnyVal {
    
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
    def setType(value: integer): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
