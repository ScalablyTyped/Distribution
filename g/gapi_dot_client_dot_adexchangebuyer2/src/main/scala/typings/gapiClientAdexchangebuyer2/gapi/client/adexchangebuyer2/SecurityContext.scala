package typings.gapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SecurityContext extends js.Object {
  /** The security types in this context. */
  var securities: js.UndefOr[js.Array[String]] = js.undefined
}

object SecurityContext {
  @scala.inline
  def apply(securities: js.Array[String] = null): SecurityContext = {
    val __obj = js.Dynamic.literal()
    if (securities != null) __obj.updateDynamic("securities")(securities.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecurityContext]
  }
}

