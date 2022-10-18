package typings.firebaseDatabase

import typings.firebaseDatabase.distSrcCoreSnapNodeMod.Node
import typings.firebaseDatabase.distSrcCoreUtilPathMod.Path
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcCoreViewCacheNodeMod {
  
  @JSImport("@firebase/database/dist/src/core/view/CacheNode", "CacheNode")
  @js.native
  open class CacheNode protected () extends StObject {
    def this(node_ : Node, fullyInitialized_ : Boolean, filtered_ : Boolean) = this()
    
    /* private */ var filtered_ : Any = js.native
    
    /* private */ var fullyInitialized_ : Any = js.native
    
    def getNode(): Node = js.native
    
    def isCompleteForChild(key: String): Boolean = js.native
    
    def isCompleteForPath(path: Path): Boolean = js.native
    
    /**
      * Returns whether this node is potentially missing children due to a filter applied to the node
      */
    def isFiltered(): Boolean = js.native
    
    /**
      * Returns whether this node was fully initialized with either server data or a complete overwrite by the client
      */
    def isFullyInitialized(): Boolean = js.native
    
    /* private */ var node_ : Any = js.native
  }
}
