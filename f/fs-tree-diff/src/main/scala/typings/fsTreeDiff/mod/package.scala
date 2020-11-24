package typings.fsTreeDiff

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Entry = typings.fsTreeDiff.entryMod.DefaultEntry
  
  type Operation = (js.Tuple3[
    typings.fsTreeDiff.mod.Operand, 
    java.lang.String, 
    typings.fsTreeDiff.entryMod.DefaultEntry
  ]) | (js.Tuple2[typings.fsTreeDiff.mod.Operand, java.lang.String])
  
  type Patch = js.Array[typings.fsTreeDiff.mod.Operation]
}
