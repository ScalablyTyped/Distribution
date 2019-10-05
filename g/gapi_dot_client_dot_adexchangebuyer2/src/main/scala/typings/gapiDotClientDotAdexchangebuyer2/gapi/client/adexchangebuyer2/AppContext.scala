package typings.gapiDotClientDotAdexchangebuyer2.gapi.client.adexchangebuyer2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppContext extends js.Object {
  /** The app types this restriction applies to. */
  var appTypes: js.UndefOr[js.Array[String]] = js.undefined
}

object AppContext {
  @scala.inline
  def apply(appTypes: js.Array[String] = null): AppContext = {
    val __obj = js.Dynamic.literal()
    if (appTypes != null) __obj.updateDynamic("appTypes")(appTypes)
    __obj.asInstanceOf[AppContext]
  }
}

