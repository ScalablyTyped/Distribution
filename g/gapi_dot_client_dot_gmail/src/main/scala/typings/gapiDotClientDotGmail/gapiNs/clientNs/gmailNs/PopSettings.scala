package typings.gapiDotClientDotGmail.gapiNs.clientNs.gmailNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PopSettings extends js.Object {
  /** The range of messages which are accessible via POP. */
  var accessWindow: js.UndefOr[String] = js.undefined
  /** The action that will be executed on a message after it has been fetched via POP. */
  var disposition: js.UndefOr[String] = js.undefined
}

object PopSettings {
  @scala.inline
  def apply(accessWindow: String = null, disposition: String = null): PopSettings = {
    val __obj = js.Dynamic.literal()
    if (accessWindow != null) __obj.updateDynamic("accessWindow")(accessWindow)
    if (disposition != null) __obj.updateDynamic("disposition")(disposition)
    __obj.asInstanceOf[PopSettings]
  }
}

