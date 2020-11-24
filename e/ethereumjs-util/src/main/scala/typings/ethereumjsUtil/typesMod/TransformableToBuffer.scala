package typings.ethereumjsUtil.typesMod

import typings.node.Buffer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransformableToBuffer extends js.Object {
  
  var toArray: js.UndefOr[js.Function0[Uint8Array]] = js.native
  
  def toBuffer(): Buffer = js.native
}
object TransformableToBuffer {
  
  @scala.inline
  def apply(toBuffer: () => Buffer): TransformableToBuffer = {
    val __obj = js.Dynamic.literal(toBuffer = js.Any.fromFunction0(toBuffer))
    __obj.asInstanceOf[TransformableToBuffer]
  }
  
  @scala.inline
  implicit class TransformableToBufferOps[Self <: TransformableToBuffer] (val x: Self) extends AnyVal {
    
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
    def setToBuffer(value: () => Buffer): Self = this.set("toBuffer", js.Any.fromFunction0(value))
    
    @scala.inline
    def setToArray(value: () => Uint8Array): Self = this.set("toArray", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteToArray: Self = this.set("toArray", js.undefined)
  }
}
