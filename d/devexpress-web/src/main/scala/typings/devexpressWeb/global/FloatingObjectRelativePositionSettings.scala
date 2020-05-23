package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains relative position settings for floating objects.
  */
@JSGlobal("FloatingObjectRelativePositionSettings")
@js.native
class FloatingObjectRelativePositionSettings ()
  extends typings.devexpressWeb.FloatingObjectRelativePositionSettings {
  /**
    * Gets or sets a value specifying to what element the horizontal position of a floating object is relative.
    */
  /* CompleteClass */
  override var horizontalPositionType: typings.devexpressWeb.FloatingObjectHorizontalPositionType = js.native
  /**
    * Gets or sets the horizontal distance between the edge of a floating object and the element specified by the FloatingObjectRelativePositionSettings.horizontalRelativePosition property
    */
  /* CompleteClass */
  override var horizontalRelativePosition: Double = js.native
  /**
    * Gets or sets a value specifying to what element the vertical position of a floating object is relative.
    */
  /* CompleteClass */
  override var verticalPositionType: typings.devexpressWeb.FloatingObjectVerticalPositionType = js.native
  /**
    * Gets or sets the horizontal distance between the edge of a floating object and the element specified by the FloatingObjectRelativePositionSettings.verticalRelativePosition property
    */
  /* CompleteClass */
  override var verticalRelativePosition: Double = js.native
}

