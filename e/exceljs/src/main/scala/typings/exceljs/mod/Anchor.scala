package typings.exceljs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("exceljs", "Anchor")
@js.native
class Anchor () extends IAnchor {
  def this(model: js.Object) = this()
  def this(model: IAnchor) = this()
  
  val colWidth: Double = js.native
  
  val rowHeight: Double = js.native
  
  var worksheet: Worksheet = js.native
}
