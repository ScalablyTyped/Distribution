package typings.firebaseDatabase

import typings.firebaseDatabase.childrenNodeMod.ChildrenNodeConstructor
import typings.firebaseDatabase.miscMod.Indexable
import typings.firebaseDatabase.nodeMod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/database/dist/src/core/snap/LeafNode", JSImport.Namespace)
@js.native
object leafNodeMod extends js.Object {
  @js.native
  class LeafNode protected () extends Node {
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
    var compareToLeafNode_ : js.Any = js.native
    var lazyHash_ : js.Any = js.native
    var priorityNode_ : js.Any = js.native
    val value_ : js.Any = js.native
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
    /**
      * @inheritDoc
      */
    def withIndex(): Node = js.native
  }
  
  /* static members */
  @js.native
  object LeafNode extends js.Object {
    /**
      * The sort order for comparing leaf nodes of different types. If two leaf nodes have
      * the same type, the comparison falls back to their value
      * @type {Array.<!string>}
      * @const
      */
    var VALUE_TYPE_ORDER: js.Array[String] = js.native
    def __childrenNodeConstructor: ChildrenNodeConstructor = js.native
    def __childrenNodeConstructor(`val`: ChildrenNodeConstructor): js.Any = js.native
  }
  
}

