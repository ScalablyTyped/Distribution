package typings.devtoolsProtocol.mod.Protocol.IndexedDB

import typings.devtoolsProtocol.devtoolsProtocolStrings.`null`
import typings.devtoolsProtocol.devtoolsProtocolStrings.array
import typings.devtoolsProtocol.devtoolsProtocolStrings.string
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KeyPath extends StObject {
  
  /**
    * Array value.
    */
  var array: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * String value.
    */
  var string: js.UndefOr[String] = js.native
  
  /**
    * Key path type. (KeyPathType enum)
    */
  var `type`: `null` | string | array = js.native
}
object KeyPath {
  
  @scala.inline
  def apply(`type`: `null` | string | array): KeyPath = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyPath]
  }
  
  @scala.inline
  implicit class KeyPathMutableBuilder[Self <: KeyPath] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArray(value: js.Array[String]): Self = StObject.set(x, "array", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArrayUndefined: Self = StObject.set(x, "array", js.undefined)
    
    @scala.inline
    def setArrayVarargs(value: String*): Self = StObject.set(x, "array", js.Array(value :_*))
    
    @scala.inline
    def setString(value: String): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStringUndefined: Self = StObject.set(x, "string", js.undefined)
    
    @scala.inline
    def setType(value: `null` | string | array): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
