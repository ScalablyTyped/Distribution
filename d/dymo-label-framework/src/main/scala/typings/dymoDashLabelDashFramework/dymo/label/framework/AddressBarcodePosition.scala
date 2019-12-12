package typings.dymoDashLabelDashFramework.dymo.label.framework

import org.scalablytyped.runtime.TopLevel
import typings.dymoDashLabelDashFramework.dymo.label.framework.AddressBarcodePosition.AboveAddress
import typings.dymoDashLabelDashFramework.dymo.label.framework.AddressBarcodePosition.BelowAddress
import typings.dymoDashLabelDashFramework.dymo.label.framework.AddressBarcodePosition.Suppress
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AddressBarcodePosition with Double] = js.native
  /* 0 */ @js.native
  object AboveAddress extends TopLevel[AboveAddress with Double]
  
  /* 1 */ @js.native
  object BelowAddress extends TopLevel[BelowAddress with Double]
  
  /* 2 */ @js.native
  object Suppress extends TopLevel[Suppress with Double]
  
}

