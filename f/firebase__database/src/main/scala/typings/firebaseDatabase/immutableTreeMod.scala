package typings.firebaseDatabase

import org.scalablytyped.runtime.StringDictionary
import typings.firebaseDatabase.anon.Value
import typings.firebaseDatabase.pathMod.Path
import typings.firebaseDatabase.sortedMapMod.SortedMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object immutableTreeMod {
  
  @JSImport("@firebase/database/dist/node-esm/src/core/util/ImmutableTree", "ImmutableTree")
  @js.native
  open class ImmutableTree[T] () extends StObject {
    def this(value: T) = this()
    def this(value: T, children: SortedMap[String, ImmutableTree[T]]) = this()
    def this(value: Null, children: SortedMap[String, ImmutableTree[T]]) = this()
    
    val children: SortedMap[String, ImmutableTree[T]] = js.native
    
    /**
      * Find the first matching value on the given path. Return the result of applying f to it.
      */
    def findOnPath[V](path: Path, f: js.Function2[/* path */ Path, /* value */ T, V | Null]): V | Null = js.native
    
    /* private */ var findOnPath_ : Any = js.native
    
    /**
      * Given a path and predicate, return the first node and the path to that node
      * where the predicate returns true.
      *
      * TODO Do a perf test -- If we're creating a bunch of `{path: value:}`
      * objects on the way back out, it may be better to pass down a pathSoFar obj.
      *
      * @param relativePath - The remainder of the path
      * @param predicate - The predicate to satisfy to return a node
      */
    def findRootMostMatchingPathAndValue(relativePath: Path, predicate: js.Function1[/* a */ T, Boolean]): Value[T] | Null = js.native
    
    /**
      * Find, if it exists, the shortest subpath of the given path that points a defined
      * value in the tree
      */
    def findRootMostValueAndPath(relativePath: Path): Value[T] | Null = js.native
    
    /**
      * Performs a depth first fold on this tree. Transforms a tree into a single
      * value, given a function that operates on the path to a node, an optional
      * current value, and a map of child names to folded subtrees
      */
    def fold[V](fn: js.Function3[/* path */ Path, /* value */ T, /* children */ StringDictionary[V], V]): V = js.native
    
    /**
      * Recursive helper for public-facing fold() method
      */
    /* private */ var fold_ : Any = js.native
    
    /**
      * Calls the given function for each node in the tree that has a value.
      *
      * @param f - A function to be called with the path from the root of the tree to
      * a node, and the value at that node. Called in depth-first order.
      */
    def foreach(f: js.Function2[/* path */ Path, /* value */ T, Unit]): Unit = js.native
    
    def foreachChild(f: js.Function2[/* name */ String, /* value */ T, Unit]): Unit = js.native
    
    def foreachOnPath(path: Path, f: js.Function2[/* path */ Path, /* value */ T, Unit]): ImmutableTree[T] = js.native
    
    /* private */ var foreachOnPath_ : Any = js.native
    
    /* private */ var foreach_ : Any = js.native
    
    /**
      * Gets a value from the tree.
      *
      * @param relativePath - Path to get value for.
      * @returns Value at path, or null.
      */
    def get(relativePath: Path): T | Null = js.native
    
    /**
      * True if the value is empty and there are no children
      */
    def isEmpty(): Boolean = js.native
    
    /**
      * Removes the value at the specified path.
      *
      * @param relativePath - Path to value to remove.
      * @returns Resulting tree.
      */
    def remove(relativePath: Path): ImmutableTree[T] = js.native
    
    /**
      * Sets a value at the specified path.
      *
      * @param relativePath - Path to set value at.
      * @param toSet - Value to set.
      * @returns Resulting tree.
      */
    def set(relativePath: Path): ImmutableTree[T] = js.native
    def set(relativePath: Path, toSet: T): ImmutableTree[T] = js.native
    
    /**
      * Replace the subtree at the specified path with the given new tree.
      *
      * @param relativePath - Path to replace subtree for.
      * @param newTree - New tree.
      * @returns Resulting tree.
      */
    def setTree(relativePath: Path, newTree: ImmutableTree[T]): ImmutableTree[T] = js.native
    
    /**
      * @returns The subtree at the given path
      */
    def subtree(relativePath: Path): ImmutableTree[T] = js.native
    
    val value: T | Null = js.native
  }
  /* static members */
  object ImmutableTree {
    
    @JSImport("@firebase/database/dist/node-esm/src/core/util/ImmutableTree", "ImmutableTree")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromObject[T](obj: StringDictionary[T]): ImmutableTree[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(obj.asInstanceOf[js.Any]).asInstanceOf[ImmutableTree[T]]
  }
}
