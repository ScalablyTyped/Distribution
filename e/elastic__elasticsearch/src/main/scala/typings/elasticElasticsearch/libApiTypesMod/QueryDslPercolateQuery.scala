package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryDslPercolateQuery
  extends StObject
     with QueryDslQueryBase {
  
  var document: js.UndefOr[Any] = js.undefined
  
  var documents: js.UndefOr[js.Array[Any]] = js.undefined
  
  var field: Field
  
  var id: js.UndefOr[Id] = js.undefined
  
  var index: js.UndefOr[IndexName] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var preference: js.UndefOr[String] = js.undefined
  
  var routing: js.UndefOr[Routing] = js.undefined
  
  var version: js.UndefOr[VersionNumber] = js.undefined
}
object QueryDslPercolateQuery {
  
  inline def apply(field: Field): QueryDslPercolateQuery = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryDslPercolateQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: QueryDslPercolateQuery] (val x: Self) extends AnyVal {
    
    inline def setDocument(value: Any): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
    
    inline def setDocumentUndefined: Self = StObject.set(x, "document", js.undefined)
    
    inline def setDocuments(value: js.Array[Any]): Self = StObject.set(x, "documents", value.asInstanceOf[js.Any])
    
    inline def setDocumentsUndefined: Self = StObject.set(x, "documents", js.undefined)
    
    inline def setDocumentsVarargs(value: Any*): Self = StObject.set(x, "documents", js.Array(value*))
    
    inline def setField(value: Field): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setId(value: Id): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setIndex(value: IndexName): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPreference(value: String): Self = StObject.set(x, "preference", value.asInstanceOf[js.Any])
    
    inline def setPreferenceUndefined: Self = StObject.set(x, "preference", js.undefined)
    
    inline def setRouting(value: Routing): Self = StObject.set(x, "routing", value.asInstanceOf[js.Any])
    
    inline def setRoutingUndefined: Self = StObject.set(x, "routing", js.undefined)
    
    inline def setVersion(value: VersionNumber): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
