package typings.dynogels.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StreamEnabled extends js.Object {
  
  var streamEnabled: Boolean = js.native
  
  var streamViewType: String = js.native
}
object StreamEnabled {
  
  @scala.inline
  def apply(streamEnabled: Boolean, streamViewType: String): StreamEnabled = {
    val __obj = js.Dynamic.literal(streamEnabled = streamEnabled.asInstanceOf[js.Any], streamViewType = streamViewType.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreamEnabled]
  }
  
  @scala.inline
  implicit class StreamEnabledOps[Self <: StreamEnabled] (val x: Self) extends AnyVal {
    
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
    def setStreamEnabled(value: Boolean): Self = this.set("streamEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreamViewType(value: String): Self = this.set("streamViewType", value.asInstanceOf[js.Any])
  }
}
