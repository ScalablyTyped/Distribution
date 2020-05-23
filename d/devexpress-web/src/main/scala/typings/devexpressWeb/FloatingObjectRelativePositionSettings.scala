package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains relative position settings for floating objects.
  */
trait FloatingObjectRelativePositionSettings extends js.Object {
  /**
    * Gets or sets a value specifying to what element the horizontal position of a floating object is relative.
    */
  var horizontalPositionType: FloatingObjectHorizontalPositionType
  /**
    * Gets or sets the horizontal distance between the edge of a floating object and the element specified by the FloatingObjectRelativePositionSettings.horizontalRelativePosition property
    */
  var horizontalRelativePosition: Double
  /**
    * Gets or sets a value specifying to what element the vertical position of a floating object is relative.
    */
  var verticalPositionType: FloatingObjectVerticalPositionType
  /**
    * Gets or sets the horizontal distance between the edge of a floating object and the element specified by the FloatingObjectRelativePositionSettings.verticalRelativePosition property
    */
  var verticalRelativePosition: Double
}

object FloatingObjectRelativePositionSettings {
  @scala.inline
  def apply(
    horizontalPositionType: FloatingObjectHorizontalPositionType,
    horizontalRelativePosition: Double,
    verticalPositionType: FloatingObjectVerticalPositionType,
    verticalRelativePosition: Double
  ): FloatingObjectRelativePositionSettings = {
    val __obj = js.Dynamic.literal(horizontalPositionType = horizontalPositionType.asInstanceOf[js.Any], horizontalRelativePosition = horizontalRelativePosition.asInstanceOf[js.Any], verticalPositionType = verticalPositionType.asInstanceOf[js.Any], verticalRelativePosition = verticalRelativePosition.asInstanceOf[js.Any])
    __obj.asInstanceOf[FloatingObjectRelativePositionSettings]
  }
}

