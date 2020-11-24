package typings.famous.physicsMod

import typings.famous.mathMod.Quaternion
import typings.famous.mathMod.Vec3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IParticleOptions extends js.Object {
  
  var collisionGroup: js.UndefOr[Double] = js.native
  
  var collisionMask: js.UndefOr[Double] = js.native
  
  var friction: js.UndefOr[Double] = js.native
  
  var mass: js.UndefOr[Double] = js.native
  
  var orientation: js.UndefOr[Quaternion] = js.native
  
  var position: js.UndefOr[Vec3] = js.native
  
  var restitution: js.UndefOr[Double] = js.native
  
  var restrictions: js.UndefOr[Double] = js.native
  
  var size: js.UndefOr[js.Array[Double]] = js.native
  
  var velocity: js.UndefOr[Double] = js.native
}
object IParticleOptions {
  
  @scala.inline
  def apply(): IParticleOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IParticleOptions]
  }
  
  @scala.inline
  implicit class IParticleOptionsOps[Self <: IParticleOptions] (val x: Self) extends AnyVal {
    
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
    def setCollisionGroup(value: Double): Self = this.set("collisionGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCollisionGroup: Self = this.set("collisionGroup", js.undefined)
    
    @scala.inline
    def setCollisionMask(value: Double): Self = this.set("collisionMask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCollisionMask: Self = this.set("collisionMask", js.undefined)
    
    @scala.inline
    def setFriction(value: Double): Self = this.set("friction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFriction: Self = this.set("friction", js.undefined)
    
    @scala.inline
    def setMass(value: Double): Self = this.set("mass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMass: Self = this.set("mass", js.undefined)
    
    @scala.inline
    def setOrientation(value: Quaternion): Self = this.set("orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrientation: Self = this.set("orientation", js.undefined)
    
    @scala.inline
    def setPosition(value: Vec3): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    
    @scala.inline
    def setRestitution(value: Double): Self = this.set("restitution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRestitution: Self = this.set("restitution", js.undefined)
    
    @scala.inline
    def setRestrictions(value: Double): Self = this.set("restrictions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRestrictions: Self = this.set("restrictions", js.undefined)
    
    @scala.inline
    def setSizeVarargs(value: Double*): Self = this.set("size", js.Array(value :_*))
    
    @scala.inline
    def setSize(value: js.Array[Double]): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    
    @scala.inline
    def setVelocity(value: Double): Self = this.set("velocity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVelocity: Self = this.set("velocity", js.undefined)
  }
}
