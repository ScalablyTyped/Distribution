package typings.googleapis.anon

import typings.googleapis.bigqueryV2Mod.bigqueryV2.SchemaTableReference
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Domain extends StObject {
  
  var domain: js.UndefOr[String] = js.undefined
  
  var groupByEmail: js.UndefOr[String] = js.undefined
  
  var iamMember: js.UndefOr[String] = js.undefined
  
  var role: js.UndefOr[String] = js.undefined
  
  var specialGroup: js.UndefOr[String] = js.undefined
  
  var userByEmail: js.UndefOr[String] = js.undefined
  
  var view: js.UndefOr[SchemaTableReference] = js.undefined
}
object Domain {
  
  @scala.inline
  def apply(): Domain = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Domain]
  }
  
  @scala.inline
  implicit class DomainMutableBuilder[Self <: Domain] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
    
    @scala.inline
    def setGroupByEmail(value: String): Self = StObject.set(x, "groupByEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupByEmailUndefined: Self = StObject.set(x, "groupByEmail", js.undefined)
    
    @scala.inline
    def setIamMember(value: String): Self = StObject.set(x, "iamMember", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIamMemberUndefined: Self = StObject.set(x, "iamMember", js.undefined)
    
    @scala.inline
    def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    
    @scala.inline
    def setSpecialGroup(value: String): Self = StObject.set(x, "specialGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpecialGroupUndefined: Self = StObject.set(x, "specialGroup", js.undefined)
    
    @scala.inline
    def setUserByEmail(value: String): Self = StObject.set(x, "userByEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserByEmailUndefined: Self = StObject.set(x, "userByEmail", js.undefined)
    
    @scala.inline
    def setView(value: SchemaTableReference): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}
