package typings
package fastDashJsonDashPatchLib.libCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PatchResult[T]
  extends stdLib.Array[OperationResult[T]] {
  var newDocument: T = js.native
}

