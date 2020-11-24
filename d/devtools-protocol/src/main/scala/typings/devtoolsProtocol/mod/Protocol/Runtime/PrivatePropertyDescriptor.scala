package typings.devtoolsProtocol.mod.Protocol.Runtime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PrivatePropertyDescriptor extends js.Object {
  
  /**
    * A function which serves as a getter for the private property,
    * or `undefined` if there is no getter (accessor descriptors only).
    */
  var get: js.UndefOr[RemoteObject] = js.native
  
  /**
    * Private property name.
    */
  var name: String = js.native
  
  /**
    * A function which serves as a setter for the private property,
    * or `undefined` if there is no setter (accessor descriptors only).
    */
  var set: js.UndefOr[RemoteObject] = js.native
  
  /**
    * The value associated with the private property.
    */
  var value: js.UndefOr[RemoteObject] = js.native
}
object PrivatePropertyDescriptor {
  
  @scala.inline
  def apply(name: String): PrivatePropertyDescriptor = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrivatePropertyDescriptor]
  }
  
  @scala.inline
  implicit class PrivatePropertyDescriptorOps[Self <: PrivatePropertyDescriptor] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGet(value: RemoteObject): Self = this.set("get", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGet: Self = this.set("get", js.undefined)
    
    @scala.inline
    def setSet(value: RemoteObject): Self = this.set("set", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSet: Self = this.set("set", js.undefined)
    
    @scala.inline
    def setValue(value: RemoteObject): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
