package typings.eurekaJsClient.mod.EurekaClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EurekaMiddlewareConfig extends js.Object {
  
  def requestMiddleware(requestOpts: js.Any, done: js.Function1[/* opts */ js.Any, Unit]): Unit = js.native
}
object EurekaMiddlewareConfig {
  
  @scala.inline
  def apply(requestMiddleware: (js.Any, js.Function1[/* opts */ js.Any, Unit]) => Unit): EurekaMiddlewareConfig = {
    val __obj = js.Dynamic.literal(requestMiddleware = js.Any.fromFunction2(requestMiddleware))
    __obj.asInstanceOf[EurekaMiddlewareConfig]
  }
  
  @scala.inline
  implicit class EurekaMiddlewareConfigOps[Self <: EurekaMiddlewareConfig] (val x: Self) extends AnyVal {
    
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
    def setRequestMiddleware(value: (js.Any, js.Function1[/* opts */ js.Any, Unit]) => Unit): Self = this.set("requestMiddleware", js.Any.fromFunction2(value))
  }
}
