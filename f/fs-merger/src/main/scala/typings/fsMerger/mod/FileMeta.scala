package typings.fsMerger.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileMeta extends js.Object {
  var getDestinationPath: js.UndefOr[js.Function] = js.undefined
  var path: String
  var prefix: js.UndefOr[String] = js.undefined
}

object FileMeta {
  @scala.inline
  def apply(path: String, getDestinationPath: js.Function = null, prefix: String = null): FileMeta = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    if (getDestinationPath != null) __obj.updateDynamic("getDestinationPath")(getDestinationPath.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileMeta]
  }
}

