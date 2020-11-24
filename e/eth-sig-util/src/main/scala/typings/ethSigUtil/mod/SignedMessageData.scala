package typings.ethSigUtil.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SignedMessageData[T] extends MessageData[T] {
  
  var sig: String = js.native
}
object SignedMessageData {
  
  @scala.inline
  def apply[T](data: T, sig: String): SignedMessageData[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], sig = sig.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignedMessageData[T]]
  }
  
  @scala.inline
  implicit class SignedMessageDataOps[Self <: SignedMessageData[_], T] (val x: Self with SignedMessageData[T]) extends AnyVal {
    
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
    def setSig(value: String): Self = this.set("sig", value.asInstanceOf[js.Any])
  }
}
