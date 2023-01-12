package typings.firebaseDatabase.distInternalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A cache node only stores complete children. Additionally it holds a flag whether the node can be considered fully
  * initialized in the sense that we know at one point in time this represented a valid state of the world, e.g.
  * initialized with data from the server, or a complete overwrite by the client. The filtered flag also tracks
  * whether a node potentially had children removed due to a filter.
  */
trait CacheNode extends StObject {
  
  /* private */ var filtered_ : Any
  
  /* private */ var fullyInitialized_ : Any
  
  def getNode(): Node2
  
  def isCompleteForChild(key: String): Boolean
  
  def isCompleteForPath(path: Path): Boolean
  
  /**
    * Returns whether this node is potentially missing children due to a filter applied to the node
    */
  def isFiltered(): Boolean
  
  /**
    * Returns whether this node was fully initialized with either server data or a complete overwrite by the client
    */
  def isFullyInitialized(): Boolean
  
  /* private */ var node_ : Any
}
object CacheNode {
  
  inline def apply(
    filtered_ : Any,
    fullyInitialized_ : Any,
    getNode: () => Node2,
    isCompleteForChild: String => Boolean,
    isCompleteForPath: Path => Boolean,
    isFiltered: () => Boolean,
    isFullyInitialized: () => Boolean,
    node_ : Any
  ): CacheNode = {
    val __obj = js.Dynamic.literal(filtered_ = filtered_.asInstanceOf[js.Any], fullyInitialized_ = fullyInitialized_.asInstanceOf[js.Any], getNode = js.Any.fromFunction0(getNode), isCompleteForChild = js.Any.fromFunction1(isCompleteForChild), isCompleteForPath = js.Any.fromFunction1(isCompleteForPath), isFiltered = js.Any.fromFunction0(isFiltered), isFullyInitialized = js.Any.fromFunction0(isFullyInitialized), node_ = node_.asInstanceOf[js.Any])
    __obj.asInstanceOf[CacheNode]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CacheNode] (val x: Self) extends AnyVal {
    
    inline def setFiltered_(value: Any): Self = StObject.set(x, "filtered_", value.asInstanceOf[js.Any])
    
    inline def setFullyInitialized_(value: Any): Self = StObject.set(x, "fullyInitialized_", value.asInstanceOf[js.Any])
    
    inline def setGetNode(value: () => Node2): Self = StObject.set(x, "getNode", js.Any.fromFunction0(value))
    
    inline def setIsCompleteForChild(value: String => Boolean): Self = StObject.set(x, "isCompleteForChild", js.Any.fromFunction1(value))
    
    inline def setIsCompleteForPath(value: Path => Boolean): Self = StObject.set(x, "isCompleteForPath", js.Any.fromFunction1(value))
    
    inline def setIsFiltered(value: () => Boolean): Self = StObject.set(x, "isFiltered", js.Any.fromFunction0(value))
    
    inline def setIsFullyInitialized(value: () => Boolean): Self = StObject.set(x, "isFullyInitialized", js.Any.fromFunction0(value))
    
    inline def setNode_(value: Any): Self = StObject.set(x, "node_", value.asInstanceOf[js.Any])
  }
}
