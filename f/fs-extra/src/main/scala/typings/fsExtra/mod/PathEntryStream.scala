package typings.fsExtra.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PathEntryStream extends js.Object {
  def read(): PathEntry | Null
}

object PathEntryStream {
  @scala.inline
  def apply(read: () => PathEntry | Null): PathEntryStream = {
    val __obj = js.Dynamic.literal(read = js.Any.fromFunction0(read))
    __obj.asInstanceOf[PathEntryStream]
  }
}

