package typings.devtoolsProtocol.mod.Protocol.IndexedDB

import typings.devtoolsProtocol.devtoolsProtocolStrings.`null`
import typings.devtoolsProtocol.devtoolsProtocolStrings.array
import typings.devtoolsProtocol.devtoolsProtocolStrings.string
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyPath extends StObject {
  
  /**
    * Array value.
    */
  var array: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * String value.
    */
  var string: js.UndefOr[String] = js.undefined
  
  /**
    * Key path type. (KeyPathType enum)
    */
  var `type`: `null` | string | array
}
object KeyPath {
  
  inline def apply(`type`: `null` | string | array): KeyPath = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyPath]
  }
  
  extension [Self <: KeyPath](x: Self) {
    
    inline def setArray(value: js.Array[String]): Self = StObject.set(x, "array", value.asInstanceOf[js.Any])
    
    inline def setArrayUndefined: Self = StObject.set(x, "array", js.undefined)
    
    inline def setArrayVarargs(value: String*): Self = StObject.set(x, "array", js.Array(value :_*))
    
    inline def setString(value: String): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
    
    inline def setStringUndefined: Self = StObject.set(x, "string", js.undefined)
    
    inline def setType(value: `null` | string | array): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
