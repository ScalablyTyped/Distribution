package typings.freedom.freedom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FreedomInCoreEnvOptions extends js.Object {
  
  var debug: js.UndefOr[String] = js.native
  
    // debug level
  var logger: js.UndefOr[String] = js.native
}
object FreedomInCoreEnvOptions {
  
  @scala.inline
  def apply(): FreedomInCoreEnvOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FreedomInCoreEnvOptions]
  }
  
  @scala.inline
  implicit class FreedomInCoreEnvOptionsOps[Self <: FreedomInCoreEnvOptions] (val x: Self) extends AnyVal {
    
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
    def setDebug(value: String): Self = this.set("debug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDebug: Self = this.set("debug", js.undefined)
    
    @scala.inline
    def setLogger(value: String): Self = this.set("logger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogger: Self = this.set("logger", js.undefined)
  }
}
