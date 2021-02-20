package typings.devtoolsProtocol.mod.Protocol.Runtime

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InternalPropertyDescriptor extends StObject {
  
  /**
    * Conventional property name.
    */
  var name: String = js.native
  
  /**
    * The value associated with the property.
    */
  var value: js.UndefOr[RemoteObject] = js.native
}
object InternalPropertyDescriptor {
  
  @scala.inline
  def apply(name: String): InternalPropertyDescriptor = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[InternalPropertyDescriptor]
  }
  
  @scala.inline
  implicit class InternalPropertyDescriptorMutableBuilder[Self <: InternalPropertyDescriptor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: RemoteObject): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
