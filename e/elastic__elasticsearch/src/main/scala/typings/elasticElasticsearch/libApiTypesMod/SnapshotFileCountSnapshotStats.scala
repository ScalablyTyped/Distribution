package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SnapshotFileCountSnapshotStats extends StObject {
  
  var file_count: integer
  
  var size_in_bytes: long
}
object SnapshotFileCountSnapshotStats {
  
  inline def apply(file_count: integer, size_in_bytes: long): SnapshotFileCountSnapshotStats = {
    val __obj = js.Dynamic.literal(file_count = file_count.asInstanceOf[js.Any], size_in_bytes = size_in_bytes.asInstanceOf[js.Any])
    __obj.asInstanceOf[SnapshotFileCountSnapshotStats]
  }
  
  extension [Self <: SnapshotFileCountSnapshotStats](x: Self) {
    
    inline def setFile_count(value: integer): Self = StObject.set(x, "file_count", value.asInstanceOf[js.Any])
    
    inline def setSize_in_bytes(value: long): Self = StObject.set(x, "size_in_bytes", value.asInstanceOf[js.Any])
  }
}
