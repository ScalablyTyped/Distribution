package typings.googleapis.clouddeployV1Mod.clouddeployV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaStage extends StObject {
  
  /**
    * Skaffold profiles to use when rendering the manifest for this stage's `Target`.
    */
  var profiles: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * The target_id to which this stage points. This field refers exclusively to the last segment of a target name. For example, this field would just be `my-target` (rather than `projects/project/locations/location/targets/my-target`). The location of the `Target` is inferred to be the same as the location of the `DeliveryPipeline` that contains this `Stage`.
    */
  var targetId: js.UndefOr[String | Null] = js.undefined
}
object SchemaStage {
  
  inline def apply(): SchemaStage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaStage]
  }
  
  extension [Self <: SchemaStage](x: Self) {
    
    inline def setProfiles(value: js.Array[String]): Self = StObject.set(x, "profiles", value.asInstanceOf[js.Any])
    
    inline def setProfilesNull: Self = StObject.set(x, "profiles", null)
    
    inline def setProfilesUndefined: Self = StObject.set(x, "profiles", js.undefined)
    
    inline def setProfilesVarargs(value: String*): Self = StObject.set(x, "profiles", js.Array(value*))
    
    inline def setTargetId(value: String): Self = StObject.set(x, "targetId", value.asInstanceOf[js.Any])
    
    inline def setTargetIdNull: Self = StObject.set(x, "targetId", null)
    
    inline def setTargetIdUndefined: Self = StObject.set(x, "targetId", js.undefined)
  }
}
