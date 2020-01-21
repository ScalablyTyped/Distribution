package typings.fastJsonPatch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object moduleCoreMod {
  /* Rewritten from type alias, can be one of: 
    - typings.fastJsonPatch.moduleCoreMod.AddOperation[js.Any]
    - typings.fastJsonPatch.moduleCoreMod.RemoveOperation
    - typings.fastJsonPatch.moduleCoreMod.ReplaceOperation[js.Any]
    - typings.fastJsonPatch.moduleCoreMod.MoveOperation
    - typings.fastJsonPatch.moduleCoreMod.CopyOperation
    - typings.fastJsonPatch.moduleCoreMod.TestOperation[js.Any]
    - typings.fastJsonPatch.moduleCoreMod.GetOperation[js.Any]
  */
  type Operation = typings.fastJsonPatch.moduleCoreMod._Operation | typings.fastJsonPatch.moduleCoreMod.AddOperation[js.Any] | typings.fastJsonPatch.moduleCoreMod.ReplaceOperation[js.Any] | typings.fastJsonPatch.moduleCoreMod.TestOperation[js.Any] | typings.fastJsonPatch.moduleCoreMod.GetOperation[js.Any]
  type Validator_[T] = js.Function4[
    /* operation */ typings.fastJsonPatch.moduleCoreMod.Operation, 
    /* index */ scala.Double, 
    /* document */ T, 
    /* existingPathFragment */ java.lang.String, 
    scala.Unit
  ]
}
