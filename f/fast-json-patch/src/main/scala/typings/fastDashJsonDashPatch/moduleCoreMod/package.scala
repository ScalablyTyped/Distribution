package typings.fastDashJsonDashPatch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object moduleCoreMod {
  /* Rewritten from type alias, can be one of: 
    - typings.fastDashJsonDashPatch.moduleCoreMod.AddOperation[js.Any]
    - typings.fastDashJsonDashPatch.moduleCoreMod.RemoveOperation
    - typings.fastDashJsonDashPatch.moduleCoreMod.ReplaceOperation[js.Any]
    - typings.fastDashJsonDashPatch.moduleCoreMod.MoveOperation
    - typings.fastDashJsonDashPatch.moduleCoreMod.CopyOperation
    - typings.fastDashJsonDashPatch.moduleCoreMod.TestOperation[js.Any]
    - typings.fastDashJsonDashPatch.moduleCoreMod.GetOperation[js.Any]
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
