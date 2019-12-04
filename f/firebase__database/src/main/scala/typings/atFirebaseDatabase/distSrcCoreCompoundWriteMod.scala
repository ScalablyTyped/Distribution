package typings.atFirebaseDatabase

import org.scalablytyped.runtime.StringDictionary
import typings.atFirebaseDatabase.distSrcCoreCompoundWriteMod.CompoundWrite
import typings.atFirebaseDatabase.distSrcCoreSnapNodeMod.NamedNode
import typings.atFirebaseDatabase.distSrcCoreSnapNodeMod.Node
import typings.atFirebaseDatabase.distSrcCoreUtilImmutableTreeMod.ImmutableTree
import typings.atFirebaseDatabase.distSrcCoreUtilPathMod.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/database/dist/src/core/CompoundWrite", JSImport.Namespace)
@js.native
object distSrcCoreCompoundWriteMod extends js.Object {
  @js.native
  class CompoundWrite protected () extends js.Object {
    def this(writeTree_ : ImmutableTree[Node]) = this()
    var writeTree_ : js.Any = js.native
    def addWrite(path: Path, node: Node): CompoundWrite = js.native
    def addWrites(path: Path, updates: StringDictionary[Node]): CompoundWrite = js.native
    /**
      * Applies this CompoundWrite to a node. The node is returned with all writes from this CompoundWrite applied to the
      * node
      * @param node The node to apply this CompoundWrite to
      * @return The node with all writes applied
      */
    @JSName("apply")
    def apply(node: Node): Node = js.native
    def childCompoundWrite(path: Path): CompoundWrite = js.native
    /**
      * Returns all children that are guaranteed to be a complete overwrite.
      *
      * @return A list of all complete children.
      */
    def getCompleteChildren(): js.Array[NamedNode] = js.native
    /**
      * Returns a node for a path if and only if the node is a "complete" overwrite at that path. This will not aggregate
      * writes from deeper paths, but will return child nodes from a more shallow path.
      *
      * @param path The path to get a complete write
      * @return The node if complete at that path, or null otherwise.
      */
    def getCompleteNode(path: Path): Node | Null = js.native
    /**
      * Returns whether this CompoundWrite will fully overwrite a node at a given location and can therefore be
      * considered "complete".
      *
      * @param path The path to check for
      * @return Whether there is a complete write at that path
      */
    def hasCompleteWrite(path: Path): Boolean = js.native
    /**
      * Returns true if this CompoundWrite is empty and therefore does not modify any nodes.
      * @return Whether this CompoundWrite is empty
      */
    def isEmpty(): Boolean = js.native
    /**
      * Will remove a write at the given path and deeper paths. This will <em>not</em> modify a write at a higher
      * location, which must be removed by calling this method with that path.
      *
      * @param path The path at which a write and all deeper writes should be removed
      * @return {!CompoundWrite} The new CompoundWrite with the removed path
      */
    def removeWrite(path: Path): CompoundWrite = js.native
  }
  
  /* static members */
  @js.native
  object CompoundWrite extends js.Object {
    var Empty: CompoundWrite = js.native
  }
  
}

