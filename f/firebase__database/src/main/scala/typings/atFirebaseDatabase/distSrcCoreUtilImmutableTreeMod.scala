package typings.atFirebaseDatabase

import org.scalablytyped.runtime.StringDictionary
import typings.atFirebaseDatabase.distSrcCoreUtilImmutableTreeMod.ImmutableTree
import typings.atFirebaseDatabase.distSrcCoreUtilPathMod.Path
import typings.atFirebaseDatabase.distSrcCoreUtilSortedMapMod.SortedMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/database/dist/src/core/util/ImmutableTree", JSImport.Namespace)
@js.native
object distSrcCoreUtilImmutableTreeMod extends js.Object {
  @js.native
  class ImmutableTree[T] () extends js.Object {
    /**
      * @template T
      * @param {?T} value
      * @param {SortedMap.<string, !ImmutableTree.<T>>=} children
      */
    def this(value: T) = this()
    def this(value: T, children: SortedMap[String, ImmutableTree[T]]) = this()
    def this(value: Null, children: SortedMap[String, ImmutableTree[T]]) = this()
    val children: SortedMap[String, ImmutableTree[T]] = js.native
    var findOnPath_ : js.Any = js.native
    /**
      * Recursive helper for public-facing fold() method
      * @template V
      * @param {!Path} pathSoFar
      * @param {function(Path, ?T, Object.<string, V>):V} fn
      * @return {V}
      * @private
      */
    var fold_ : js.Any = js.native
    var foreachOnPath_ : js.Any = js.native
    var foreach_ : js.Any = js.native
    val value: T | Null = js.native
    /**
      * Find the first matching value on the given path. Return the result of applying f to it.
      * @template V
      * @param {!Path} path
      * @param {!function(!Path, !T):?V} f
      * @return {?V}
      */
    def findOnPath[V](path: Path, f: js.Function2[/* path */ Path, /* value */ T, V | Null]): V | Null = js.native
    /**
      * Given a path and predicate, return the first node and the path to that node
      * where the predicate returns true.
      *
      * TODO Do a perf test -- If we're creating a bunch of {path: value:} objects
      * on the way back out, it may be better to pass down a pathSoFar obj.
      *
      * @param {!Path} relativePath The remainder of the path
      * @param {function(T):boolean} predicate The predicate to satisfy to return a
      *   node
      * @return {?{path:!Path, value:!T}}
      */
    def findRootMostMatchingPathAndValue(relativePath: Path, predicate: js.Function1[/* a */ T, Boolean]): Anon_Path[T] | Null = js.native
    /**
      * Find, if it exists, the shortest subpath of the given path that points a defined
      * value in the tree
      * @param {!Path} relativePath
      * @return {?{path: !Path, value: !T}}
      */
    def findRootMostValueAndPath(relativePath: Path): Anon_Path[T] | Null = js.native
    /**
      * Performs a depth first fold on this tree. Transforms a tree into a single
      * value, given a function that operates on the path to a node, an optional
      * current value, and a map of child names to folded subtrees
      * @template V
      * @param {function(Path, ?T, Object.<string, V>):V} fn
      * @return {V}
      */
    def fold[V](fn: js.Function3[/* path */ Path, /* value */ T, /* children */ StringDictionary[V], V]): V = js.native
    /**
      * Calls the given function for each node in the tree that has a value.
      *
      * @param {function(!Path, !T)} f A function to be called with
      *   the path from the root of the tree to a node, and the value at that node.
      *   Called in depth-first order.
      */
    def foreach(f: js.Function2[/* path */ Path, /* value */ T, Unit]): Unit = js.native
    /**
      *
      * @param {function(string, !T)} f
      */
    def foreachChild(f: js.Function2[/* name */ String, /* value */ T, Unit]): Unit = js.native
    /**
      *
      * @param {!Path} path
      * @param {!function(!Path, !T)} f
      * @returns {!ImmutableTree.<T>}
      */
    def foreachOnPath(path: Path, f: js.Function2[/* path */ Path, /* value */ T, Unit]): ImmutableTree[T] = js.native
    /**
      * Gets a value from the tree.
      *
      * @param {!Path} relativePath Path to get value for.
      * @return {?T} Value at path, or null.
      */
    def get(relativePath: Path): T | Null = js.native
    /**
      * True if the value is empty and there are no children
      * @return {boolean}
      */
    def isEmpty(): Boolean = js.native
    /**
      * Removes the value at the specified path.
      *
      * @param {!Path} relativePath Path to value to remove.
      * @return {!ImmutableTree.<T>} Resulting tree.
      */
    def remove(relativePath: Path): ImmutableTree[T] = js.native
    def set(relativePath: Path): ImmutableTree[T] = js.native
    /**
      * Sets a value at the specified path.
      *
      * @param {!Path} relativePath Path to set value at.
      * @param {?T} toSet Value to set.
      * @return {!ImmutableTree.<T>} Resulting tree.
      */
    def set(relativePath: Path, toSet: T): ImmutableTree[T] = js.native
    /**
      * Replace the subtree at the specified path with the given new tree.
      *
      * @param {!Path} relativePath Path to replace subtree for.
      * @param {!ImmutableTree} newTree New tree.
      * @return {!ImmutableTree} Resulting tree.
      */
    def setTree(relativePath: Path, newTree: ImmutableTree[T]): ImmutableTree[T] = js.native
    /**
      * @param {!Path} relativePath
      * @return {!ImmutableTree.<T>} The subtree at the given path
      */
    def subtree(relativePath: Path): ImmutableTree[T] = js.native
  }
  
  /* static members */
  @js.native
  object ImmutableTree extends js.Object {
    var Empty: ImmutableTree[_] = js.native
    /**
      * @template T
      * @param {!Object.<string, !T>} obj
      * @return {!ImmutableTree.<!T>}
      */
    def fromObject[T](obj: StringDictionary[T]): ImmutableTree[T] = js.native
  }
  
}

