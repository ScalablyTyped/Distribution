package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchProfile extends StObject {
  
  var shards: js.Array[SearchShardProfile]
}
object SearchProfile {
  
  inline def apply(shards: js.Array[SearchShardProfile]): SearchProfile = {
    val __obj = js.Dynamic.literal(shards = shards.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchProfile]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SearchProfile] (val x: Self) extends AnyVal {
    
    inline def setShards(value: js.Array[SearchShardProfile]): Self = StObject.set(x, "shards", value.asInstanceOf[js.Any])
    
    inline def setShardsVarargs(value: SearchShardProfile*): Self = StObject.set(x, "shards", js.Array(value*))
  }
}
