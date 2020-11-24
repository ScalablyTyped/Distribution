package typings.famous.physicsMod

import typings.famous.mathMod.Vec3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISpringOptions extends IForceOptions {
  
  var anchor: js.UndefOr[Vec3] = js.native
  
  var damping: js.UndefOr[Double] = js.native
  
  var dampingRatio: js.UndefOr[Double] = js.native
  
  var length: js.UndefOr[Double] = js.native
  
  var maxLength: js.UndefOr[Double] = js.native
  
  var period: js.UndefOr[Double] = js.native
  
  var stiffness: js.UndefOr[Double] = js.native
  
  var `type`: js.UndefOr[js.Function2[/* dist */ js.Any, /* rMax */ js.Any, Double]] = js.native
}
object ISpringOptions {
  
  @scala.inline
  def apply(): ISpringOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISpringOptions]
  }
  
  @scala.inline
  implicit class ISpringOptionsOps[Self <: ISpringOptions] (val x: Self) extends AnyVal {
    
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
    def setAnchor(value: Vec3): Self = this.set("anchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnchor: Self = this.set("anchor", js.undefined)
    
    @scala.inline
    def setDamping(value: Double): Self = this.set("damping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDamping: Self = this.set("damping", js.undefined)
    
    @scala.inline
    def setDampingRatio(value: Double): Self = this.set("dampingRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDampingRatio: Self = this.set("dampingRatio", js.undefined)
    
    @scala.inline
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLength: Self = this.set("length", js.undefined)
    
    @scala.inline
    def setMaxLength(value: Double): Self = this.set("maxLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxLength: Self = this.set("maxLength", js.undefined)
    
    @scala.inline
    def setPeriod(value: Double): Self = this.set("period", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePeriod: Self = this.set("period", js.undefined)
    
    @scala.inline
    def setStiffness(value: Double): Self = this.set("stiffness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStiffness: Self = this.set("stiffness", js.undefined)
    
    @scala.inline
    def setType(value: (/* dist */ js.Any, /* rMax */ js.Any) => Double): Self = this.set("type", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
