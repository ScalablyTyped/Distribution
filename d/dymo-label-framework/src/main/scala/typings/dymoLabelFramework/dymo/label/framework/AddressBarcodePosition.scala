package typings.dymoLabelFramework.dymo.label.framework

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AddressBarcodePosition extends StObject
/** Enumeration that specifies where to draw the Intellegent Mail barcode for an Address object. */
@JSGlobal("dymo.label.framework.AddressBarcodePosition")
@js.native
object AddressBarcodePosition extends StObject {
  
  /** Indicates to print the barcode above the address. */
  @js.native
  sealed trait AboveAddress
    extends StObject
       with AddressBarcodePosition
  
  /** Indicates to print the barcode below the address. */
  @js.native
  sealed trait BelowAddress
    extends StObject
       with AddressBarcodePosition
  
  /** Indicates to not print the barcode at all. */
  @js.native
  sealed trait Suppress
    extends StObject
       with AddressBarcodePosition
}
