package typings.dymoLabelFramework.dymo.label.framework

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("dymo.label.framework.getPrinters")
@js.native
object getPrinters extends js.Object {
  /**
  	 * Gets a list of all printers supported by the DYMO Label Framework.
  	 * Results are returned in an array-like object.
  	 * Each item is of the type dymo.label.framework.PrinterInfo.
  	 * In addition, items can be accessed by printer name.
  	 */
  def apply(): js.Array[PrinterInfo] = js.native
}

