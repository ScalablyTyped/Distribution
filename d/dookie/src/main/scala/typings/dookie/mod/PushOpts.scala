package typings.dookie.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PushOpts extends js.Object {
  var dropDatabase: Boolean
  var filename: js.UndefOr[String] = js.undefined
}

object PushOpts {
  @scala.inline
  def apply(dropDatabase: Boolean, filename: String = null): PushOpts = {
    val __obj = js.Dynamic.literal(dropDatabase = dropDatabase.asInstanceOf[js.Any])
    if (filename != null) __obj.updateDynamic("filename")(filename.asInstanceOf[js.Any])
    __obj.asInstanceOf[PushOpts]
  }
}

