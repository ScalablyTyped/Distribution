package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import typings.elasticElasticsearch.elasticElasticsearchStrings.join
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MappingJoinProperty
  extends StObject
     with MappingPropertyBase
     with MappingProperty {
  
  var eager_global_ordinals: js.UndefOr[Boolean] = js.undefined
  
  var relations: js.UndefOr[Record[RelationName, RelationName | js.Array[RelationName]]] = js.undefined
  
  var `type`: join
}
object MappingJoinProperty {
  
  inline def apply(): MappingJoinProperty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("join")
    __obj.asInstanceOf[MappingJoinProperty]
  }
  
  extension [Self <: MappingJoinProperty](x: Self) {
    
    inline def setEager_global_ordinals(value: Boolean): Self = StObject.set(x, "eager_global_ordinals", value.asInstanceOf[js.Any])
    
    inline def setEager_global_ordinalsUndefined: Self = StObject.set(x, "eager_global_ordinals", js.undefined)
    
    inline def setRelations(value: Record[RelationName, RelationName | js.Array[RelationName]]): Self = StObject.set(x, "relations", value.asInstanceOf[js.Any])
    
    inline def setRelationsUndefined: Self = StObject.set(x, "relations", js.undefined)
    
    inline def setType(value: join): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
