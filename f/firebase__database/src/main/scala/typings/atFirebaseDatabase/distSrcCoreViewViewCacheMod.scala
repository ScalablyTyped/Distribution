package typings.atFirebaseDatabase

import typings.atFirebaseDatabase.distSrcCoreSnapNodeMod.Node
import typings.atFirebaseDatabase.distSrcCoreViewCacheNodeMod.CacheNode
import typings.atFirebaseDatabase.distSrcCoreViewViewCacheMod.ViewCache
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/database/dist/src/core/view/ViewCache", JSImport.Namespace)
@js.native
object distSrcCoreViewViewCacheMod extends js.Object {
  @js.native
  class ViewCache protected () extends js.Object {
    /**
      *
      * @param {!CacheNode} eventCache_
      * @param {!CacheNode} serverCache_
      */
    def this(eventCache_ : CacheNode, serverCache_ : CacheNode) = this()
    val eventCache_ : js.Any = js.native
    val serverCache_ : js.Any = js.native
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
  @js.native
  object ViewCache extends js.Object {
    /**
      * @const
      * @type {ViewCache}
      */
    var Empty: ViewCache = js.native
  }
  
}

