package typings.gaeaModel.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UniqueKey extends js.Object {
  
  // 唯一 key，用来实例化组件
  var uniqueKey: String = js.native
}
object UniqueKey {
  
  @scala.inline
  def apply(uniqueKey: String): UniqueKey = {
    val __obj = js.Dynamic.literal(uniqueKey = uniqueKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[UniqueKey]
  }
  
  @scala.inline
  implicit class UniqueKeyOps[Self <: UniqueKey] (val x: Self) extends AnyVal {
    
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
    def setUniqueKey(value: String): Self = this.set("uniqueKey", value.asInstanceOf[js.Any])
  }
}
