package typings.dymoDashLabelDashFramework.dymo.label.framework

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("dymo.label.framework.createLabelWriterPrintParamsXml")
@js.native
object createLabelWriterPrintParamsXml extends js.Object {
  /**
  	 * Creates an XML string suitable to to pass to the dymo.label.framework.printLabel function
  	 * as printParamsXml parameter. Created print parameters are for printing to LabelWriter printers.
  	 * Returns an XML string.
  	 *
  	 * @param params A JavaScript object with the following properties
  	 *   (not all properties must be defined; if a property is not defined, a default value is used)
  	 */
  def apply(params: CreateLabelWriterPrintParamsXmlParams): String = js.native
}

