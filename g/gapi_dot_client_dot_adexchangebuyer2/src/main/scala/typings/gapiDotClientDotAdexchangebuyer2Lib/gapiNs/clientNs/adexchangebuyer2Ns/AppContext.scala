package typings
package gapiDotClientDotAdexchangebuyer2Lib.gapiNs.clientNs.adexchangebuyer2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppContext extends js.Object {
  /** The app types this restriction applies to. */
  var appTypes: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object AppContext {
  @scala.inline
  def apply(appTypes: js.Array[java.lang.String] = null): AppContext = {
    val __obj = js.Dynamic.literal()
    if (appTypes != null) __obj.updateDynamic("appTypes")(appTypes)
    __obj.asInstanceOf[AppContext]
  }
}

