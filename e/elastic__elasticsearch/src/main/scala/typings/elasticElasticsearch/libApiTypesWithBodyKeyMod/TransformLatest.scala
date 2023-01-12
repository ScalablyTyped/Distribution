package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransformLatest extends StObject {
  
  var sort: Field
  
  var unique_key: js.Array[Field]
}
object TransformLatest {
  
  inline def apply(sort: Field, unique_key: js.Array[Field]): TransformLatest = {
    val __obj = js.Dynamic.literal(sort = sort.asInstanceOf[js.Any], unique_key = unique_key.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransformLatest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TransformLatest] (val x: Self) extends AnyVal {
    
    inline def setSort(value: Field): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
    
    inline def setUnique_key(value: js.Array[Field]): Self = StObject.set(x, "unique_key", value.asInstanceOf[js.Any])
    
    inline def setUnique_keyVarargs(value: Field*): Self = StObject.set(x, "unique_key", js.Array(value*))
  }
}
