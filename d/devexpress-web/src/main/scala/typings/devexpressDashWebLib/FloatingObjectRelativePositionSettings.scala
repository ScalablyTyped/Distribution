package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains relative position settings for floating objects.
  */
trait FloatingObjectRelativePositionSettings extends js.Object {
  /**
    * Gets or sets a value specifying to what element the horizontal position of a floating object is relative.
    * Value: One of the <see cref="FloatingObjectHorizontalPositionType" /> enumeration values.
    */
  var horizontalPositionType: js.Any
  /**
    * Gets or sets the horizontal distance between the edge of a floating object and the element specified by the horizontalRelativePosition property
    * Value: An integer value specifying the horizontal position in twips.
    */
  var horizontalRelativePosition: scala.Double
  /**
    * Gets or sets a value specifying to what element the vertical position of a floating object is relative.
    * Value: One of the <see cref="FloatingObjectVerticalPositionType" /> enumeration values.
    */
  var verticalPositionType: js.Any
  /**
    * Gets or sets the horizontal distance between the edge of a floating object and the element specified by the verticalRelativePosition property
    * Value: An integer value specifying the vertical position in twips.
    */
  var verticalRelativePosition: scala.Double
}

object FloatingObjectRelativePositionSettings {
  @scala.inline
  def apply(
    horizontalPositionType: js.Any,
    horizontalRelativePosition: scala.Double,
    verticalPositionType: js.Any,
    verticalRelativePosition: scala.Double
  ): FloatingObjectRelativePositionSettings = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("horizontalPositionType")(horizontalPositionType)
    __obj.updateDynamic("horizontalRelativePosition")(horizontalRelativePosition)
    __obj.updateDynamic("verticalPositionType")(verticalPositionType)
    __obj.updateDynamic("verticalRelativePosition")(verticalRelativePosition)
    __obj.asInstanceOf[FloatingObjectRelativePositionSettings]
  }
}

