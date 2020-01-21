package typings.facebookInstantGames.FBInstant

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("FBInstant.logEvent")
@js.native
object logEvent extends js.Object {
  /**
    * Log an app event with FB Analytics. See https://developers.facebook.com/docs/javascript/reference/v2.8#app_events for more details about FB Analytics.
    *
    * @param eventName Name of the event. Must be 2 to 40 characters, and can only contain '_', '-', ' ', and alphanumeric characters.
    * @param valueToSum An optional numeric value that FB Analytics can calculate a sum with.
    * @param parameters An optional object that can contain up to 25 key-value pairs to be logged with the event. Keys must be 2 to 40 characters,
    * and can only contain '_', '-', ' ', and alphanumeric characters. Values must be less than 100 characters in length.
    * @returns The error if the event failed to log; otherwise returns null.
    */
  def apply(eventName: String): APIError | Null = js.native
  def apply(eventName: String, valueToSum: Double): APIError | Null = js.native
  def apply(eventName: String, valueToSum: Double, parameters: StringDictionary[String]): APIError | Null = js.native
}

