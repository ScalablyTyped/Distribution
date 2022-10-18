package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SnapshotCleanupRepositoryCleanupRepositoryResults extends StObject {
  
  var deleted_blobs: long
  
  var deleted_bytes: long
}
object SnapshotCleanupRepositoryCleanupRepositoryResults {
  
  inline def apply(deleted_blobs: long, deleted_bytes: long): SnapshotCleanupRepositoryCleanupRepositoryResults = {
    val __obj = js.Dynamic.literal(deleted_blobs = deleted_blobs.asInstanceOf[js.Any], deleted_bytes = deleted_bytes.asInstanceOf[js.Any])
    __obj.asInstanceOf[SnapshotCleanupRepositoryCleanupRepositoryResults]
  }
  
  extension [Self <: SnapshotCleanupRepositoryCleanupRepositoryResults](x: Self) {
    
    inline def setDeleted_blobs(value: long): Self = StObject.set(x, "deleted_blobs", value.asInstanceOf[js.Any])
    
    inline def setDeleted_bytes(value: long): Self = StObject.set(x, "deleted_bytes", value.asInstanceOf[js.Any])
  }
}
