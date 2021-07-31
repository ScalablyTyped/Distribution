package typings.firebaseMessaging

import typings.std.ArrayBuffer
import typings.std.Blob
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PushMessageData extends StObject {
  
  def arrayBuffer(): ArrayBuffer
  
  def blob(): Blob
  
  def json(): js.Any
  
  def text(): String
}
object PushMessageData {
  
  @scala.inline
  def apply(arrayBuffer: () => ArrayBuffer, blob: () => Blob, json: () => js.Any, text: () => String): PushMessageData = {
    val __obj = js.Dynamic.literal(arrayBuffer = js.Any.fromFunction0(arrayBuffer), blob = js.Any.fromFunction0(blob), json = js.Any.fromFunction0(json), text = js.Any.fromFunction0(text))
    __obj.asInstanceOf[PushMessageData]
  }
  
  @scala.inline
  implicit class PushMessageDataMutableBuilder[Self <: PushMessageData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArrayBuffer(value: () => ArrayBuffer): Self = StObject.set(x, "arrayBuffer", js.Any.fromFunction0(value))
    
    @scala.inline
    def setBlob(value: () => Blob): Self = StObject.set(x, "blob", js.Any.fromFunction0(value))
    
    @scala.inline
    def setJson(value: () => js.Any): Self = StObject.set(x, "json", js.Any.fromFunction0(value))
    
    @scala.inline
    def setText(value: () => String): Self = StObject.set(x, "text", js.Any.fromFunction0(value))
  }
}
