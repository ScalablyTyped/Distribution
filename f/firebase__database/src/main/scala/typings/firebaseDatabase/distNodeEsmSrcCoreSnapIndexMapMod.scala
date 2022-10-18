package typings.firebaseDatabase

import org.scalablytyped.runtime.StringDictionary
import typings.firebaseDatabase.distNodeEsmSrcCoreSnapIndexesIndexMod.Index
import typings.firebaseDatabase.distNodeEsmSrcCoreSnapNodeMod.NamedNode
import typings.firebaseDatabase.distNodeEsmSrcCoreSnapNodeMod.Node
import typings.firebaseDatabase.distNodeEsmSrcCoreUtilSortedMapMod.SortedMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distNodeEsmSrcCoreSnapIndexMapMod {
  
  @JSImport("@firebase/database/dist/node-esm/src/core/snap/IndexMap", "IndexMap")
  @js.native
  open class IndexMap protected () extends StObject {
    def this(
      indexes_ : StringDictionary[(SortedMap[NamedNode, Node]) | (/*FallbackType*/ js.Object)],
      indexSet_ : StringDictionary[Index]
    ) = this()
    
    def addIndex(indexDefinition: Index, existingChildren: SortedMap[String, Node]): IndexMap = js.native
    
    /**
      * Ensure that this node is properly tracked in any indexes that we're maintaining
      */
    def addToIndexes(namedNode: NamedNode, existingChildren: SortedMap[String, Node]): IndexMap = js.native
    
    def get(indexKey: String): (SortedMap[NamedNode, Node]) | Null = js.native
    
    def hasIndex(indexDefinition: Index): Boolean = js.native
    
    /* private */ var indexSet_ : Any = js.native
    
    /* private */ var indexes_ : Any = js.native
    
    /**
      * Create a new IndexMap instance with the given value removed
      */
    def removeFromIndexes(namedNode: NamedNode, existingChildren: SortedMap[String, Node]): IndexMap = js.native
  }
}
