package typings
package detoxLib.DetoxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Actions[R] extends js.Object {
  /**
           * Clear text from a text field.
           * @example await element(by.id('textField')).clearText();
           */
  def clearText(): stdLib.Promise[Actions[R]] = js.native
  /**
           * Simulate long press on an element
           * @example await element(by.id('tappable')).longPress();
           */
  def longPress(): stdLib.Promise[Actions[R]] = js.native
  /**
           * Simulate multiple taps on an element.
           * @param times number
           * @example await element(by.id('tappable')).multiTap(3);
           */
  def multiTap(times: scala.Double): stdLib.Promise[Actions[R]] = js.native
  /**
           * Paste text into a text field.
           * @param text
           * @example await element(by.id('textField')).replaceText('passcode again');
           */
  def replaceText(text: java.lang.String): stdLib.Promise[Actions[R]] = js.native
  /**
           *
           * @param pixels
           * @param direction
           * @example
           * await element(by.id('scrollView')).scroll(100, 'down');
           * await element(by.id('scrollView')).scroll(100, 'up');
           */
  def scroll(pixels: scala.Double, direction: Direction): stdLib.Promise[Actions[R]] = js.native
  /**
           * Scroll to edge.
           * @param edge
           * @example await element(by.id('scrollView')).scrollTo('bottom');
           * await element(by.id('scrollView')).scrollTo('top');
           */
  def scrollTo(edge: Direction): stdLib.Promise[Actions[R]] = js.native
  /**
           * (iOS Only) column - number of datepicker column (starts from 0) value - string value in setted column (must be correct)
           * @param column
           * @param value
           * @example await expect(element(by.type('UIPickerView'))).toBeVisible();
           * await element(by.type('UIPickerView')).setColumnToValue(1,"6");
           * await element(by.type('UIPickerView')).setColumnToValue(2,"34");
           */
  def setColumnToValue(column: scala.Double, value: java.lang.String): stdLib.Promise[Actions[R]] = js.native
  /**
           *
           * @param direction
           * @param speed
           * @param percentage
           * @example await element(by.id('scrollView')).swipe('down');
           * await element(by.id('scrollView')).swipe('down', 'fast');
           * await element(by.id('scrollView')).swipe('down', 'fast', 0.5);
           */
  def swipe(direction: Direction): stdLib.Promise[Actions[R]] = js.native
  /**
           *
           * @param direction
           * @param speed
           * @param percentage
           * @example await element(by.id('scrollView')).swipe('down');
           * await element(by.id('scrollView')).swipe('down', 'fast');
           * await element(by.id('scrollView')).swipe('down', 'fast', 0.5);
           */
  def swipe(direction: Direction, speed: Speed): stdLib.Promise[Actions[R]] = js.native
  /**
           *
           * @param direction
           * @param speed
           * @param percentage
           * @example await element(by.id('scrollView')).swipe('down');
           * await element(by.id('scrollView')).swipe('down', 'fast');
           * await element(by.id('scrollView')).swipe('down', 'fast', 0.5);
           */
  def swipe(direction: Direction, speed: Speed, percentage: scala.Double): stdLib.Promise[Actions[R]] = js.native
  /**
           * Simulate tap on an element
           * @example await element(by.id('tappable')).tap();
           */
  def tap(): stdLib.Promise[Actions[R]] = js.native
  /**
           * Simulate tap at a specific point on an element.
           * Note: The point coordinates are relative to the matched element and the element size could changes on different devices or even when changing the device font size.
           * @param point
           * @example await element(by.id('tappable')).tapAtPoint({ x:5, y:10 });
           */
  def tapAtPoint(point: detoxLib.Anon_Y): stdLib.Promise[Actions[R]] = js.native
  /**
           * Use the builtin keyboard to type text into a text field.
           * @param text
           * @example await element(by.id('textField')).typeText('passcode');
           */
  def typeText(text: java.lang.String): stdLib.Promise[Actions[R]] = js.native
}

