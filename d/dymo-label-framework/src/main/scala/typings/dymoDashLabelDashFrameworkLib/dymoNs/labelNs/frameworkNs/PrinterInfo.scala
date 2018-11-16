package typings
package dymoDashLabelDashFrameworkLib.dymoNs.labelNs.frameworkNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait PrinterInfo extends js.Object {
  /** Indicates whether the Auto-Cut feature is supported by the printer or not. Note: The property is only defined if printerType is "TapePrinter". */
  var isAutoCutSupported: scala.Boolean
  /** Indicates whether the printer is connected to a computer or not. Note: Currently only returns properly for local USB-connected printers on Windows. */
  var isConnected: scala.Boolean
  /** Indicates whether the printer is a local USB-connected printer or a shared network printer. Note: Currently only returns properly on Windows. */
  var isLocal: scala.Boolean
  /** Indicates whether the printer is a "LabelWriter Twin Turbo" (has two rolls) or not. Note: The property is only defined if printerType is "LabelWriterPrinter". */
  var isTwinTurbo: scala.Boolean
  /** Returns the printer model/driver name. */
  var modelName: java.lang.String
  /** Returns the printer name (print queue name on Mac). */
  var name: java.lang.String
  /** Returns the printer type; "LabelWriterPrinter" or "TapePrinter". */
  var printerType: java.lang.String
}

