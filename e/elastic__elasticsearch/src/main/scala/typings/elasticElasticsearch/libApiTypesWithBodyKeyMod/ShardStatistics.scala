package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShardStatistics extends StObject {
  
  var failed: uint
  
  var failures: js.UndefOr[js.Array[ShardFailure]] = js.undefined
  
  var skipped: js.UndefOr[uint] = js.undefined
  
  var successful: uint
  
  var total: uint
}
object ShardStatistics {
  
  inline def apply(failed: uint, successful: uint, total: uint): ShardStatistics = {
    val __obj = js.Dynamic.literal(failed = failed.asInstanceOf[js.Any], successful = successful.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShardStatistics]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ShardStatistics] (val x: Self) extends AnyVal {
    
    inline def setFailed(value: uint): Self = StObject.set(x, "failed", value.asInstanceOf[js.Any])
    
    inline def setFailures(value: js.Array[ShardFailure]): Self = StObject.set(x, "failures", value.asInstanceOf[js.Any])
    
    inline def setFailuresUndefined: Self = StObject.set(x, "failures", js.undefined)
    
    inline def setFailuresVarargs(value: ShardFailure*): Self = StObject.set(x, "failures", js.Array(value*))
    
    inline def setSkipped(value: uint): Self = StObject.set(x, "skipped", value.asInstanceOf[js.Any])
    
    inline def setSkippedUndefined: Self = StObject.set(x, "skipped", js.undefined)
    
    inline def setSuccessful(value: uint): Self = StObject.set(x, "successful", value.asInstanceOf[js.Any])
    
    inline def setTotal(value: uint): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
  }
}
