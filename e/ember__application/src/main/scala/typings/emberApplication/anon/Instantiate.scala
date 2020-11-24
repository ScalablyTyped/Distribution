package typings.emberApplication.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Instantiate extends js.Object {
  
  var instantiate: js.UndefOr[Boolean] = js.native
  
  var singleton: js.UndefOr[Boolean] = js.native
}
object Instantiate {
  
  @scala.inline
  def apply(): Instantiate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Instantiate]
  }
  
  @scala.inline
  implicit class InstantiateOps[Self <: Instantiate] (val x: Self) extends AnyVal {
    
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
    def setInstantiate(value: Boolean): Self = this.set("instantiate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstantiate: Self = this.set("instantiate", js.undefined)
    
    @scala.inline
    def setSingleton(value: Boolean): Self = this.set("singleton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSingleton: Self = this.set("singleton", js.undefined)
  }
}
