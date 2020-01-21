package typings.dymoLabelFramework.dymo.label.framework

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("dymo.label.framework.printLabelAndPollStatus")
@js.native
object printLabelAndPollStatus extends js.Object {
  /**
  	 * Prints a label and runs status checking in a loop
  	 *
  	 * @param printerName The printer to print on. A list of printers can be obtained by getPrinters()
  	 * @param printParamsXml Printing parameters, like number of copies, print quality, etc. See [PrintParams.xsd]{@link http://labelwriter.com/software/dls/sdk/PrintParams.xsd}
  	 * @param labelXml Label to print
  	 * @param labelSetXml
  	 *   LabelSet to print. LabelSet is used to print multiple labels with same layout but different data, e.g.
  	 *   multiple addresses.
  	 *   Use LabelSetBuilder to create a LabelSet or construct xml manually according to
  	 *   [LabelSet.xsd]{@link http://labelwriter.com/software/dls/sdk/LabelSet.xsd}
  	 * @param statusCallback
  	 *   Function to be called when a print job status is available.
  	 *   To continue polling the status the function should return true, false otherwise.
  	 * @param pollInterval Polling interval in milliseconds
  	 */
  def apply(
    printerName: String,
    printParamsXml: String,
    labelXml: String,
    labelSetXml: String,
    statusCallback: js.Function2[/* printJob */ PrintJob, /* printJobStatusInfo */ PrintJobStatusInfo, Boolean],
    pollInterval: Double
  ): PrintJob = js.native
}

