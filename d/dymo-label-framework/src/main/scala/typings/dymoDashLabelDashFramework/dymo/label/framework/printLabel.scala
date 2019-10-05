package typings.dymoDashLabelDashFramework.dymo.label.framework

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("dymo.label.framework.printLabel")
@js.native
object printLabel extends js.Object {
  /**
  	 * Prints one or more labels.
  	 *
    * @param printerName The name of the printer to print to. A list of printers can be obtained using
  	 *   dymo.label.framework.getPrinters.
    * @param printParamsXml The print parameters, such as number of copies, print quality, etc.
  	 *   See [PrintParams.xsd]{@link http://labelwriter.com/software/dls/sdk/PrintParams.xsd}.
    * @param labelXml The label to print.
    * @param labelSetXml The LabelSet to print. LabelSet is used to print multiple labels with the same layout,
  	 *   but with different data, such as multiple addresses. Use dymo.label.framework.LabelSetBuilder class to
  	 *   create a LabelSet, or construct XML manualy according to
  	 *   [LabelSet.xsd]{@link http://labelwriter.com/software/dls/sdk/LabelSet.xsd}.
  	 */
  def apply(printerName: String, printParamsXml: String, labelXml: String, labelSetXml: String): Unit = js.native
}

