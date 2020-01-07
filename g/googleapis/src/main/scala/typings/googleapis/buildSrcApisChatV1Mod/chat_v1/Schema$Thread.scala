package typings.googleapis.buildSrcApisChatV1Mod.chat_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A thread in Hangouts Chat.
  */
@js.native
trait Schema$Thread extends js.Object {
  /**
    * Resource name, in the form &quot;spaces/x/threads/ *&quot;.  Example:
    * spaces/AAAAMpdlehY/threads/UMxbHmzDlr4
    */
  var name: js.UndefOr[String] = js.native
}

object Schema$Thread {
  @scala.inline
  def apply(name: String = null): Schema$Thread = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Thread]
  }
}

