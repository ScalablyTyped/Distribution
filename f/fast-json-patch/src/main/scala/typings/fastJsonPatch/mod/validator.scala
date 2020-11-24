package typings.fastJsonPatch.mod

import typings.fastJsonPatch.moduleCoreMod.Operation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fast-json-patch", "validator")
@js.native
object validator extends js.Object {
  
  def apply(operation: Operation, index: Double): Unit = js.native
  def apply(
    operation: Operation,
    index: Double,
    document: js.UndefOr[scala.Nothing],
    existingPathFragment: String
  ): Unit = js.native
  def apply(operation: Operation, index: Double, document: js.Any): Unit = js.native
  def apply(operation: Operation, index: Double, document: js.Any, existingPathFragment: String): Unit = js.native
}
