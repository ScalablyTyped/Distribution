package typings.fastJsonStringify.mod

import typings.fastJsonStringify.fastJsonStringifyStrings.`null`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NullSchema
  extends BaseSchema
     with Schema {
  
  var `type`: `null` = js.native
}
object NullSchema {
  
  @scala.inline
  def apply(`type`: `null`): NullSchema = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NullSchema]
  }
  
  @scala.inline
  implicit class NullSchemaOps[Self <: NullSchema] (val x: Self) extends AnyVal {
    
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
    def setType(value: `null`): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
