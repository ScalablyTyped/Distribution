package typings.googleGax.iamServiceMod.google.iam.v1

import typings.googleGax.iamServiceMod.google.`type`.IExpr
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a Binding. */
trait IBinding extends StObject {
  
  /** Binding condition */
  var condition: js.UndefOr[IExpr | Null] = js.undefined
  
  /** Binding members */
  var members: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /** Binding role */
  var role: js.UndefOr[String | Null] = js.undefined
}
object IBinding {
  
  @scala.inline
  def apply(): IBinding = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IBinding]
  }
  
  @scala.inline
  implicit class IBindingMutableBuilder[Self <: IBinding] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCondition(value: IExpr): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConditionNull: Self = StObject.set(x, "condition", null)
    
    @scala.inline
    def setConditionUndefined: Self = StObject.set(x, "condition", js.undefined)
    
    @scala.inline
    def setMembers(value: js.Array[String]): Self = StObject.set(x, "members", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMembersNull: Self = StObject.set(x, "members", null)
    
    @scala.inline
    def setMembersUndefined: Self = StObject.set(x, "members", js.undefined)
    
    @scala.inline
    def setMembersVarargs(value: String*): Self = StObject.set(x, "members", js.Array(value :_*))
    
    @scala.inline
    def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleNull: Self = StObject.set(x, "role", null)
    
    @scala.inline
    def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
  }
}
