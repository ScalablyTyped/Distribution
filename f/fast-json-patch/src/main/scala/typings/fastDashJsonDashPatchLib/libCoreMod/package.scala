package typings
package fastDashJsonDashPatchLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libCoreMod {
  /* Rewritten from type alias, can be one of: 
    - AddOperation[js.Any]
    - RemoveOperation
    - ReplaceOperation[js.Any]
    - MoveOperation
    - CopyOperation
    - TestOperation[js.Any]
    - GetOperation[js.Any]
  */
  type Operation = _Operation | AddOperation[js.Any] | ReplaceOperation[js.Any] | TestOperation[js.Any] | GetOperation[js.Any]
  type Validator[T] = js.Function4[
    /* operation */ Operation, 
    /* index */ scala.Double, 
    /* document */ T, 
    /* existingPathFragment */ java.lang.String, 
    scala.Unit
  ]
}
