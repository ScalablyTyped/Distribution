package typings.googleCloudStorage.aclMod

import typings.googleCloudCommon.utilMod.BodyResponseCallback
import typings.googleCloudCommon.utilMod.DecorateRequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AclOptions extends js.Object {
  
  var pathPrefix: String = js.native
  
  def request(reqOpts: DecorateRequestOptions, callback: BodyResponseCallback): Unit = js.native
}
object AclOptions {
  
  @scala.inline
  def apply(pathPrefix: String, request: (DecorateRequestOptions, BodyResponseCallback) => Unit): AclOptions = {
    val __obj = js.Dynamic.literal(pathPrefix = pathPrefix.asInstanceOf[js.Any], request = js.Any.fromFunction2(request))
    __obj.asInstanceOf[AclOptions]
  }
  
  @scala.inline
  implicit class AclOptionsOps[Self <: AclOptions] (val x: Self) extends AnyVal {
    
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
    def setPathPrefix(value: String): Self = this.set("pathPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: (DecorateRequestOptions, BodyResponseCallback) => Unit): Self = this.set("request", js.Any.fromFunction2(value))
  }
}
