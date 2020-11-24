package typings.flatbuffers.mod.global.flatbuffers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Table extends js.Object {
  
  var bb: ByteBuffer | Null = js.native
  
  var bb_pos: Double = js.native
}
object Table {
  
  @scala.inline
  def apply(bb_pos: Double): Table = {
    val __obj = js.Dynamic.literal(bb_pos = bb_pos.asInstanceOf[js.Any])
    __obj.asInstanceOf[Table]
  }
  
  @scala.inline
  implicit class TableOps[Self <: Table] (val x: Self) extends AnyVal {
    
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
    def setBb_pos(value: Double): Self = this.set("bb_pos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBb(value: ByteBuffer): Self = this.set("bb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBbNull: Self = this.set("bb", null)
  }
}
