package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains text wrapping settings for floating objects.
  */
@JSGlobal("FloatingObjectTextWrappingSettings")
@js.native
class FloatingObjectTextWrappingSettings () extends js.Object {
  /**
    * Gets or sets the bottom offset of text wrapping.
    */
  var bottomDistance: Double = js.native
  /**
    * Gets or sets a value specifying how text can wrap around a floating object's left and right sides.
    */
  var floatingObjectTextWrapSide: FloatingObjectTextWrapSide = js.native
  /**
    * Gets or sets a value specifying how text is wrapped around a floating object.
    */
  var floatingObjectTextWrapType: FloatingObjectTextWrapType = js.native
  /**
    * Gets or sets the left offset of text wrapping.
    */
  var leftDistance: Double = js.native
  /**
    * Gets or sets the right offset of text wrapping.
    */
  var rightDistance: Double = js.native
  /**
    * Gets or sets the top offset of text wrapping.
    */
  var topDistance: Double = js.native
}

