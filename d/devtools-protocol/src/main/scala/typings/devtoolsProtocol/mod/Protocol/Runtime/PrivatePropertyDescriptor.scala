package typings.devtoolsProtocol.mod.Protocol.Runtime

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PrivatePropertyDescriptor extends StObject {
  
  /**
    * A function which serves as a getter for the private property,
    * or `undefined` if there is no getter (accessor descriptors only).
    */
  var get: js.UndefOr[RemoteObject] = js.undefined
  
  /**
    * Private property name.
    */
  var name: String
  
  /**
    * A function which serves as a setter for the private property,
    * or `undefined` if there is no setter (accessor descriptors only).
    */
  var set: js.UndefOr[RemoteObject] = js.undefined
  
  /**
    * The value associated with the private property.
    */
  var value: js.UndefOr[RemoteObject] = js.undefined
}
object PrivatePropertyDescriptor {
  
  inline def apply(name: String): PrivatePropertyDescriptor = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrivatePropertyDescriptor]
  }
  
  extension [Self <: PrivatePropertyDescriptor](x: Self) {
    
    inline def setGet(value: RemoteObject): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setGetUndefined: Self = StObject.set(x, "get", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSet(value: RemoteObject): Self = StObject.set(x, "set", value.asInstanceOf[js.Any])
    
    inline def setSetUndefined: Self = StObject.set(x, "set", js.undefined)
    
    inline def setValue(value: RemoteObject): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
