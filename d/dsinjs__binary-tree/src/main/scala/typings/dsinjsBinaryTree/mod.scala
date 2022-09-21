package typings.dsinjsBinaryTree

import typings.dsinjsBinaryTree.btreeMod.BTreeRootAttrStruct
import typings.dsinjsBinaryTree.btreeMod.BTreeValueAttrStruct
import typings.dsinjsBinaryTree.btreenodeMod.BTreeNodeStruct
import typings.dsinjsBinaryTree.dsinjsBinaryTreeStrings.L
import typings.dsinjsBinaryTree.dsinjsBinaryTreeStrings.R
import typings.dsinjsBinaryTree.dsinjsBinaryTreeStrings.U
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@dsinjs/binary-tree", "BTree")
  @js.native
  open class BTree[T] protected ()
    extends typings.dsinjsBinaryTree.btreeMod.BTree[T] {
    def this(attr: T) = this()
    /**
      * Constructor for Binary Tree.
      * @param {BTreeRootAttrStruct|BTreeValueAttrStruct|T} attr Can be of type object, string, number. In case of object root/value property is expected to be value of root node.
      * @constructor
      */
    def this(attr: BTreeRootAttrStruct[T]) = this()
    def this(attr: BTreeValueAttrStruct[T]) = this()
  }
  /* static members */
  object BTree {
    
    @JSImport("@dsinjs/binary-tree", "BTree")
    @js.native
    val ^ : js.Any = js.native
    
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
    inline def fromArray[T2](arr: js.Array[T2]): typings.dsinjsBinaryTree.btreeMod.BTree[T2] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromArray")(arr.asInstanceOf[js.Any]).asInstanceOf[typings.dsinjsBinaryTree.btreeMod.BTree[T2]]
    
    /**
      * Returns index value from given path.
      * @param {Array<'U'|'L'|'R'>} path Array for U L or R, which represents the quickest path to get to a node.
      * @returns {number} Returns index value.
      * @method getIndexFromPath
      * @public
      * @static
      * @member
      */
    inline def getIndexFromPath(path: js.Array[U | L | R]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getIndexFromPath")(path.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    /**
      * Returns Path equivalent to the given index.
      * @param {number} index Index number from which path to be calculated.
      * @returns {Array<'U'|'L'|'R'>} Path equivalent to the given index.
      * @method getPathFromIndex
      * @public
      * @static
      */
    inline def getPathFromIndex(index: Double): js.Array[U | L | R] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPathFromIndex")(index.asInstanceOf[js.Any]).asInstanceOf[js.Array[U | L | R]]
  }
  
  @JSImport("@dsinjs/binary-tree", "BTreeNode")
  @js.native
  open class BTreeNode[T] protected ()
    extends typings.dsinjsBinaryTree.btreenodeMod.BTreeNode[T] {
    /**
      *
      * @param {BTreeNodeStruct} attr attributes to initialize the node.
      */
    def this(attr: BTreeNodeStruct[T]) = this()
  }
}
