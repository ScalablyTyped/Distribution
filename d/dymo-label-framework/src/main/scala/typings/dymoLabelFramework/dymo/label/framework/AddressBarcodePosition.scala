package typings.dymoLabelFramework.dymo.label.framework

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
  sealed trait AboveAddress extends AddressBarcodePosition
  
  /** Indicates to print the barcode below the address. */
  @js.native
  sealed trait BelowAddress extends AddressBarcodePosition
  
  /** Indicates to not print the barcode at all. */
  @js.native
  sealed trait Suppress extends AddressBarcodePosition
  
}

