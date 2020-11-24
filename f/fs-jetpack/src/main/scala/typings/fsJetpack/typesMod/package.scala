package typings.fsJetpack

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object typesMod {
  
  type AppendData = java.lang.String | typings.node.Buffer
  
  type OverwriteFunction = js.Function2[
    /* srcInspectData */ typings.fsJetpack.typesMod.InspectResult, 
    /* destInspectData */ typings.fsJetpack.typesMod.InspectResult, 
    scala.Boolean | js.Promise[scala.Boolean]
  ]
  
  type WritableData = java.lang.String | js.Object | js.Array[js.Any] | typings.node.Buffer
}
