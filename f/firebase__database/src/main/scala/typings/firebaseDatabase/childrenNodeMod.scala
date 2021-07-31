package typings.firebaseDatabase

import org.scalablytyped.runtime.Instantiable3
import typings.firebaseDatabase.indexMapMod.IndexMap
import typings.firebaseDatabase.indexMod.Index
import typings.firebaseDatabase.nodeMod.NamedNode
import typings.firebaseDatabase.nodeMod.Node
import typings.firebaseDatabase.sortedMapMod.SortedMap
import typings.firebaseDatabase.sortedMapMod.SortedMapIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object childrenNodeMod {
  
  @JSImport("@firebase/database/dist/src/core/snap/ChildrenNode", "ChildrenNode")
  @js.native
  class ChildrenNode protected ()
    extends StObject
       with Node {
    def this(children_ : SortedMap[String, Node], priorityNode_ : Null, indexMap_ : IndexMap) = this()
    /**
      *
      * @param {!SortedMap.<string, !Node>} children_ List of children
      * of this node..
      * @param {?Node} priorityNode_ The priority of this node (as a snapshot node).
      * @param {!IndexMap} indexMap_
      */
    def this(children_ : SortedMap[String, Node], priorityNode_ : Node, indexMap_ : IndexMap) = this()
    
    val children_ : js.Any = js.native
    
    /**
      * @inheritDoc
      */
    def compareTo(other: ChildrenNode): Double = js.native
    
    /**
      * @param {!Index} indexDefinition
      * @return {?NamedNode}
      */
    def getFirstChild(indexDefinition: Index): NamedNode | Null = js.native
    
    /**
      * @param {!Index} indexDefinition
      * @return {?string}
      */
    def getFirstChildName(indexDefinition: Index): String | Null = js.native
    
    /**
      * @param {!Index} indexDefinition
      * @return {SortedMapIterator}
      */
    def getIterator(indexDefinition: Index): SortedMapIterator[String | NamedNode, Node, NamedNode] = js.native
    
    /**
      *
      * @param {!NamedNode} startPost
      * @param {!Index} indexDefinition
      * @return {!SortedMapIterator}
      */
    def getIteratorFrom(startPost: NamedNode, indexDefinition: Index): SortedMapIterator[String | NamedNode, Node, NamedNode] = js.native
    
    /**
      * @param {!Index} indexDefinition
      * @return {?NamedNode}
      */
    def getLastChild(indexDefinition: Index): NamedNode | Null = js.native
    
    /**
      * Given an index, return the key name of the largest value we have, according to that index
      * @param {!Index} indexDefinition
      * @return {?string}
      */
    def getLastChildName(indexDefinition: Index): String | Null = js.native
    
    /**
      * @param {!Index} indexDefinition
      * @return {!SortedMapIterator}
      */
    def getReverseIterator(indexDefinition: Index): SortedMapIterator[String | NamedNode, Node, NamedNode] = js.native
    
    /**
      * @param {!NamedNode} endPost
      * @param {!Index} indexDefinition
      * @return {!SortedMapIterator}
      */
    def getReverseIteratorFrom(endPost: NamedNode, indexDefinition: Index): SortedMapIterator[String | NamedNode, Node, NamedNode] = js.native
    
    var indexMap_ : js.Any = js.native
    
    var lazyHash_ : js.Any = js.native
    
    val priorityNode_ : js.Any = js.native
    
    /**
      * Returns a SortedMap ordered by index, or null if the default (by-key) ordering can be used
      * instead.
      *
      * @private
      * @param {!Index} indexDefinition
      * @return {?SortedMap.<NamedNode, Node>}
      */
    var resolveIndex_ : js.Any = js.native
  }
  /* static members */
  object ChildrenNode {
    
    @JSImport("@firebase/database/dist/src/core/snap/ChildrenNode", "ChildrenNode")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @private
      * @type {RegExp}
      */
    @JSImport("@firebase/database/dist/src/core/snap/ChildrenNode", "ChildrenNode.INTEGER_REGEXP_")
    @js.native
    def INTEGER_REGEXP_ : js.Any = js.native
    @scala.inline
    def INTEGER_REGEXP__=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INTEGER_REGEXP_")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@firebase/database/dist/src/core/snap/ChildrenNode", "MAX_NODE")
  @js.native
  val MAX_NODE: MaxNode = js.native
  
  @JSImport("@firebase/database/dist/src/core/snap/ChildrenNode", "MaxNode")
  @js.native
  class MaxNode () extends ChildrenNode
  
  @js.native
  trait ChildrenNodeConstructor
    extends StObject
       with Instantiable3[
          /* children_ */ SortedMap[String, Node], 
          (/* priorityNode_ */ Node) | (/* priorityNode_ */ Null), 
          /* indexMap_ */ IndexMap, 
          ChildrenNode
        ] {
    
    var EMPTY_NODE: ChildrenNode = js.native
  }
  
  /**
    * Document NamedNode extensions
    */
  /* augmented module */
  object firebaseDatabaseDistSrcCoreSnapNodeAugmentingMod {
    
    trait NamedNode extends StObject {
      
      var MAX: typings.firebaseDatabase.childrenNodeMod.firebaseDatabaseDistSrcCoreSnapNodeAugmentingMod.NamedNode
      
      var MIN: typings.firebaseDatabase.childrenNodeMod.firebaseDatabaseDistSrcCoreSnapNodeAugmentingMod.NamedNode
    }
    object NamedNode {
      
      @scala.inline
      def apply(
        MAX: typings.firebaseDatabase.childrenNodeMod.firebaseDatabaseDistSrcCoreSnapNodeAugmentingMod.NamedNode,
        MIN: typings.firebaseDatabase.childrenNodeMod.firebaseDatabaseDistSrcCoreSnapNodeAugmentingMod.NamedNode
      ): typings.firebaseDatabase.childrenNodeMod.firebaseDatabaseDistSrcCoreSnapNodeAugmentingMod.NamedNode = {
        val __obj = js.Dynamic.literal(MAX = MAX.asInstanceOf[js.Any], MIN = MIN.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.firebaseDatabase.childrenNodeMod.firebaseDatabaseDistSrcCoreSnapNodeAugmentingMod.NamedNode]
      }
      
      @scala.inline
      implicit class NamedNodeMutableBuilder[Self <: typings.firebaseDatabase.childrenNodeMod.firebaseDatabaseDistSrcCoreSnapNodeAugmentingMod.NamedNode] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setMAX(
          value: typings.firebaseDatabase.childrenNodeMod.firebaseDatabaseDistSrcCoreSnapNodeAugmentingMod.NamedNode
        ): Self = StObject.set(x, "MAX", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMIN(
          value: typings.firebaseDatabase.childrenNodeMod.firebaseDatabaseDistSrcCoreSnapNodeAugmentingMod.NamedNode
        ): Self = StObject.set(x, "MIN", value.asInstanceOf[js.Any])
      }
    }
  }
}
