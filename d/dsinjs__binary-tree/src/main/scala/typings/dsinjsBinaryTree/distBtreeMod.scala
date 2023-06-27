package typings.dsinjsBinaryTree

import org.scalablytyped.runtime.Instantiable1
import typings.dsinjsBinaryTree.anon.Next
import typings.dsinjsBinaryTree.anon.TypeofBTree
import typings.dsinjsBinaryTree.distBtreenodeMod.BTreeNode
import typings.dsinjsBinaryTree.dsinjsBinaryTreeStrings.L
import typings.dsinjsBinaryTree.dsinjsBinaryTreeStrings.R
import typings.dsinjsBinaryTree.dsinjsBinaryTreeStrings.U
import typings.std.AddEventListenerOptions
import typings.std.EventListenerOptions
import typings.std.EventListenerOrEventListenerObject
import typings.std.FrameRequestCallback
import typings.std.IterableIterator
import typings.std.Storage
import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distBtreeMod {
  
  @JSImport("@dsinjs/binary-tree/dist/btree", "BTree")
  @js.native
  open class BTree[T] protected () extends StObject {
    def this(attr: T) = this()
    /**
      * Constructor for Binary Tree.
      * @param {BTreeRootAttrStruct|BTreeValueAttrStruct|T} attr Can be of type object, string, number. In case of object root/value property is expected to be value of root node.
      * @constructor
      */
    def this(attr: BTreeRootAttrStruct[T]) = this()
    def this(attr: BTreeValueAttrStruct[T]) = this()
    
    /**
      * Deletes given value from tree.
      * Travarsal = Root -> L -> R.
      * @param {T} val Value to be removed.
      * @returns {BTreeNode<T>} Returns removed BTreeNode.
      * @method delete
      * @member
      * @public
      */
    def delete(`val`: T): BTreeNode[T] = js.native
    
    /**
      * Depth of the binary tree.
      * @type {number}
      * @property depth
      */
    var depth: Double = js.native
    
    /**
      * Breadth first search. Executes given callback functions with parameters BTreeNode and path index for each node in BFS fashion.
      * @param {{(node: BTreeNode<T>, index: number) => any}} callback A callback function for execution of each node.
      * @method each
      * @member
      * @public
      * @returns {void} no value.
      */
    def each(callback: js.Function2[/* node */ BTreeNode[T], /* index */ Double, Any]): Unit = js.native
    
    /**
      * Returns an iterable of key, value pairs for every entry in the tree.
      * @method entries
      * @member
      * @public
      * @returns {IterableIterator<[number, BTreeNode<T>]>} Iterable for iterations.
      * @example
      * var tree = new BTree(10);
      * for (const [index, node] of tree.entries()) {
      *  console.log(index, node.value); // 0, 10
      * }
      */
    def entries(): IterableIterator[js.Tuple2[Double, BTreeNode[T]]] = js.native
    
    /**
      * Checks if given item exists or not, returns boolean.
      * @param {T} value Any value to check if it exists or not.
      * @method exists
      * @member
      * @public
      * @returns {boolean} Returns true if it is present, otherwise false.
      * @example
      * var tree = BTree.fromArray([10, 20, 30, 40, 50, 60, 70, 80]);
      * tree.exists(30); // true
      * tree.exists(51); // false
      */
    def exists(value: T): Boolean = js.native
    
    /**
      * Filters each item based on given filter function
      * @param {{(value: T) => boolean}} filterFnc callback function for filtering purpose.
      * @method filter
      * @member
      * @public
      * @throws FilteredRootError, Error when root node gets filtered out.
      * @returns {BTree<T>} New filtered instance of tree.
      * @example
      * var tree = BTree.fromArray([10, 20, 30, 40]);
      * var tree2 = tree.filter(n => !!(n % 4 === 0 || n === 10));
      * var arr2 = tree2.toArray(); // [{value:10,...},{value:20,...},{value:40,...}]
      */
    def filter(filterFnc: js.Function1[/* value */ T, Boolean]): BTree[T] = js.native
    
    /**
      * Returns the first matched tree node. Traverses using BFS.
      * @param {T} item any value to find inside the tree.
      * @method find
      * @member
      * @public
      * @returns {BTreeNode<T> | null} Returns the first matched tree node, if not found, returns null.
      * @example
      */
    def find(item: T): BTreeNode[T] | Null = js.native
    
    /**
      * Breadth first search. Executes given callback functions with parameters BTreeNode and path index for each node in BFS fashion.
      * @param {{(node: BTreeNode<T>, index: number) => any}} callback A callback function for execution of each node.
      * @method forEach
      * @member
      * @public
      * @returns {void} no value.
      */
    def forEach(callback: js.Function2[/* node */ BTreeNode[T], /* index */ Double, Any]): Unit = js.native
    
    /**
      * Checks if given item exists or not, returns boolean.
      * @param {T} value Any value to check if it exists or not.
      * @method has
      * @member
      * @public
      * @returns {boolean} Returns true if it is present, otherwise false.
      * @example
      * var tree = BTree.fromArray([10, 20, 30, 40, 50, 60, 70, 80]);
      * tree.has(30); // true
      * tree.has(51); // false
      */
    def has(value: T): Boolean = js.native
    
    /**
      * Checks if given item exists or not, returns boolean.
      * @param {T} value Any value to check if it exists or not.
      * @method includes
      * @member
      * @public
      * @returns {boolean} Returns true if it is present, otherwise false.
      * @example
      * var tree = BTree.fromArray([10, 20, 30, 40, 50, 60, 70, 80]);
      * tree.includes(30); // true
      * tree.includes(51); // false
      */
    def includes(value: T): Boolean = js.native
    
    /**
      * Returns first index of a value matched, if it is not present, it returns -1.
      * @param {T} value Any value to find.
      * @method indexOf
      * @member
      * @public
      * @returns {number} Returns index of given item.
      * @example
      * var tree = BTree.fromArray([10, 20, 30, 40, 50, 60, 70, 80]);
      * tree.indexOf(30); // => 3
      * tree.indexOf(51); // => -1
      */
    def indexOf(value: T): Double = js.native
    
    /**
      * Inserts the given value to the tree where first free left child node is found.
      * @param {any} val any type of value to be added to tree node.
      * @returns {BTreeNode} Returns newly created BTreeNode.
      * @method insert
      * @member
      * @example
      * var tree = new BTree(10);
      * tree.insert(10);
      * tree.insert(20);
      * tree.insert(30);
      * tree.toString(); // "10102030"
      */
    def insert(`val`: T): BTreeNode[T] = js.native
    
    /**
      * Inserts given element at given location. If location is already taken then it does not insert any value.
      * @param {T} val value to insert.
      * @param {number} index index at which to append new element to.
      * @method insertAt
      * @member
      * @public
      * @throws UnreachableError
      * @example
      * tree.insertAt(20,2);
      */
    def insertAt(`val`: T, index: Double): Unit = js.native
    
    /**
      * Inserts the given value to the tree where first free left child node is found.
      * @param {T} val any type of value to be added to tree node.
      * @method insertLeftMost
      * @member
      * @returns {BTreeNode<T>} Returns newly created BTreeNode.
      */
    def insertLeftMost(`val`: T): BTreeNode[T] = js.native
    
    /**
      * Inserts the given value to the tree where first free right child node is found.
      * @param {T} val any type of value to be added to tree node.
      * @method insertRightMost
      * @member
      * @public
      * @returns {BTreeNode<T>} Returns newly created BTreeNode.
      */
    def insertRightMost(`val`: T): BTreeNode[T] = js.native
    
    /**
      * Returns an iterable of key, value pairs for every entry in the tree.
      * @method [Symbol.iterator]
      * @member
      * @public
      * @example
      * var tree = new BTree(10);
      * for (const node of tree) {
      *  console.log(node.value); // 10
      * }
      */
    @JSName(js.Symbol.iterator)
    var iterator: js.Function0[Next[T]] = js.native
    
    /**
      * Maps current tree values to a new tree with modifying the values using given callback function.
      * Uses BFS.
      * @param {{(value: T) => T}} callback callback function for value modifier.
      * @method map
      * @member
      * @public
      * @returns {BTree<T>} A new BTree
      * @example
      * var tree = BTree.fromArray([10, 20, 30, 40]);
      * var tree2 = tree.map(n => n * 2);
      * var arr2 = tree2.toArray(); // [{value:20,...},{value:40,...},{value:60,...},{value:80,...}]
      */
    def map(callback: js.Function1[/* value */ T, T]): BTree[T] = js.native
    
    /**
      * Prints entire tree on the console, useful for logging and checking status.
      * @method print
      * @member
      * @public
      * @returns {void} Returns undefined.
      * @example
      * var tree = BTree.fromArray([1, 2, 3]);
      * tree.print();
      * 1 (1)
      * |- 2 (2)
      * |- 3 (3)
      */
    def print(): Unit = js.native
    
    /**
      * Reduces each node values using reduceFunction and returns final value.
      * @param {(next: T2, value: T, index: number, tree: BTree<T>) => T2} reduceFunction callback function for reducing each node value to a final value.
      * @param {T2} initialValue Optional, Accumulator/Initial value.
      * @method reduce<T2>
      * @member
      * @public
      * @returns {T2} Returns reduceed value
      * @example
      * var tree = BTree.fromArray([10, 20, 30, 40]);
      * var sum = tree.reduce((acc, node) => acc + node); // => 100
      */
    def reduce[T2](
      reduceFunction: js.Function4[/* next */ T2, /* value */ T, /* index */ Double, /* tree */ BTree[T], T2]
    ): T2 = js.native
    def reduce[T2](
      reduceFunction: js.Function4[/* next */ T2, /* value */ T, /* index */ Double, /* tree */ BTree[T], T2],
      initialValue: T2
    ): T2 = js.native
    
    /**
      * Reverses the current Binary Tree, Left Node becomes Right node and vise versa.
      * Does not return new instance, returns current tree instance.
      * @method reverse
      * @member
      * @public
      * @returns {BTree<T>} Returns current tree instance.
      * @example
      * var tree = BTree.fromArray([10, 20, 30, 40, 50, 60, 70, 80]);
      * tree.reverse().toArray(); // => [10, 30, 20, 70, 60, 50, 40, 80]
      */
    def reverse(): BTree[T] = js.native
    
    /**
      * Root node of the binary tree.
      * @type {BTreeNode}
      * @property root
      */
    var root: BTreeNode[T] = js.native
    
    /**
      * Sorts the tree based on compare function, Has option to sort only at children level.
      * @param {Function} compareFnc Function used to determine the order of the elements. It is expected to return
      * a negative value if first argument is less than second argument, zero if they're equal and a positive
      * value otherwise. If omitted, the elements are sorted in ascending, ASCII character order.
      * ```ts
      * (a, b) => a - b)
      * ```
      * @param {boolean} atOnlyFirstChildLevel Optiona, Flag to specify if first child of each node should sorted. Default is `false`.
      * @method sort
      * @member
      * @public
      * @returns {void} Returns undefined.
      * @example
      * var tree = BTree.fromArray([10, 200, 100, 50, 60, 90, 5, 3]);
      * tree.sort().toFlatArray(); // => [3,5,10,50,60,90,100,200]
      */
    def sort(): Unit = js.native
    def sort(compareFnc: js.Function2[/* a */ Any, /* b */ Any, Double]): Unit = js.native
    def sort(compareFnc: js.Function2[/* a */ Any, /* b */ Any, Double], atOnlyFirstChildLevel: Boolean): Unit = js.native
    def sort(compareFnc: Unit, atOnlyFirstChildLevel: Boolean): Unit = js.native
    
    /**
      * Returns array value.
      * @method toArray
      * @member
      * @public
      * @returns {Array<BTreeNode>} Returns array form of given tree.
      * @example
      * var tree = new BTree(10);
      * tree.insert(20);
      * tree.toArray(); // => [{value:10,...},{value:20,...}]
      */
    def toArray(): js.Array[BTreeNode[T]] = js.native
    
    /**
      * Returns array of values of the tree.
      * @method toFlatArray
      * @member
      * @public
      * @returns {Array<T>} Returns array form of given tree.
      * @example
      * var tree = new BTree(10);
      * tree.insert(20);
      * tree.toFlatArray(); // => [10,20]
      */
    def toFlatArray(): js.Array[T] = js.native
    
    /**
      * Returns JSON Form.
      * @method toJSON
      * @member
      * @public
      * @returns {BTreeNodeStruct} Returns json form of a given tree.
      * @example
      * var tree = new BTree(10);
      * tree.insert(20);
      * tree.toJSON(); // {value:10,lNode:{value:20,lNode:null,rNode:null},rNode:null}
      */
    def toJSON(): typings.dsinjsBinaryTree.distBtreenodeMod.BTreeNodeStruct[T] = js.native
    
    /**
      * Breadth first search. Executes given callback functions with parameters BTreeNode and path index for each node in BFS fashion.
      * @param {{(node: BTreeNode<T>, index: number) => any}} callback A callback function for execution of each node.
      * @method traverseBFS
      * @member
      * @public
      * @returns {void} no value.
      */
    def traverseBFS(callback: js.Function2[/* node */ BTreeNode[T], /* index */ Double, Any]): Unit = js.native
    
    /**
      * Depth first search, Executes given callback functions with parameters BTreeNode and path index for each node in DFS fashion.
      * @param {{(node: BTreeNode<T>, index: number) => any}} callback A callback function for execution of each node.
      * @method traverseDFS
      * @member
      * @public
      * @returns {void} no value.
      */
    def traverseDFS(callback: js.Function2[/* node */ BTreeNode[T], /* index */ Double, Any]): Unit = js.native
  }
  /* static members */
  object BTree {
    
    @JSImport("@dsinjs/binary-tree/dist/btree", "BTree")
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
    inline def fromArray[T2](arr: js.Array[T2]): BTree[T2] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromArray")(arr.asInstanceOf[js.Any]).asInstanceOf[BTree[T2]]
    
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
  
  @JSImport("@dsinjs/binary-tree/dist/btree", "BTreeNodeStruct")
  @js.native
  open class BTreeNodeStruct[T] () extends StObject {
    
    var lNode: js.UndefOr[BTreeNodeStruct[T] | Null] = js.native
    
    var rNode: js.UndefOr[BTreeNodeStruct[T] | Null] = js.native
    
    var value: js.UndefOr[T | Null] = js.native
  }
  
  @JSImport("@dsinjs/binary-tree/dist/btree", "ExtendedWindow")
  @js.native
  open class ExtendedWindow ()
    extends StObject
       with Window {
    
    var BTree: TypeofBTree = js.native
    
    var BTreeNode: Instantiable1[
        /* attr */ typings.dsinjsBinaryTree.distBtreenodeMod.BTreeNodeStruct[/* import warning: RewrittenClass.unapply cls was tparam T */ Any], 
        typings.dsinjsBinaryTree.distBtreenodeMod.BTreeNode[js.Object]
      ] = js.native
    
    var DSinJS: typings.dsinjsBinaryTree.anon.BTree = js.native
    
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, callback: EventListenerOrEventListenerObject): Unit = js.native
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: AddEventListenerOptions): Unit = js.native
    
    /* standard dom */
    /* CompleteClass */
    override def cancelAnimationFrame(handle: Double): Unit = js.native
    
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/localStorage) */
    /* standard dom */
    /* CompleteClass */
    override val localStorage: Storage = js.native
    
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject): Unit = js.native
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: EventListenerOptions): Unit = js.native
    
    /* standard dom */
    /* CompleteClass */
    override def requestAnimationFrame(callback: FrameRequestCallback): Double = js.native
    
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/sessionStorage) */
    /* standard dom */
    /* CompleteClass */
    override val sessionStorage: Storage = js.native
  }
  
  trait BTreeRootAttrStruct[T] extends StObject {
    
    var root: js.UndefOr[T] = js.undefined
  }
  object BTreeRootAttrStruct {
    
    inline def apply[T](): BTreeRootAttrStruct[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BTreeRootAttrStruct[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BTreeRootAttrStruct[?], T] (val x: Self & BTreeRootAttrStruct[T]) extends AnyVal {
      
      inline def setRoot(value: T): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    }
  }
  
  trait BTreeValueAttrStruct[T] extends StObject {
    
    var value: js.UndefOr[T] = js.undefined
  }
  object BTreeValueAttrStruct {
    
    inline def apply[T](): BTreeValueAttrStruct[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BTreeValueAttrStruct[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BTreeValueAttrStruct[?], T] (val x: Self & BTreeValueAttrStruct[T]) extends AnyVal {
      
      inline def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
