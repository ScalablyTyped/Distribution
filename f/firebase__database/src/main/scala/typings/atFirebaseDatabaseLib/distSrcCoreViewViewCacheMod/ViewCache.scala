package typings
package atFirebaseDatabaseLib.distSrcCoreViewViewCacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/database/dist/src/core/view/ViewCache", "ViewCache")
@js.native
class ViewCache protected () extends js.Object {
  /**
       *
       * @param {!CacheNode} eventCache_
       * @param {!CacheNode} serverCache_
       */
  def this(`eventCache_`: atFirebaseDatabaseLib.distSrcCoreViewCacheNodeMod.CacheNode, `serverCache_`: atFirebaseDatabaseLib.distSrcCoreViewCacheNodeMod.CacheNode) = this()
  val `eventCache_`: js.Any = js.native
  val `serverCache_`: js.Any = js.native
  /**
       * @return {?Node}
       */
  def getCompleteEventSnap(): atFirebaseDatabaseLib.distSrcCoreSnapNodeMod.Node | scala.Null = js.native
  /**
       * @return {?Node}
       */
  def getCompleteServerSnap(): atFirebaseDatabaseLib.distSrcCoreSnapNodeMod.Node | scala.Null = js.native
  /**
       * @return {!CacheNode}
       */
  def getEventCache(): atFirebaseDatabaseLib.distSrcCoreViewCacheNodeMod.CacheNode = js.native
  /**
       * @return {!CacheNode}
       */
  def getServerCache(): atFirebaseDatabaseLib.distSrcCoreViewCacheNodeMod.CacheNode = js.native
  /**
       * @param {!Node} eventSnap
       * @param {boolean} complete
       * @param {boolean} filtered
       * @return {!ViewCache}
       */
  def updateEventSnap(
    eventSnap: atFirebaseDatabaseLib.distSrcCoreSnapNodeMod.Node,
    complete: scala.Boolean,
    filtered: scala.Boolean
  ): ViewCache = js.native
  /**
       * @param {!Node} serverSnap
       * @param {boolean} complete
       * @param {boolean} filtered
       * @return {!ViewCache}
       */
  def updateServerSnap(
    serverSnap: atFirebaseDatabaseLib.distSrcCoreSnapNodeMod.Node,
    complete: scala.Boolean,
    filtered: scala.Boolean
  ): ViewCache = js.native
}

@JSImport("@firebase/database/dist/src/core/view/ViewCache", "ViewCache")
@js.native
object ViewCache extends js.Object {
  /**
       * @const
       * @type {ViewCache}
       */
  var Empty: atFirebaseDatabaseLib.distSrcCoreViewViewCacheMod.ViewCache = js.native
}

