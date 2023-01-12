package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndicesCloseCloseShardResult extends StObject {
  
  var failures: js.Array[ShardFailure]
}
object IndicesCloseCloseShardResult {
  
  inline def apply(failures: js.Array[ShardFailure]): IndicesCloseCloseShardResult = {
    val __obj = js.Dynamic.literal(failures = failures.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndicesCloseCloseShardResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IndicesCloseCloseShardResult] (val x: Self) extends AnyVal {
    
    inline def setFailures(value: js.Array[ShardFailure]): Self = StObject.set(x, "failures", value.asInstanceOf[js.Any])
    
    inline def setFailuresVarargs(value: ShardFailure*): Self = StObject.set(x, "failures", js.Array(value*))
  }
}
