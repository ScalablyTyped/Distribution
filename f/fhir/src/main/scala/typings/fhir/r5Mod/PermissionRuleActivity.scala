package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PermissionRuleActivity
  extends StObject
     with BackboneElement {
  
  /**
    * Note that this is the direct action (not the grounds for the action covered in the purpose element). At present, the only action in the understood and tested scope of this resource is 'read'.
    */
  var action: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * The actor(s) authorized for the defined activity.
    */
  var actor: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * The purpose for which the permission is given.
    */
  var purpose: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
}
object PermissionRuleActivity {
  
  inline def apply(): PermissionRuleActivity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PermissionRuleActivity]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PermissionRuleActivity] (val x: Self) extends AnyVal {
    
    inline def setAction(value: js.Array[CodeableConcept]): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setActionVarargs(value: CodeableConcept*): Self = StObject.set(x, "action", js.Array(value*))
    
    inline def setActor(value: js.Array[Reference]): Self = StObject.set(x, "actor", value.asInstanceOf[js.Any])
    
    inline def setActorUndefined: Self = StObject.set(x, "actor", js.undefined)
    
    inline def setActorVarargs(value: Reference*): Self = StObject.set(x, "actor", js.Array(value*))
    
    inline def setPurpose(value: js.Array[CodeableConcept]): Self = StObject.set(x, "purpose", value.asInstanceOf[js.Any])
    
    inline def setPurposeUndefined: Self = StObject.set(x, "purpose", js.undefined)
    
    inline def setPurposeVarargs(value: CodeableConcept*): Self = StObject.set(x, "purpose", js.Array(value*))
  }
}
