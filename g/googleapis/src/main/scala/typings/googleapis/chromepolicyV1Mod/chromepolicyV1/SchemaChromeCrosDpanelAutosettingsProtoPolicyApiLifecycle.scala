package typings.googleapis.chromepolicyV1Mod.chromepolicyV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaChromeCrosDpanelAutosettingsProtoPolicyApiLifecycle extends StObject {
  
  /**
    * Description about current life cycle.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * End supporting date for current policy.
    */
  var endSupport: js.UndefOr[SchemaGoogleTypeDate] = js.undefined
  
  /**
    * Indicate current life cycle stage of the policy API.
    */
  var policyApiLifecycleStage: js.UndefOr[String | Null] = js.undefined
}
object SchemaChromeCrosDpanelAutosettingsProtoPolicyApiLifecycle {
  
  inline def apply(): SchemaChromeCrosDpanelAutosettingsProtoPolicyApiLifecycle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaChromeCrosDpanelAutosettingsProtoPolicyApiLifecycle]
  }
  
  extension [Self <: SchemaChromeCrosDpanelAutosettingsProtoPolicyApiLifecycle](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEndSupport(value: SchemaGoogleTypeDate): Self = StObject.set(x, "endSupport", value.asInstanceOf[js.Any])
    
    inline def setEndSupportUndefined: Self = StObject.set(x, "endSupport", js.undefined)
    
    inline def setPolicyApiLifecycleStage(value: String): Self = StObject.set(x, "policyApiLifecycleStage", value.asInstanceOf[js.Any])
    
    inline def setPolicyApiLifecycleStageNull: Self = StObject.set(x, "policyApiLifecycleStage", null)
    
    inline def setPolicyApiLifecycleStageUndefined: Self = StObject.set(x, "policyApiLifecycleStage", js.undefined)
  }
}
