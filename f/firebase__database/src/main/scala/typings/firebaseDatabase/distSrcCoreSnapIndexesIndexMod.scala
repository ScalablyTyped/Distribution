package typings.firebaseDatabase

import typings.firebaseDatabase.distSrcCoreSnapNodeMod.NamedNode
import typings.firebaseDatabase.distSrcCoreSnapNodeMod.Node
import typings.firebaseDatabase.distSrcCoreUtilSortedMapMod.Comparator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcCoreSnapIndexesIndexMod {
  
  /* note: abstract class */ @JSImport("@firebase/database/dist/src/core/snap/indexes/Index", "Index")
  @js.native
  open class Index () extends StObject {
    
    def compare(a: NamedNode, b: NamedNode): Double = js.native
    
    /**
      * @returns A standalone comparison function for
      * this index
      */
    def getCompare(): Comparator[NamedNode] = js.native
    
    /**
      * Given a before and after value for a node, determine if the indexed value has changed. Even if they are different,
      * it's possible that the changes are isolated to parts of the snapshot that are not indexed.
      *
      *
      * @returns True if the portion of the snapshot being indexed changed between oldNode and newNode
      */
    def indexedValueChanged(oldNode: Node, newNode: Node): Boolean = js.native
    
    def isDefinedOn(node: Node): Boolean = js.native
    
    def makePost(indexValue: Any, name: String): NamedNode = js.native
    
    /**
      * @returns a node wrapper that will sort greater than or equal to
      * any other node wrapper, using this index
      */
    def maxPost(): NamedNode = js.native
    
    /**
      * @returns a node wrapper that will sort equal to or less than
      * any other node wrapper, using this index
      */
    def minPost(): NamedNode = js.native
  }
}
