package typings
package fbLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FBSDKCanvas extends js.Object {
  var Prefetcher: FBSDKCanvasPrefetcher = js.native
  /* Hides the HTML element passed in via the elem param from view. */
  def hideFlashElement(element: stdLib.Element): scala.Unit = js.native
  def hideFlashElement(element: stdLib.HTMLElement): scala.Unit = js.native
  /* Tells Facebook to scroll to a specific location of your canvas page. */
  def scrollTo(x: stdLib.Number, y: stdLib.Number): scala.Unit = js.native
  def setAutoGrow(diffInterval: stdLib.Number): scala.Unit = js.native
  /* Starts or stops a timer which will grow your iframe to fit the content every few milliseconds. */
  def setAutoGrow(stopTimer: scala.Boolean): scala.Unit = js.native
  def setAutoGrow(stopTimer: scala.Boolean, diffInterval: stdLib.Number): scala.Unit = js.native
  /* Calls you back with an integer, in milliseconds, of the timing of the page load, beginning from the time when the first bytes arrive on
          the client, and ending from the point at which you call this function.
      */
  def setDoneLoading(): FBSDKCanvasDoneLoading = js.native
  /* Calls you back with an integer, in milliseconds, of the timing of the page load, beginning from the time when the first bytes arrive on
          the client, and ending from the point at which you call this function.
      */
  def setDoneLoading(handler: js.Function): FBSDKCanvasDoneLoading = js.native
  /* Tells Facebook to resize your iframe. */
  def setSize(canvasSizeOptions: FBSDKCanvasSize): scala.Unit = js.native
  /* Registers the callback for inline processing (i.e. without page reload) of user actions when they click on any link to the current app from Canvas */
  def setUrlHandler(): java.lang.String = js.native
  /* Registers the callback for inline processing (i.e. without page reload) of user actions when they click on any link to the current app from Canvas */
  def setUrlHandler(handler: js.Function): java.lang.String = js.native
  /* Displays the HTML element passed in via the elem param, after it has been hidden via FB.Canvas.hideFlashElement. */
  def showFlashElement(element: stdLib.Element): scala.Unit = js.native
  def showFlashElement(element: stdLib.HTMLElement): scala.Unit = js.native
  /* Call startTimer to resume the timer after a period of time for the page load that you didn't wish to measure, which you began by calling stopTimer. */
  def startTimer(): scala.Unit = js.native
  /* Call stopTimer when you wish to stop timing the page load for a period of time */
  def stopTimer(): scala.Unit = js.native
  /* Call stopTimer when you wish to stop timing the page load for a period of time */
  def stopTimer(handler: js.Function1[/* fbResponseObject */ js.Object, _]): scala.Unit = js.native
}

