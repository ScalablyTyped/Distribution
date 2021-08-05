package typings.elasticlunr.mod

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SerialisedIndexData[T] extends StObject {
  
  var documentStore: SerialisedDocumentStore[T]
  
  var fields: js.Array[/* keyof T */ String]
  
  var index: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]:? elasticlunr.elasticlunr.InvertedIndexNode}
    */ typings.elasticlunr.elasticlunrStrings.SerialisedIndexData & TopLevel[js.Any]
  
  var pipeline: SerialisedPipeline
  
  var ref: /* keyof T */ String
  
  var version: String
}
object SerialisedIndexData {
  
  inline def apply[T](
    documentStore: SerialisedDocumentStore[T],
    fields: js.Array[/* keyof T */ String],
    index: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]:? elasticlunr.elasticlunr.InvertedIndexNode}
    */ typings.elasticlunr.elasticlunrStrings.SerialisedIndexData & TopLevel[js.Any],
    pipeline: SerialisedPipeline,
    ref: /* keyof T */ String,
    version: String
  ): SerialisedIndexData[T] = {
    val __obj = js.Dynamic.literal(documentStore = documentStore.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], pipeline = pipeline.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[SerialisedIndexData[T]]
  }
  
  extension [Self <: SerialisedIndexData[?], T](x: Self & SerialisedIndexData[T]) {
    
    inline def setDocumentStore(value: SerialisedDocumentStore[T]): Self = StObject.set(x, "documentStore", value.asInstanceOf[js.Any])
    
    inline def setFields(value: js.Array[/* keyof T */ String]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsVarargs(value: (/* keyof T */ String)*): Self = StObject.set(x, "fields", js.Array(value :_*))
    
    inline def setIndex(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof T ]:? elasticlunr.elasticlunr.InvertedIndexNode}
      */ typings.elasticlunr.elasticlunrStrings.SerialisedIndexData & TopLevel[js.Any]
    ): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setPipeline(value: SerialisedPipeline): Self = StObject.set(x, "pipeline", value.asInstanceOf[js.Any])
    
    inline def setPipelineVarargs(value: String*): Self = StObject.set(x, "pipeline", js.Array(value :_*))
    
    inline def setRef(value: /* keyof T */ String): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
