package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DanglingIndicesListDanglingIndicesResponse extends StObject {
  
  var dangling_indices: js.Array[DanglingIndicesListDanglingIndicesDanglingIndex]
}
object DanglingIndicesListDanglingIndicesResponse {
  
  inline def apply(dangling_indices: js.Array[DanglingIndicesListDanglingIndicesDanglingIndex]): DanglingIndicesListDanglingIndicesResponse = {
    val __obj = js.Dynamic.literal(dangling_indices = dangling_indices.asInstanceOf[js.Any])
    __obj.asInstanceOf[DanglingIndicesListDanglingIndicesResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DanglingIndicesListDanglingIndicesResponse] (val x: Self) extends AnyVal {
    
    inline def setDangling_indices(value: js.Array[DanglingIndicesListDanglingIndicesDanglingIndex]): Self = StObject.set(x, "dangling_indices", value.asInstanceOf[js.Any])
    
    inline def setDangling_indicesVarargs(value: DanglingIndicesListDanglingIndicesDanglingIndex*): Self = StObject.set(x, "dangling_indices", js.Array(value*))
  }
}
