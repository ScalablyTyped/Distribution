package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains text wrapping settings for floating objects.
  */
trait FloatingObjectTextWrappingSettings extends js.Object {
  /**
    * Gets or sets the bottom offset of text wrapping.
    * Value: An integer value specifying the bottom offset in twips.
    */
  var bottomDistance: Double
  /**
    * Gets or sets a value specifying how text can wrap around a floating object's left and right sides.
    * Value: One of the <see cref="FloatingObjectTextWrapSide" /> enumeration values.
    */
  var floatingObjectTextWrapSide: js.Any
  /**
    * Gets or sets a value specifying how text is wrapped around a floating object.
    * Value: One of the <see cref="FloatingObjectTextWrapType" /> enumeration values.
    */
  var floatingObjectTextWrapType: js.Any
  /**
    * Gets or sets the left offset of text wrapping.
    * Value: An integer value specifying the left offset in twips.
    */
  var leftDistance: Double
  /**
    * Gets or sets the right offset of text wrapping.
    * Value: An integer value specifying the right offset in twips.
    */
  var rightDistance: Double
  /**
    * Gets or sets the top offset of text wrapping.
    * Value: An integer value specifying the top offset in twips.
    */
  var topDistance: Double
}

object FloatingObjectTextWrappingSettings {
  @scala.inline
  def apply(
    bottomDistance: Double,
    floatingObjectTextWrapSide: js.Any,
    floatingObjectTextWrapType: js.Any,
    leftDistance: Double,
    rightDistance: Double,
    topDistance: Double
  ): FloatingObjectTextWrappingSettings = {
    val __obj = js.Dynamic.literal(bottomDistance = bottomDistance, floatingObjectTextWrapSide = floatingObjectTextWrapSide, floatingObjectTextWrapType = floatingObjectTextWrapType, leftDistance = leftDistance, rightDistance = rightDistance, topDistance = topDistance)
  
    __obj.asInstanceOf[FloatingObjectTextWrappingSettings]
  }
}

