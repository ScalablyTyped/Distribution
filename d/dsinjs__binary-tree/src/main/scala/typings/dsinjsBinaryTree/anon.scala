package typings.dsinjsBinaryTree

import org.scalablytyped.runtime.Instantiable1
import typings.dsinjsBinaryTree.btreeMod.BTreeRootAttrStruct
import typings.dsinjsBinaryTree.btreeMod.BTreeValueAttrStruct
import typings.dsinjsBinaryTree.btreenodeMod.BTreeNodeStruct
import typings.dsinjsBinaryTree.dsinjsBinaryTreeStrings.L
import typings.dsinjsBinaryTree.dsinjsBinaryTreeStrings.R
import typings.dsinjsBinaryTree.dsinjsBinaryTreeStrings.U
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait BTree extends StObject {
    
    var BTree: TypeofBTree
    
    var BTreeNode: Instantiable1[
        /* attr */ BTreeNodeStruct[/* import warning: RewrittenClass.unapply cls was tparam T */ Any], 
        typings.dsinjsBinaryTree.btreenodeMod.BTreeNode[js.Object]
      ]
  }
  object BTree {
    
    inline def apply(
      BTree: TypeofBTree,
      BTreeNode: Instantiable1[
          /* attr */ BTreeNodeStruct[/* import warning: RewrittenClass.unapply cls was tparam T */ Any], 
          typings.dsinjsBinaryTree.btreenodeMod.BTreeNode[js.Object]
        ]
    ): BTree = {
      val __obj = js.Dynamic.literal(BTree = BTree.asInstanceOf[js.Any], BTreeNode = BTreeNode.asInstanceOf[js.Any])
      __obj.asInstanceOf[BTree]
    }
    
    extension [Self <: BTree](x: Self) {
      
      inline def setBTree(value: TypeofBTree): Self = StObject.set(x, "BTree", value.asInstanceOf[js.Any])
      
      inline def setBTreeNode(
        value: Instantiable1[
              /* attr */ BTreeNodeStruct[/* import warning: RewrittenClass.unapply cls was tparam T */ Any], 
              typings.dsinjsBinaryTree.btreenodeMod.BTreeNode[js.Object]
            ]
      ): Self = StObject.set(x, "BTreeNode", value.asInstanceOf[js.Any])
    }
  }
  
  trait BTreeNode extends StObject {
    
    var BTreeNode: Instantiable1[
        /* attr */ BTreeNodeStruct[/* import warning: RewrittenClass.unapply cls was tparam T */ Any], 
        typings.dsinjsBinaryTree.btreenodeMod.BTreeNode[js.Object]
      ]
  }
  object BTreeNode {
    
    inline def apply(
      BTreeNode: Instantiable1[
          /* attr */ BTreeNodeStruct[/* import warning: RewrittenClass.unapply cls was tparam T */ Any], 
          typings.dsinjsBinaryTree.btreenodeMod.BTreeNode[js.Object]
        ]
    ): BTreeNode = {
      val __obj = js.Dynamic.literal(BTreeNode = BTreeNode.asInstanceOf[js.Any])
      __obj.asInstanceOf[BTreeNode]
    }
    
    extension [Self <: BTreeNode](x: Self) {
      
      inline def setBTreeNode(
        value: Instantiable1[
              /* attr */ BTreeNodeStruct[/* import warning: RewrittenClass.unapply cls was tparam T */ Any], 
              typings.dsinjsBinaryTree.btreenodeMod.BTreeNode[js.Object]
            ]
      ): Self = StObject.set(x, "BTreeNode", value.asInstanceOf[js.Any])
    }
  }
  
  trait Done[T] extends StObject {
    
    var done: Boolean
    
    var value: typings.dsinjsBinaryTree.btreenodeMod.BTreeNode[T]
  }
  object Done {
    
    inline def apply[T](done: Boolean, value: typings.dsinjsBinaryTree.btreenodeMod.BTreeNode[T]): Done[T] = {
      val __obj = js.Dynamic.literal(done = done.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Done[T]]
    }
    
    extension [Self <: Done[?], T](x: Self & Done[T]) {
      
      inline def setDone(value: Boolean): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
      
      inline def setValue(value: typings.dsinjsBinaryTree.btreenodeMod.BTreeNode[T]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait Next[T] extends StObject {
    
    /**
      * @returns { {value: BTreeNode<T>, done: boolean} }
      * @private
      */
    def next(): Done[T]
  }
  object Next {
    
    inline def apply[T](next: () => Done[T]): Next[T] = {
      val __obj = js.Dynamic.literal(next = js.Any.fromFunction0(next))
      __obj.asInstanceOf[Next[T]]
    }
    
    extension [Self <: Next[?], T](x: Self & Next[T]) {
      
      inline def setNext(value: () => Done[T]): Self = StObject.set(x, "next", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait TypeofBTree
    extends StObject
       with Instantiable1[
          (/* import warning: RewrittenClass.unapply cls was tparam T */ /* attr */ Any) | (/* attr */ BTreeRootAttrStruct[/* import warning: RewrittenClass.unapply cls was tparam T */ Any]) | (/* attr */ BTreeValueAttrStruct[/* import warning: RewrittenClass.unapply cls was tparam T */ Any]), 
          typings.dsinjsBinaryTree.btreeMod.BTree[js.Object]
        ] {
    
    /**
      * Converts given values into a Binary Tree.
      * @param {T2[]} arr Any array of values.
      * @returns {BTree<T2>} Newly generated tree.
      * @method fromArray
      * @static
      * @public
      * @example
      * var tree = BTree.fromArray([10,20,30,40]);
      */
    def fromArray[T2](arr: js.Array[T2]): typings.dsinjsBinaryTree.btreeMod.BTree[T2] = js.native
    
    /**
      * Returns index value from given path.
      * @param {Array<'U'|'L'|'R'>} path Array for U L or R, which represents the quickest path to get to a node.
      * @returns {number} Returns index value.
      * @method getIndexFromPath
      * @public
      * @static
      * @member
      */
    def getIndexFromPath(path: js.Array[U | L | R]): Double = js.native
    
    /**
      * Returns Path equivalent to the given index.
      * @param {number} index Index number from which path to be calculated.
      * @returns {Array<'U'|'L'|'R'>} Path equivalent to the given index.
      * @method getPathFromIndex
      * @public
      * @static
      */
    def getPathFromIndex(index: Double): js.Array[U | L | R] = js.native
  }
}
