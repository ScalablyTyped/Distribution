package typings.elasticElasticsearch.anon

import typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.IndexName
import typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Currentnode extends StObject {
  
  var current_node: js.UndefOr[String] = js.undefined
  
  var index: js.UndefOr[IndexName] = js.undefined
  
  var primary: js.UndefOr[Boolean] = js.undefined
  
  var shard: js.UndefOr[integer] = js.undefined
}
object Currentnode {
  
  inline def apply(): Currentnode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Currentnode]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Currentnode] (val x: Self) extends AnyVal {
    
    inline def setCurrent_node(value: String): Self = StObject.set(x, "current_node", value.asInstanceOf[js.Any])
    
    inline def setCurrent_nodeUndefined: Self = StObject.set(x, "current_node", js.undefined)
    
    inline def setIndex(value: IndexName): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setPrimary(value: Boolean): Self = StObject.set(x, "primary", value.asInstanceOf[js.Any])
    
    inline def setPrimaryUndefined: Self = StObject.set(x, "primary", js.undefined)
    
    inline def setShard(value: integer): Self = StObject.set(x, "shard", value.asInstanceOf[js.Any])
    
    inline def setShardUndefined: Self = StObject.set(x, "shard", js.undefined)
  }
}
