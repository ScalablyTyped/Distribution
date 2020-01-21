package typings.googleapis.chatV1Mod.chatV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A thread in Hangouts Chat.
  */
@js.native
trait SchemaThread extends js.Object {
  /**
    * Resource name, in the form &quot;spaces/x/threads/ *&quot;.  Example:
    * spaces/AAAAMpdlehY/threads/UMxbHmzDlr4
    */
  var name: js.UndefOr[String] = js.native
}

object SchemaThread {
  @scala.inline
  def apply(name: String = null): SchemaThread = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaThread]
  }
}

