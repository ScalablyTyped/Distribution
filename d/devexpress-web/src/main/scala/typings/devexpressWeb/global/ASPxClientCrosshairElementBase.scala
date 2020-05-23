package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The base class for all Crosshair Cursor's elements.
  */
@JSGlobal("ASPxClientCrosshairElementBase")
@js.native
class ASPxClientCrosshairElementBase ()
  extends typings.devexpressWeb.ASPxClientCrosshairElementBase {
  /**
    * Returns the Crosshair Cursor's axis label element that belongs to the Crosshair element.
    */
  /* CompleteClass */
  override var AxisLabelElement: typings.devexpressWeb.ASPxClientCrosshairAxisLabelElement = js.native
  /**
    * Returns the Crosshair Cursor's label element that belongs to the Crosshair element.
    */
  /* CompleteClass */
  override var LabelElement: typings.devexpressWeb.ASPxClientCrosshairSeriesLabelElement = js.native
  /**
    * Returns the Crosshair Cursor's line element that belongs to the Crosshair element.
    */
  /* CompleteClass */
  override var LineElement: typings.devexpressWeb.ASPxClientCrosshairLineElement = js.native
  /**
    * Returns the series or indicator point for which the Crosshair Cursor creates this element.
    */
  /* CompleteClass */
  override var Point: typings.devexpressWeb.ASPxClientSeriesPoint = js.native
  /**
    * Returns a value that specifies whether the crosshair element is visible.
    */
  /* CompleteClass */
  override var visible: Boolean = js.native
}

