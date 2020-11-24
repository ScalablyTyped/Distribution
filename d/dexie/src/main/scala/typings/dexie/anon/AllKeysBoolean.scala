package typings.dexie.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AllKeysBoolean extends js.Object {
  
  var allKeys: Boolean = js.native
}
object AllKeysBoolean {
  
  @scala.inline
  def apply(allKeys: Boolean): AllKeysBoolean = {
    val __obj = js.Dynamic.literal(allKeys = allKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllKeysBoolean]
  }
  
  @scala.inline
  implicit class AllKeysBooleanOps[Self <: AllKeysBoolean] (val x: Self) extends AnyVal {
    
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
    def setAllKeys(value: Boolean): Self = this.set("allKeys", value.asInstanceOf[js.Any])
  }
}
