package typings.dymoLabelFramework.dymo.label.framework

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PrinterInfo extends js.Object {
  /** Indicates whether the Auto-Cut feature is supported by the printer or not. Note: The property is only defined if printerType is "TapePrinter". */
  var isAutoCutSupported: Boolean = js.native
  /** Indicates whether the printer is connected to a computer or not. Note: Currently only returns properly for local USB-connected printers on Windows. */
  var isConnected: Boolean = js.native
  /** Indicates whether the printer is a local USB-connected printer or a shared network printer. Note: Currently only returns properly on Windows. */
  var isLocal: Boolean = js.native
  /** Indicates whether the printer is a "LabelWriter Twin Turbo" (has two rolls) or not. Note: The property is only defined if printerType is "LabelWriterPrinter". */
  var isTwinTurbo: Boolean = js.native
  /** Returns the printer model/driver name. */
  var modelName: String = js.native
  /** Returns the printer name (print queue name on Mac). */
  var name: String = js.native
  /** Returns the printer type; "LabelWriterPrinter" or "TapePrinter". */
  var printerType: String = js.native
}

object PrinterInfo {
  @scala.inline
  def apply(
    isAutoCutSupported: Boolean,
    isConnected: Boolean,
    isLocal: Boolean,
    isTwinTurbo: Boolean,
    modelName: String,
    name: String,
    printerType: String
  ): PrinterInfo = {
    val __obj = js.Dynamic.literal(isAutoCutSupported = isAutoCutSupported.asInstanceOf[js.Any], isConnected = isConnected.asInstanceOf[js.Any], isLocal = isLocal.asInstanceOf[js.Any], isTwinTurbo = isTwinTurbo.asInstanceOf[js.Any], modelName = modelName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], printerType = printerType.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrinterInfo]
  }
  @scala.inline
  implicit class PrinterInfoOps[Self <: PrinterInfo] (val x: Self) extends AnyVal {
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
    def setIsAutoCutSupported(value: Boolean): Self = this.set("isAutoCutSupported", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsConnected(value: Boolean): Self = this.set("isConnected", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsLocal(value: Boolean): Self = this.set("isLocal", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsTwinTurbo(value: Boolean): Self = this.set("isTwinTurbo", value.asInstanceOf[js.Any])
    @scala.inline
    def setModelName(value: String): Self = this.set("modelName", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrinterType(value: String): Self = this.set("printerType", value.asInstanceOf[js.Any])
  }
  
}

