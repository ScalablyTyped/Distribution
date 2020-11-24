package typings.googleMaps.mod

import typings.std.PromiseConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateClientOptionsWithPromise extends CreateClientOptions {
  
  /** Promise constructor */
  var Promise: PromiseConstructor = js.native
}
object CreateClientOptionsWithPromise {
  
  @scala.inline
  def apply(Promise: PromiseConstructor, key: String): CreateClientOptionsWithPromise = {
    val __obj = js.Dynamic.literal(Promise = Promise.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateClientOptionsWithPromise]
  }
  
  @scala.inline
  implicit class CreateClientOptionsWithPromiseOps[Self <: CreateClientOptionsWithPromise] (val x: Self) extends AnyVal {
    
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
  }
}
