package typings.atFirebaseDatabase

import org.scalablytyped.runtime.StringDictionary
import typings.atFirebaseDatabase.distSrcCoreUtilPathMod.Path
import typings.atFirebaseDatabase.distSrcCoreUtilTreeMod.Tree
import typings.atFirebaseDatabase.distSrcCoreUtilTreeMod.TreeNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/database/dist/src/core/util/Tree", JSImport.Namespace)
@js.native
object distSrcCoreUtilTreeMod extends js.Object {
  @js.native
  /**
    * @template T
    * @param {string=} name_ Optional name of the node.
    * @param {Tree=} parent_ Optional parent node.
    * @param {TreeNode=} node_ Optional node to wrap.
    */
  class Tree[T] () extends js.Object {
    def this(name_ : String) = this()
    def this(name_ : String, parent_ : Tree[T]) = this()
    def this(name_ : String, parent_ : Null, node_ : TreeNode[T]) = this()
    def this(name_ : String, parent_ : Tree[T], node_ : TreeNode[T]) = this()
    var name_ : js.Any = js.native
    var node_ : js.Any = js.native
    var parent_ : js.Any = js.native
    /**
      * Adds or removes the passed child to this tree node, depending on whether it's empty.
      *
      * @param {string} childName The name of the child to update.
      * @param {!Tree.<T>} child The child to update.
      * @private
      */
    var updateChild_ : js.Any = js.native
    /**
      * Adds or removes this child from its parent based on whether it's empty or not.
      *
      * @private
      */
    var updateParents_ : js.Any = js.native
    /**
      * Clears the contents of the tree node (its value and all children).
      */
    def clear(): Unit = js.native
    /**
      * Calls action on each ancestor node.
      *
      * @param {function(!Tree.<T>)} action Action to be called on each parent; return
      *   true to abort.
      * @param {boolean=} includeSelf Whether to call action on this node as well.
      * @return {boolean} true if the action callback returned true.
      */
    def forEachAncestor(action: js.Function1[/* tree */ Tree[T], _]): Boolean = js.native
    def forEachAncestor(action: js.Function1[/* tree */ Tree[T], _], includeSelf: Boolean): Boolean = js.native
    /**
      * Calls action for each child of this tree node.
      *
      * @param {function(!Tree.<T>)} action Action to be called for each child.
      */
    def forEachChild(action: js.Function1[/* tree */ Tree[T], Unit]): Unit = js.native
    /**
      * Does a depth-first traversal of this node's descendants, calling action for each one.
      *
      * @param {function(!Tree.<T>)} action Action to be called for each child.
      * @param {boolean=} includeSelf Whether to call action on this node as well. Defaults to
      *   false.
      * @param {boolean=} childrenFirst Whether to call action on children before calling it on
      *   parent.
      */
    def forEachDescendant(action: js.Function1[/* tree */ Tree[T], Unit]): Unit = js.native
    def forEachDescendant(action: js.Function1[/* tree */ Tree[T], Unit], includeSelf: Boolean): Unit = js.native
    def forEachDescendant(action: js.Function1[/* tree */ Tree[T], Unit], includeSelf: Boolean, childrenFirst: Boolean): Unit = js.native
    /**
      * Does a depth-first traversal of this node's descendants.  When a descendant with a value
      * is found, action is called on it and traversal does not continue inside the node.
      * Action is *not* called on this node.
      *
      * @param {function(!Tree.<T>)} action Action to be called for each child.
      */
    def forEachImmediateDescendantWithValue(action: js.Function1[/* tree */ Tree[T], Unit]): Unit = js.native
    /**
      * Returns the data associated with this tree node.
      *
      * @return {?T} The data or null if no data exists.
      */
    def getValue(): T | Null = js.native
    /**
      * @return {boolean} Whether the tree has any children.
      */
    def hasChildren(): Boolean = js.native
    /**
      * @return {boolean} Whether the tree is empty (no value or children).
      */
    def isEmpty(): Boolean = js.native
    /**
      * @return {string} The name of the tree node.
      */
    def name(): String = js.native
    /**
      * @return {?Tree} The parent tree node, or null if this is the root of the tree.
      */
    def parent(): Tree[T] | Null = js.native
    /**
      * @return {!Path} The path of this tree node, as a Path.
      */
    def path(): Path = js.native
    /**
      * Sets data to this tree node.
      *
      * @param {!T} value Value to set.
      */
    def setValue(value: T): Unit = js.native
    /**
      * Returns a sub-Tree for the given path.
      *
      * @param {!(string|Path)} pathObj Path to look up.
      * @return {!Tree.<T>} Tree for path.
      */
    def subTree(pathObj: String): Tree[T] = js.native
    def subTree(pathObj: Path): Tree[T] = js.native
  }
  
  @js.native
  class TreeNode[T] () extends js.Object {
    var childCount: Double = js.native
    var children: StringDictionary[TreeNode[T]] = js.native
    var value: T | Null = js.native
  }
  
}

