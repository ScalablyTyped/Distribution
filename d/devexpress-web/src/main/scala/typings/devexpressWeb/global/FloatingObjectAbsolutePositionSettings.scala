package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains page margin settings.
  */
@JSGlobal("FloatingObjectAbsolutePositionSettings")
@js.native
class FloatingObjectAbsolutePositionSettings ()
  extends typings.devexpressWeb.FloatingObjectAbsolutePositionSettings {
  /**
    * Gets or sets a floating object's horizontal position relative to an element specified by the FloatingObjectAbsolutePositionSettings.horizontalPositionType property.
    */
  /* CompleteClass */
  override var horizontalAbsolutePosition: Double = js.native
  /**
    * Gets or sets a value specifying to what element the horizontal position of a floating object is relative.
    */
  /* CompleteClass */
  override var horizontalPositionType: typings.devexpressWeb.FloatingObjectHorizontalPositionType = js.native
  /**
    * Gets or sets a floating object's vertical position relative to an element specified by the FloatingObjectAbsolutePositionSettings.verticalPositionType property.
    */
  /* CompleteClass */
  override var verticalAbsolutePosition: Double = js.native
  /**
    * Gets or sets a value specifying to what element the vertical position of a floating object is relative.
    */
  /* CompleteClass */
  override var verticalPositionType: typings.devexpressWeb.FloatingObjectVerticalPositionType = js.native
}

