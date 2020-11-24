package typings.devtoolsProtocol.mod.Protocol.IndexedDB

import typings.devtoolsProtocol.devtoolsProtocolStrings.`null`
import typings.devtoolsProtocol.devtoolsProtocolStrings.array
import typings.devtoolsProtocol.devtoolsProtocolStrings.string
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KeyPath extends js.Object {
  
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
  implicit class KeyPathOps[Self <: KeyPath] (val x: Self) extends AnyVal {
    
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
    def setType(value: `null` | string | array): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArrayVarargs(value: String*): Self = this.set("array", js.Array(value :_*))
    
    @scala.inline
    def setArray(value: js.Array[String]): Self = this.set("array", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArray: Self = this.set("array", js.undefined)
    
    @scala.inline
    def setString(value: String): Self = this.set("string", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteString: Self = this.set("string", js.undefined)
  }
}
