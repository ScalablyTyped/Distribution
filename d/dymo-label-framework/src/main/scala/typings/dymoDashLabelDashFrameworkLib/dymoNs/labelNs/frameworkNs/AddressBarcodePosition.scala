package typings
package dymoDashLabelDashFrameworkLib.dymoNs.labelNs.frameworkNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AddressBarcodePosition extends js.Object

/** Enumeration that specifies where to draw the Intellegent Mail barcode for an Address object. */
@JSGlobal("dymo.label.framework.AddressBarcodePosition")
@js.native
object AddressBarcodePosition extends js.Object {
  /** Indicates to print the barcode above the address. */
  @js.native
  sealed trait AboveAddress
    extends dymoDashLabelDashFrameworkLib.dymoNs.labelNs.frameworkNs.AddressBarcodePosition
  
  /** Indicates to print the barcode below the address. */
  @js.native
  sealed trait BelowAddress
    extends dymoDashLabelDashFrameworkLib.dymoNs.labelNs.frameworkNs.AddressBarcodePosition
  
  /** Indicates to not print the barcode at all. */
  @js.native
  sealed trait Suppress
    extends dymoDashLabelDashFrameworkLib.dymoNs.labelNs.frameworkNs.AddressBarcodePosition
  
  val AboveAddress: AboveAddress with java.lang.String = js.native
  val BelowAddress: BelowAddress with java.lang.String = js.native
  val Suppress: Suppress with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    dymoDashLabelDashFrameworkLib.dymoNs.labelNs.frameworkNs.AddressBarcodePosition with java.lang.String
  ] = js.native
}

