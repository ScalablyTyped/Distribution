package typings.dexie.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PrimaryKey[TKey] extends js.Object {
  
  var key: js.Any = js.native
  
  var primaryKey: TKey = js.native
}
object PrimaryKey {
  
  @scala.inline
  def apply[TKey](key: js.Any, primaryKey: TKey): PrimaryKey[TKey] = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], primaryKey = primaryKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrimaryKey[TKey]]
  }
  
  @scala.inline
  implicit class PrimaryKeyOps[Self <: PrimaryKey[_], TKey] (val x: Self with PrimaryKey[TKey]) extends AnyVal {
    
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
    def setKey(value: js.Any): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrimaryKey(value: TKey): Self = this.set("primaryKey", value.asInstanceOf[js.Any])
  }
}
