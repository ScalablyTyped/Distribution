package typings.glue.mod

import typings.hapi.mod.Server
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  var preConnections: js.UndefOr[
    js.Function2[/* Server */ Server, /* next */ js.Function1[/* err */ js.Any, Unit], Unit]
  ] = js.native
  
  var preRegister: js.UndefOr[
    js.Function2[/* Server */ Server, /* next */ js.Function1[/* err */ js.Any, Unit], Unit]
  ] = js.native
  
  var relativeTo: String = js.native
}
object Options {
  
  @scala.inline
  def apply(relativeTo: String): Options = {
    val __obj = js.Dynamic.literal(relativeTo = relativeTo.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setRelativeTo(value: String): Self = this.set("relativeTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreConnections(value: (/* Server */ Server, /* next */ js.Function1[/* err */ js.Any, Unit]) => Unit): Self = this.set("preConnections", js.Any.fromFunction2(value))
    
    @scala.inline
    def deletePreConnections: Self = this.set("preConnections", js.undefined)
    
    @scala.inline
    def setPreRegister(value: (/* Server */ Server, /* next */ js.Function1[/* err */ js.Any, Unit]) => Unit): Self = this.set("preRegister", js.Any.fromFunction2(value))
    
    @scala.inline
    def deletePreRegister: Self = this.set("preRegister", js.undefined)
  }
}
