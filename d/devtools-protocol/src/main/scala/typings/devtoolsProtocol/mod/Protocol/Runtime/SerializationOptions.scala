package typings.devtoolsProtocol.mod.Protocol.Runtime

import typings.devtoolsProtocol.devtoolsProtocolStrings.deep
import typings.devtoolsProtocol.devtoolsProtocolStrings.idOnly
import typings.devtoolsProtocol.devtoolsProtocolStrings.json
import typings.devtoolsProtocol.mod.Protocol.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SerializationOptions extends StObject {
  
  /**
    * Deep serialization depth. Default is full depth. Respected only in `deep` serialization mode.
    */
  var maxDepth: js.UndefOr[integer] = js.undefined
  
  /**
    *  (SerializationOptionsSerialization enum)
    */
  var serialization: deep | json | idOnly
}
object SerializationOptions {
  
  inline def apply(serialization: deep | json | idOnly): SerializationOptions = {
    val __obj = js.Dynamic.literal(serialization = serialization.asInstanceOf[js.Any])
    __obj.asInstanceOf[SerializationOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SerializationOptions] (val x: Self) extends AnyVal {
    
    inline def setMaxDepth(value: integer): Self = StObject.set(x, "maxDepth", value.asInstanceOf[js.Any])
    
    inline def setMaxDepthUndefined: Self = StObject.set(x, "maxDepth", js.undefined)
    
    inline def setSerialization(value: deep | json | idOnly): Self = StObject.set(x, "serialization", value.asInstanceOf[js.Any])
  }
}
