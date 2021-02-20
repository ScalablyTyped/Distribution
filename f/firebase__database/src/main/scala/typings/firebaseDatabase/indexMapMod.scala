package typings.firebaseDatabase

import org.scalablytyped.runtime.StringDictionary
import typings.firebaseDatabase.indexMod.Index
import typings.firebaseDatabase.nodeMod.NamedNode
import typings.firebaseDatabase.nodeMod.Node
import typings.firebaseDatabase.sortedMapMod.SortedMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object indexMapMod {
  
  @JSImport("@firebase/database/dist/src/core/snap/IndexMap", "IndexMap")
  @js.native
  class IndexMap protected () extends StObject {
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
    
    var indexSet_ : js.Any = js.native
    
    var indexes_ : js.Any = js.native
    
    /**
      * Create a new IndexMap instance with the given value removed
      */
    def removeFromIndexes(namedNode: NamedNode, existingChildren: SortedMap[String, Node]): IndexMap = js.native
  }
}
