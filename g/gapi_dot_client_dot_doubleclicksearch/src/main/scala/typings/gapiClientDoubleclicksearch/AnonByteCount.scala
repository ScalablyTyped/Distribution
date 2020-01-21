package typings.gapiClientDoubleclicksearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonByteCount extends js.Object {
  /** The size of this report file in bytes. */
  var byteCount: js.UndefOr[String] = js.undefined
  /** Use this url to download the report file. */
  var url: js.UndefOr[String] = js.undefined
}

object AnonByteCount {
  @scala.inline
  def apply(byteCount: String = null, url: String = null): AnonByteCount = {
    val __obj = js.Dynamic.literal()
    if (byteCount != null) __obj.updateDynamic("byteCount")(byteCount.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonByteCount]
  }
}

