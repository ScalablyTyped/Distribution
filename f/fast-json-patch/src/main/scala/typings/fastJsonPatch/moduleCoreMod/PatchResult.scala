package typings.fastJsonPatch.moduleCoreMod

import typings.std.Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PatchResult[T] extends Array[OperationResult[T]] {
  
  var newDocument: T = js.native
}
