package typings.googleCloudPromisify.mod

import typings.std.PromiseConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WithPromise extends js.Object {
  
  var Promise: js.UndefOr[PromiseConstructor] = js.native
}
object WithPromise {
  
  @scala.inline
  def apply(): WithPromise = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WithPromise]
  }
  
  @scala.inline
  implicit class WithPromiseOps[Self <: WithPromise] (val x: Self) extends AnyVal {
    
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
    def setPromise(value: PromiseConstructor): Self = this.set("Promise", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePromise: Self = this.set("Promise", js.undefined)
  }
}
