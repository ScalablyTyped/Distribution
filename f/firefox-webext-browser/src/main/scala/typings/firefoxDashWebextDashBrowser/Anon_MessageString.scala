package typings.firefoxDashWebextDashBrowser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_MessageString extends js.Object {
  /** Details about the error which occurred. */
  var message: js.UndefOr[String] = js.undefined
}

object Anon_MessageString {
  @scala.inline
  def apply(message: String = null): Anon_MessageString = {
    val __obj = js.Dynamic.literal()
    if (message != null) __obj.updateDynamic("message")(message)
    __obj.asInstanceOf[Anon_MessageString]
  }
}

