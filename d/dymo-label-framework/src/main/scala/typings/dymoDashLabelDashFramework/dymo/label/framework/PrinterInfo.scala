package typings.dymoDashLabelDashFramework.dymo.label.framework

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PrinterInfo extends js.Object {
  /** Indicates whether the Auto-Cut feature is supported by the printer or not. Note: The property is only defined if printerType is "TapePrinter". */
  var isAutoCutSupported: Boolean
  /** Indicates whether the printer is connected to a computer or not. Note: Currently only returns properly for local USB-connected printers on Windows. */
  var isConnected: Boolean
  /** Indicates whether the printer is a local USB-connected printer or a shared network printer. Note: Currently only returns properly on Windows. */
  var isLocal: Boolean
  /** Indicates whether the printer is a "LabelWriter Twin Turbo" (has two rolls) or not. Note: The property is only defined if printerType is "LabelWriterPrinter". */
  var isTwinTurbo: Boolean
  /** Returns the printer model/driver name. */
  var modelName: String
  /** Returns the printer name (print queue name on Mac). */
  var name: String
  /** Returns the printer type; "LabelWriterPrinter" or "TapePrinter". */
  var printerType: String
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
}

