package typings.firebaseRemoteConfig.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HttpStatus extends js.Object {
  
  var httpStatus: Double = js.native
}
object HttpStatus {
  
  @scala.inline
  def apply(httpStatus: Double): HttpStatus = {
    val __obj = js.Dynamic.literal(httpStatus = httpStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpStatus]
  }
  
  @scala.inline
  implicit class HttpStatusOps[Self <: HttpStatus] (val x: Self) extends AnyVal {
    
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
    def setHttpStatus(value: Double): Self = this.set("httpStatus", value.asInstanceOf[js.Any])
  }
}
