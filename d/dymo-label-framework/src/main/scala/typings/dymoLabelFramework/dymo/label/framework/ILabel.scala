package typings.dymoLabelFramework.dymo.label.framework

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * There is no constructor function for ILabel. To get ILabel instance use the
  * dymo.label.framework.openLabelFile or dymo.label.framework.openLabelXml function.
  * ILabel provides methods for manipulating label content, such as set address or text
  * on the label.
  */
@js.native
trait ILabel extends js.Object {
  /**
    * Gets the Intelligent Mail barcode position for an Address object.
    *
    * @param addressIndex The zero-based index of the Address object in a 'virtual' array of all Address objects on the label.
    *
    * @returns A string with one of the values defined by the dymo.label.framework.AddressBarcodePosition enumeration.
    */
  def getAddressBarcodePosition(addressIndex: Double): AddressBarcodePosition = js.native
  /**
    * Gets the number of Address objects on the label.
    */
  def getAddressObjectCount(): Double = js.native
  /**
    * Gets the text content of an Address object.
    *
    * @param addressIndex The zero-based index of the Address object in a 'virtual' array of all Address objects on the label.
    *
    * @returns The plain text from the Address object.
    */
  def getAddressText(addressIndex: Double): String = js.native
  /**
    * Returns the current label as an XML string. The returned XML string can be passed
    * to functions that accept label XML as a parameter, or can be used to direct content
    * manipulations not currently supported by the Framework.
    */
  def getLabelXml(): String = js.native
  /**
    * Gets an array of object reference names on the label. Returns an array of strings.
    */
  def getObjectNames(): js.Array[String] = js.native
  /**
    * Gets the 'text' content of an object. The content depends on the object type.
    * * Address and Text objects - Returns the object text without formatting.
    * * Barcode object - Returns the barcode string.
    * * Image - Returns the base64-encoded string on the image's PNG stream (only if image data is embedded with the label and not linked to a URL or file).
    * * Circular Text object - Returns the object text.
    * * Other objects - Returns an empty string.
    *
    * @param objectName The name of the object.
    */
  def getObjectText(objectName: String): String = js.native
  /**
    * Prints the label.
    *
    * @param printerName The name of the printer to print to. A list of printers can be obtained using dymo.label.framework.getPrinters.
    * @param printParamsXml The print parameters, such as number of copies, print quality, etc. See [PrintParams.xsd]{@link http://labelwriter.com/software/dls/sdk/PrintParams.xsd}.
    * @param labelSetXml
    *   The LabelSet to print. LabelSet is used to print multiple labels with the same layout, but with different
    *   data, such as multiple addresses. Use the dymo.label.framework.LabelSetBuilder class to create a LabelSet
    *   or construct XML manually according to [LabelSet.xsd]{@link http://labelwriter.com/software/dls/sdk/LabelSet.xsd}.
    */
  def print(printerName: String, printParamsXml: String, labelSetXml: String): Unit = js.native
  /**
    * Prints a label and runs status checking in a loop
    *
    * @param printerName The name of the printer to print to. A list of printers can be obtained using dymo.label.framework.getPrinters.
    * @param printParamsXml The print parameters, such as number of copies, print quality, etc. See [PrintParams.xsd]{@link http://labelwriter.com/software/dls/sdk/PrintParams.xsd}.
    * @param labelSetXml The LabelSet to print.
    *   LabelSet is used to print multiple labels with the same layout, but with different data, such as multiple
    *   addresses. Use the dymo.label.framework.LabelSetBuilder class to create a LabelSet or construct XML manually
    *   according to [LabelSet.xsd]{@link http://labelwriter.com/software/dls/sdk/LabelSet.xsd}.
    * @param statusCallback Status callback function called when the service returned status information.
    *   The callback takes two parameters; the first is PrintJob object. It can be used to get the status information on demand,
    *   without using polling. Also, it might be extended in the future to provide more control over the print job, e.g. an ability
    *   to cancel it. The second parameter to the callback is PrintJobStatusInfo class. PrintJobStatusInfo has two properties:
    *   statusMessage that contains a status message string; and status that contains status code. The callback has to return a
    *   boolean value. If true is returned, than pritnAndPollStatus() will poll the service again after the pollInterval passed.
    *   If false is returned, then printAndPollStatus() finishes processing.
    * @param pollInterval Interval in milliseconds to ask the proxy service for the job status information.
    *
    * @returns The print job.
    */
  def printAndPollStatus(
    printerName: String,
    printParamsXml: String,
    labelSetXml: String,
    statusCallback: js.Function2[/* printJob */ PrintJob, /* printJobStatusInfo */ PrintJobStatusInfo, Boolean],
    pollInterval: Double
  ): PrintJob = js.native
  /**
    * Creates a label raster image that can be used for label previewing.
    *
    * @param renderParamsXml Rendering parameters, such as shadow depth, label color, etc.
    *   See [LabelRenderParams.xsd]{@link http://labelwriter.com/software/dls/sdk/LabelRenderParams.xsd}.
    * @param printerName The name of the printer that the preview is generated for.
    *   The preview/output can be different for different printers,
    *   especially for tape printers with different print head sizes.
    *   If it is not important what printer the label is printed to,
    *   an empty string can be passed. In this case, the default printer metrics will
    *   be used. The default is LW400 for LabelWriter printers and LW400 DUO Tape for
    *   tape printers.
    */
  def render(renderParamsXml: String, printerName: String): String = js.native
  /**
    * Sets the Intelligent Mail barcode position for an Address object.
    *
    * @param addressIndex The zero-based index of the Address object in a 'virtual' array of all Address objects on the label.
    * @param barcodePosition The barcode position.
    *
    * @returns self
    */
  def setAddressBarcodePosition(addressIndex: Double, barcodePosition: AddressBarcodePosition): ILabel = js.native
  /**
    * Sets the text content of an Address object.
    *
    * @param addressIndex The zero-based index of the Address object in a 'virtual' array of all Address objects on the label.
    * @param text The plain text string that contains the content of the Address object. Note: The current text formatting is retained on a line-by-line basis.
    *
    * @returns self
    */
  def setAddressText(addressIndex: Double, text: String): ILabel = js.native
  /**
    * Sets the text content for an object. The content and/or text formatting are set differently
    * depending on the object type.
    *
    * * Address object - The formatting is applied on a line-by-line basis (using list).
    * * Text object - The formatting of the current first character is applied to all text.
    * * Barcode object - The barcode text.
    * * Image object - The base64-encoded string of image's PNG stream.
    * * CircularText object - The object text.
    * * Date and Time and Counter objects - The object's 'Before' text.
    * * Other objects - An empty string.
    *
    * @param objectName The name of the object.
    * @param text The plain text string for new object content.
    */
  def setObjectText(objectName: String, text: String): ILabel = js.native
}

object ILabel {
  @scala.inline
  def apply(
    getAddressBarcodePosition: Double => AddressBarcodePosition,
    getAddressObjectCount: () => Double,
    getAddressText: Double => String,
    getLabelXml: () => String,
    getObjectNames: () => js.Array[String],
    getObjectText: String => String,
    print: (String, String, String) => Unit,
    printAndPollStatus: (String, String, String, js.Function2[/* printJob */ PrintJob, /* printJobStatusInfo */ PrintJobStatusInfo, Boolean], Double) => PrintJob,
    render: (String, String) => String,
    setAddressBarcodePosition: (Double, AddressBarcodePosition) => ILabel,
    setAddressText: (Double, String) => ILabel,
    setObjectText: (String, String) => ILabel
  ): ILabel = {
    val __obj = js.Dynamic.literal(getAddressBarcodePosition = js.Any.fromFunction1(getAddressBarcodePosition), getAddressObjectCount = js.Any.fromFunction0(getAddressObjectCount), getAddressText = js.Any.fromFunction1(getAddressText), getLabelXml = js.Any.fromFunction0(getLabelXml), getObjectNames = js.Any.fromFunction0(getObjectNames), getObjectText = js.Any.fromFunction1(getObjectText), print = js.Any.fromFunction3(print), printAndPollStatus = js.Any.fromFunction5(printAndPollStatus), render = js.Any.fromFunction2(render), setAddressBarcodePosition = js.Any.fromFunction2(setAddressBarcodePosition), setAddressText = js.Any.fromFunction2(setAddressText), setObjectText = js.Any.fromFunction2(setObjectText))
    __obj.asInstanceOf[ILabel]
  }
  @scala.inline
  implicit class ILabelOps[Self <: ILabel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGetAddressBarcodePosition(value: Double => AddressBarcodePosition): Self = this.set("getAddressBarcodePosition", js.Any.fromFunction1(value))
    @scala.inline
    def setGetAddressObjectCount(value: () => Double): Self = this.set("getAddressObjectCount", js.Any.fromFunction0(value))
    @scala.inline
    def setGetAddressText(value: Double => String): Self = this.set("getAddressText", js.Any.fromFunction1(value))
    @scala.inline
    def setGetLabelXml(value: () => String): Self = this.set("getLabelXml", js.Any.fromFunction0(value))
    @scala.inline
    def setGetObjectNames(value: () => js.Array[String]): Self = this.set("getObjectNames", js.Any.fromFunction0(value))
    @scala.inline
    def setGetObjectText(value: String => String): Self = this.set("getObjectText", js.Any.fromFunction1(value))
    @scala.inline
    def setPrint(value: (String, String, String) => Unit): Self = this.set("print", js.Any.fromFunction3(value))
    @scala.inline
    def setPrintAndPollStatus(
      value: (String, String, String, js.Function2[/* printJob */ PrintJob, /* printJobStatusInfo */ PrintJobStatusInfo, Boolean], Double) => PrintJob
    ): Self = this.set("printAndPollStatus", js.Any.fromFunction5(value))
    @scala.inline
    def setRender(value: (String, String) => String): Self = this.set("render", js.Any.fromFunction2(value))
    @scala.inline
    def setSetAddressBarcodePosition(value: (Double, AddressBarcodePosition) => ILabel): Self = this.set("setAddressBarcodePosition", js.Any.fromFunction2(value))
    @scala.inline
    def setSetAddressText(value: (Double, String) => ILabel): Self = this.set("setAddressText", js.Any.fromFunction2(value))
    @scala.inline
    def setSetObjectText(value: (String, String) => ILabel): Self = this.set("setObjectText", js.Any.fromFunction2(value))
  }
  
}

