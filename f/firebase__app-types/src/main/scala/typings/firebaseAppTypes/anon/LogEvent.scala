package typings.firebaseAppTypes.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LogEvent extends js.Object {
  def logEvent(eventName: String, eventParams: StringDictionary[js.Any]): Unit = js.native
  def logEvent(eventName: String, eventParams: StringDictionary[js.Any], options: Global): Unit = js.native
}

