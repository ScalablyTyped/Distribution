package typings.emberMocha.mod

import typings.ember.mod.default.Resolver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetupOptions extends js.Object {
  
  var resolver: Resolver = js.native
}
object SetupOptions {
  
  @scala.inline
  def apply(resolver: Resolver): SetupOptions = {
    val __obj = js.Dynamic.literal(resolver = resolver.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetupOptions]
  }
  
  @scala.inline
  implicit class SetupOptionsOps[Self <: SetupOptions] (val x: Self) extends AnyVal {
    
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
    def setResolver(value: Resolver): Self = this.set("resolver", value.asInstanceOf[js.Any])
  }
}
