package typings.elasticElasticsearch.libApiTypesMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TermvectorsResponse extends StObject {
  
  var _id: Id
  
  var _index: IndexName
  
  var _version: VersionNumber
  
  var found: Boolean
  
  var term_vectors: js.UndefOr[Record[Field, TermvectorsTermVector]] = js.undefined
  
  var took: long
}
object TermvectorsResponse {
  
  inline def apply(_id: Id, _index: IndexName, _version: VersionNumber, found: Boolean, took: long): TermvectorsResponse = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], _index = _index.asInstanceOf[js.Any], _version = _version.asInstanceOf[js.Any], found = found.asInstanceOf[js.Any], took = took.asInstanceOf[js.Any])
    __obj.asInstanceOf[TermvectorsResponse]
  }
  
  extension [Self <: TermvectorsResponse](x: Self) {
    
    inline def setFound(value: Boolean): Self = StObject.set(x, "found", value.asInstanceOf[js.Any])
    
    inline def setTerm_vectors(value: Record[Field, TermvectorsTermVector]): Self = StObject.set(x, "term_vectors", value.asInstanceOf[js.Any])
    
    inline def setTerm_vectorsUndefined: Self = StObject.set(x, "term_vectors", js.undefined)
    
    inline def setTook(value: long): Self = StObject.set(x, "took", value.asInstanceOf[js.Any])
    
    inline def set_id(value: Id): Self = StObject.set(x, "_id", value.asInstanceOf[js.Any])
    
    inline def set_index(value: IndexName): Self = StObject.set(x, "_index", value.asInstanceOf[js.Any])
    
    inline def set_version(value: VersionNumber): Self = StObject.set(x, "_version", value.asInstanceOf[js.Any])
  }
}
