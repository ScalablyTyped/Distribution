package typings.fastJsonPatch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object coreMod {
  /* Rewritten from type alias, can be one of: 
    - typings.fastJsonPatch.coreMod.AddOperation[js.Any]
    - typings.fastJsonPatch.coreMod.RemoveOperation
    - typings.fastJsonPatch.coreMod.ReplaceOperation[js.Any]
    - typings.fastJsonPatch.coreMod.MoveOperation
    - typings.fastJsonPatch.coreMod.CopyOperation
    - typings.fastJsonPatch.coreMod.TestOperation[js.Any]
    - typings.fastJsonPatch.coreMod.GetOperation[js.Any]
  */
  type Operation = typings.fastJsonPatch.coreMod._Operation | typings.fastJsonPatch.coreMod.AddOperation[js.Any] | typings.fastJsonPatch.coreMod.ReplaceOperation[js.Any] | typings.fastJsonPatch.coreMod.TestOperation[js.Any] | typings.fastJsonPatch.coreMod.GetOperation[js.Any]
  type Validator_[T] = js.Function4[
    /* operation */ typings.fastJsonPatch.coreMod.Operation, 
    /* index */ scala.Double, 
    /* document */ T, 
    /* existingPathFragment */ java.lang.String, 
    scala.Unit
  ]
}
