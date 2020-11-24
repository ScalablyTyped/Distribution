package typings.firebaseMessaging

import typings.std.ArrayBuffer
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PushMessageData extends js.Object {
  
  def arrayBuffer(): ArrayBuffer = js.native
  
  def blob(): Blob = js.native
  
  def json(): js.Any = js.native
  
  def text(): String = js.native
}
object PushMessageData {
  
  @scala.inline
  def apply(arrayBuffer: () => ArrayBuffer, blob: () => Blob, json: () => js.Any, text: () => String): PushMessageData = {
    val __obj = js.Dynamic.literal(arrayBuffer = js.Any.fromFunction0(arrayBuffer), blob = js.Any.fromFunction0(blob), json = js.Any.fromFunction0(json), text = js.Any.fromFunction0(text))
    __obj.asInstanceOf[PushMessageData]
  }
  
  @scala.inline
  implicit class PushMessageDataOps[Self <: PushMessageData] (val x: Self) extends AnyVal {
    
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
    def setArrayBuffer(value: () => ArrayBuffer): Self = this.set("arrayBuffer", js.Any.fromFunction0(value))
    
    @scala.inline
    def setBlob(value: () => Blob): Self = this.set("blob", js.Any.fromFunction0(value))
    
    @scala.inline
    def setJson(value: () => js.Any): Self = this.set("json", js.Any.fromFunction0(value))
    
    @scala.inline
    def setText(value: () => String): Self = this.set("text", js.Any.fromFunction0(value))
  }
}
