package typings.devtoolsProtocol.mod.Protocol.Runtime

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InternalPropertyDescriptor extends StObject {
  
  /**
    * Conventional property name.
    */
  var name: String
  
  /**
    * The value associated with the property.
    */
  var value: js.UndefOr[RemoteObject] = js.undefined
}
object InternalPropertyDescriptor {
  
  inline def apply(name: String): InternalPropertyDescriptor = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[InternalPropertyDescriptor]
  }
  
  extension [Self <: InternalPropertyDescriptor](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setValue(value: RemoteObject): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
