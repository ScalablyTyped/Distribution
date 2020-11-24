package typings.dockerode.mod

import typings.dockerode.anon.Architecture
import typings.dockerode.anon.Spread
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Placement extends js.Object {
  
  var Constraints: js.UndefOr[js.Array[String]] = js.native
  
  var MaxReplicas: js.UndefOr[Double] = js.native
  
  var Platforms: js.UndefOr[js.Array[Architecture]] = js.native
  
  var Preferences: js.UndefOr[js.Array[Spread]] = js.native
}
object Placement {
  
  @scala.inline
  def apply(): Placement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Placement]
  }
  
  @scala.inline
  implicit class PlacementOps[Self <: Placement] (val x: Self) extends AnyVal {
    
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
    def setConstraintsVarargs(value: String*): Self = this.set("Constraints", js.Array(value :_*))
    
    @scala.inline
    def setConstraints(value: js.Array[String]): Self = this.set("Constraints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConstraints: Self = this.set("Constraints", js.undefined)
    
    @scala.inline
    def setMaxReplicas(value: Double): Self = this.set("MaxReplicas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxReplicas: Self = this.set("MaxReplicas", js.undefined)
    
    @scala.inline
    def setPlatformsVarargs(value: Architecture*): Self = this.set("Platforms", js.Array(value :_*))
    
    @scala.inline
    def setPlatforms(value: js.Array[Architecture]): Self = this.set("Platforms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlatforms: Self = this.set("Platforms", js.undefined)
    
    @scala.inline
    def setPreferencesVarargs(value: Spread*): Self = this.set("Preferences", js.Array(value :_*))
    
    @scala.inline
    def setPreferences(value: js.Array[Spread]): Self = this.set("Preferences", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreferences: Self = this.set("Preferences", js.undefined)
  }
}
