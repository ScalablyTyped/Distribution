package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndicesCloseCloseIndexResult extends StObject {
  
  var closed: Boolean
  
  var shards: js.UndefOr[Record[String, IndicesCloseCloseShardResult]] = js.undefined
}
object IndicesCloseCloseIndexResult {
  
  inline def apply(closed: Boolean): IndicesCloseCloseIndexResult = {
    val __obj = js.Dynamic.literal(closed = closed.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndicesCloseCloseIndexResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IndicesCloseCloseIndexResult] (val x: Self) extends AnyVal {
    
    inline def setClosed(value: Boolean): Self = StObject.set(x, "closed", value.asInstanceOf[js.Any])
    
    inline def setShards(value: Record[String, IndicesCloseCloseShardResult]): Self = StObject.set(x, "shards", value.asInstanceOf[js.Any])
    
    inline def setShardsUndefined: Self = StObject.set(x, "shards", js.undefined)
  }
}
