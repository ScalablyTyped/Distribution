package typings.dojo.dojo._base.kernel

import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojo/_base/kernel.mouseButtons.html
  *
  *
  */
trait mouseButtons extends js.Object {
  /**
    * Numeric value of the left mouse button for the platform.
    *
    */
  var LEFT: Double
  /**
    * Numeric value of the middle mouse button for the platform.
    *
    */
  var MIDDLE: Double
  /**
    * Numeric value of the right mouse button for the platform.
    *
    */
  var RIGHT: Double
  /**
    * Checks an event object for a pressed button
    *
    * @param e Event object to examine
    * @param button The button value (example: dojo.mouseButton.LEFT)
    */
  def isButton(e: Event, button: Double): Boolean
  /**
    * Checks an event object for the pressed left button
    *
    * @param e Event object to examine
    */
  def isLeft(e: Event): Boolean
  /**
    * Checks an event object for the pressed middle button
    *
    * @param e Event object to examine
    */
  def isMiddle(e: Event): Boolean
  /**
    * Checks an event object for the pressed right button
    *
    * @param e Event object to examine
    */
  def isRight(e: Event): Boolean
}

object mouseButtons {
  @scala.inline
  def apply(
    LEFT: Double,
    MIDDLE: Double,
    RIGHT: Double,
    isButton: (Event, Double) => Boolean,
    isLeft: Event => Boolean,
    isMiddle: Event => Boolean,
    isRight: Event => Boolean
  ): mouseButtons = {
    val __obj = js.Dynamic.literal(LEFT = LEFT, MIDDLE = MIDDLE, RIGHT = RIGHT, isButton = js.Any.fromFunction2(isButton), isLeft = js.Any.fromFunction1(isLeft), isMiddle = js.Any.fromFunction1(isMiddle), isRight = js.Any.fromFunction1(isRight))
  
    __obj.asInstanceOf[mouseButtons]
  }
}

