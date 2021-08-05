package typings.firebaseDatabase

import typings.firebaseDatabase.indexMod.Index
import typings.firebaseDatabase.nodeMod.NamedNode
import typings.firebaseDatabase.nodeMod.Node
import typings.firebaseDatabase.pathMod.Path
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pathIndexMod {
  
  @JSImport("@firebase/database/dist/src/core/snap/indexes/PathIndex", "PathIndex")
  @js.native
  class PathIndex protected () extends Index {
    def this(indexPath_ : Path) = this()
    
    /**
      * @param {!Node} snap
      * @return {!Node}
      * @protected
      */
    /* protected */ def extractChild(snap: Node): Node = js.native
    
    /* private */ var indexPath_ : js.Any = js.native
    
    /**
      * @inheritDoc
      */
    def makePost(indexValue: js.Object, name: String): NamedNode = js.native
  }
}
