package typings.diagnosticChannelPublishers.winstonPubMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IWinstonData extends js.Object {
  
  var level: String = js.native
  
  var levelKind: String = js.native
  
  var message: String | Error = js.native
  
  var meta: js.Any = js.native
}
object IWinstonData {
  
  @scala.inline
  def apply(level: String, levelKind: String, message: String | Error, meta: js.Any): IWinstonData = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any], levelKind = levelKind.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWinstonData]
  }
  
  @scala.inline
  implicit class IWinstonDataOps[Self <: IWinstonData] (val x: Self) extends AnyVal {
    
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
    def setLevel(value: String): Self = this.set("level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevelKind(value: String): Self = this.set("levelKind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: String | Error): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeta(value: js.Any): Self = this.set("meta", value.asInstanceOf[js.Any])
  }
}
