package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MtermvectorsTermVectorsResult extends StObject {
  
  var _id: Id
  
  var _index: IndexName
  
  var _version: js.UndefOr[VersionNumber] = js.undefined
  
  var error: js.UndefOr[ErrorCause] = js.undefined
  
  var found: js.UndefOr[Boolean] = js.undefined
  
  var term_vectors: js.UndefOr[Record[Field, TermvectorsTermVector]] = js.undefined
  
  var took: js.UndefOr[long] = js.undefined
}
object MtermvectorsTermVectorsResult {
  
  inline def apply(_id: Id, _index: IndexName): MtermvectorsTermVectorsResult = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], _index = _index.asInstanceOf[js.Any])
    __obj.asInstanceOf[MtermvectorsTermVectorsResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MtermvectorsTermVectorsResult] (val x: Self) extends AnyVal {
    
    inline def setError(value: ErrorCause): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setFound(value: Boolean): Self = StObject.set(x, "found", value.asInstanceOf[js.Any])
    
    inline def setFoundUndefined: Self = StObject.set(x, "found", js.undefined)
    
    inline def setTerm_vectors(value: Record[Field, TermvectorsTermVector]): Self = StObject.set(x, "term_vectors", value.asInstanceOf[js.Any])
    
    inline def setTerm_vectorsUndefined: Self = StObject.set(x, "term_vectors", js.undefined)
    
    inline def setTook(value: long): Self = StObject.set(x, "took", value.asInstanceOf[js.Any])
    
    inline def setTookUndefined: Self = StObject.set(x, "took", js.undefined)
    
    inline def set_id(value: Id): Self = StObject.set(x, "_id", value.asInstanceOf[js.Any])
    
    inline def set_index(value: IndexName): Self = StObject.set(x, "_index", value.asInstanceOf[js.Any])
    
    inline def set_version(value: VersionNumber): Self = StObject.set(x, "_version", value.asInstanceOf[js.Any])
    
    inline def set_versionUndefined: Self = StObject.set(x, "_version", js.undefined)
  }
}
