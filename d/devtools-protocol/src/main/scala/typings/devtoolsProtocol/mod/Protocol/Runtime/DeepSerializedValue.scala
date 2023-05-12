package typings.devtoolsProtocol.mod.Protocol.Runtime

import typings.devtoolsProtocol.devtoolsProtocolStrings.`null`
import typings.devtoolsProtocol.devtoolsProtocolStrings.`object`
import typings.devtoolsProtocol.devtoolsProtocolStrings.array
import typings.devtoolsProtocol.devtoolsProtocolStrings.arraybuffer
import typings.devtoolsProtocol.devtoolsProtocolStrings.bigint
import typings.devtoolsProtocol.devtoolsProtocolStrings.boolean
import typings.devtoolsProtocol.devtoolsProtocolStrings.date
import typings.devtoolsProtocol.devtoolsProtocolStrings.error
import typings.devtoolsProtocol.devtoolsProtocolStrings.function
import typings.devtoolsProtocol.devtoolsProtocolStrings.map
import typings.devtoolsProtocol.devtoolsProtocolStrings.node
import typings.devtoolsProtocol.devtoolsProtocolStrings.number
import typings.devtoolsProtocol.devtoolsProtocolStrings.promise
import typings.devtoolsProtocol.devtoolsProtocolStrings.proxy_
import typings.devtoolsProtocol.devtoolsProtocolStrings.regexp
import typings.devtoolsProtocol.devtoolsProtocolStrings.set
import typings.devtoolsProtocol.devtoolsProtocolStrings.string
import typings.devtoolsProtocol.devtoolsProtocolStrings.symbol
import typings.devtoolsProtocol.devtoolsProtocolStrings.typedarray
import typings.devtoolsProtocol.devtoolsProtocolStrings.undefined
import typings.devtoolsProtocol.devtoolsProtocolStrings.weakmap
import typings.devtoolsProtocol.devtoolsProtocolStrings.weakset
import typings.devtoolsProtocol.devtoolsProtocolStrings.window
import typings.devtoolsProtocol.mod.Protocol.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeepSerializedValue extends StObject {
  
  var objectId: js.UndefOr[String] = js.undefined
  
  /**
    *  (DeepSerializedValueType enum)
    */
  var `type`: undefined | `null` | string | number | boolean | bigint | regexp | date | symbol | array | `object` | function | map | set | weakmap | weakset | error | proxy_ | promise | typedarray | arraybuffer | node | window
  
  var value: js.UndefOr[Any] = js.undefined
  
  /**
    * Set if value reference met more then once during serialization. In such
    * case, value is provided only to one of the serialized values. Unique
    * per value in the scope of one CDP call.
    */
  var weakLocalObjectReference: js.UndefOr[integer] = js.undefined
}
object DeepSerializedValue {
  
  inline def apply(
    `type`: undefined | `null` | string | number | boolean | bigint | regexp | date | symbol | array | `object` | function | map | set | weakmap | weakset | error | proxy_ | promise | typedarray | arraybuffer | node | window
  ): DeepSerializedValue = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeepSerializedValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeepSerializedValue] (val x: Self) extends AnyVal {
    
    inline def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
    
    inline def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
    
    inline def setType(
      value: undefined | `null` | string | number | boolean | bigint | regexp | date | symbol | array | `object` | function | map | set | weakmap | weakset | error | proxy_ | promise | typedarray | arraybuffer | node | window
    ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    inline def setWeakLocalObjectReference(value: integer): Self = StObject.set(x, "weakLocalObjectReference", value.asInstanceOf[js.Any])
    
    inline def setWeakLocalObjectReferenceUndefined: Self = StObject.set(x, "weakLocalObjectReference", js.undefined)
  }
}
