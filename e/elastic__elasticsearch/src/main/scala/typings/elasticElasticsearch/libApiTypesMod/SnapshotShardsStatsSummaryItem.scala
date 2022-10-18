package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SnapshotShardsStatsSummaryItem extends StObject {
  
  var file_count: long
  
  var size_in_bytes: long
}
object SnapshotShardsStatsSummaryItem {
  
  inline def apply(file_count: long, size_in_bytes: long): SnapshotShardsStatsSummaryItem = {
    val __obj = js.Dynamic.literal(file_count = file_count.asInstanceOf[js.Any], size_in_bytes = size_in_bytes.asInstanceOf[js.Any])
    __obj.asInstanceOf[SnapshotShardsStatsSummaryItem]
  }
  
  extension [Self <: SnapshotShardsStatsSummaryItem](x: Self) {
    
    inline def setFile_count(value: long): Self = StObject.set(x, "file_count", value.asInstanceOf[js.Any])
    
    inline def setSize_in_bytes(value: long): Self = StObject.set(x, "size_in_bytes", value.asInstanceOf[js.Any])
  }
}
