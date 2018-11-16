package typings
package fastDashJsonDashPatchLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libCoreMod {
  type Operation = AddOperation[js.Any] | RemoveOperation | ReplaceOperation[js.Any] | MoveOperation | CopyOperation | TestOperation[js.Any] | GetOperation[js.Any]
  type Validator[T] = js.Function4[
    /* operation */ Operation, 
    /* index */ scala.Double, 
    /* document */ T, 
    /* existingPathFragment */ java.lang.String, 
    scala.Unit
  ]
}
