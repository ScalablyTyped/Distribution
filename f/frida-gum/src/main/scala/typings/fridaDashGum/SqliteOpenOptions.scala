package typings.fridaDashGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SqliteOpenOptions extends js.Object {
  var flags: js.UndefOr[js.Array[SqliteOpenFlag]] = js.undefined
}

object SqliteOpenOptions {
  @scala.inline
  def apply(flags: js.Array[SqliteOpenFlag] = null): SqliteOpenOptions = {
    val __obj = js.Dynamic.literal()
    if (flags != null) __obj.updateDynamic("flags")(flags)
    __obj.asInstanceOf[SqliteOpenOptions]
  }
}

