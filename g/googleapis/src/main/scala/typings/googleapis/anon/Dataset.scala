package typings.googleapis.anon

import typings.googleapis.bigqueryV2Mod.bigqueryV2.SchemaDatasetAccessEntry
import typings.googleapis.bigqueryV2Mod.bigqueryV2.SchemaRoutineReference
import typings.googleapis.bigqueryV2Mod.bigqueryV2.SchemaTableReference
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dataset extends StObject {
  
  var dataset: js.UndefOr[SchemaDatasetAccessEntry] = js.undefined
  
  var domain: js.UndefOr[String] = js.undefined
  
  var groupByEmail: js.UndefOr[String] = js.undefined
  
  var iamMember: js.UndefOr[String] = js.undefined
  
  var role: js.UndefOr[String] = js.undefined
  
  var routine: js.UndefOr[SchemaRoutineReference] = js.undefined
  
  var specialGroup: js.UndefOr[String] = js.undefined
  
  var userByEmail: js.UndefOr[String] = js.undefined
  
  var view: js.UndefOr[SchemaTableReference] = js.undefined
}
object Dataset {
  
  inline def apply(): Dataset = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Dataset]
  }
  
  extension [Self <: Dataset](x: Self) {
    
    inline def setDataset(value: SchemaDatasetAccessEntry): Self = StObject.set(x, "dataset", value.asInstanceOf[js.Any])
    
    inline def setDatasetUndefined: Self = StObject.set(x, "dataset", js.undefined)
    
    inline def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
    
    inline def setGroupByEmail(value: String): Self = StObject.set(x, "groupByEmail", value.asInstanceOf[js.Any])
    
    inline def setGroupByEmailUndefined: Self = StObject.set(x, "groupByEmail", js.undefined)
    
    inline def setIamMember(value: String): Self = StObject.set(x, "iamMember", value.asInstanceOf[js.Any])
    
    inline def setIamMemberUndefined: Self = StObject.set(x, "iamMember", js.undefined)
    
    inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    
    inline def setRoutine(value: SchemaRoutineReference): Self = StObject.set(x, "routine", value.asInstanceOf[js.Any])
    
    inline def setRoutineUndefined: Self = StObject.set(x, "routine", js.undefined)
    
    inline def setSpecialGroup(value: String): Self = StObject.set(x, "specialGroup", value.asInstanceOf[js.Any])
    
    inline def setSpecialGroupUndefined: Self = StObject.set(x, "specialGroup", js.undefined)
    
    inline def setUserByEmail(value: String): Self = StObject.set(x, "userByEmail", value.asInstanceOf[js.Any])
    
    inline def setUserByEmailUndefined: Self = StObject.set(x, "userByEmail", js.undefined)
    
    inline def setView(value: SchemaTableReference): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}
