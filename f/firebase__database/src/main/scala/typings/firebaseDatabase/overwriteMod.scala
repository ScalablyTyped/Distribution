package typings.firebaseDatabase

import typings.firebaseDatabase.nodeMod.Node
import typings.firebaseDatabase.operationMod.Operation
import typings.firebaseDatabase.operationMod.OperationSource
import typings.firebaseDatabase.operationMod.OperationType
import typings.firebaseDatabase.pathMod.Path
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object overwriteMod {
  
  @JSImport("@firebase/database/dist/src/core/operation/Overwrite", "Overwrite")
  @js.native
  class Overwrite protected ()
    extends StObject
       with Operation {
    def this(source: OperationSource, path: Path, snap: Node) = this()
    
    /**
      * @param {string} childName
      * @return {?Operation}
      */
    /* CompleteClass */
    override def operationForChild(childName: String): Operation | Null = js.native
    
    /**
      * @type {!Path}
      */
    /* CompleteClass */
    var path: Path = js.native
    
    var snap: Node = js.native
    
    /**
      * @type {!OperationSource}
      */
    /* CompleteClass */
    var source: OperationSource = js.native
    
    /**
      * @type {!OperationType}
      */
    /* CompleteClass */
    var `type`: OperationType = js.native
  }
}
