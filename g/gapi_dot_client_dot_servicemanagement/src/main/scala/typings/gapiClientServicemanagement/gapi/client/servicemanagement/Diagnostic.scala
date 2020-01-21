package typings.gapiClientServicemanagement.gapi.client.servicemanagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Diagnostic extends js.Object {
  /** The kind of diagnostic information provided. */
  var kind: js.UndefOr[String] = js.undefined
  /** File name and line number of the error or warning. */
  var location: js.UndefOr[String] = js.undefined
  /** Message describing the error or warning. */
  var message: js.UndefOr[String] = js.undefined
}

object Diagnostic {
  @scala.inline
  def apply(kind: String = null, location: String = null, message: String = null): Diagnostic = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    __obj.asInstanceOf[Diagnostic]
  }
}

