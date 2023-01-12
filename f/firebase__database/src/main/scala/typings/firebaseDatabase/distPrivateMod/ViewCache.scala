package typings.firebaseDatabase.distPrivateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Stores the data we have cached for a view.
  *
  * serverSnap is the cached server data, eventSnap is the cached event data (server data plus any local writes).
  */
trait ViewCache extends StObject {
  
  val eventCache: CacheNode
  
  val serverCache: CacheNode
}
object ViewCache {
  
  inline def apply(eventCache: CacheNode, serverCache: CacheNode): ViewCache = {
    val __obj = js.Dynamic.literal(eventCache = eventCache.asInstanceOf[js.Any], serverCache = serverCache.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewCache]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ViewCache] (val x: Self) extends AnyVal {
    
    inline def setEventCache(value: CacheNode): Self = StObject.set(x, "eventCache", value.asInstanceOf[js.Any])
    
    inline def setServerCache(value: CacheNode): Self = StObject.set(x, "serverCache", value.asInstanceOf[js.Any])
  }
}
