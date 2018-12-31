package typings
package atFirebaseDatabaseLib.distSrcCoreViewCacheNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/database/dist/src/core/view/CacheNode", "CacheNode")
@js.native
class CacheNode protected () extends js.Object {
  /**
    * @param {!Node} node_
    * @param {boolean} fullyInitialized_
    * @param {boolean} filtered_
    */
  def this(`node_`: atFirebaseDatabaseLib.distSrcCoreSnapNodeMod.Node, `fullyInitialized_`: scala.Boolean, `filtered_`: scala.Boolean) = this()
  var `filtered_`: js.Any = js.native
  var `fullyInitialized_`: js.Any = js.native
  var `node_`: js.Any = js.native
  /**
    * @return {!Node}
    */
  def getNode(): atFirebaseDatabaseLib.distSrcCoreSnapNodeMod.Node = js.native
  /**
    * @param {!string} key
    * @return {boolean}
    */
  def isCompleteForChild(key: java.lang.String): scala.Boolean = js.native
  /**
    * @param {!Path} path
    * @return {boolean}
    */
  def isCompleteForPath(path: atFirebaseDatabaseLib.distSrcCoreUtilPathMod.Path): scala.Boolean = js.native
  /**
    * Returns whether this node is potentially missing children due to a filter applied to the node
    * @return {boolean}
    */
  def isFiltered(): scala.Boolean = js.native
  /**
    * Returns whether this node was fully initialized with either server data or a complete overwrite by the client
    * @return {boolean}
    */
  def isFullyInitialized(): scala.Boolean = js.native
}

