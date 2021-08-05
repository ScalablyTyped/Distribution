package typings.googleGax.iamServiceMod.google.iam.v1

import typings.googleGax.iamServiceMod.google.`type`.IExpr
import typings.googleGax.iamServiceMod.google.iam.v1.BindingDelta.Action
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a BindingDelta. */
trait IBindingDelta extends StObject {
  
  /** BindingDelta action */
  var action: js.UndefOr[Action | Null] = js.undefined
  
  /** BindingDelta condition */
  var condition: js.UndefOr[IExpr | Null] = js.undefined
  
  /** BindingDelta member */
  var member: js.UndefOr[String | Null] = js.undefined
  
  /** BindingDelta role */
  var role: js.UndefOr[String | Null] = js.undefined
}
object IBindingDelta {
  
  inline def apply(): IBindingDelta = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IBindingDelta]
  }
  
  extension [Self <: IBindingDelta](x: Self) {
    
    inline def setAction(value: Action): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionNull: Self = StObject.set(x, "action", null)
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setCondition(value: IExpr): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
    
    inline def setConditionNull: Self = StObject.set(x, "condition", null)
    
    inline def setConditionUndefined: Self = StObject.set(x, "condition", js.undefined)
    
    inline def setMember(value: String): Self = StObject.set(x, "member", value.asInstanceOf[js.Any])
    
    inline def setMemberNull: Self = StObject.set(x, "member", null)
    
    inline def setMemberUndefined: Self = StObject.set(x, "member", js.undefined)
    
    inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setRoleNull: Self = StObject.set(x, "role", null)
    
    inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
  }
}
