package typings.followRedirects.mod

import typings.followRedirects.anon.Location
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WrappableResponse extends js.Object {
  
  def destroy(): js.Any = js.native
  
  var headers: Location = js.native
  
  var statusCode: js.UndefOr[Double] = js.native
}
object WrappableResponse {
  
  @scala.inline
  def apply(destroy: () => js.Any, headers: Location): WrappableResponse = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[WrappableResponse]
  }
  
  @scala.inline
  implicit class WrappableResponseOps[Self <: WrappableResponse] (val x: Self) extends AnyVal {
    
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
    def setDestroy(value: () => js.Any): Self = this.set("destroy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHeaders(value: Location): Self = this.set("headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusCode(value: Double): Self = this.set("statusCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatusCode: Self = this.set("statusCode", js.undefined)
  }
}
