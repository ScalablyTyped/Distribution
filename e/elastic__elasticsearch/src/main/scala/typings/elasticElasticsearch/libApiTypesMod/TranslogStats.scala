package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TranslogStats extends StObject {
  
  var earliest_last_modified_age: long
  
  var operations: long
  
  var size: js.UndefOr[String] = js.undefined
  
  var size_in_bytes: long
  
  var uncommitted_operations: integer
  
  var uncommitted_size: js.UndefOr[String] = js.undefined
  
  var uncommitted_size_in_bytes: long
}
object TranslogStats {
  
  inline def apply(
    earliest_last_modified_age: long,
    operations: long,
    size_in_bytes: long,
    uncommitted_operations: integer,
    uncommitted_size_in_bytes: long
  ): TranslogStats = {
    val __obj = js.Dynamic.literal(earliest_last_modified_age = earliest_last_modified_age.asInstanceOf[js.Any], operations = operations.asInstanceOf[js.Any], size_in_bytes = size_in_bytes.asInstanceOf[js.Any], uncommitted_operations = uncommitted_operations.asInstanceOf[js.Any], uncommitted_size_in_bytes = uncommitted_size_in_bytes.asInstanceOf[js.Any])
    __obj.asInstanceOf[TranslogStats]
  }
  
  extension [Self <: TranslogStats](x: Self) {
    
    inline def setEarliest_last_modified_age(value: long): Self = StObject.set(x, "earliest_last_modified_age", value.asInstanceOf[js.Any])
    
    inline def setOperations(value: long): Self = StObject.set(x, "operations", value.asInstanceOf[js.Any])
    
    inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setSize_in_bytes(value: long): Self = StObject.set(x, "size_in_bytes", value.asInstanceOf[js.Any])
    
    inline def setUncommitted_operations(value: integer): Self = StObject.set(x, "uncommitted_operations", value.asInstanceOf[js.Any])
    
    inline def setUncommitted_size(value: String): Self = StObject.set(x, "uncommitted_size", value.asInstanceOf[js.Any])
    
    inline def setUncommitted_sizeUndefined: Self = StObject.set(x, "uncommitted_size", js.undefined)
    
    inline def setUncommitted_size_in_bytes(value: long): Self = StObject.set(x, "uncommitted_size_in_bytes", value.asInstanceOf[js.Any])
  }
}
