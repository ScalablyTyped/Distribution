package typings.fb

import typings.std.Element
import typings.std.HTMLElement
import typings.std.Number
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FBSDKCanvas extends js.Object {
  var Prefetcher: FBSDKCanvasPrefetcher = js.native
  /* Hides the HTML element passed in via the elem param from view. */
  def hideFlashElement(element: Element): Unit = js.native
  def hideFlashElement(element: HTMLElement): Unit = js.native
  /* Tells Facebook to scroll to a specific location of your canvas page. */
  def scrollTo(x: Number, y: Number): Unit = js.native
  def setAutoGrow(diffInterval: Number): Unit = js.native
  /* Starts or stops a timer which will grow your iframe to fit the content every few milliseconds. */
  def setAutoGrow(stopTimer: Boolean): Unit = js.native
  def setAutoGrow(stopTimer: Boolean, diffInterval: Number): Unit = js.native
  /* Calls you back with an integer, in milliseconds, of the timing of the page load, beginning from the time when the first bytes arrive on
    the client, and ending from the point at which you call this function.
    */
  def setDoneLoading(): FBSDKCanvasDoneLoading = js.native
  def setDoneLoading(handler: js.Function): FBSDKCanvasDoneLoading = js.native
  /* Tells Facebook to resize your iframe. */
  def setSize(canvasSizeOptions: FBSDKCanvasSize): Unit = js.native
  /* Registers the callback for inline processing (i.e. without page reload) of user actions when they click on any link to the current app from Canvas */
  def setUrlHandler(): String = js.native
  def setUrlHandler(handler: js.Function): String = js.native
  /* Displays the HTML element passed in via the elem param, after it has been hidden via FB.Canvas.hideFlashElement. */
  def showFlashElement(element: Element): Unit = js.native
  def showFlashElement(element: HTMLElement): Unit = js.native
  /* Call startTimer to resume the timer after a period of time for the page load that you didn't wish to measure, which you began by calling stopTimer. */
  def startTimer(): Unit = js.native
  /* Call stopTimer when you wish to stop timing the page load for a period of time */
  def stopTimer(): Unit = js.native
  def stopTimer(handler: js.Function1[/* fbResponseObject */ js.Object, _]): Unit = js.native
}

