package typings.detox.mod.global.Detox_

import typings.detox.anon.X
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Actions[R] extends js.Object {
  /**
    * Clear text from a text field.
    * @example
    * await element(by.id('textField')).clearText();
    */
  def clearText(): js.Promise[Actions[R]] = js.native
  /**
    * Simulate long press on an element
    * @example
    * await element(by.id('tappable')).longPress();
    */
  def longPress(): js.Promise[Actions[R]] = js.native
  /**
    * Simulate multiple taps on an element.
    * @param times number of times to tap
    * @example
    * await element(by.id('tappable')).multiTap(3);
    */
  def multiTap(times: Double): js.Promise[Actions[R]] = js.native
  /**
    * Pinches in the given direction with speed and angle. (iOS only)
    * @param direction
    * @param speed
    * @param angle value in radiant, default is `0`
    * @example
    * await expect(element(by.id('PinchableScrollView'))).toBeVisible();
    * await element(by.id('PinchableScrollView')).pinchWithAngle('outward', 'slow', 0);
    */
  def pinchWithAngle(direction: Direction, speed: Speed, angle: Double): js.Promise[Actions[R]] = js.native
  /**
    * Paste text into a text field.
    * @param text
    * @example
    * await element(by.id('textField')).replaceText('passcode again');
    */
  def replaceText(text: String): js.Promise[Actions[R]] = js.native
  /**
    * Scrolls a given amount of pixels in the provided direction, starting from the provided start positions.
    * @param pixels - independent device pixels
    * @param direction - left/right/up/down
    * @param @optional startPositionX - the X starting scroll position, in percentage; valid input: `[0.0, 1.0]`, `NaN`; default: `NaN`—choose the best value automatically
    * @param @optional startPositionY - the Y starting scroll position, in percentage; valid input: `[0.0, 1.0]`, `NaN`; default: `NaN`—choose the best value automatically
    * @example
    * await element(by.id('scrollView')).scroll(100, 'down', NaN, 0.85);
    * await element(by.id('scrollView')).scroll(100, 'up');
    */
  def scroll(pixels: Double, direction: Direction): js.Promise[Actions[R]] = js.native
  def scroll(
    pixels: Double,
    direction: Direction,
    startPositionX: js.UndefOr[scala.Nothing],
    startPositionY: Double
  ): js.Promise[Actions[R]] = js.native
  def scroll(pixels: Double, direction: Direction, startPositionX: Double): js.Promise[Actions[R]] = js.native
  def scroll(pixels: Double, direction: Direction, startPositionX: Double, startPositionY: Double): js.Promise[Actions[R]] = js.native
  /**
    * Scroll to edge.
    * @param edge
    * @example
    * await element(by.id('scrollView')).scrollTo('bottom');
    * await element(by.id('scrollView')).scrollTo('top');
    */
  def scrollTo(edge: Direction): js.Promise[Actions[R]] = js.native
  /**
    * Sets a picker view’s column to the given value. This function supports both date pickers and general picker views. (iOS Only)
    * @param column number of datepicker column (starts from 0)
    * @param value string value in setted column (must be correct)
    * @example a
    * wait expect(element(by.type('UIPickerView'))).toBeVisible();
    * await element(by.type('UIPickerView')).setColumnToValue(1,"6");
    * await element(by.type('UIPickerView')).setColumnToValue(2,"34");
    *
    * > Note: When working with date pickers, you should always set an explicit locale when launching your app in order to prevent flakiness from different date and time styles.
    * See [here](https://github.com/wix/Detox/blob/master/docs/APIRef.DeviceObjectAPI.md#9-launch-with-a-specific-language-ios-only) for more information.
    */
  def setColumnToValue(column: Double, value: String): js.Promise[Actions[R]] = js.native
  /**
    * Sets the date of a date picker to a date generated from the provided string and date format. (iOS only)
    * @param dateString string representing a date in the supplied `dateFormat`
    * @param dateFormat format for the `dateString` supplied
    * @example
    * await expect(element(by.id('datePicker'))).toBeVisible();
    * await element(by.id('datePicker')).setDatePickerDate('2019-02-06T05:10:00-08:00', "yyyy-MM-dd'T'HH:mm:ssZZZZZ");
    */
  def setDatePickerDate(dateString: String, dateFormat: String): js.Promise[Actions[R]] = js.native
  /**
    * Swipes in the provided direction at the provided speed, started from percentage.
    * @param direction
    * @param speed default: `fast`
    * @param @optional percentage screen percentage to swipe; valid input: `[0.0, 1.0]`
    * @example
    * await element(by.id('scrollView')).swipe('down');
    * await element(by.id('scrollView')).swipe('down', 'fast');
    * await element(by.id('scrollView')).swipe('down', 'fast', 0.5);
    */
  def swipe(direction: Direction): js.Promise[Actions[R]] = js.native
  def swipe(direction: Direction, speed: js.UndefOr[scala.Nothing], percentage: Double): js.Promise[Actions[R]] = js.native
  def swipe(direction: Direction, speed: Speed): js.Promise[Actions[R]] = js.native
  def swipe(direction: Direction, speed: Speed, percentage: Double): js.Promise[Actions[R]] = js.native
  /**
    * Simulate tap on an element
    * @example
    * await element(by.id('tappable')).tap();
    */
  def tap(): js.Promise[Actions[R]] = js.native
  /**
    * Simulate tap at a specific point on an element.
    * Note: The point coordinates are relative to the matched element and the element size could changes on different devices or even when changing the device font size.
    * @param point
    * @example
    * await element(by.id('tappable')).tapAtPoint({ x:5, y:10 });
    */
  def tapAtPoint(point: X): js.Promise[Actions[R]] = js.native
  /**
    * Taps the backspace key on the built-in keyboard.
    * @example
    * await element(by.id('textField')).tapBackspaceKey();
    */
  def tapBackspaceKey(): js.Promise[Actions[R]] = js.native
  /**
    * Taps the return key on the built-in keyboard.
    * @example
    * await element(by.id('textField')).tapReturnKey();
    */
  def tapReturnKey(): js.Promise[Actions[R]] = js.native
  /**
    * Use the builtin keyboard to type text into a text field.
    * @param text
    * @example
    * await element(by.id('textField')).typeText('passcode');
    */
  def typeText(text: String): js.Promise[Actions[R]] = js.native
}

