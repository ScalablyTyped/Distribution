package typings.firebaseDatabase

import typings.firebaseDatabase.snapNodeMod.Node
import typings.firebaseDatabase.viewCacheNodeMod.CacheNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object viewViewCacheMod {
  
  @JSImport("@firebase/database/dist/src/core/view/ViewCache", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def newViewCache(eventCache: CacheNode, serverCache: CacheNode): ViewCache = (^.asInstanceOf[js.Dynamic].applyDynamic("newViewCache")(eventCache.asInstanceOf[js.Any], serverCache.asInstanceOf[js.Any])).asInstanceOf[ViewCache]
  
  inline def viewCacheGetCompleteEventSnap(viewCache: ViewCache): Node | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("viewCacheGetCompleteEventSnap")(viewCache.asInstanceOf[js.Any]).asInstanceOf[Node | Null]
  
  inline def viewCacheGetCompleteServerSnap(viewCache: ViewCache): Node | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("viewCacheGetCompleteServerSnap")(viewCache.asInstanceOf[js.Any]).asInstanceOf[Node | Null]
  
  inline def viewCacheUpdateEventSnap(viewCache: ViewCache, eventSnap: Node, complete: Boolean, filtered: Boolean): ViewCache = (^.asInstanceOf[js.Dynamic].applyDynamic("viewCacheUpdateEventSnap")(viewCache.asInstanceOf[js.Any], eventSnap.asInstanceOf[js.Any], complete.asInstanceOf[js.Any], filtered.asInstanceOf[js.Any])).asInstanceOf[ViewCache]
  
  inline def viewCacheUpdateServerSnap(viewCache: ViewCache, serverSnap: Node, complete: Boolean, filtered: Boolean): ViewCache = (^.asInstanceOf[js.Dynamic].applyDynamic("viewCacheUpdateServerSnap")(viewCache.asInstanceOf[js.Any], serverSnap.asInstanceOf[js.Any], complete.asInstanceOf[js.Any], filtered.asInstanceOf[js.Any])).asInstanceOf[ViewCache]
  
  trait ViewCache extends StObject {
    
    val eventCache: CacheNode
    
    val serverCache: CacheNode
  }
  object ViewCache {
    
    inline def apply(eventCache: CacheNode, serverCache: CacheNode): ViewCache = {
      val __obj = js.Dynamic.literal(eventCache = eventCache.asInstanceOf[js.Any], serverCache = serverCache.asInstanceOf[js.Any])
      __obj.asInstanceOf[ViewCache]
    }
    
    extension [Self <: ViewCache](x: Self) {
      
      inline def setEventCache(value: CacheNode): Self = StObject.set(x, "eventCache", value.asInstanceOf[js.Any])
      
      inline def setServerCache(value: CacheNode): Self = StObject.set(x, "serverCache", value.asInstanceOf[js.Any])
    }
  }
}
