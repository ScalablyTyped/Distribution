package typings.fileEntryCache

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHash extends js.Object {
  val hash: js.UndefOr[String] = js.undefined
  val mtime: js.UndefOr[Double] = js.undefined
  val size: js.UndefOr[Double] = js.undefined
}

object AnonHash {
  @scala.inline
  def apply(hash: String = null, mtime: Int | Double = null, size: Int | Double = null): AnonHash = {
    val __obj = js.Dynamic.literal()
    if (hash != null) __obj.updateDynamic("hash")(hash.asInstanceOf[js.Any])
    if (mtime != null) __obj.updateDynamic("mtime")(mtime.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHash]
  }
}

