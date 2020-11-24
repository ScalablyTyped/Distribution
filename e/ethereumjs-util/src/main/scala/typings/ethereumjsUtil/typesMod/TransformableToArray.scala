package typings.ethereumjsUtil.typesMod

import typings.node.Buffer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransformableToArray extends js.Object {
  
  def toArray(): Uint8Array = js.native
  
  var toBuffer: js.UndefOr[js.Function0[Buffer]] = js.native
}
object TransformableToArray {
  
  @scala.inline
  def apply(toArray: () => Uint8Array): TransformableToArray = {
    val __obj = js.Dynamic.literal(toArray = js.Any.fromFunction0(toArray))
    __obj.asInstanceOf[TransformableToArray]
  }
  
  @scala.inline
  implicit class TransformableToArrayOps[Self <: TransformableToArray] (val x: Self) extends AnyVal {
    
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
    def setToArray(value: () => Uint8Array): Self = this.set("toArray", js.Any.fromFunction0(value))
    
    @scala.inline
    def setToBuffer(value: () => Buffer): Self = this.set("toBuffer", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteToBuffer: Self = this.set("toBuffer", js.undefined)
  }
}
