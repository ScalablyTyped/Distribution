package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the client-side equivalent of the CrosshairElementGroup class.
  */
@JSGlobal("ASPxClientCrosshairElementGroup")
@js.native
class ASPxClientCrosshairElementGroup ()
  extends typings.devexpressWeb.ASPxClientCrosshairElementGroup {
  /**
    * Returns the collection of elements that the Crosshair Cursor displays in the group.
    */
  /* CompleteClass */
  override var CrosshairElements: js.Array[typings.devexpressWeb.ASPxClientCrosshairElement] = js.native
  /**
    * Returns the collection of indicator elements that the Crosshair Cursor displays in the group.
    */
  /* CompleteClass */
  override var CrosshairIndicatorElements: js.Array[typings.devexpressWeb.ASPxClientCrosshairIndicatorElement] = js.native
  /**
    * Returns the Crosshair Cursor group's Header element.
    */
  /* CompleteClass */
  override var HeaderElement: typings.devexpressWeb.ASPxClientCrosshairGroupHeaderElement = js.native
}

