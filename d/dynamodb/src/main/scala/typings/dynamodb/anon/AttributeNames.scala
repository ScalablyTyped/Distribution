package typings.dynamodb.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AttributeNames extends js.Object {
  
  var attributeNames: js.Any = js.native
  
  var attributeValues: js.Any = js.native
}
object AttributeNames {
  
  @scala.inline
  def apply(attributeNames: js.Any, attributeValues: js.Any): AttributeNames = {
    val __obj = js.Dynamic.literal(attributeNames = attributeNames.asInstanceOf[js.Any], attributeValues = attributeValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttributeNames]
  }
  
  @scala.inline
  implicit class AttributeNamesOps[Self <: AttributeNames] (val x: Self) extends AnyVal {
    
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
    def setAttributeNames(value: js.Any): Self = this.set("attributeNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributeValues(value: js.Any): Self = this.set("attributeValues", value.asInstanceOf[js.Any])
  }
}
