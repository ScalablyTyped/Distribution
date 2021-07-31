package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TableWidthUnitType extends StObject
/**
  * Lists values that specify unit types for the table width.
  */
@JSGlobal("TableWidthUnitType")
@js.native
object TableWidthUnitType extends StObject {
  
  /**
    * Automatically determined width.
    */
  @js.native
  sealed trait Auto
    extends StObject
       with TableWidthUnitType
  
  /**
    * Width in fiftieths of a percent.
    */
  @js.native
  sealed trait FiftiethsOfPercent
    extends StObject
       with TableWidthUnitType
  
  /**
    * Width in units of measurements that are currently in effect for the document.
    */
  @js.native
  sealed trait ModelUnits
    extends StObject
       with TableWidthUnitType
  
  /**
    * Not set.
    */
  @js.native
  sealed trait Nil
    extends StObject
       with TableWidthUnitType
}
