package typings.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ByteCount extends js.Object {
  var byteCount: js.UndefOr[String] = js.native
  var url: js.UndefOr[String] = js.native
}

object ByteCount {
  @scala.inline
  def apply(byteCount: String = null, url: String = null): ByteCount = {
    val __obj = js.Dynamic.literal()
    if (byteCount != null) __obj.updateDynamic("byteCount")(byteCount.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ByteCount]
  }
}

