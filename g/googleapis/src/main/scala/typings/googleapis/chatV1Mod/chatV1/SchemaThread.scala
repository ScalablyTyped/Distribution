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
  def apply(): SchemaThread = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaThread]
  }
  @scala.inline
  implicit class SchemaThreadOps[Self <: SchemaThread] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
  
}

