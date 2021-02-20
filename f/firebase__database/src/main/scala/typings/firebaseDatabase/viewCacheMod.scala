package typings.firebaseDatabase

import typings.firebaseDatabase.cacheNodeMod.CacheNode
import typings.firebaseDatabase.nodeMod.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object viewCacheMod {
  
  @JSImport("@firebase/database/dist/src/core/view/ViewCache", "ViewCache")
  @js.native
  class ViewCache protected () extends StObject {
    /**
      *
      * @param {!CacheNode} eventCache_
      * @param {!CacheNode} serverCache_
      */
    def this(eventCache_ : CacheNode, serverCache_ : CacheNode) = this()
    
    val eventCache_ : js.Any = js.native
    
    /**
      * @return {?Node}
      */
    def getCompleteEventSnap(): Node | Null = js.native
    
    /**
      * @return {?Node}
      */
    def getCompleteServerSnap(): Node | Null = js.native
    
    /**
      * @return {!CacheNode}
      */
    def getEventCache(): CacheNode = js.native
    
    /**
      * @return {!CacheNode}
      */
    def getServerCache(): CacheNode = js.native
    
    val serverCache_ : js.Any = js.native
    
    /**
      * @param {!Node} eventSnap
      * @param {boolean} complete
      * @param {boolean} filtered
      * @return {!ViewCache}
      */
    def updateEventSnap(eventSnap: Node, complete: Boolean, filtered: Boolean): ViewCache = js.native
    
    /**
      * @param {!Node} serverSnap
      * @param {boolean} complete
      * @param {boolean} filtered
      * @return {!ViewCache}
      */
    def updateServerSnap(serverSnap: Node, complete: Boolean, filtered: Boolean): ViewCache = js.native
  }
  /* static members */
  object ViewCache {
    
    @JSImport("@firebase/database/dist/src/core/view/ViewCache", "ViewCache")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @const
      * @type {ViewCache}
      */
    @JSImport("@firebase/database/dist/src/core/view/ViewCache", "ViewCache.Empty")
    @js.native
    def Empty: ViewCache = js.native
    @scala.inline
    def Empty_=(x: ViewCache): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Empty")(x.asInstanceOf[js.Any])
  }
}
