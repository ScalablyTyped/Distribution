package typings.emberQunit.mod

import typings.ember.mod.default.Resolver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetupTestOptions extends js.Object {
  
  /**
    * The resolver to use when instantiating container-managed entities in the test.
    */
  var resolver: js.UndefOr[Resolver] = js.native
}
object SetupTestOptions {
  
  @scala.inline
  def apply(): SetupTestOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SetupTestOptions]
  }
  
  @scala.inline
  implicit class SetupTestOptionsOps[Self <: SetupTestOptions] (val x: Self) extends AnyVal {
    
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
    
    @scala.inline
    def deleteResolver: Self = this.set("resolver", js.undefined)
  }
}
