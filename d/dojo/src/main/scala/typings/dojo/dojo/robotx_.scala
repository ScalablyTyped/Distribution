package typings.dojo.dojo

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojo/robotx.html
  *
  *
  */
@js.native
trait robotx_ extends js.Object {
  /**
    *
    */
  var doc: js.Object = js.native
  /**
    *
    */
  var mouseWheelSize: Double = js.native
  /**
    *
    */
  var window: js.Object = js.native
  /**
    * Opens the application at the specified URL for testing, redirecting dojo to point to the application
    * environment instead of the test environment.
    *
    * @param url URL to open. Any of the test's dojo.doc calls (e.g. dojo.byId()), and any dijit.registry calls(e.g. dijit.byId()) will point to elements and widgets inside this application.
    */
  def initRobot(url: String): Unit = js.native
  /**
    * Holds down a single key, like SHIFT or 'a'.
    * Holds down a single key, like SHIFT or 'a'.
    *
    * @param charOrCode char/JS keyCode/dojo.keys.* constant for the key you want to hold downWarning: holding down a shifted key, like 'A', can have unpredictable results.
    * @param delay               OptionalDelay, in milliseconds, to wait before firing.The delay is a delta with respect to the previous automation call.For example, the following code ends after 600ms:robot.mouseClick({left: true}, 100) // first call; wait 100msrobot.typeKeys("dij", 500) // 500ms AFTER previous call; 600ms in all
    */
  def keyDown(charOrCode: Double): Unit = js.native
  def keyDown(charOrCode: Double, delay: Double): Unit = js.native
  /**
    * Types a key combination, like SHIFT-TAB.
    * Types a key combination, like SHIFT-TAB.
    *
    * @param charOrCode char/JS keyCode/dojo.keys.* constant for the key you want to press
    * @param delay               OptionalDelay, in milliseconds, to wait before firing.The delay is a delta with respect to the previous automation call.For example, the following code ends after 600ms:robot.mouseClick({left: true}, 100) // first call; wait 100msrobot.typeKeys("dij", 500) // 500ms AFTER previous call; 600ms in all
    * @param modifiers JSON object that represents all of the modifier keys being pressed.It takes the following Boolean attributes:shiftaltctrlmeta
    * @param asynchronous If true, the delay happens asynchronously and immediately, outside of the browser's JavaScript thread and any previous calls.This is useful for interacting with the browser's modal dialogs.
    */
  def keyPress(charOrCode: Double, delay: Double, modifiers: js.Object, asynchronous: Boolean): Unit = js.native
  /**
    * Releases a single key, like SHIFT or 'a'.
    * Releases a single key, like SHIFT or 'a'.
    *
    * @param charOrCode char/JS keyCode/dojo.keys.* constant for the key you want to releaseWarning: releasing a shifted key, like 'A', can have unpredictable results.
    * @param delay               OptionalDelay, in milliseconds, to wait before firing.The delay is a delta with respect to the previous automation call.For example, the following code ends after 600ms:robot.mouseClick({left: true}, 100) // first call; wait 100msrobot.typeKeys("dij", 500) // 500ms AFTER previous call; 600ms in all
    */
  def keyUp(charOrCode: Double): Unit = js.native
  def keyUp(charOrCode: Double, delay: Double): Unit = js.native
  /**
    *
    */
  def killRobot(): Unit = js.native
  /**
    * Convenience function to do a press/release.
    * See robot.mousePress for more info.
    * Convenience function to do a press/release.
    * See robot.mousePress for more info.
    *
    * @param buttons
    * @param delay               Optional
    */
  def mouseClick(buttons: js.Object): Unit = js.native
  def mouseClick(buttons: js.Object, delay: Double): Unit = js.native
  /**
    * Moves the mouse to the specified x,y offset relative to the viewport.
    *
    * @param x x offset relative to the viewport, in pixels, to move the mouse.
    * @param y y offset relative to the viewport, in pixels, to move the mouse.
    * @param delay               OptionalDelay, in milliseconds, to wait before firing.The delay is a delta with respect to the previous automation call.For example, the following code ends after 600ms:robot.mouseClick({left: true}, 100) // first call; wait 100msrobot.typeKeys("dij", 500) // 500ms AFTER previous call; 600ms in all
    * @param duration               OptionalApproximate time Robot will spend moving the mouseThe default is 100ms. This also affects how many mousemove events willbe generated, which is the log of the duration.
    * @param absolute Boolean indicating whether the x and y values are absolute coordinates.If false, then mouseMove expects that the x,y will be relative to the window. (clientX/Y)If true, then mouseMove expects that the x,y will be absolute. (pageX/Y)
    */
  def mouseMove(x: Double, y: Double, delay: Double, duration: Double, absolute: Boolean): Unit = js.native
  /**
    * Moves the mouse over the specified node at the specified relative x,y offset.
    * Moves the mouse over the specified node at the specified relative x,y offset.
    * If you do not specify an offset, mouseMove will default to move to the middle of the node.
    * Example: to move the mouse over a ComboBox's down arrow node, call doh.mouseMoveAt(dijit.byId('setvaluetest').downArrowNode);
    *
    * @param node The id of the node, or the node itself, to move the mouse to.If you pass an id or a function that returns a node, the node will not be evaluated until the movement executes.This is useful if you need to move the mouse to an node that is not yet present.
    * @param delay Delay, in milliseconds, to wait before firing.The delay is a delta with respect to the previous automation call.For example, the following code ends after 600ms:robot.mouseClick({left:true}, 100) // first call; wait 100msrobot.typeKeys("dij", 500) // 500ms AFTER previous call; 600ms in all
    * @param duration Approximate time Robot will spend moving the mouseThe default is 100ms.
    * @param offsetX x offset relative to the node, in pixels, to move the mouse. The default is half the node's width.
    * @param offsetY y offset relative to the node, in pixels, to move the mouse. The default is half the node's height.
    */
  def mouseMoveAt(node: String, delay: Double, duration: Double, offsetX: Double, offsetY: Double): Unit = js.native
  /**
    * Moves the mouse over the specified node at the specified relative x,y offset.
    * Moves the mouse over the specified node at the specified relative x,y offset.
    * If you do not specify an offset, mouseMove will default to move to the middle of the node.
    * Example: to move the mouse over a ComboBox's down arrow node, call doh.mouseMoveAt(dijit.byId('setvaluetest').downArrowNode);
    *
    * @param node The id of the node, or the node itself, to move the mouse to.If you pass an id or a function that returns a node, the node will not be evaluated until the movement executes.This is useful if you need to move the mouse to an node that is not yet present.
    * @param delay Delay, in milliseconds, to wait before firing.The delay is a delta with respect to the previous automation call.For example, the following code ends after 600ms:robot.mouseClick({left:true}, 100) // first call; wait 100msrobot.typeKeys("dij", 500) // 500ms AFTER previous call; 600ms in all
    * @param duration Approximate time Robot will spend moving the mouseThe default is 100ms.
    * @param offsetX x offset relative to the node, in pixels, to move the mouse. The default is half the node's width.
    * @param offsetY y offset relative to the node, in pixels, to move the mouse. The default is half the node's height.
    */
  def mouseMoveAt(node: js.Function, delay: Double, duration: Double, offsetX: Double, offsetY: Double): Unit = js.native
  /**
    * Moves the mouse over the specified node at the specified relative x,y offset.
    * Moves the mouse over the specified node at the specified relative x,y offset.
    * If you do not specify an offset, mouseMove will default to move to the middle of the node.
    * Example: to move the mouse over a ComboBox's down arrow node, call doh.mouseMoveAt(dijit.byId('setvaluetest').downArrowNode);
    *
    * @param node The id of the node, or the node itself, to move the mouse to.If you pass an id or a function that returns a node, the node will not be evaluated until the movement executes.This is useful if you need to move the mouse to an node that is not yet present.
    * @param delay Delay, in milliseconds, to wait before firing.The delay is a delta with respect to the previous automation call.For example, the following code ends after 600ms:robot.mouseClick({left:true}, 100) // first call; wait 100msrobot.typeKeys("dij", 500) // 500ms AFTER previous call; 600ms in all
    * @param duration Approximate time Robot will spend moving the mouseThe default is 100ms.
    * @param offsetX x offset relative to the node, in pixels, to move the mouse. The default is half the node's width.
    * @param offsetY y offset relative to the node, in pixels, to move the mouse. The default is half the node's height.
    */
  def mouseMoveAt(node: HTMLElement, delay: Double, duration: Double, offsetX: Double, offsetY: Double): Unit = js.native
  /**
    * Move the mouse from the current position to the specified point.
    * Delays reading contents point until queued command starts running.
    * See mouseMove() for details.
    *
    * @param point x, y position relative to viewport, or if absolute == true, to document
    * @param delay               Optional
    * @param duration               Optional
    * @param absolute
    */
  def mouseMoveTo(point: js.Object, delay: Double, duration: Double, absolute: Boolean): Unit = js.native
  /**
    * Presses mouse buttons.
    * Presses the mouse buttons you pass as true.
    * Example: to press the left mouse button, pass {left: true}.
    * Mouse buttons you don't specify keep their previous pressed state.
    *
    * @param buttons JSON object that represents all of the mouse buttons being pressed.It takes the following Boolean attributes:leftmiddleright
    * @param delay               OptionalDelay, in milliseconds, to wait before firing.The delay is a delta with respect to the previous automation call.For example, the following code ends after 600ms:robot.mouseClick({left: true}, 100) // first call; wait 100msrobot.typeKeys("dij", 500) // 500ms AFTER previous call; 600ms in all
    */
  def mousePress(buttons: js.Object): Unit = js.native
  def mousePress(buttons: js.Object, delay: Double): Unit = js.native
  /**
    * Releases mouse buttons.
    * Releases the mouse buttons you pass as true.
    * Example: to release the left mouse button, pass {left: true}.
    * Mouse buttons you don't specify keep their previous pressed state.
    * See robot.mousePress for more info.
    *
    * @param buttons
    * @param delay               Optional
    */
  def mouseRelease(buttons: js.Object): Unit = js.native
  def mouseRelease(buttons: js.Object, delay: Double): Unit = js.native
  /**
    * Spins the mouse wheel.
    * Spins the wheel wheelAmt "notches."
    * Negative wheelAmt scrolls up/away from the user.
    * Positive wheelAmt scrolls down/toward the user.
    * Note: this will all happen in one event.
    * Warning: the size of one mouse wheel notch is an OS setting.
    * You can access this size from robot.mouseWheelSize
    *
    * @param wheelAmt Number of notches to spin the wheel.Negative wheelAmt scrolls up/away from the user.Positive wheelAmt scrolls down/toward the user.
    * @param delay               OptionalDelay, in milliseconds, to wait before firing.The delay is a delta with respect to the previous automation call.For example, the following code ends after 600ms:    robot.mouseClick({left: true}, 100) // first call; wait 100ms    robot.typeKeys("dij", 500) // 500ms AFTER previous call; 600ms in all
    * @param duration               OptionalApproximate time Robot will spend moving the mouseBy default, the Robot will wheel the mouse as fast as possible.
    */
  def mouseWheel(wheelAmt: Double): Unit = js.native
  def mouseWheel(wheelAmt: Double, delay: Double): Unit = js.native
  def mouseWheel(wheelAmt: Double, delay: Double, duration: Double): Unit = js.native
  /**
    * Scroll the passed node into view, if it is not.
    *
    * @param node The id of the node, or the node itself, to move the mouse to.If you pass an id or a function that returns a node, the node will not be evaluated until the movement executes.This is useful if you need to move the mouse to an node that is not yet present.
    * @param delay Delay, in milliseconds, to wait before firing.The delay is a delta with respect to the previous automation call.
    */
  def scrollIntoView(node: String, delay: Double): Unit = js.native
  /**
    * Scroll the passed node into view, if it is not.
    *
    * @param node The id of the node, or the node itself, to move the mouse to.If you pass an id or a function that returns a node, the node will not be evaluated until the movement executes.This is useful if you need to move the mouse to an node that is not yet present.
    * @param delay Delay, in milliseconds, to wait before firing.The delay is a delta with respect to the previous automation call.
    */
  def scrollIntoView(node: js.Function, delay: Double): Unit = js.native
  /**
    * Scroll the passed node into view, if it is not.
    *
    * @param node The id of the node, or the node itself, to move the mouse to.If you pass an id or a function that returns a node, the node will not be evaluated until the movement executes.This is useful if you need to move the mouse to an node that is not yet present.
    * @param delay Delay, in milliseconds, to wait before firing.The delay is a delta with respect to the previous automation call.
    */
  def scrollIntoView(node: HTMLElement, delay: Double): Unit = js.native
  /**
    * Defer an action by adding it to the robot's incrementally delayed queue of actions to execute.
    *
    * @param f A function containing actions you want to defer.  It can return a Promiseto delay further actions.
    * @param delay               OptionalDelay, in milliseconds, to wait before firing.The delay is a delta with respect to the previous automation call.For example, the following code ends after 600ms:robot.mouseClick({left: true}, 100) // first call; wait 100msrobot.typeKeys("dij", 500) // 500ms AFTER previous call; 600ms in all
    * @param duration               OptionalDelay to wait after firing.
    */
  def sequence(f: js.Function): Unit = js.native
  def sequence(f: js.Function, delay: Double): Unit = js.native
  def sequence(f: js.Function, delay: Double, duration: Double): Unit = js.native
  /**
    * Set clipboard content.
    * Set data as clipboard content, overriding anything already there. The
    * data will be put to the clipboard using the given format.
    *
    * @param data New clipboard content to set
    * @param format               OptionalSet this to "text/html" to put richtext to the clipboard.Otherwise, data is treated as plaintext. By default, plaintextis used.
    */
  def setClipboard(data: String): Unit = js.native
  def setClipboard(data: String, format: String): Unit = js.native
  /**
    *
    */
  def startRobot(): js.Any = js.native
  /**
    * Types a string of characters in order, or types a dojo.keys.* constant.
    * Types a string of characters in order, or types a dojo.keys.* constant.
    *
    * @param chars String of characters to type, or a dojo.keys.* constant
    * @param delay               OptionalDelay, in milliseconds, to wait before firing.The delay is a delta with respect to the previous automation call.For example, the following code ends after 600ms:robot.mouseClick({left: true}, 100) // first call; wait 100msrobot.typeKeys("dij", 500) // 500ms AFTER previous call; 600ms in all
    * @param duration               OptionalTime, in milliseconds, to spend pressing all of the keys.The default is (string length)*50 ms.
    */
  def typeKeys(chars: String): Unit = js.native
  def typeKeys(chars: String, delay: Double): Unit = js.native
  def typeKeys(chars: String, delay: Double, duration: Double): Unit = js.native
  /**
    * Types a string of characters in order, or types a dojo.keys.* constant.
    * Types a string of characters in order, or types a dojo.keys.* constant.
    *
    * @param chars String of characters to type, or a dojo.keys.* constant
    * @param delay               OptionalDelay, in milliseconds, to wait before firing.The delay is a delta with respect to the previous automation call.For example, the following code ends after 600ms:robot.mouseClick({left: true}, 100) // first call; wait 100msrobot.typeKeys("dij", 500) // 500ms AFTER previous call; 600ms in all
    * @param duration               OptionalTime, in milliseconds, to spend pressing all of the keys.The default is (string length)*50 ms.
    */
  def typeKeys(chars: Double): Unit = js.native
  def typeKeys(chars: Double, delay: Double): Unit = js.native
  def typeKeys(chars: Double, delay: Double, duration: Double): Unit = js.native
  /**
    * Notifies DOH that the doh.robot is about to make a page change in the application it is driving,
    * returning a doh.Deferred object the user should return in their runTest function as part of a DOH test.
    *
    * @param submitActions The doh.robot will execute the actions the test passes into the submitActions argument (like clicking the submit button),expecting these actions to create a page change (like a form submit).After these actions execute and the resulting page loads, the next test will start.
    */
  def waitForPageToLoad(submitActions: js.Function): js.Any = js.native
}

