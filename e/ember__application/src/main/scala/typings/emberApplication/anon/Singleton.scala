package typings.emberApplication.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Singleton extends js.Object {
  
  var singleton: js.UndefOr[Boolean] = js.native
}
object Singleton {
  
  @scala.inline
  def apply(): Singleton = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Singleton]
  }
  
  @scala.inline
  implicit class SingletonOps[Self <: Singleton] (val x: Self) extends AnyVal {
    
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
    def setSingleton(value: Boolean): Self = this.set("singleton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSingleton: Self = this.set("singleton", js.undefined)
  }
}
