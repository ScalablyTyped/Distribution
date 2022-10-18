package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SnapshotShardsStats extends StObject {
  
  var done: long
  
  var failed: long
  
  var finalizing: long
  
  var initializing: long
  
  var started: long
  
  var total: long
}
object SnapshotShardsStats {
  
  inline def apply(done: long, failed: long, finalizing: long, initializing: long, started: long, total: long): SnapshotShardsStats = {
    val __obj = js.Dynamic.literal(done = done.asInstanceOf[js.Any], failed = failed.asInstanceOf[js.Any], finalizing = finalizing.asInstanceOf[js.Any], initializing = initializing.asInstanceOf[js.Any], started = started.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[SnapshotShardsStats]
  }
  
  extension [Self <: SnapshotShardsStats](x: Self) {
    
    inline def setDone(value: long): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
    
    inline def setFailed(value: long): Self = StObject.set(x, "failed", value.asInstanceOf[js.Any])
    
    inline def setFinalizing(value: long): Self = StObject.set(x, "finalizing", value.asInstanceOf[js.Any])
    
    inline def setInitializing(value: long): Self = StObject.set(x, "initializing", value.asInstanceOf[js.Any])
    
    inline def setStarted(value: long): Self = StObject.set(x, "started", value.asInstanceOf[js.Any])
    
    inline def setTotal(value: long): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
  }
}
