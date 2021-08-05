package typings.firebaseDatabase

import typings.firebaseDatabase.miscMod.Indexable
import typings.firebaseDatabase.nodeMod.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object leafNodeMod {
  
  @JSImport("@firebase/database/dist/src/core/snap/LeafNode", "LeafNode")
  @js.native
  class LeafNode protected ()
    extends StObject
       with Node {
    /**
      * @implements {Node}
      * @param {!(string|number|boolean|Object)} value_ The value to store in this leaf node.
      *                                         The object type is possible in the event of a deferred value
      * @param {!Node=} priorityNode_ The priority of this node.
      */
    def this(value_ : String) = this()
    def this(value_ : Boolean) = this()
    def this(value_ : Double) = this()
    def this(value_ : Indexable) = this()
    def this(value_ : String, priorityNode_ : Node) = this()
    def this(value_ : Boolean, priorityNode_ : Node) = this()
    def this(value_ : Double, priorityNode_ : Node) = this()
    def this(value_ : Indexable, priorityNode_ : Node) = this()
    
    /**
      * Comparison specifically for two leaf nodes
      * @param {!LeafNode} otherLeaf
      * @return {!number}
      * @private
      */
    /* private */ var compareToLeafNode_ : js.Any = js.native
    
    /** @inheritDoc */
    def getPredecessorChildName(childName: String, childNode: Node): Null = js.native
    
    /**
      * Returns the value of the leaf node.
      * @return {Object|string|number|boolean} The value of the node.
      */
    def getValue(): Indexable | String | Double | Boolean = js.native
    
    /**
      * @inheritDoc
      */
    def hasChild(): Boolean = js.native
    
    /**
      * @inheritDoc
      */
    def isIndexed(): Boolean = js.native
    
    /* private */ var lazyHash_ : js.Any = js.native
    
    /* private */ var priorityNode_ : js.Any = js.native
    
    /* private */ val value_ : js.Any = js.native
    
    /**
      * @inheritDoc
      */
    def withIndex(): Node = js.native
  }
  /* static members */
  object LeafNode {
    
    @JSImport("@firebase/database/dist/src/core/snap/LeafNode", "LeafNode")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * The sort order for comparing leaf nodes of different types. If two leaf nodes have
      * the same type, the comparison falls back to their value
      * @type {Array.<!string>}
      * @const
      */
    @JSImport("@firebase/database/dist/src/core/snap/LeafNode", "LeafNode.VALUE_TYPE_ORDER")
    @js.native
    def VALUE_TYPE_ORDER: js.Array[String] = js.native
    inline def VALUE_TYPE_ORDER_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VALUE_TYPE_ORDER")(x.asInstanceOf[js.Any])
  }
}
