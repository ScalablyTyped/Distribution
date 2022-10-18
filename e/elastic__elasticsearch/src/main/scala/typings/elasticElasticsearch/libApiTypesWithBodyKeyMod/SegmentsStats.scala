package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SegmentsStats extends StObject {
  
  var count: integer
  
  var doc_values_memory: js.UndefOr[ByteSize] = js.undefined
  
  var doc_values_memory_in_bytes: integer
  
  var file_sizes: Record[String, IndicesStatsShardFileSizeInfo]
  
  var fixed_bit_set: js.UndefOr[ByteSize] = js.undefined
  
  var fixed_bit_set_memory_in_bytes: integer
  
  var index_writer_max_memory_in_bytes: js.UndefOr[integer] = js.undefined
  
  var index_writer_memory: js.UndefOr[ByteSize] = js.undefined
  
  var index_writer_memory_in_bytes: integer
  
  var max_unsafe_auto_id_timestamp: long
  
  var memory: js.UndefOr[ByteSize] = js.undefined
  
  var memory_in_bytes: integer
  
  var norms_memory: js.UndefOr[ByteSize] = js.undefined
  
  var norms_memory_in_bytes: integer
  
  var points_memory: js.UndefOr[ByteSize] = js.undefined
  
  var points_memory_in_bytes: integer
  
  var stored_fields_memory_in_bytes: integer
  
  var stored_memory: js.UndefOr[ByteSize] = js.undefined
  
  var term_vectors_memory_in_bytes: integer
  
  var term_vectory_memory: js.UndefOr[ByteSize] = js.undefined
  
  var terms_memory: js.UndefOr[ByteSize] = js.undefined
  
  var terms_memory_in_bytes: integer
  
  var version_map_memory: js.UndefOr[ByteSize] = js.undefined
  
  var version_map_memory_in_bytes: integer
}
object SegmentsStats {
  
  inline def apply(
    count: integer,
    doc_values_memory_in_bytes: integer,
    file_sizes: Record[String, IndicesStatsShardFileSizeInfo],
    fixed_bit_set_memory_in_bytes: integer,
    index_writer_memory_in_bytes: integer,
    max_unsafe_auto_id_timestamp: long,
    memory_in_bytes: integer,
    norms_memory_in_bytes: integer,
    points_memory_in_bytes: integer,
    stored_fields_memory_in_bytes: integer,
    term_vectors_memory_in_bytes: integer,
    terms_memory_in_bytes: integer,
    version_map_memory_in_bytes: integer
  ): SegmentsStats = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], doc_values_memory_in_bytes = doc_values_memory_in_bytes.asInstanceOf[js.Any], file_sizes = file_sizes.asInstanceOf[js.Any], fixed_bit_set_memory_in_bytes = fixed_bit_set_memory_in_bytes.asInstanceOf[js.Any], index_writer_memory_in_bytes = index_writer_memory_in_bytes.asInstanceOf[js.Any], max_unsafe_auto_id_timestamp = max_unsafe_auto_id_timestamp.asInstanceOf[js.Any], memory_in_bytes = memory_in_bytes.asInstanceOf[js.Any], norms_memory_in_bytes = norms_memory_in_bytes.asInstanceOf[js.Any], points_memory_in_bytes = points_memory_in_bytes.asInstanceOf[js.Any], stored_fields_memory_in_bytes = stored_fields_memory_in_bytes.asInstanceOf[js.Any], term_vectors_memory_in_bytes = term_vectors_memory_in_bytes.asInstanceOf[js.Any], terms_memory_in_bytes = terms_memory_in_bytes.asInstanceOf[js.Any], version_map_memory_in_bytes = version_map_memory_in_bytes.asInstanceOf[js.Any])
    __obj.asInstanceOf[SegmentsStats]
  }
  
  extension [Self <: SegmentsStats](x: Self) {
    
    inline def setCount(value: integer): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setDoc_values_memory(value: ByteSize): Self = StObject.set(x, "doc_values_memory", value.asInstanceOf[js.Any])
    
    inline def setDoc_values_memoryUndefined: Self = StObject.set(x, "doc_values_memory", js.undefined)
    
    inline def setDoc_values_memory_in_bytes(value: integer): Self = StObject.set(x, "doc_values_memory_in_bytes", value.asInstanceOf[js.Any])
    
    inline def setFile_sizes(value: Record[String, IndicesStatsShardFileSizeInfo]): Self = StObject.set(x, "file_sizes", value.asInstanceOf[js.Any])
    
    inline def setFixed_bit_set(value: ByteSize): Self = StObject.set(x, "fixed_bit_set", value.asInstanceOf[js.Any])
    
    inline def setFixed_bit_setUndefined: Self = StObject.set(x, "fixed_bit_set", js.undefined)
    
    inline def setFixed_bit_set_memory_in_bytes(value: integer): Self = StObject.set(x, "fixed_bit_set_memory_in_bytes", value.asInstanceOf[js.Any])
    
    inline def setIndex_writer_max_memory_in_bytes(value: integer): Self = StObject.set(x, "index_writer_max_memory_in_bytes", value.asInstanceOf[js.Any])
    
    inline def setIndex_writer_max_memory_in_bytesUndefined: Self = StObject.set(x, "index_writer_max_memory_in_bytes", js.undefined)
    
    inline def setIndex_writer_memory(value: ByteSize): Self = StObject.set(x, "index_writer_memory", value.asInstanceOf[js.Any])
    
    inline def setIndex_writer_memoryUndefined: Self = StObject.set(x, "index_writer_memory", js.undefined)
    
    inline def setIndex_writer_memory_in_bytes(value: integer): Self = StObject.set(x, "index_writer_memory_in_bytes", value.asInstanceOf[js.Any])
    
    inline def setMax_unsafe_auto_id_timestamp(value: long): Self = StObject.set(x, "max_unsafe_auto_id_timestamp", value.asInstanceOf[js.Any])
    
    inline def setMemory(value: ByteSize): Self = StObject.set(x, "memory", value.asInstanceOf[js.Any])
    
    inline def setMemoryUndefined: Self = StObject.set(x, "memory", js.undefined)
    
    inline def setMemory_in_bytes(value: integer): Self = StObject.set(x, "memory_in_bytes", value.asInstanceOf[js.Any])
    
    inline def setNorms_memory(value: ByteSize): Self = StObject.set(x, "norms_memory", value.asInstanceOf[js.Any])
    
    inline def setNorms_memoryUndefined: Self = StObject.set(x, "norms_memory", js.undefined)
    
    inline def setNorms_memory_in_bytes(value: integer): Self = StObject.set(x, "norms_memory_in_bytes", value.asInstanceOf[js.Any])
    
    inline def setPoints_memory(value: ByteSize): Self = StObject.set(x, "points_memory", value.asInstanceOf[js.Any])
    
    inline def setPoints_memoryUndefined: Self = StObject.set(x, "points_memory", js.undefined)
    
    inline def setPoints_memory_in_bytes(value: integer): Self = StObject.set(x, "points_memory_in_bytes", value.asInstanceOf[js.Any])
    
    inline def setStored_fields_memory_in_bytes(value: integer): Self = StObject.set(x, "stored_fields_memory_in_bytes", value.asInstanceOf[js.Any])
    
    inline def setStored_memory(value: ByteSize): Self = StObject.set(x, "stored_memory", value.asInstanceOf[js.Any])
    
    inline def setStored_memoryUndefined: Self = StObject.set(x, "stored_memory", js.undefined)
    
    inline def setTerm_vectors_memory_in_bytes(value: integer): Self = StObject.set(x, "term_vectors_memory_in_bytes", value.asInstanceOf[js.Any])
    
    inline def setTerm_vectory_memory(value: ByteSize): Self = StObject.set(x, "term_vectory_memory", value.asInstanceOf[js.Any])
    
    inline def setTerm_vectory_memoryUndefined: Self = StObject.set(x, "term_vectory_memory", js.undefined)
    
    inline def setTerms_memory(value: ByteSize): Self = StObject.set(x, "terms_memory", value.asInstanceOf[js.Any])
    
    inline def setTerms_memoryUndefined: Self = StObject.set(x, "terms_memory", js.undefined)
    
    inline def setTerms_memory_in_bytes(value: integer): Self = StObject.set(x, "terms_memory_in_bytes", value.asInstanceOf[js.Any])
    
    inline def setVersion_map_memory(value: ByteSize): Self = StObject.set(x, "version_map_memory", value.asInstanceOf[js.Any])
    
    inline def setVersion_map_memoryUndefined: Self = StObject.set(x, "version_map_memory", js.undefined)
    
    inline def setVersion_map_memory_in_bytes(value: integer): Self = StObject.set(x, "version_map_memory_in_bytes", value.asInstanceOf[js.Any])
  }
}
