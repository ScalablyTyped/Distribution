package typings.elasticElasticsearch.libApiTypesMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndicesSegmentsSegment extends StObject {
  
  var attributes: Record[String, String]
  
  var committed: Boolean
  
  var compound: Boolean
  
  var deleted_docs: long
  
  var generation: integer
  
  var memory_in_bytes: double
  
  var num_docs: long
  
  var search: Boolean
  
  var size_in_bytes: double
  
  var version: VersionString
}
object IndicesSegmentsSegment {
  
  inline def apply(
    attributes: Record[String, String],
    committed: Boolean,
    compound: Boolean,
    deleted_docs: long,
    generation: integer,
    memory_in_bytes: double,
    num_docs: long,
    search: Boolean,
    size_in_bytes: double,
    version: VersionString
  ): IndicesSegmentsSegment = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], committed = committed.asInstanceOf[js.Any], compound = compound.asInstanceOf[js.Any], deleted_docs = deleted_docs.asInstanceOf[js.Any], generation = generation.asInstanceOf[js.Any], memory_in_bytes = memory_in_bytes.asInstanceOf[js.Any], num_docs = num_docs.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any], size_in_bytes = size_in_bytes.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndicesSegmentsSegment]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IndicesSegmentsSegment] (val x: Self) extends AnyVal {
    
    inline def setAttributes(value: Record[String, String]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setCommitted(value: Boolean): Self = StObject.set(x, "committed", value.asInstanceOf[js.Any])
    
    inline def setCompound(value: Boolean): Self = StObject.set(x, "compound", value.asInstanceOf[js.Any])
    
    inline def setDeleted_docs(value: long): Self = StObject.set(x, "deleted_docs", value.asInstanceOf[js.Any])
    
    inline def setGeneration(value: integer): Self = StObject.set(x, "generation", value.asInstanceOf[js.Any])
    
    inline def setMemory_in_bytes(value: double): Self = StObject.set(x, "memory_in_bytes", value.asInstanceOf[js.Any])
    
    inline def setNum_docs(value: long): Self = StObject.set(x, "num_docs", value.asInstanceOf[js.Any])
    
    inline def setSearch(value: Boolean): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
    
    inline def setSize_in_bytes(value: double): Self = StObject.set(x, "size_in_bytes", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: VersionString): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
