package typings.expoFileSystem.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Md5 extends js.Object {
  
  var md5: js.UndefOr[Boolean] = js.native
  
  var size: js.UndefOr[Boolean] = js.native
}
object Md5 {
  
  @scala.inline
  def apply(): Md5 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Md5]
  }
  
  @scala.inline
  implicit class Md5Ops[Self <: Md5] (val x: Self) extends AnyVal {
    
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
    def setMd5(value: Boolean): Self = this.set("md5", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMd5: Self = this.set("md5", js.undefined)
    
    @scala.inline
    def setSize(value: Boolean): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
  }
}
