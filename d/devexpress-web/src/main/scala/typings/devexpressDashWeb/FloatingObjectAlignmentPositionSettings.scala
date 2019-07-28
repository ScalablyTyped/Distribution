package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains alignment position settings for floating objects.
  */
trait FloatingObjectAlignmentPositionSettings extends js.Object {
  /**
    * Gets or sets a value specifying how a floating object is horizontally aligned relative to an element specified by the horizontalPositionAlignment property.
    * Value: One of the <see cref="FloatingObjectHorizontalPositionAlignment" /> enumeration values.
    */
  var horizontalPositionAlignment: js.Any
  /**
    * Gets or sets a value specifying to what element the horizontal alignment of a floating object is relative.
    * Value: One of the <see cref="FloatingObjectHorizontalPositionType" /> enumeration values.
    */
  var horizontalPositionType: js.Any
  /**
    * Gets or sets a value specifying how a floating object is vertically aligned relative to an element specified by the verticalPositionAlignment property.
    * Value: One of the <see cref="FloatingObjectVerticalPositionAlignment" /> enumeration values.
    */
  var verticalPositionAlignment: js.Any
  /**
    * Gets or sets a value specifying to what element the vertical alignment of a floating object is relative.
    * Value: One of the <see cref="FloatingObjectVerticalPositionType" /> enumeration values.
    */
  var verticalPositionType: js.Any
}

object FloatingObjectAlignmentPositionSettings {
  @scala.inline
  def apply(
    horizontalPositionAlignment: js.Any,
    horizontalPositionType: js.Any,
    verticalPositionAlignment: js.Any,
    verticalPositionType: js.Any
  ): FloatingObjectAlignmentPositionSettings = {
    val __obj = js.Dynamic.literal(horizontalPositionAlignment = horizontalPositionAlignment, horizontalPositionType = horizontalPositionType, verticalPositionAlignment = verticalPositionAlignment, verticalPositionType = verticalPositionType)
  
    __obj.asInstanceOf[FloatingObjectAlignmentPositionSettings]
  }
}

