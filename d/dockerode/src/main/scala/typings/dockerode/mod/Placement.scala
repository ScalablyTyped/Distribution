package typings.dockerode.mod

import typings.dockerode.anon.Architecture
import typings.dockerode.anon.Spread
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Placement extends StObject {
  
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
  implicit class PlacementMutableBuilder[Self <: Placement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConstraints(value: js.Array[String]): Self = StObject.set(x, "Constraints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConstraintsUndefined: Self = StObject.set(x, "Constraints", js.undefined)
    
    @scala.inline
    def setConstraintsVarargs(value: String*): Self = StObject.set(x, "Constraints", js.Array(value :_*))
    
    @scala.inline
    def setMaxReplicas(value: Double): Self = StObject.set(x, "MaxReplicas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxReplicasUndefined: Self = StObject.set(x, "MaxReplicas", js.undefined)
    
    @scala.inline
    def setPlatforms(value: js.Array[Architecture]): Self = StObject.set(x, "Platforms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlatformsUndefined: Self = StObject.set(x, "Platforms", js.undefined)
    
    @scala.inline
    def setPlatformsVarargs(value: Architecture*): Self = StObject.set(x, "Platforms", js.Array(value :_*))
    
    @scala.inline
    def setPreferences(value: js.Array[Spread]): Self = StObject.set(x, "Preferences", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreferencesUndefined: Self = StObject.set(x, "Preferences", js.undefined)
    
    @scala.inline
    def setPreferencesVarargs(value: Spread*): Self = StObject.set(x, "Preferences", js.Array(value :_*))
  }
}
