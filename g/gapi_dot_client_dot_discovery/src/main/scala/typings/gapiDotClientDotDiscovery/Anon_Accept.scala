package typings.gapiDotClientDotDiscovery

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Accept extends js.Object {
  /** MIME Media Ranges for acceptable media uploads to this method. */
  var accept: js.UndefOr[js.Array[String]] = js.undefined
  /** Maximum size of a media upload, such as "1MB", "2GB" or "3TB". */
  var maxSize: js.UndefOr[String] = js.undefined
  /** Supported upload protocols. */
  var protocols: js.UndefOr[Anon_Resumable] = js.undefined
}

object Anon_Accept {
  @scala.inline
  def apply(accept: js.Array[String] = null, maxSize: String = null, protocols: Anon_Resumable = null): Anon_Accept = {
    val __obj = js.Dynamic.literal()
    if (accept != null) __obj.updateDynamic("accept")(accept.asInstanceOf[js.Any])
    if (maxSize != null) __obj.updateDynamic("maxSize")(maxSize.asInstanceOf[js.Any])
    if (protocols != null) __obj.updateDynamic("protocols")(protocols.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Accept]
  }
}

