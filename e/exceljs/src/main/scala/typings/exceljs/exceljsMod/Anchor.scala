package typings.exceljs.exceljsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("exceljs", "Anchor")
@js.native
class Anchor () extends IAnchor {
  def this(model: js.Object) = this()
  def this(model: IAnchor) = this()
  /* CompleteClass */
  override var col: Double = js.native
  val colWidth: Double = js.native
  /* CompleteClass */
  override var nativeCol: Double = js.native
  /* CompleteClass */
  override var nativeColOff: Double = js.native
  /* CompleteClass */
  override var nativeRow: Double = js.native
  /* CompleteClass */
  override var nativeRowOff: Double = js.native
  /* CompleteClass */
  override var row: Double = js.native
  val rowHeight: Double = js.native
  var worksheet: Worksheet = js.native
}

