package typings.fabric.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PropertySet extends js.Object {
  
  var propertySet: js.UndefOr[String] = js.native
  
  var stateProperties: js.UndefOr[js.Array[_]] = js.native
}
object PropertySet {
  
  @scala.inline
  def apply(): PropertySet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PropertySet]
  }
  
  @scala.inline
  implicit class PropertySetOps[Self <: PropertySet] (val x: Self) extends AnyVal {
    
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
    def setPropertySet(value: String): Self = this.set("propertySet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePropertySet: Self = this.set("propertySet", js.undefined)
    
    @scala.inline
    def setStatePropertiesVarargs(value: js.Any*): Self = this.set("stateProperties", js.Array(value :_*))
    
    @scala.inline
    def setStateProperties(value: js.Array[_]): Self = this.set("stateProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStateProperties: Self = this.set("stateProperties", js.undefined)
  }
}
