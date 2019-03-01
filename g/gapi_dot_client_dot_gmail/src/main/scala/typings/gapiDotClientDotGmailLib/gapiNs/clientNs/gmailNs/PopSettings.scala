package typings
package gapiDotClientDotGmailLib.gapiNs.clientNs.gmailNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PopSettings extends js.Object {
  /** The range of messages which are accessible via POP. */
  var accessWindow: js.UndefOr[java.lang.String] = js.undefined
  /** The action that will be executed on a message after it has been fetched via POP. */
  var disposition: js.UndefOr[java.lang.String] = js.undefined
}

object PopSettings {
  @scala.inline
  def apply(accessWindow: java.lang.String = null, disposition: java.lang.String = null): PopSettings = {
    val __obj = js.Dynamic.literal()
    if (accessWindow != null) __obj.updateDynamic("accessWindow")(accessWindow)
    if (disposition != null) __obj.updateDynamic("disposition")(disposition)
    __obj.asInstanceOf[PopSettings]
  }
}

