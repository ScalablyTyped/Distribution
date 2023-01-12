package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchTotalHits extends StObject {
  
  var relation: SearchTotalHitsRelation
  
  var value: long
}
object SearchTotalHits {
  
  inline def apply(relation: SearchTotalHitsRelation, value: long): SearchTotalHits = {
    val __obj = js.Dynamic.literal(relation = relation.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchTotalHits]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SearchTotalHits] (val x: Self) extends AnyVal {
    
    inline def setRelation(value: SearchTotalHitsRelation): Self = StObject.set(x, "relation", value.asInstanceOf[js.Any])
    
    inline def setValue(value: long): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
