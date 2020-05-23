package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TableWidthUnitType extends js.Object

/**
  * Lists values that specify unit types for the table width.
  */
@JSGlobal("TableWidthUnitType")
@js.native
object TableWidthUnitType extends js.Object {
  /**
    * Automatically determined width.
    */
  @js.native
  sealed trait Auto extends TableWidthUnitType
  
  /**
    * Width in fiftieths of a percent.
    */
  @js.native
  sealed trait FiftiethsOfPercent extends TableWidthUnitType
  
  /**
    * Width in units of measurements that are currently in effect for the document.
    */
  @js.native
  sealed trait ModelUnits extends TableWidthUnitType
  
  /**
    * Not set.
    */
  @js.native
  sealed trait Nil extends TableWidthUnitType
  
}

