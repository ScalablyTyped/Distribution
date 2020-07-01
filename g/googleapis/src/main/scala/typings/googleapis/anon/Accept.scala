package typings.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Accept extends js.Object {
  var accept: js.UndefOr[js.Array[String]] = js.native
  var maxSize: js.UndefOr[String] = js.native
  var protocols: js.UndefOr[Resumable] = js.native
}

object Accept {
  @scala.inline
  def apply(accept: js.Array[String] = null, maxSize: String = null, protocols: Resumable = null): Accept = {
    val __obj = js.Dynamic.literal()
    if (accept != null) __obj.updateDynamic("accept")(accept.asInstanceOf[js.Any])
    if (maxSize != null) __obj.updateDynamic("maxSize")(maxSize.asInstanceOf[js.Any])
    if (protocols != null) __obj.updateDynamic("protocols")(protocols.asInstanceOf[js.Any])
    __obj.asInstanceOf[Accept]
  }
}

