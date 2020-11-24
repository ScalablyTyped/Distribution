package typings.ethereumjsBlockchain.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Key extends js.Object {
  
  var key: String = js.native
  
  var keyEncoding: String = js.native
  
  var `type`: String = js.native
  
  var value: js.Any = js.native
  
  var valueEncoding: String = js.native
}
object Key {
  
  @scala.inline
  def apply(key: String, keyEncoding: String, `type`: String, value: js.Any, valueEncoding: String): Key = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], keyEncoding = keyEncoding.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], valueEncoding = valueEncoding.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Key]
  }
  
  @scala.inline
  implicit class KeyOps[Self <: Key] (val x: Self) extends AnyVal {
    
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
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyEncoding(value: String): Self = this.set("keyEncoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: js.Any): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueEncoding(value: String): Self = this.set("valueEncoding", value.asInstanceOf[js.Any])
  }
}
