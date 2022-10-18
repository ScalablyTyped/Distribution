package typings.firebaseDatabase

import org.scalablytyped.runtime.Instantiable3
import typings.firebaseDatabase.distNodeEsmSrcCoreSnapIndexMapMod.IndexMap
import typings.firebaseDatabase.distNodeEsmSrcCoreSnapIndexesIndexMod.Index
import typings.firebaseDatabase.distNodeEsmSrcCoreSnapNodeMod.NamedNode
import typings.firebaseDatabase.distNodeEsmSrcCoreSnapNodeMod.Node
import typings.firebaseDatabase.distNodeEsmSrcCoreUtilSortedMapMod.SortedMap
import typings.firebaseDatabase.distNodeEsmSrcCoreUtilSortedMapMod.SortedMapIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distNodeEsmSrcCoreSnapChildrenNodeMod {
  
  @JSImport("@firebase/database/dist/node-esm/src/core/snap/ChildrenNode", "ChildrenNode")
  @js.native
  open class ChildrenNode protected ()
    extends StObject
       with Node {
    def this(children_ : SortedMap[String, Node], priorityNode_ : Null, indexMap_ : IndexMap) = this()
    /**
      * @param children_ - List of children of this node..
      * @param priorityNode_ - The priority of this node (as a snapshot node).
      */
    def this(children_ : SortedMap[String, Node], priorityNode_ : Node, indexMap_ : IndexMap) = this()
    
    /* private */ val children_ : Any = js.native
    
    def compareTo(other: ChildrenNode): Double = js.native
    
    def getFirstChild(indexDefinition: Index): NamedNode | Null = js.native
    
    def getFirstChildName(indexDefinition: Index): String | Null = js.native
    
    def getIterator(indexDefinition: Index): SortedMapIterator[String | NamedNode, Node, NamedNode] = js.native
    
    def getIteratorFrom(startPost: NamedNode, indexDefinition: Index): SortedMapIterator[String | NamedNode, Node, NamedNode] = js.native
    
    def getLastChild(indexDefinition: Index): NamedNode | Null = js.native
    
    /**
      * Given an index, return the key name of the largest value we have, according to that index
      */
    def getLastChildName(indexDefinition: Index): String | Null = js.native
    
    def getReverseIterator(indexDefinition: Index): SortedMapIterator[String | NamedNode, Node, NamedNode] = js.native
    
    def getReverseIteratorFrom(endPost: NamedNode, indexDefinition: Index): SortedMapIterator[String | NamedNode, Node, NamedNode] = js.native
    
    /* private */ var indexMap_ : Any = js.native
    
    /* private */ var lazyHash_ : Any = js.native
    
    /* private */ val priorityNode_ : Any = js.native
    
    /**
      * Returns a SortedMap ordered by index, or null if the default (by-key) ordering can be used
      * instead.
      *
      */
    /* private */ var resolveIndex_ : Any = js.native
  }
  /* static members */
  object ChildrenNode {
    
    @JSImport("@firebase/database/dist/node-esm/src/core/snap/ChildrenNode", "ChildrenNode")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@firebase/database/dist/node-esm/src/core/snap/ChildrenNode", "ChildrenNode.INTEGER_REGEXP_")
    @js.native
    def INTEGER_REGEXP_ : Any = js.native
    inline def INTEGER_REGEXP__=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INTEGER_REGEXP_")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@firebase/database/dist/node-esm/src/core/snap/ChildrenNode", "MAX_NODE")
  @js.native
  val MAX_NODE: MaxNode = js.native
  
  @JSImport("@firebase/database/dist/node-esm/src/core/snap/ChildrenNode", "MaxNode")
  @js.native
  open class MaxNode () extends ChildrenNode
  
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
  object firebaseDatabaseDistNodeEsmSrcCoreSnapNodeAugmentingMod {
    
    trait NamedNode extends StObject {
      
      var MAX: typings.firebaseDatabase.distNodeEsmSrcCoreSnapChildrenNodeMod.firebaseDatabaseDistNodeEsmSrcCoreSnapNodeAugmentingMod.NamedNode
      
      var MIN: typings.firebaseDatabase.distNodeEsmSrcCoreSnapChildrenNodeMod.firebaseDatabaseDistNodeEsmSrcCoreSnapNodeAugmentingMod.NamedNode
    }
    object NamedNode {
      
      inline def apply(
        MAX: typings.firebaseDatabase.distNodeEsmSrcCoreSnapChildrenNodeMod.firebaseDatabaseDistNodeEsmSrcCoreSnapNodeAugmentingMod.NamedNode,
        MIN: typings.firebaseDatabase.distNodeEsmSrcCoreSnapChildrenNodeMod.firebaseDatabaseDistNodeEsmSrcCoreSnapNodeAugmentingMod.NamedNode
      ): typings.firebaseDatabase.distNodeEsmSrcCoreSnapChildrenNodeMod.firebaseDatabaseDistNodeEsmSrcCoreSnapNodeAugmentingMod.NamedNode = {
        val __obj = js.Dynamic.literal(MAX = MAX.asInstanceOf[js.Any], MIN = MIN.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.firebaseDatabase.distNodeEsmSrcCoreSnapChildrenNodeMod.firebaseDatabaseDistNodeEsmSrcCoreSnapNodeAugmentingMod.NamedNode]
      }
      
      extension [Self <: typings.firebaseDatabase.distNodeEsmSrcCoreSnapChildrenNodeMod.firebaseDatabaseDistNodeEsmSrcCoreSnapNodeAugmentingMod.NamedNode](x: Self) {
        
        inline def setMAX(
          value: typings.firebaseDatabase.distNodeEsmSrcCoreSnapChildrenNodeMod.firebaseDatabaseDistNodeEsmSrcCoreSnapNodeAugmentingMod.NamedNode
        ): Self = StObject.set(x, "MAX", value.asInstanceOf[js.Any])
        
        inline def setMIN(
          value: typings.firebaseDatabase.distNodeEsmSrcCoreSnapChildrenNodeMod.firebaseDatabaseDistNodeEsmSrcCoreSnapNodeAugmentingMod.NamedNode
        ): Self = StObject.set(x, "MIN", value.asInstanceOf[js.Any])
      }
    }
  }
}
