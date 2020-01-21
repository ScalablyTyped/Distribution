package typings.dymoLabelFramework.dymo.label.framework

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("dymo.label.framework.printLabel2")
@js.native
object printLabel2 extends js.Object {
  /**
  	 * Prints a label and returns a print job object
  	 *
  	 * @param printerName The printer to print on. A list of printers can be obtained by getPrinters()
  	 * @param printParamsXml Printing parameters, like number of copies, print quality, etc. See [PrintParams.xsd]{@link http://labelwriter.com/software/dls/sdk/PrintParams.xsd}
  	 * @param labelXml Label to print
  	 * @param labelSetXml
  	 *   LabelSet to print. LabelSet is used to print multiple labels with same layout but different data, e.g. multiple addresses.
  	 *   Use LabelSetBuilder to create a LabelSet or construct xml manualy according to [LabelSet.xsd]{@link http://labelwriter.com/software/dls/sdk/LabelSet.xsd}.
  	 */
  def apply(printerName: String, printParamsXml: String, labelXml: String, labelSetXml: String): PrintJob = js.native
}

