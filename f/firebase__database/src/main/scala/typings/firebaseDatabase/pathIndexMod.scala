package typings.firebaseDatabase

import typings.firebaseDatabase.indexMod.Index
import typings.firebaseDatabase.nodeMod.NamedNode
import typings.firebaseDatabase.nodeMod.Node
import typings.firebaseDatabase.pathMod.Path
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pathIndexMod {
  
  @JSImport("@firebase/database/dist/node-esm/src/core/snap/indexes/PathIndex", "PathIndex")
  @js.native
  open class PathIndex protected () extends Index {
    def this(indexPath_ : Path) = this()
    
    /* protected */ def extractChild(snap: Node): Node = js.native
    
    /* private */ var indexPath_ : Any = js.native
    
    def makePost(indexValue: js.Object, name: String): NamedNode = js.native
  }
}
