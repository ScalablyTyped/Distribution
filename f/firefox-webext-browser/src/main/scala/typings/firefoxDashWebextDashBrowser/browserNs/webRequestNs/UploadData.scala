package typings.firefoxDashWebextDashBrowser.browserNs.webRequestNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains data uploaded in a URL request. */
trait UploadData extends js.Object {
  /** An ArrayBuffer with a copy of the data. */
  var bytes: js.UndefOr[js.Any] = js.undefined
  /** A string with the file's path and name. */
  var file: js.UndefOr[String] = js.undefined
}

object UploadData {
  @scala.inline
  def apply(bytes: js.Any = null, file: String = null): UploadData = {
    val __obj = js.Dynamic.literal()
    if (bytes != null) __obj.updateDynamic("bytes")(bytes)
    if (file != null) __obj.updateDynamic("file")(file)
    __obj.asInstanceOf[UploadData]
  }
}

