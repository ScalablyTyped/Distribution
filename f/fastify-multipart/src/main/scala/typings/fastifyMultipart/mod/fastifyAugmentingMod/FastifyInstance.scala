package typings.fastifyMultipart.mod.fastifyAugmentingMod

import typings.fastifyMultipart.mod.MultipartErrors
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FastifyInstance extends js.Object {
  
  var multipartErrors: MultipartErrors = js.native
}
object FastifyInstance {
  
  @scala.inline
  def apply(multipartErrors: MultipartErrors): FastifyInstance = {
    val __obj = js.Dynamic.literal(multipartErrors = multipartErrors.asInstanceOf[js.Any])
    __obj.asInstanceOf[FastifyInstance]
  }
  
  @scala.inline
  implicit class FastifyInstanceOps[Self <: FastifyInstance] (val x: Self) extends AnyVal {
    
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
    def setMultipartErrors(value: MultipartErrors): Self = this.set("multipartErrors", value.asInstanceOf[js.Any])
  }
}
