package typings.fileEntryCache.mod

import typings.fileEntryCache.AnonHash
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileDescriptor extends js.Object {
  val changed: js.UndefOr[Boolean] = js.undefined
  val err: js.UndefOr[Error] = js.undefined
  val key: String
  val meta: js.UndefOr[AnonHash] = js.undefined
  val notFound: Boolean
}

object FileDescriptor {
  @scala.inline
  def apply(
    key: String,
    notFound: Boolean,
    changed: js.UndefOr[Boolean] = js.undefined,
    err: Error = null,
    meta: AnonHash = null
  ): FileDescriptor = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], notFound = notFound.asInstanceOf[js.Any])
    if (!js.isUndefined(changed)) __obj.updateDynamic("changed")(changed.asInstanceOf[js.Any])
    if (err != null) __obj.updateDynamic("err")(err.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileDescriptor]
  }
}

