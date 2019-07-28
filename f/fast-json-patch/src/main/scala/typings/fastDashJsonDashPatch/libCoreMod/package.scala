package typings.fastDashJsonDashPatch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libCoreMod {
  /* Rewritten from type alias, can be one of: 
    - typings.fastDashJsonDashPatch.libCoreMod.AddOperation[js.Any]
    - typings.fastDashJsonDashPatch.libCoreMod.RemoveOperation
    - typings.fastDashJsonDashPatch.libCoreMod.ReplaceOperation[js.Any]
    - typings.fastDashJsonDashPatch.libCoreMod.MoveOperation
    - typings.fastDashJsonDashPatch.libCoreMod.CopyOperation
    - typings.fastDashJsonDashPatch.libCoreMod.TestOperation[js.Any]
    - typings.fastDashJsonDashPatch.libCoreMod.GetOperation[js.Any]
  */
  type Operation = _Operation | AddOperation[js.Any] | ReplaceOperation[js.Any] | TestOperation[js.Any] | GetOperation[js.Any]
  type Validator[T] = js.Function4[
    /* operation */ Operation, 
    /* index */ Double, 
    /* document */ T, 
    /* existingPathFragment */ String, 
    Unit
  ]
}
