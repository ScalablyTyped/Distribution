package typings.dockerode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DiscreteGenericResource extends GenericResource {
  
  var Kind: js.UndefOr[String] = js.native
  
  var Value: js.UndefOr[Double] = js.native
}
object DiscreteGenericResource {
  
  @scala.inline
  def apply(): DiscreteGenericResource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiscreteGenericResource]
  }
  
  @scala.inline
  implicit class DiscreteGenericResourceOps[Self <: DiscreteGenericResource] (val x: Self) extends AnyVal {
    
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
    def setKind(value: String): Self = this.set("Kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("Kind", js.undefined)
    
    @scala.inline
    def setValue(value: Double): Self = this.set("Value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("Value", js.undefined)
  }
}
