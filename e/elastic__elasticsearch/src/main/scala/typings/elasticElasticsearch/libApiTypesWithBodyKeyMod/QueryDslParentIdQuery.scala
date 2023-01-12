package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryDslParentIdQuery
  extends StObject
     with QueryDslQueryBase {
  
  var id: js.UndefOr[Id] = js.undefined
  
  var ignore_unmapped: js.UndefOr[Boolean] = js.undefined
  
  var `type`: js.UndefOr[RelationName] = js.undefined
}
object QueryDslParentIdQuery {
  
  inline def apply(): QueryDslParentIdQuery = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryDslParentIdQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: QueryDslParentIdQuery] (val x: Self) extends AnyVal {
    
    inline def setId(value: Id): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setIgnore_unmapped(value: Boolean): Self = StObject.set(x, "ignore_unmapped", value.asInstanceOf[js.Any])
    
    inline def setIgnore_unmappedUndefined: Self = StObject.set(x, "ignore_unmapped", js.undefined)
    
    inline def setType(value: RelationName): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
