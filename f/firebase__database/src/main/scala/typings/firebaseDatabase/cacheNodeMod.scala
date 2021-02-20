package typings.firebaseDatabase

import typings.firebaseDatabase.nodeMod.Node
import typings.firebaseDatabase.pathMod.Path
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cacheNodeMod {
  
  @JSImport("@firebase/database/dist/src/core/view/CacheNode", "CacheNode")
  @js.native
  class CacheNode protected () extends StObject {
    /**
      * @param {!Node} node_
      * @param {boolean} fullyInitialized_
      * @param {boolean} filtered_
      */
    def this(node_ : Node, fullyInitialized_ : Boolean, filtered_ : Boolean) = this()
    
    var filtered_ : js.Any = js.native
    
    var fullyInitialized_ : js.Any = js.native
    
    /**
      * @return {!Node}
      */
    def getNode(): Node = js.native
    
    /**
      * @param {!string} key
      * @return {boolean}
      */
    def isCompleteForChild(key: String): Boolean = js.native
    
    /**
      * @param {!Path} path
      * @return {boolean}
      */
    def isCompleteForPath(path: Path): Boolean = js.native
    
    /**
      * Returns whether this node is potentially missing children due to a filter applied to the node
      * @return {boolean}
      */
    def isFiltered(): Boolean = js.native
    
    /**
      * Returns whether this node was fully initialized with either server data or a complete overwrite by the client
      * @return {boolean}
      */
    def isFullyInitialized(): Boolean = js.native
    
    var node_ : js.Any = js.native
  }
}
