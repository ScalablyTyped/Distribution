package typings.dockerode.mod

import typings.dockerode.anon.Architecture
import typings.dockerode.anon.Spread
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Placement extends StObject {
  
  var Constraints: js.UndefOr[js.Array[String]] = js.undefined
  
  var MaxReplicas: js.UndefOr[Double] = js.undefined
  
  var Platforms: js.UndefOr[js.Array[Architecture]] = js.undefined
  
  var Preferences: js.UndefOr[js.Array[Spread]] = js.undefined
}
object Placement {
  
  inline def apply(): Placement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Placement]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Placement] (val x: Self) extends AnyVal {
    
    inline def setConstraints(value: js.Array[String]): Self = StObject.set(x, "Constraints", value.asInstanceOf[js.Any])
    
    inline def setConstraintsUndefined: Self = StObject.set(x, "Constraints", js.undefined)
    
    inline def setConstraintsVarargs(value: String*): Self = StObject.set(x, "Constraints", js.Array(value*))
    
    inline def setMaxReplicas(value: Double): Self = StObject.set(x, "MaxReplicas", value.asInstanceOf[js.Any])
    
    inline def setMaxReplicasUndefined: Self = StObject.set(x, "MaxReplicas", js.undefined)
    
    inline def setPlatforms(value: js.Array[Architecture]): Self = StObject.set(x, "Platforms", value.asInstanceOf[js.Any])
    
    inline def setPlatformsUndefined: Self = StObject.set(x, "Platforms", js.undefined)
    
    inline def setPlatformsVarargs(value: Architecture*): Self = StObject.set(x, "Platforms", js.Array(value*))
    
    inline def setPreferences(value: js.Array[Spread]): Self = StObject.set(x, "Preferences", value.asInstanceOf[js.Any])
    
    inline def setPreferencesUndefined: Self = StObject.set(x, "Preferences", js.undefined)
    
    inline def setPreferencesVarargs(value: Spread*): Self = StObject.set(x, "Preferences", js.Array(value*))
  }
}
