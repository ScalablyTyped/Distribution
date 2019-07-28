package typings.dymoDashLabelDashFramework.dymoNs.labelNs.frameworkNs

import typings.dymoDashLabelDashFramework.Anon_ErrorDetails
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("dymo.label.framework")
@js.native
object ^ extends js.Object {
  /** Returns the library version number, e.g. "1.2.6" */
  var VERSION: String = js.native
  /**
  	 * Undocumented, removed, see http://developers.dymo.com/2013/08/14/dymo-sdk-qa/#comment-27119
  	 */
  def addPrinterUri(printerUri: String): Unit = js.native
  def addPrinterUri(printerUri: String, location: String): Unit = js.native
  def addPrinterUri(printerUri: String, location: String, successCallback: AddPrinterUriCallback): Unit = js.native
  def addPrinterUri(
    printerUri: String,
    location: String,
    successCallback: AddPrinterUriCallback,
    errorCallback: AddPrinterUriCallback
  ): Unit = js.native
  /** Checks that the browser enviroment is suitable for the Framework. */
  def checkEnvironment(): Anon_ErrorDetails = js.native
  /**
  	 * Creates an XML string suitable to pass to the dymo.label.framework.renderLabel function
  	 * as renderParamsXml parameter. Returns an XML string.
  	 *
  	 * @param params A JavaScript object with the following properties
  	 *   (not all properties must be defined; if a property is not defined, a default value is used)
  	 */
  def createLabelRenderParamsXml(params: CreateLabelRenderParamsXmlParams): String = js.native
  /**
  	 * Creates an XML string suitable to to pass to the dymo.label.framework.printLabel function
  	 * as printParamsXml parameter. Created print parameters are for printing to LabelWriter printers.
  	 * Returns an XML string.
  	 *
  	 * @param params A JavaScript object with the following properties
  	 *   (not all properties must be defined; if a property is not defined, a default value is used)
  	 */
  def createLabelWriterPrintParamsXml(params: CreateLabelWriterPrintParamsXmlParams): String = js.native
  /**
  	 * Creates an XML string suitable to pass to the dymo.label.framework.printLabel function as printParamsXml parameter. Created print parameters are for printing to Tape printers.
  	 * Returns an XML string.
  	 *
  	 * @param params A JavaScript object with the following properties
  	 *   (not all properties must be defined; if a property is not defined, a default value is used)
  	 */
  def createTapePrintParamsXml(params: CreateTapePrintParamsXmlParams): String = js.native
  /**
  	 * Convenience method (overload of getPrinters) to get a list of all printers of type "LabelWriterPrinter".
  	 */
  def getLabelWriterPrinters(): js.Array[PrinterInfo] = js.native
  /**
  	 * Gets a list of all printers supported by the DYMO Label Framework.
  	 * Results are returned in an array-like object.
  	 * Each item is of the type dymo.label.framework.PrinterInfo.
  	 * In addition, items can be accessed by printer name.
  	 */
  def getPrinters(): js.Array[PrinterInfo] = js.native
  /**
  	 * Convenience method (overload of getPrinters) to get a list of all printers of type "TapePrinter".
  	 */
  def getTapePrinters(): js.Array[PrinterInfo] = js.native
  /**
  	 * Loads an image from a URL or file and returns it as a base64-encoded PNG stream.
  	 * The loaded image is not necessarily in PNG format.
  	 * The image can be in any format supported by the Framework (by DYMO Label v.8).
  	 * The loaded data can be used to set content for an image object on a label.
  	 * Note: The comments for {@link openLabelFile} apply to this function as well.
  	 *
  	 * @param imageUri URL or file name to load the image from.
  	 *
  	 * @returns A base64-encoded PNG stream.
  	 */
  def loadImageAsPngBase64(imageUri: String): String = js.native
  /**
  	 * Loads label content from a file or URL.
    * The following considerations should be taken before using this function:
  	 *
    * * The full file name or URL should be specified. The function will not honor relative paths based on document.location.href.
    * * The fileName can be an http:// or file:// URL. On Windows the file name can be a regular file name, for example 'c:\\users\desktop\address.label'.
    * * The content of the label will be loaded synchronously. Therefore, if the remote server is down there will be a timeout.
    * * Any local file can be accessed or attempted to be accessed. The function is not limited by any browser restrictions. However, only a valid label file (according to label.xsd schema) can be loaded. This could still be a potential security concern.
    * * The URL is not limited to same-site-origin browser policy. Any URL can be opened.
    * * The proxy settings are the system default settings, these are not necessarily the browser settings.
  	 *
    * Use this function only when there is no other way to load label data. In most cases, label data should be loaded using dymo.label.framework.openLabelXml.
  	 *
  	 * @param fileName FileName or URL to load label from.
  	 * 
  	 * @returns Returns Label object; provides label manipulation methods.
  	 */
  def openLabelFile(fileName: String): ILabel = js.native
  /**
  	 * Loads label content from an XML stream/string.
  	 * Note: This is the preferred way to load/open label files.
  	 * Use XMLHttpRequest() or other standard browser methods to get XML string.
  	 *
  	 * @param labelXml The label definition as an XML string.
  	 * @returns Label object.
  	 */
  def openLabelXml(labelXml: String): ILabel = js.native
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
  def printLabel(printerName: String, printParamsXml: String, labelXml: String, labelSetXml: String): Unit = js.native
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
  def printLabel2(printerName: String, printParamsXml: String, labelXml: String, labelSetXml: String): PrintJob = js.native
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
  def printLabelAndPollStatus(
    printerName: String,
    printParamsXml: String,
    labelXml: String,
    labelSetXml: String,
    statusCallback: js.Function2[/* printJob */ PrintJob, /* printJobStatusInfo */ PrintJobStatusInfo, Boolean],
    pollInterval: Double
  ): PrintJob = js.native
  /**
  	 * Undocumented, removed, see http://developers.dymo.com/2013/08/14/dymo-sdk-qa/#comment-27119
  	 */
  def removeAllPrinterUri(): Unit = js.native
  /**
  	 * Undocumented, removed, see http://developers.dymo.com/2013/08/14/dymo-sdk-qa/#comment-27119
  	 */
  def removePrinterUri(printerUri: String): Unit = js.native
  /**
  	 * Creates a label raster image that can be used for label previewing.
  	 * Returns a string that is a base64-encoded PNG stream of the label image.
  	 * This string can be used as data: url for  element.
  	 * Note: data: urls are not supported by IE6 and IE7. IE8 supports them with a 32KB limit (so it may not be possible to preview 'large' labels).
  	 *
    * @param labelXml Label to preview.
    * @param renderParamsXml The rendering parameters, such as shadow depth, label color, etc. See [LabelRenderParams.xsd]{@link http://labelwriter.com/software/dls/sdk/LabelRenderParams.xsd}.
    * @param printerName The name of the printer that the preview is generated for.
  	 *   The preview/output can be different for different printers, especially for tape printers
  	 *   with different print head sizes. If it is not important what printer the label is
  	 *   printed to, an empty string can be passed. In this case, the default printer metrics
  	 *   will be used. The default is LW400 for LabelWriter printers and LW400 DUO Tape for tape printers.
  	 *
  	 * @returns A base64-encoded PNG stream of the label image.
  	 */
  def renderLabel(labelXml: String, renderParamsXml: String, printerName: String): String = js.native
}

