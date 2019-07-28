package typings.googleDotScriptDotClientDashSide.googleNs.scriptNs

import org.scalablytyped.runtime.StringDictionary
import typings.std.Error
import typings.std.HTMLFormElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Runner
  extends /**
  * Executes the server-side Apps Script function with the corresponding name.
  */
/* functionName */ StringDictionary[
      js.Function2[/* first */ js.UndefOr[Parameter | HTMLFormElement], /* repeated */ Parameter, Unit]
    ] {
  /**
    * Sets a callback function to run if the server-side function throws an exception.
    * Without a failure handler, failures are logged to the JavaScript console.
    * To override this, call withFailureHandler(null) or supply a failure handler that does nothing.
    * @param handler a client-side callback function to run if the server-side function throws an exception;
    * the Error object is passed to the function as the first argument, and the user object (if any) is passed as a second argument
    */
  def withFailureHandler(handler: js.Function2[/* error */ Error, /* object */ js.UndefOr[js.Any], Unit]): Runner
  /**
    * Sets a callback function to run if the server-side function returns successfully.
    * @param handler a client-side callback function to run if the server-side function returns successfully;
    * the server's return value is passed to the function as the first argument, and the user object (if any) is passed as a second argument
    */
  def withSuccessHandler(handler: js.Function2[/* value */ js.UndefOr[js.Any], /* object */ js.UndefOr[js.Any], Unit]): Runner
  /**
    * Sets an object to pass as a second parameter to the success and failure handlers.
    * @param object an object to pass as a second parameter to the success and failure handlers;
    * because user objects are not sent to the server, they are not subject to the restrictions on parameters and return values for server calls.
    * User objects cannot, however, be objects constructed with the new operator
    */
  def withUserObject(`object`: js.Any): Runner
}

object Runner {
  @scala.inline
  def apply(
    withFailureHandler: js.Function2[/* error */ Error, /* object */ js.UndefOr[js.Any], Unit] => Runner,
    withSuccessHandler: js.Function2[/* value */ js.UndefOr[js.Any], /* object */ js.UndefOr[js.Any], Unit] => Runner,
    withUserObject: js.Any => Runner,
    StringDictionary: /**
    * Executes the server-side Apps Script function with the corresponding name.
    */
  /* functionName */ StringDictionary[
      js.Function2[/* first */ js.UndefOr[Parameter | HTMLFormElement], /* repeated */ Parameter, Unit]
    ] = null
  ): Runner = {
    val __obj = js.Dynamic.literal(withFailureHandler = js.Any.fromFunction1(withFailureHandler), withSuccessHandler = js.Any.fromFunction1(withSuccessHandler), withUserObject = js.Any.fromFunction1(withUserObject))
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Runner]
  }
}

