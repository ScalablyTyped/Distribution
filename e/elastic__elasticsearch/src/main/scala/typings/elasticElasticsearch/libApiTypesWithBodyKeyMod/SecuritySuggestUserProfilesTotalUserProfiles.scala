package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecuritySuggestUserProfilesTotalUserProfiles extends StObject {
  
  var relation: RelationName
  
  var value: long
}
object SecuritySuggestUserProfilesTotalUserProfiles {
  
  inline def apply(relation: RelationName, value: long): SecuritySuggestUserProfilesTotalUserProfiles = {
    val __obj = js.Dynamic.literal(relation = relation.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecuritySuggestUserProfilesTotalUserProfiles]
  }
  
  extension [Self <: SecuritySuggestUserProfilesTotalUserProfiles](x: Self) {
    
    inline def setRelation(value: RelationName): Self = StObject.set(x, "relation", value.asInstanceOf[js.Any])
    
    inline def setValue(value: long): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
