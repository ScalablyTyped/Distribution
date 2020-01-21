package typings.gapiClientFirebaserules.gapi.client.firebaserules

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Source extends js.Object {
  /** `File` set constituting the `Source` bundle. */
  var files: js.UndefOr[js.Array[File]] = js.undefined
}

object Source {
  @scala.inline
  def apply(files: js.Array[File] = null): Source = {
    val __obj = js.Dynamic.literal()
    if (files != null) __obj.updateDynamic("files")(files.asInstanceOf[js.Any])
    __obj.asInstanceOf[Source]
  }
}

