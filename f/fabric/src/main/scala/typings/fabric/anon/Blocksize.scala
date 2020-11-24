package typings.fabric.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Blocksize extends js.Object {
  
  /**
    * Blocksize for pixelate
    * @default 4
    */
  var blocksize: js.UndefOr[Double] = js.native
}
object Blocksize {
  
  @scala.inline
  def apply(): Blocksize = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Blocksize]
  }
  
  @scala.inline
  implicit class BlocksizeOps[Self <: Blocksize] (val x: Self) extends AnyVal {
    
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
    def setBlocksize(value: Double): Self = this.set("blocksize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlocksize: Self = this.set("blocksize", js.undefined)
  }
}
