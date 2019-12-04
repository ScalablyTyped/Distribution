package typings.fastDashJsonDashPatch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object commonjsCoreMod {
  /* Rewritten from type alias, can be one of: 
    - typings.fastDashJsonDashPatch.commonjsCoreMod.AddOperation[js.Any]
    - typings.fastDashJsonDashPatch.commonjsCoreMod.RemoveOperation
    - typings.fastDashJsonDashPatch.commonjsCoreMod.ReplaceOperation[js.Any]
    - typings.fastDashJsonDashPatch.commonjsCoreMod.MoveOperation
    - typings.fastDashJsonDashPatch.commonjsCoreMod.CopyOperation
    - typings.fastDashJsonDashPatch.commonjsCoreMod.TestOperation[js.Any]
    - typings.fastDashJsonDashPatch.commonjsCoreMod.GetOperation[js.Any]
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
