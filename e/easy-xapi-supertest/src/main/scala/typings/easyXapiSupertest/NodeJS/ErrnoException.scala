package typings.easyXapiSupertest.NodeJS

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ErrnoException extends Error {
  
  var code: js.UndefOr[String] = js.native
  
  var errno: js.UndefOr[Double] = js.native
  
  var path: js.UndefOr[String] = js.native
  
  var syscall: js.UndefOr[String] = js.native
}
object ErrnoException {
  
  @scala.inline
  def apply(message: String, name: String): ErrnoException = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrnoException]
  }
  
  @scala.inline
  implicit class ErrnoExceptionOps[Self <: ErrnoException] (val x: Self) extends AnyVal {
    
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
    def setCode(value: String): Self = this.set("code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCode: Self = this.set("code", js.undefined)
    
    @scala.inline
    def setErrno(value: Double): Self = this.set("errno", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrno: Self = this.set("errno", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    
    @scala.inline
    def setSyscall(value: String): Self = this.set("syscall", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSyscall: Self = this.set("syscall", js.undefined)
  }
}
