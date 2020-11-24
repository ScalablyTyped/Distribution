package typings.dingtalkRobotSender.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AtMobiles extends js.Object {
  
  var atMobiles: js.Array[String] = js.native
  
  var isAtAll: Boolean = js.native
}
object AtMobiles {
  
  @scala.inline
  def apply(atMobiles: js.Array[String], isAtAll: Boolean): AtMobiles = {
    val __obj = js.Dynamic.literal(atMobiles = atMobiles.asInstanceOf[js.Any], isAtAll = isAtAll.asInstanceOf[js.Any])
    __obj.asInstanceOf[AtMobiles]
  }
  
  @scala.inline
  implicit class AtMobilesOps[Self <: AtMobiles] (val x: Self) extends AnyVal {
    
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
    def setAtMobilesVarargs(value: String*): Self = this.set("atMobiles", js.Array(value :_*))
    
    @scala.inline
    def setAtMobiles(value: js.Array[String]): Self = this.set("atMobiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsAtAll(value: Boolean): Self = this.set("isAtAll", value.asInstanceOf[js.Any])
  }
}
