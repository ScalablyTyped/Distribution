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
  
  @scala.inline
  def apply(): IBindingDelta = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IBindingDelta]
  }
  
  @scala.inline
  implicit class IBindingDeltaMutableBuilder[Self <: IBindingDelta] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: Action): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionNull: Self = StObject.set(x, "action", null)
    
    @scala.inline
    def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    @scala.inline
    def setCondition(value: IExpr): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConditionNull: Self = StObject.set(x, "condition", null)
    
    @scala.inline
    def setConditionUndefined: Self = StObject.set(x, "condition", js.undefined)
    
    @scala.inline
    def setMember(value: String): Self = StObject.set(x, "member", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMemberNull: Self = StObject.set(x, "member", null)
    
    @scala.inline
    def setMemberUndefined: Self = StObject.set(x, "member", js.undefined)
    
    @scala.inline
    def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleNull: Self = StObject.set(x, "role", null)
    
    @scala.inline
    def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
  }
}
