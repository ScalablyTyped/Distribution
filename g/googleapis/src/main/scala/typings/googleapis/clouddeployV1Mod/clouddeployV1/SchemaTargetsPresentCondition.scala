package typings.googleapis.clouddeployV1Mod.clouddeployV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTargetsPresentCondition extends StObject {
  
  /**
    * The list of Target names that are missing. For example, projects/{project_id\}/locations/{location_name\}/targets/{target_name\}.
    */
  var missingTargets: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * True if there aren't any missing Targets.
    */
  var status: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Last time the condition was updated.
    */
  var updateTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaTargetsPresentCondition {
  
  inline def apply(): SchemaTargetsPresentCondition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTargetsPresentCondition]
  }
  
  extension [Self <: SchemaTargetsPresentCondition](x: Self) {
    
    inline def setMissingTargets(value: js.Array[String]): Self = StObject.set(x, "missingTargets", value.asInstanceOf[js.Any])
    
    inline def setMissingTargetsNull: Self = StObject.set(x, "missingTargets", null)
    
    inline def setMissingTargetsUndefined: Self = StObject.set(x, "missingTargets", js.undefined)
    
    inline def setMissingTargetsVarargs(value: String*): Self = StObject.set(x, "missingTargets", js.Array(value*))
    
    inline def setStatus(value: Boolean): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusNull: Self = StObject.set(x, "status", null)
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeNull: Self = StObject.set(x, "updateTime", null)
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
