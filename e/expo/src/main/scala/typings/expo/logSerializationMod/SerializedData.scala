package typings.expo.logSerializationMod

import typings.expo.remoteLoggingMod.LogData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SerializedData extends js.Object {
  
  var body: js.Array[LogData] = js.native
  
  var includesStack: Boolean = js.native
}
object SerializedData {
  
  @scala.inline
  def apply(body: js.Array[LogData], includesStack: Boolean): SerializedData = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], includesStack = includesStack.asInstanceOf[js.Any])
    __obj.asInstanceOf[SerializedData]
  }
  
  @scala.inline
  implicit class SerializedDataOps[Self <: SerializedData] (val x: Self) extends AnyVal {
    
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
    def setBodyVarargs(value: LogData*): Self = this.set("body", js.Array(value :_*))
    
    @scala.inline
    def setBody(value: js.Array[LogData]): Self = this.set("body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludesStack(value: Boolean): Self = this.set("includesStack", value.asInstanceOf[js.Any])
  }
}
