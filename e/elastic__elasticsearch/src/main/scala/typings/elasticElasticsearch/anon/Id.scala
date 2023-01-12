package typings.elasticElasticsearch.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Id extends StObject {
  
  var id: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.Id
}
object Id {
  
  inline def apply(id: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.Id): Id = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Id]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Id] (val x: Self) extends AnyVal {
    
    inline def setId(value: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.Id): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
