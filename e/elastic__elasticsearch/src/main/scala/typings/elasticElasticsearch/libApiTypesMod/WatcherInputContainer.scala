package typings.elasticElasticsearch.libApiTypesMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WatcherInputContainer extends StObject {
  
  var chain: js.UndefOr[WatcherChainInput] = js.undefined
  
  var http: js.UndefOr[WatcherHttpInput] = js.undefined
  
  var search: js.UndefOr[WatcherSearchInput] = js.undefined
  
  var simple: js.UndefOr[Record[String, Any]] = js.undefined
}
object WatcherInputContainer {
  
  inline def apply(): WatcherInputContainer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WatcherInputContainer]
  }
  
  extension [Self <: WatcherInputContainer](x: Self) {
    
    inline def setChain(value: WatcherChainInput): Self = StObject.set(x, "chain", value.asInstanceOf[js.Any])
    
    inline def setChainUndefined: Self = StObject.set(x, "chain", js.undefined)
    
    inline def setHttp(value: WatcherHttpInput): Self = StObject.set(x, "http", value.asInstanceOf[js.Any])
    
    inline def setHttpUndefined: Self = StObject.set(x, "http", js.undefined)
    
    inline def setSearch(value: WatcherSearchInput): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
    
    inline def setSearchUndefined: Self = StObject.set(x, "search", js.undefined)
    
    inline def setSimple(value: Record[String, Any]): Self = StObject.set(x, "simple", value.asInstanceOf[js.Any])
    
    inline def setSimpleUndefined: Self = StObject.set(x, "simple", js.undefined)
  }
}
